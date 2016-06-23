package net.be_geek.spring_boot_sample_todo.repository;

import net.be_geek.spring_boot_sample_todo.entity.TestEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
