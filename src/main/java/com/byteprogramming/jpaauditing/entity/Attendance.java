package com.byteprogramming.jpaauditing.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@IdClass(AttendanceID.class)
@Table(name="attendance", schema="oper")
@NoArgsConstructor
@Data

public class Attendance extends AuditableBase implements Serializable {

	private static final long serialVersionUID = 81024225062716935L;

	@Id
	@Column(name="emp_id")
	private Integer empId;
	
	@Id
	@Column(name="effective_dt")
	private LocalDate effectiveDt;
	
	@Column(name="fl_present")
	private boolean present;
	
}
