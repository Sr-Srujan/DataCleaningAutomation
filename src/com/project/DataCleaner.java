package com.project;

public class DataCleaner {

    public static String cleanDepartment(String department) {
        return department.substring(0,1).toUpperCase() +
                department.substring(1).toLowerCase();
    }

    public static String cleanName(String name) {
        if(name == null || name.trim().isEmpty()) {
            return "Unknown";
        }
        return name;
    }

    public static String cleanSalary(String salary) {
        if(salary == null || salary.trim().isEmpty()) {
            return "50000";
        }
        return salary;
    }
}
