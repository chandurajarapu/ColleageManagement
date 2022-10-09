/**
 * 
 */
package com.college.management.entity.DAO;

import java.util.List;

import com.college.management.entity.LectureDetails;

/**
 * @author SHANTHI R
 * DATE : 06-Oct-2022
 * EMPID : 200
 */
public interface LectureDetailsDAO {
	 LectureDetails getLectureDetailsByLectureId(Integer  lectureId);
	
	 List<LectureDetails> getLectureDetailsByLectureName(String  lectureName);
	 
	 List<LectureDetails> getLectureDetailsByLectureNameAndDepartname(String  lectureName,String departmentName);
	
	 LectureDetails saveLectureDetails( LectureDetails  lectureDetails);
	
	 LectureDetails saveOrUpdateLectureDetails( LectureDetails  lectureDetails);
}
