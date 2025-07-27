package com.exampleJavaSpring.aprendendospring.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Telefone extends JpaRepository<Telefone, Long> {
}
