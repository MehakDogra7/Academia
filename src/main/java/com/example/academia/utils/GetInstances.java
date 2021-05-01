package com.example.academia.utils;

import com.example.academia.service.StudentOperationsServiceImpl;

public class GetInstances {
    private static StudentOperationsServiceImpl studentOperationsServiceImpl;

    public static StudentOperationsServiceImpl getInstanceOfStudentOperationService() {
        if (studentOperationsServiceImpl != null) return studentOperationsServiceImpl;

        studentOperationsServiceImpl = new StudentOperationsServiceImpl();
        return studentOperationsServiceImpl;
    }
}
