package com.example.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.attendance.entity.Attendance;
import com.example.attendance.repository.AttendanceRepository;

import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceRepository repository;

    @PostMapping
    public Attendance markAttendance(@RequestBody Attendance attendance) {
        return repository.save(attendance);
    }

    @GetMapping
    public List<Attendance> getAllAttendance() {
        return repository.findAll();
    }
}