package Student_Registration;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

abstract class Registration {
    // ArrayList<Student> grades = new ArrayList<>;
    private static ArrayList<Registration> students_list = new ArrayList<>();
    // Student[] students_array = new Student[100];
    private static HashMap<String, String> course_list_swe = new HashMap<String, String>();
    private static HashMap<String, String> course_list_cmp_eng = new HashMap<String, String>();
    private static HashMap<String, String> course_list_econ = new HashMap<String, String>();

    public abstract void setInfo(String first_name, String last_name, String id, String department, int year);

    public abstract String get_first_name();

    public abstract String get_last_name();

    public abstract String get_id();

    public abstract String get_department();

    public abstract int get_year();

    // public void output() {
    // System.out.println("abstracted class's method");
    // };

    public void set_student_object(Registration student) {

        students_list.add(student);

    }

    // for the admin to see all registerd students
    public ArrayList<Registration> get_student_objects() {

        return students_list;

    }

    public void set_course_swe(String key, String course) {
        course_list_swe.put(key, course);
    }

    public void set_course_cmp_eng(String key, String course) {
        course_list_cmp_eng.put(key, course);
    }

    public void set_course_econ(String key, String course) {
        course_list_econ.put(key, course);
    }

    public HashMap<String, String> get_course_econ() {

        return course_list_econ;

    }

    public HashMap<String, String> get_course_swe() {

        return course_list_swe;

    }

    public HashMap<String, String> get_course_cmp_eng() {

        return course_list_cmp_eng;

    }

    public void initiallize_course_swe() {

        if (course_list_swe.isEmpty()) {
            course_list_swe.put("AI", "Artificial Intelligence");
            course_list_swe.put("WD", "Web Development");
            course_list_swe.put("PR", "Programming");
            course_list_swe.put("CS", "Cybersecurity");
            course_list_swe.put("DA", "Data Analytics");
            course_list_swe.put("ML", "Machine Learning");
            course_list_swe.put("SE", "Software Engineering");
            course_list_swe.put("CC", "Cloud Computing");
        }

    }

    public void initialize_course_comp_engineering() {
        if (course_list_cmp_eng.isEmpty()) {
            course_list_cmp_eng.put("CSE101", "Introduction to Computer Science");
            course_list_cmp_eng.put("CSE102", "Data Structures and Algorithms");
            course_list_cmp_eng.put("CSE201", "Computer Organization");
            course_list_cmp_eng.put("CSE301", "Operating Systems");
        }
    }

    public void initialize_course_economics() {
        if (course_list_econ.isEmpty()) {
            course_list_econ.put("ECO101", "Microeconomics");
            course_list_econ.put("ECO102", "Macroeconomics");
            course_list_econ.put("ECO201", "Econometrics");
            course_list_econ.put("ECO301", "International Economics");
        }

    }
}
