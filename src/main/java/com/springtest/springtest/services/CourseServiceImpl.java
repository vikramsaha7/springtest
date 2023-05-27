package com.springtest.springtest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.springtest.springtest.dau.CourseDau;
import com.springtest.springtest.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	//List<Courses> list;
	@Autowired
	private CourseDau cd;
	public CourseServiceImpl() {
		super();
//		list = new ArrayList<>();
//		list.add(new Courses(23,"spring boot","Spring boot courses"));
//		list.add(new Courses(22,"Node js","Node js courses"));
//		list.add(new Courses(25,"Aws","Aws courses"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return this.cd.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
//		Courses c=null;
//		for(Courses itr:list) {
//			if(itr.getId()==courseId) {
//				c=itr;
//				break;
//			}
//		}
//		return c;
		return cd.findById(courseId).get();
	}

	@Override
	public Courses addCourse(Courses c) {
		//list.add(c);
		cd.save(c);
		return c;
	}

	@Override
	public Courses updateCourse(Courses c) {
		// TODO Auto-generated method stub
//		Courses ct=null;
//		int i=0;
//		for(Courses itr:list) {
//			if(itr.getId()==c.getId()) {
//				list.set(i, c);
//				ct=c;
//				break;
//			}
//			i++;
//		}
		cd.save(c);
		return c; 
	}

	@Override
	public void removeCourse(String courseId) {
		// TODO Auto-generated method stub
//		Courses c=null;
//		for(Courses itr:list) {
//			if(itr.getId()==Long.parseLong(courseId)) {
//				list.remove(itr);
//				c=itr;
//				break;
//			}
//		}
		cd.deleteById(Long.parseLong(courseId));
	}

}
