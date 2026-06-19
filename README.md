# Data Cleaning & Reporting Automation

## Overview

Data Cleaning & Reporting Automation is a Java-based project that automates the process of cleaning employee data, removing duplicates, handling missing values, standardizing inconsistent records, and generating automated reports.

This project demonstrates practical data processing and reporting skills commonly used in data analytics and software development.

## Features

* Read employee data from CSV files
* Handle missing employee names
* Handle missing salary values
* Standardize department names
* Remove duplicate records
* Generate cleaned CSV output
* Generate automated text reports
* Calculate employee statistics
* Calculate average salary
* Generate department-wise employee counts

## Technologies Used

* Java
* IntelliJ IDEA
* CSV Files
* Java Collections Framework
* File Handling

## Project Structure

DataCleaningAutomation

├── data

│ ├── employees.csv

│ ├── cleaned_employees.csv

│ └── report.txt

├── src

│ └── com.project

│ ├── Main.java

│ ├── DataCleaner.java

│ └── ReportGenerator.java

├── README.md

└── Project_Report.docx

## Workflow

1. Read employee data from CSV file.
2. Detect missing values.
3. Replace missing names with "Unknown".
4. Replace missing salaries with default values.
5. Standardize department names.
6. Remove duplicate records.
7. Generate cleaned CSV file.
8. Generate employee report.
9. Display analytics summary.

## Sample Output

### Cleaned Record

1,John,It,50000

22,Unknown,Hr,50000

47,Unknown,It,62000

### Report Output

Total Employees : 49

Total Salary : 2740000

Average Salary : 55918.36

Department Wise Count:

It : 14

Hr : 13

Finance : 11

Marketing : 11

## Learning Outcomes

* Java File Handling
* Exception Handling
* Collections (HashSet, HashMap)
* Data Cleaning Techniques
* Report Generation
* CSV Processing
* Data Analytics Fundamentals

## Future Enhancements

* Export reports to Excel
* Generate graphical charts
* Build a Java Swing dashboard
* Connect with databases
* Add real-time data processing

## Author

S R Srujan
