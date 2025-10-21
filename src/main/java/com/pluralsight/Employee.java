package com.pluralsight;

import java.time.LocalTime;

public class Employee {

    //employeeId, name, department, payRate, hoursWorked.
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * 1.5 * payRate );
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours(){
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    private double punchInTime = 0;

    public void punchIn(double time){
        this.punchInTime = time;
    }

    public void punchIn(){
//        LocalTime lt = LocalTime.now();
//        int hours = lt.getHour();
//        int minutes = lt.getMinute();
//        double timeAsDouble = hours + ((double) minutes / 60);
//
//        this.punchInTime = timeAsDouble;

        LocalTime lt = LocalTime.now();
        this.punchInTime   = lt.getHour() + ((double) lt.getMinute() / 60);



    }

    public void punchOut(double time){
        //double elapsedTime = time - this.punchInTime;
        //this.hoursWorked += (float) elapsedTime;

        this.hoursWorked += (float) (time - this.punchInTime);

    }

    public void punchOut(){
//        LocalTime lt = LocalTime.now();
//        double punchOutAsDouble =  lt.getHour() + ((double) lt.getMinute() / 60);
//        this.hoursWorked += (float) (punchOutAsDouble - this.punchInTime);
//
        LocalTime lt = LocalTime.now();
        this.hoursWorked += (float) ( lt.getHour() + ((double) lt.getMinute() / 60) - this.punchInTime);

    }

    public void punchTimeCard(double checkInTime, double checkOutTime){
        this.hoursWorked += (float) (checkOutTime - checkInTime);
    }

    public void logHours(float hours){
        this.hoursWorked += hours;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", payRate=" + payRate +
                ", hoursWorked=" + hoursWorked +
                ", getTotalPay()=" + getTotalPay() +
                ". getRegularHours()=" + getRegularHours() +
                ", getOvertimeHours()=" + getOvertimeHours() +
                '}';
    }
}
