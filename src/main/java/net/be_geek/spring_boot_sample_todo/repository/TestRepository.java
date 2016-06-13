package net.be_geek.spring_boot_sample_todo.repository;

import net.be_geek.spring_boot_sample_todo.entity.TestEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Integer> {

}
