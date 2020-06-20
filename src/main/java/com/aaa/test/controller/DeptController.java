package com.aaa.test.controller;


import com.aaa.test.entity.Dept;
import com.aaa.test.entity.ResultData;
import com.aaa.test.service.DeptService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author AAATeacherChen
 * @since 2020-06-19
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/deptList")
    public String toDeptList(){
        return "DeptList";
    }
    @RequestMapping("/selectAllDept")
    @ResponseBody
    public ResultData selectAllDept(){
        List<Dept> list = deptService.selectList(null);
        return new ResultData(0,"查询成功",0,list);
    }
    @RequestMapping("/selectById")
    @ResponseBody
    public Dept selectById(Integer deptId){
        Dept dept = deptService.selectById(deptId);
        return dept;
    }
    @RequestMapping("/updateDept")
    @ResponseBody
    public ResultData updateDept(Dept dept){
        Wrapper<Dept> wrapper = new EntityWrapper<Dept>();
        boolean a = deptService.updateById(dept);
        if(a){
            return new ResultData(0,"修改成功",0,null);
        }else {
            return new ResultData(0,"修改失败",0,null);
        }
    }

}

