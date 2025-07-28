package com.exampleJavaSpring.aprendendospring.business;

import com.exampleJavaSpring.aprendendospring.infrastructure.entity.Usuario;
import com.exampleJavaSpring.aprendendospring.infrastructure.exceptions.ConflictException;
import com.exampleJavaSpring.aprendendospring.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {


    private final UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario (Usuario usuario){
        try{
            emailExistente(usuario.getEmail());
        return usuarioRepository.save(usuario);

     }catch(ConflictException e){
            throw new ConflictException("email já cadastrado", e.getCause() )

    }
    }

    public  void emailExistente(String email){
        try {
            boolean existe = verificarEmailExistente(email);
            if (existe){
                throw new ConflictException("email já cadastrado " + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException("email já cadastrado " + e.getCause());
        }
    }
    public boolean verificarEmailExistente(String email){
        return usuarioRepository.existsByEmail(email)
    }

}
