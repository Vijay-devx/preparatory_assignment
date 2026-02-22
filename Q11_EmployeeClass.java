
/*
    Q11. Create a structure called Employee that includes three fields - a first
         name (type String), a last name (type String) and a monthly salary (double).
         Write functions to initialize the fields, print them and modify the values in
         the given object. Example methods:
          void emp_init(struct emp* e);
          void set_salary(struct emp *e, double sal);
          void emp_display(struct emp *e);

           Write the test code in the main(). Create two emp objects and display each
           object’s yearly salary. Then give each Employee a 10% raise and display
           each Employee’s yearly salary again.

*/



class Employee
{
    String first_name;
    String last_name;
    double monthly_salary;
    int hike_percentage;

    Employee(String f, String l, double salary, int percent)
    {
        first_name = f;
        last_name = l;
        monthly_salary = salary;
        hike_percentage = percent;
    }

    double getYearlySalary()
    {
        return monthly_salary * 12;
    }

    void applyRaise()
    {

         monthly_salary = monthly_salary + monthly_salary * (hike_percentage / 100.0);
    }

    double getYearlyHiked()
    {
        return  monthly_salary * 12;
    }

    void display()
    {

        System.out.println(first_name+" "+last_name+":");

        System.out.println("Before Hike: ");

        System.out.println("monthly salary = "+monthly_salary);
        System.out.println("yearly salary = "+getYearlySalary());

        applyRaise();

        System.out.println("\nAfter hike: ");

        System.out.println("Monthly Salary = "+monthly_salary);
        System.out.println("yearly salary = "+getYearlyHiked());

        System.out.println(); //just for separation between outputs
        

    }
}

public class Q11_EmployeeClass 
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ram", "kumar", 10000, 10);

        e1.display();

        Employee e2 = new Employee("shyam", "patel", 12000, 10);

        e2.display();

    }

    
}
