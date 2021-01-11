package com.byteprogramming.jpaauditing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byteprogramming.jpaauditing.entity.Attendance;
import com.byteprogramming.jpaauditing.service.AttendanceService;

@RestController
@RequestMapping(value="/byteprogramming")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	@PostMapping(value="/jpaAudit/attendance")
	public ResponseEntity<Attendance> saveAttendance(@RequestBody Attendance attendace){
		
		return new ResponseEntity<Attendance>(attendanceService.saveAttendance(attendace), HttpStatus.OK);
	}
}
