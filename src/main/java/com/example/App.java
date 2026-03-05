package com.example;

public class App {
public static String calculateGrade(int marks) { if (marks >= 90) return "A";
else if (marks >= 80) return "B";
else if (marks >= 70) return "C"; else if (marks >= 60) return "D"; else return "F";
}

public static void main(String[] args) {
System.out.println("Grade for 85: " + calculateGrade(85));
}
}
