/**
 * 
 */
package com.college.management.service;

import java.util.List;

import com.college.management.entity.LectureDetails;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
public interface LectureDetailsService {
	 LectureDetails getLectureDetailsByDepartmentId(Integer  lectureId);
		
	 List<LectureDetails> getLectureDetailsByLectureName(String  lectureName);
	 
	 List<LectureDetails> getLectureDetailsByLectureNameAndDepartname(String  lectureName,String departmentName);
	
	 LectureDetails saveLectureDetails( LectureDetails  lectureDetails);
	
	 LectureDetails saveOrUpdateLectureDetails( LectureDetails  lectureDetails);
}
