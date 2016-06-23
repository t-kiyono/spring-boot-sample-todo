package net.be_geek.spring_boot_sample_todo.entity;

import lombok.EqualsAndHashCode;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@EqualsAndHashCode
public abstract class BaseEntity {

	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this,
				ToStringStyle.JSON_STYLE);
	}

}
