package org.example.March17ExamQuestion;

public class Employee {
    private Integer empId;
    private String empName;
    private String empAddress;
    private String empEmail;
    private Integer empExperience;
    private Double empSalary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public Integer getEmpExperience() {
        return empExperience;
    }

    public void setEmpExperience(Integer empExperience) {
        this.empExperience = empExperience;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empExperience=" + empExperience +
                ", empSalary=" + empSalary +
                '}';
    }
}
