package com.college.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.entity.LectureDetails;
import com.college.management.entity.DAO.LectureDetailsDAO;
import com.college.management.service.LectureDetailsService;
@Service
public class LectureDetailsServiceImpl implements LectureDetailsService {
	
@Autowired
	LectureDetailsDAO lectureDetailsDAO;


	@Override
	public LectureDetails getLectureDetailsByDepartmentId(Integer lectureId) {
		return lectureDetailsDAO.getLectureDetailsByLectureId(lectureId);
	}

	@Override
	public List<LectureDetails> getLectureDetailsByLectureName(String lectureName) {
		return lectureDetailsDAO.getLectureDetailsByLectureName(lectureName);
	}

	@Override
	public List<LectureDetails> getLectureDetailsByLectureNameAndDepartname(String lectureName, String departmentName) {
		return lectureDetailsDAO.getLectureDetailsByLectureNameAndDepartname(lectureName, departmentName);
	}

	@Override
	public LectureDetails saveLectureDetails(LectureDetails lectureDetails) {
		return lectureDetailsDAO.saveLectureDetails(lectureDetails);
	}

	@Override
	public LectureDetails saveOrUpdateLectureDetails(LectureDetails lectureDetails) {
		return lectureDetailsDAO.saveOrUpdateLectureDetails(lectureDetails);
	}

}
