package com.byteprogramming.jpaauditing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.byteprogramming.jpaauditing.entity.Attendance;
import com.byteprogramming.jpaauditing.repository.AttendanceRepo;

@Service
public class AttendanceService {

	@Autowired
	private AttendanceRepo attendanceRepo;
	
	public Attendance saveAttendance(Attendance attendance) {
		
		return attendanceRepo.save(attendance);
		
	}
}
