package net.be_geek.spring_boot_sample_todo.form;

import lombok.EqualsAndHashCode;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@EqualsAndHashCode
public abstract class BaseForm {

	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this,
				ToStringStyle.JSON_STYLE);
	}
}
