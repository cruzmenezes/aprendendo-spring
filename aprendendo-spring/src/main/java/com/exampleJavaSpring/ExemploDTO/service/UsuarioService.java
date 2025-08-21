package com.exemplo.dto.service;

import com.exemplo.dto.model.Usuario;
import com.exemplo.dto.dto.UsuarioDTO;
import com.exemplo.dto.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<UsuarioDTO> listarUsuarios() {
        List<Usuario> usuarios = repository.findAll();
        return usuarios.stream()
                .map(u -> new UsuarioDTO(u.getNome(), u.getEmail()))
                .collect(Collectors.toList());
    }
}
