package com.project;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String filePath = "data/employees.csv";
        String outputFile = "data/cleaned_employees.csv";

        Set<String> uniqueRecords = new HashSet<>();

        int employeeCount = 0;
        double totalSalary = 0;

        Map<String, Integer> departmentCount = new HashMap<>();

        try (
                BufferedReader br = new BufferedReader(new FileReader(filePath));
                FileWriter writer = new FileWriter(outputFile)
        ) {

            br.readLine(); // Skip header

            writer.write("ID,Name,Department,Salary\n");

            String line;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",", -1);

                String id = data[0];
                String name = DataCleaner.cleanName(data[1]);
                String dept = DataCleaner.cleanDepartment(data[2]);
                String salary = DataCleaner.cleanSalary(data[3]);

                String cleanedRecord =
                        id + "," +
                                name + "," +
                                dept + "," +
                                salary;

                if (!uniqueRecords.contains(cleanedRecord)) {

                    uniqueRecords.add(cleanedRecord);

                    writer.write(cleanedRecord + "\n");

                    employeeCount++;

                    totalSalary += Double.parseDouble(salary);

                    departmentCount.put(
                            dept,
                            departmentCount.getOrDefault(dept, 0) + 1
                    );

                    System.out.println("Saved: " + cleanedRecord);
                }
            }

            double averageSalary = totalSalary / employeeCount;
            ReportGenerator.generateReport(
                    employeeCount,
                    totalSalary,
                    averageSalary,
                    departmentCount
            );

            System.out.println("\n===== REPORT =====");

            System.out.println("Total Employees : " + employeeCount);

            System.out.println("Total Salary    : " + totalSalary);

            System.out.println("Average Salary  : " + averageSalary);

            System.out.println("\nDepartment Wise Count:");

            for (Map.Entry<String, Integer> entry : departmentCount.entrySet()) {

                System.out.println(
                        entry.getKey() + " : " + entry.getValue()
                );
            }

            System.out.println("\nCleaning Completed!");
            System.out.println("Cleaned file generated successfully.");
            System.out.println("\nReport saved to data/report.txt");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}