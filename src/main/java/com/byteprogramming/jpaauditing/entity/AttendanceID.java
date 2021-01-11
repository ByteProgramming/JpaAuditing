package com.byteprogramming.jpaauditing.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AttendanceID implements Serializable {

	@Column(name="emp_id")
	private Integer empId;
	
	@Column(name="effective_dt")
	private LocalDate effectiveDt;
}
