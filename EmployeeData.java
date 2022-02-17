import java.util.Scanner;

public class EmployeeData 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        int n=0, MAX=100;
        int EmpNo[] = new int[MAX];
        int Basic[] = new int[MAX]; 
        int HRA[] = new int[MAX]; 
        int IT[] = new int[MAX]; 

        String EmpName[] = new String[MAX];
        String JoinDate[]= new String[MAX];
        String Designation[]= new String[MAX];
        String Department[]= new String[MAX];

        while(true)
        {
            if(n==0)
            {
                System.out.println("\n\nTable Empty...Create...");
                System.out.print("\n\nEnter number of Employees to add: ");
                n= inp.nextInt();
                for(int i=0; i<n;i++)
                {
                    System.out.println("\n\nEnter Data for Employee "+(i+1)+": \n");

                    System.out.print("\nEnter Employee Name: ");
                    EmpName[i]= inp.next();

                    System.out.print("\nEnter Employee ID: ");
                    EmpNo[i]= inp.nextInt();

                    System.out.print("\nEnter Join Date (dd/mm/yyyy): ");
                    JoinDate[i]= inp.next();

                    System.out.print("\nEnter Designation Code: ");
                    Designation[i]= inp.next();

                    System.out.print("\nEnter Department: ");
                    Department[i]= inp.next();

                    System.out.print("\nEnter Basic: ");
                    Basic[i]= inp.nextInt();

                    System.out.print("\nEnter HRA: ");
                    HRA[i]= inp.nextInt();

                    System.out.print("\nEnter IT: ");
                    IT[i]= inp.nextInt();
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("\n\nList of Employees...\n\n");
            System.out.println("\nEID.\t\t\tEmployee Name\t\tJoining Date\t\tD.Code\t\tDepartment\t\tBasic\t\tHRA\t\tIT\n");
            for(int i = 0; i <n;i++)
            {
                System.out.println("\n\n"+EmpNo[i]+"\t\t\t"+EmpName[i]+"\t\t\t"+JoinDate[i]+"\t\t\t"+Designation[i]+"\t\t"+Department[i]+"\t\t"+Basic[i]+"\t\t"+HRA[i]+"\t\t"+IT[i]);
            }

            System.out.println("\n\n\n\tEmployee Database Access Menu\n\n");
            System.out.println("\n1. Add Employee.");
            System.out.println("\n2. Calculate Salary. ");
            System.out.println("\n3. Designation Details. ");
            System.out.println("\n0. Exit. ");


            System.out.print("\n\nEnter Choice: ");
            int choice = inp.nextInt();

            switch (choice)
            {
                case 1:
                    n++;
                    System.out.println("\n\nEnter Data for Employee "+n+": \n");

                    System.out.print("\nEnter Employee Name: ");
                    EmpName[n-1]= inp.next();

                    System.out.print("\nEnter Employee ID: ");
                    EmpNo[n-1]= inp.nextInt();

                    System.out.print("\nEnter Join Date (dd/mm/yyyy): ");
                    JoinDate[n-1]= inp.next();

                    System.out.print("\nEnter Designation Code: ");
                    Designation[n-1]= inp.next();

                    System.out.print("\nEnter Department: ");
                    Department[n-1]= inp.next();

                    System.out.print("\nEnter Basic: ");
                    Basic[n-1]= inp.nextInt();

                    System.out.print("\nEnter HRA: ");
                    HRA[n-1]= inp.nextInt();

                    System.out.print("\nEnter IT: ");
                    IT[n-1]= inp.nextInt();

                    break;

                case 2:
                    System.out.print("Enter EID to check salary: ");
                    int check = inp.nextInt();
                    int temp = 0;
                    while(EmpNo[temp]!=check)
                    {
                        temp++;
                    }
                    int salary=0;
                    switch (Designation[temp])
                    {
                        case "e":
                            salary = Basic[temp]+20000+HRA[temp]-IT[temp];
                            break;
                        case "c":
                            salary = Basic[temp]+32000+HRA[temp]-IT[temp];
                        case "k":
                            salary = Basic[temp]+12000+HRA[temp]-IT[temp];
                        case "r":
                            salary = Basic[temp]+15000+HRA[temp]-IT[temp];
                        case "m":
                            salary = Basic[temp]+40000+HRA[temp]-IT[temp];
                    }
                    System.out.println("Salary = "+salary+"\n\n\nPress any button to continue...");
                    inp.next();
                    break;

                case 3: 
                    System.out.print("Enter EID to check designation: ");
                    int chek = inp.nextInt();
                    int t = 0;
                    while(EmpNo[t]!=chek)
                    {
                        t++;
                    }
                    switch (Designation[t])
                    {
                        case "e": System.out.println("Designation : Engineer "); break;
                        case "c": System.out.println("Designation : Consultant "); break;
                        case "k": System.out.println("Designation : Clerk "); break;
                        case "r": System.out.println("Designation : Receptionist "); break;
                        case "m": System.out.println("Designation : Manager "); break;
                    }
                    System.out.println("\n\n\nPress any button to continue...");
                    inp.next();
                    break;
                    
                case 0: 
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    inp.close();
                    System.exit(0);break;

                default: System.out.println("\n\nInvalid Choice...Go back to start...");

            }
        }
    }    
}
