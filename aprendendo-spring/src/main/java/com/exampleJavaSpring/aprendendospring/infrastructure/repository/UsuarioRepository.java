package com.exampleJavaSpring.aprendendospring.infrastructure.repository;

import com.exampleJavaSpring.aprendendospring.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
