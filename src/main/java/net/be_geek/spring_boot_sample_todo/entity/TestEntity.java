package net.be_geek.spring_boot_sample_todo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@EqualsAndHashCode
public class TestEntity {

	@Id
	@GeneratedValue
	private Integer id;
}
