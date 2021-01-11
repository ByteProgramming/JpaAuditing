package com.byteprogramming.jpaauditing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byteprogramming.jpaauditing.entity.Attendance;

@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Integer>{

}
