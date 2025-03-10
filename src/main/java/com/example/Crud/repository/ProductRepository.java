package com.example.Crud.repository;

import com.example.Crud.entity.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Produtos, Long> {
}
