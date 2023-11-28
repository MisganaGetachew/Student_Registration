package Student_Registration;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Admin {
    // things Admin can do
    // add/remove cources
    // see List of registerd students
    // Remove Students

    public void output(ArrayList<Registration> all_students) {

        System.out.print("" +
                "--------------------------------------- R E G I S T T E R E D  S T U D E N T 'S   L I S T --------------------------------\n"
                + "| ID  | FRIST NAME | LAST NAME | DEPARTMENT | YEAR\n");
        for (Registration student : all_students) {

            System.out.println(student.get_id() + "  " + student.get_first_name() + "  " + student.get_last_name()
                    + "  " + student.get_department() + "  " + student.get_year() + "  ");

        }
    }

    void find_student(ArrayList<Registration> all_students, String Id) {

        Boolean exists = false;

        for (Registration student : all_students) {

            if (student.get_id().equals(Id.toUpperCase())) {

                exists = true;
                System.out.println(student.get_id() + " " + student.get_first_name() + " " + student.get_last_name()
                        + " " + student.get_department() + " " + student.get_year());
                break;

            }

        }

        if (!exists) {
            System.out.println("student with the provided ID couldn't be found");
        }

    }

    boolean deleted;

    void delete_student(ArrayList<Registration> all_students, String Id) {
        Boolean exists = false;
        for (Registration student : all_students) {

            if (student.get_id().equals(Id.toUpperCase())) {

                exists = true;
                all_students.remove(student);
                System.out.println(student.get_first_name() + " Removed from Registerd List succesfully! ");
                // this.testing_delete_course(exists);

                break;

            }

        }

        if (exists) {
            System.out.println("student with the provided ID couldn't be found");

            // this.testing_delete_course(exists);
        }
    }

    boolean testing_delete_course() {

        return this.deleted;

    }

    void add_course(Registration student, int val) {

        Scanner input_value = new Scanner(System.in);

        if (val == 1) {
            student.initiallize_course_swe();
            System.out.println("insert the cources code");
            String code = input_value.next();
            System.out.println("insert the cources Name");
            String name = input_value.next();
            student.set_course_swe(code, name);
            System.out.println("Course Added successully!!  ");

        }

        else if (val == 2) {

            student.initialize_course_comp_engineering();
            System.out.println("insert the cources code");
            String code = input_value.next();
            System.out.println("insert the cources Name");
            String name = input_value.next();
            student.set_course_cmp_eng(code, name);
            System.out.println("Course Added successully!!  ");

        }

        else if (val == 3) {

            student.initialize_course_economics();
            System.out.println("insert the cources code");
            String code = input_value.next();
            System.out.println("insert the cources Name");
            String name = input_value.next();
            student.set_course_econ(code, name);
            System.out.println("Course Added successully!!  ");

        }
    }

    void remove_course(Registration student, int val, Scanner input_value) {

        // input_value = new Scanner(System.in);

        if (val == 1) {
            student.initiallize_course_swe();
            System.out.println("insert the cources code");
            String code = input_value.next();
            if (student.get_course_swe().containsKey(code)) {
                student.get_course_swe().remove(code);
                deleted = true;
                System.out.println("Course deleted successully!!  ");

            } else {
                System.out.println("oops the provided code doesn't refer to any of the subjects stored");

            }

        }

        else if (val == 2) {

            student.initialize_course_comp_engineering();
            System.out.println("insert the cources code");
            String code = input_value.next();
            if (student.get_course_cmp_eng().containsKey(code)) {
                student.get_course_cmp_eng().remove(code);
                deleted = true;
                System.out.println("Course deleted successully!!  ");

            } else {
                deleted = false;
                System.out.println("oops the provided code doesn't refer to any of the subjects stored");

            }

        }

        else if (val == 3) {

            student.initialize_course_economics();
            System.out.println("insert the cources code");
            String code = input_value.next();
            if (student.get_course_econ().containsKey(code)) {
                student.get_course_econ().remove(code);
                deleted = true;
                System.out.println("Course deleted successully!!  ");

            } else {
                deleted = false;
                System.out.println("oops the provided code doesn't refer to any of the subjects stored");

            }

        }
    }

    void add_student(ArrayList<Registration> all_students, Registration student) {
        Boolean exists = false;
        String taken_id = "";

        Scanner input_value = new Scanner(System.in);

        System.out.println("""
                --- PROVIDE STUDENT'S INFORMATION ---

                """);
        System.out.print("STUDENT'S FIRST NAME:- ");
        String Fname = input_value.next();
        System.out.print("STUDENT'S LAST NAME:- ");
        String Lname = input_value.next();
        System.out.print("STUDENT'S ID:- ");
        String ID = input_value.next();

        for (Registration stud : all_students) {

            if (stud.get_id().equals(ID.toUpperCase())) {

                exists = true;
                taken_id = stud.get_first_name();
                break;

            }

        }
        if (exists) {
            System.out.println("ID has been taken by " + taken_id + " Plesase use A different one");
            System.out.print("STUDENT'S ID:- ");
            ID = input_value.next();

        }

        System.out.print("STUDENT'S DEPARTMENT:- ");
        String department = input_value.next();
        System.out.print("STUDENT'S YEAR OF STUDY(1 - 7):- ");
        int year = input_value.nextInt();

        student.setInfo(Fname.toUpperCase(), Lname.toUpperCase(), ID.toUpperCase(), department.toUpperCase(),
                year);
        student.set_student_object(student);

        System.out.println("student registerd succesfully ");

    }
}
