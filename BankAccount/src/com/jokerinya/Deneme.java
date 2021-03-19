package com.jokerinya;

public class Deneme {
    private String number;
    private int studentTrueAnswers;
    private int studentFalseAnswers;
    private String studentName;
    private String studentEmail;

    public Deneme(String studentName, String studentEmail) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getStudentTrueAnswers() {
        return studentTrueAnswers;
    }

    public void setStudentTrueAnswers(int studentTrueAnswers) {
        this.studentTrueAnswers = studentTrueAnswers;
    }

    public int getStudentFalseAnswers() {
        return studentFalseAnswers;
    }

    public void setStudentFalseAnswers(int studentFalseAnswers) {
        this.studentFalseAnswers = studentFalseAnswers;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }



}
