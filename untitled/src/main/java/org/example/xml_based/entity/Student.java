package org.example.xml_based.entity;

public class Student {
    private Integer studentId;
    private String studName;
    private Integer studRollNumber;
    private String subjectId;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public Integer getStudRollNumber() {
        return studRollNumber;
    }

    public void setStudRollNumber(Integer studRollNumber) {
        this.studRollNumber = studRollNumber;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studName='" + studName + '\'' +
                ", studRollNumber=" + studRollNumber +
                ", subjectId='" + subjectId + '\'' +
                '}';
    }
}
