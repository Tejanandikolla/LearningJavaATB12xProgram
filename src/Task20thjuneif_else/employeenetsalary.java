//20)  Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,) Reserch from your side for this program.

package Task20thjuneif_else;

import java.util.Scanner;

public class employeenetsalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double basic_pay=scanner.nextDouble();
        double HRA=basic_pay*0.20;
        double DA=basic_pay*0.10;
        double tax=0;
        double gross_salary= basic_pay+HRA+DA;
        if(gross_salary>50000){
            tax=gross_salary*0.10;

        }
        double net_salary=gross_salary-tax;
        System.out.println("\n===== Salary Breakdown =====");
        System.out.println("Basic Pay      :" + basic_pay);
        System.out.println("HRA (20%)      :" + HRA);
        System.out.println("DA (10%)       :" + DA);
        System.out.println("Gross Salary   : " + gross_salary);
        System.out.println("Tax Deduction  :" + tax);
        System.out.println("-------------------------------");
        System.out.println("Net Salary     : RS " + net_salary);
        }

    }

