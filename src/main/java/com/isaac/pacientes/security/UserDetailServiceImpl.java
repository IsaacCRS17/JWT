package com.isaac.pacientes.security;

import com.isaac.pacientes.entity.UsuarioEntity;
import com.isaac.pacientes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        UsuarioEntity usuario =usuarioRepository.findOneByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("El usuario con email: " +email + " no existe"));
        return new UserDetailsImpl(usuario);
    }
}
