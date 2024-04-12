package com.springrest.springrest.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.courseDao;
import com.springrest.springrest.entities.course;
@Service

public class CourseServiceimpl implements CourseService {
	@Autowired
	private courseDao coursedao;
//	List<course> list;
	public CourseServiceimpl()
	{
		//list=new ArrayList<>();
		//list.add(new course(145,"javaCourse","this course" ));
		//list.add(new course(2,"C++ course","that course"));
			
			
	}

	@Override
	public List<course> getCourses() {
		// TODO Auto-generated method stub
		return coursedao.findAll();
	}

	
	@Override
	public course getCourse(long courseid) {
	//	course c=null;
		//for(course course:list)
		//{
		//	if(course.getId()==courseid)
		//	{
		//		c=course;
			//	break;
		//	}
	//	}
		// TODO Auto-generated method stub
		return coursedao.getReferenceById(courseid);
	}

	@Override
	public course addCourse(course course) {
		//list.add(course);
	  coursedao.save(course);
		return course;
	
	}

	

	@Override
	public void deleteCourse(long parseLong) {
	/*	course c=null;
		for(course course:list)
		{
			if(course.getId()==courseid) {
				list.remove(course);
				c=course;
			}
		}
		*/
		course entity=coursedao.getReferenceById(parseLong);
		 coursedao.delete(entity);
		
	}

	@Override
	public course updateCourse(course courses) {
	//	list.forEach(e ->{
		//	if(e.getId()==courses.getId()) {
		//		e.setDescription(courses.getDescription());
		//		e.setTitle(courses.getTitle());
		//	}
			
		//});
		coursedao.save(courses);
		return courses;
		
	}
}
	
