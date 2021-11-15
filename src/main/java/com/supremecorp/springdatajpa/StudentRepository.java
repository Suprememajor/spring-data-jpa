package com.supremecorp.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by suprememajor on the 11/15/21
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
