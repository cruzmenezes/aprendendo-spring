package com.exampleJavaSpring.aprendendospring.infrastructure.repository;

import com.exampleJavaSpring.aprendendospring.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
