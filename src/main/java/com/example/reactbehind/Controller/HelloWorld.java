package com.example.reactbehind.Controller;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("list1")
public class HelloWorld {
    @ResponseBody
    public String list0(){
        return " OK ";
    }

    @PostMapping
    public String list1(){
        return " OK ";
    }

    @GetMapping
    public SecurityProperties.User list2(){
        return null;
    }


    @PostMapping("list")
    public Map<String, Object> list(
                       @RequestParam(required = false, defaultValue = "1") int userid,
                       @RequestParam(required = false, defaultValue = "zmjxx2003121") String passwrd)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/reactsql?useSSL=false","root","zmjxx2003121");
            Statement stmt = conn.createStatement();
            String sql = "select * from reactsql_user WHERE USERID = "+userid;
            ResultSet rs =  stmt.executeQuery(sql);
            while(rs.next()){
                String psw = rs.getString("psw");
                if(passwrd==psw) {
                    Map<String, Object> data = new HashMap<>();
                    data.put("passWrd", passwrd);

                    Map<String, Object> response = new HashMap<>();
                    response.put("success", true);
                    response.put("message", "Data retrieved successfully");
                    response.put("data", data);

                    return response;
                }
                else {
                    Map<String, Object> data = new HashMap<>();
                    data.put("passWrd", passwrd);

                    Map<String, Object> response = new HashMap<>();
                    response.put("success", true);
                    response.put("message", "Data retrieved successfully");
                    response.put("data", data);

                    return response;
                }
            }



        } catch (Exception e) {
            e.printStackTrace();
            Map<String, Object> data = new HashMap<>();
            data.put("passWrd", e.getMessage());

            Map<String, Object> response = new HashMap<>();
            response.put("success", true);
            response.put("message", "Data retrieved successfully");
            response.put("data", data);

            return response;
        }

        Map<String, Object> data = new HashMap<>();
        data.put("passWrd", "");

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "Data retrieved successfully");
        response.put("data", data);

        return response;
    }
}
