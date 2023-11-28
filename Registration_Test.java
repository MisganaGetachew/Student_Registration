package Student_Registration;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Registration_Test {

    @Test
    public void Admin_Find_Student_Test() {

        Registration student = new Student();
        student.setInfo("Misgana", "Getachew", "T/4918/14", "swe", 4);
        student.set_student_object(student);

        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        Admin admin = new Admin();

        admin.find_student(student.get_student_objects(), "T/4918/14");
        String expectedOutput = "T/4918/14 " + "Misgana " + "Getachew " + "swe " + 4;
        // Add expected student information here...

        // Assert if the captured output matches the expected output
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void Admin_remove_course_test() {

        Registration student = new Student();
        student.setInfo("Misgana", "Getachew", "T/4918/14", "swe", 4);
        student.set_student_object(student);

        Scanner input_value = new Scanner("DSA");
        Admin admin = new Admin();
        admin.remove_course(student, 1, input_value); // Assuming val = 1 for this test

        assertEquals(false, admin.testing_delete_course());
    }

    @Test
    public void StudentTest() {
        Registration student = new Student();
        student.setInfo("Misgana", "Getachew", "T/4918/14", "swe", 4);

        assertEquals("Misgana", student.get_first_name());

    }

}
