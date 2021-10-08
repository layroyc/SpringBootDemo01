package com.wy.controller;

import com.wy.bean.Student;
import com.wy.respcode.Result;
import com.wy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //全查  注意 不用 map  公司中 都用 一个类， 好几个类组成的类， 叫做 统一响应类， 每个公司都不一样
    @RequestMapping("/selectAll")    //   /student/selectAll
    public Result selectALL(){

        List<Student> students = studentService.selectByExample(null);
        //Result result = new Result(students);
        //return result;  或

        return new Result(students);//匿名内部类
    }

    //分页查询   带参数的+分页查询
    @RequestMapping("/selectAllByPage")
    public Result selectAllByPage(){
        return null;
    }
}
