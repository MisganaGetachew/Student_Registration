package Student_Registration;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;

public class Main {
    static int choice;

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    """


                            |--------------------------------- R E G I S T R A T I O N  W O R L D  -----------------------------|


                                                            1, S T U D E N T                           2, A D M I N                 3. Q U I T

                            """);
            try {
                Scanner input_value = new Scanner(System.in);
                choice = input_value.nextInt();
                Registration student = new Student();

                if (choice == 1) {
                    Output trial = new Output();

                    System.out.println("""
                            --- SO LET'S RECEIVE YOURE INFORMATIONS ---

                            """);

                    System.out.print("YOUR FIRST NAME:- ");
                    String Fname = input_value.next();
                    System.out.print("YOUR LAST NAME:- ");
                    String Lname = input_value.next();
                    System.out.print("YOUR ID:- ");
                    String ID = input_value.next();
                    System.out.print("YOUR DEPARTMENT:- ");
                    System.out.println("""
                            1, Software Engineering     2, Computer Engineering     3, Economics
                            """);
                    int dep_id = input_value.nextInt(4);
                    String department = "";
                    if (dep_id == 1) {
                        student.initiallize_course_swe();
                        department = "Software Engineering";
                    } else if (dep_id == 2) {
                        student.initialize_course_comp_engineering();
                        department = "Computer Engnineering";

                    } else if (dep_id == 3) {
                        student.initialize_course_economics();
                        department = "Economics";

                    } else {
                        System.out.println("Plesase insert a valid input");
                    }
                    System.out.print("YOUR YEAR OF STUDY(1 - 7):- ");
                    int year = input_value.nextInt();

                    student.setInfo(Fname.toUpperCase(), Lname.toUpperCase(), ID.toUpperCase(),
                            department.toUpperCase(),
                            year);
                    student.set_student_object(student);
                    System.out.println(
                            """

                                    ____________________________________ Y O U ' V E  R E G I S T E R E D   S U C C E S F U L L Y! ___________________________________

                                    INSERT
                                    1, To collect your slip      2, To continue      3, To exit

                                     """);
                    int choice2 = input_value.nextInt(4);
                    if (choice2 == 1) {

                        trial.show_output(student, dep_id);

                    }

                    else if (choice2 == 2) {

                        continue;

                    }

                    else if (choice2 == 3) {

                        System.exit(0);
                    }

                    else {
                        System.out.println("{Please Insert The Expected Value");
                        continue;
                    }

                }

                else if (choice == 3) {

                    System.exit(0);
                } else if (choice == 2) {
                    // Registration reg = new Student();
                    Admin admin = new Admin();
                    System.out.println(
                            """
                                    1, Show  Registered Students
                                    2, Find A student
                                    3, Add student
                                    4, Delete A student
                                    5, Add course
                                    6, Remove Course
                                    7, Go to main Page
                                    8, exit
                                    """);

                    int choice3 = input_value.nextInt(9);
                    if (choice3 == 1) {

                        if (student.get_student_objects().isEmpty()) {
                            System.out.println("""
                                    NO STUDENT REGISTERED AS OF NOW
                                    """);
                            continue;

                        }

                        else {

                            admin.output(student.get_student_objects());

                        }

                    } else if (choice3 == 2) {

                        if (student.get_student_objects().isEmpty()) {
                            System.out.println("""
                                    NO STUDENT REGISTERED AS OF NOW
                                    """);
                        } else {
                            System.out.println("insert Id of student to be found! ");
                            String student_id = input_value.next();
                            admin.find_student(student.get_student_objects(), student_id);
                        }

                    }

                    else if (choice3 == 4) {
                        if (student.get_student_objects().isEmpty()) {
                            System.out.println("""
                                    NO STUDENT REGISTERED AS OF NOW
                                    """);
                        } else {
                            System.out.println("insert Id of student to be deleted! ");
                            String student_id = input_value.next();
                            // admin.find_student(reg.get_student_objects(), );
                            admin.delete_student(student.get_student_objects(), student_id);
                        }

                    } else if (choice3 == 5) {
                        System.out.println("""
                                1, Software Engineering     2, Computer Engineering     3, Economics
                                """);
                        int dep_id = input_value.nextInt(4);
                        if (dep_id == 1) {

                            admin.add_course(student, dep_id);

                        }

                        else if (dep_id == 2) {
                            admin.add_course(student, dep_id);

                        } else if (dep_id == 3) {
                            admin.add_course(student, dep_id);

                        } else {
                            System.out.println("Plesase insert a valid input");
                        }

                    }

                    else if (choice3 == 6) {
                        System.out.println("""
                                Insert department to delete course from
                                1, Software Engineering     2, Computer Engineering     3, Economics
                                """);
                        int dep_id = input_value.nextInt(4);
                        if (dep_id == 1) {

                            admin.remove_course(student, dep_id);
                        }

                        else if (dep_id == 2) {
                            admin.remove_course(student, dep_id);

                        } else if (dep_id == 3) {
                            admin.remove_course(student, dep_id);

                        } else {
                            System.out.println("Plesase insert a valid input");
                        }

                    }

                    else if (choice3 == 3) {

                        admin.add_student(student.get_student_objects(), student);

                    }

                    else if (choice3 == 7) {

                        continue;

                    }

                    else if (choice3 == 8) {
                        System.exit(0);
                    } else {
                        System.out.println("plesase insert numbers ");
                    }

                }

                else {
                    System.out.println("Plesase insert a valid input");
                }

            } catch (InputMismatchException ex) {
                System.out.println("plesase insert a number value for ");
                continue;

            } catch (Exception e) {
                System.out.println("Please insert the expected input value");
                continue;
            }
        }

    }
}
