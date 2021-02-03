package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        List<Member> members = new ArrayList<>();

        employees.add(new Administration("Claus", "221175-1011"));
        employees.add(new Instructor("Tove", "011080-1014", 20));
        employees.add(new Administration("Anna", "011080-1012"));
        employees.add(new Instructor("Henning", "011080-1011", 15));

        members.add(new Member("Morten", "130195-1303", false));
        members.add(new Member("Martin", "221175-1011", true));
        members.add(new Member("Martina", "050970-1410", false));
        members.add(new Member("Marcel", "221175-1043", true));

        System.out.println("FITNESS EMPLOYEES");
        System.out.printf("%-10s %-15s %-10s %-15s %-10s %n", "Name", "Cpr", "Hours(Per week)", "Salary", "Vacation");
        System.out.println("---------------------------------------------------------------------");
        for (Employee employee : employees) {
            if (employee instanceof Administration) {
                System.out.printf("%-10s %-15s %-15s %-15s %-5s %n", employee.name, employee.cpr, employee.getHours(), employee.getSalary() + " kr.", ((Administration) employee).getVacation());
            } else {
                System.out.printf("%-10s %-15s %-15s %-15s %-5s %n", employee.name, employee.cpr, employee.getHours(), employee.getSalary() + " kr.", "");
            }
        }
        System.out.println("*********************************************************************");
        System.out.println();

        System.out.println("FITNESS MEMBERS");
        System.out.printf("%-10s %-15s %-15s %-15s %n", "Name", "Cpr", "Member type", "Fee");
        System.out.println("--------------------------------------------------");
        for (Member member : members) {
            System.out.printf("%-10s %-15s %-15s %-15s %n", member.name, member.cpr, member.getMemberType(), member.monthlyFee() + " kr.");
        }
        System.out.println("**************************************************");
        System.out.println();

        System.out.println("EMPLOYEES & MEMBERS NAME AND CPR");
        System.out.printf("%-10s %-15s %n", "Name", "Cpr");
        System.out.println("-----------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-10s %-15s %n", employee.name, employee.cpr);
        }
        for (Member member : members) {
            System.out.printf("%-10s %-15s %n", member.name, member.cpr);
        }
        System.out.println("*****************************");
        System.out.println();
    }
}
