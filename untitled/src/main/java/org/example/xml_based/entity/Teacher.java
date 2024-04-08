package org.example.xml_based.entity;

public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private String teacherQualification;
    private Integer experienceOfTeaching;
    private Integer studentId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherQualification() {
        return teacherQualification;
    }

    public void setTeacherQualification(String teacherQualification) {
        this.teacherQualification = teacherQualification;
    }

    public Integer getExperienceOfTeaching() {
        return experienceOfTeaching;
    }

    public void setExperienceOfTeaching(Integer experienceOfTeaching) {
        this.experienceOfTeaching = experienceOfTeaching;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherQualification='" + teacherQualification + '\'' +
                ", experienceOfTeaching=" + experienceOfTeaching +
                ", studentId=" + studentId +
                '}';
    }
}