package net.be_geek.spring_boot_sample_todo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class TestEntity extends BaseEntity {

	@Id
	@GeneratedValue
	private Integer id;

	@NotNull
	@Column(nullable = false)
	private String name;

	private Integer age;

	private LocalDate birthDate;

}
