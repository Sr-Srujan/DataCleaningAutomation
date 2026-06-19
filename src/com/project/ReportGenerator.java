package com.project;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ReportGenerator {

    public static void generateReport(
            int employeeCount,
            double totalSalary,
            double averageSalary,
            Map<String, Integer> departmentCount
    ) {

        try (FileWriter writer = new FileWriter("data/report.txt")) {

            writer.write("===== EMPLOYEE REPORT =====\n\n");

            writer.write("Total Employees : "
                    + employeeCount + "\n");

            writer.write("Total Salary : "
                    + totalSalary + "\n");

            writer.write("Average Salary : "
                    + averageSalary + "\n\n");

            writer.write("Department Wise Count\n");

            for (Map.Entry<String, Integer> entry :
                    departmentCount.entrySet()) {

                writer.write(
                        entry.getKey() +
                                " : " +
                                entry.getValue() +
                                "\n"
                );
            }

            writer.write("\nReport Generated Successfully!");

        } catch (IOException e) {

            System.out.println(
                    "Error generating report: "
                            + e.getMessage()
            );
        }
    }
}