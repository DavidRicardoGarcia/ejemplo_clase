package com.departamento.departamento.controller;

 
import com.departamento.departamento.entity.Department;
import com.departamento.departamento.service.DepartmentService;
import java.util.List;
import javax.validation.Valid;
// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class DepartmentController {
 
    // Annotation
    @Autowired private DepartmentService departmentService;
 
    // Save operation
    @PostMapping("/departments")
    //@PostMapping(value = "/departments", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Department saveDepartment(
        @Valid @RequestBody Department department)
    {   System.out.println("post a dept");
        return departmentService.saveDepartment(department);
    }
 
    // Read operation
    @GetMapping("/departments")
    //@RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> fetchDepartmentList()
    {   System.out.println("get all dept");
        return departmentService.fetchDepartmentList();
    }

        // Read operation
        @GetMapping("/num-departments")
        //@RequestMapping(value = "/departments", method = RequestMethod.GET)
        public int numDepartments()
        {   System.out.println("get all dept");
            return departmentService.fetchDepartmentList().size();
        }
 
    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {   System.out.println("put a dept");
        return departmentService.updateDepartment(
            department, departmentId);
    }
 
    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                       Long departmentId)
    {   System.out.println("del a dept");
        departmentService.deleteDepartmentById(
            departmentId);
        return "Deleted Successfully";
    }
}