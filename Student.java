package Student_Registration;

class Student extends Registration {

    private String first_name;
    private String last_name;
    private String ID;
    private String department;
    private int year;

    public void setInfo(String first_name, String last_name, String id, String department, int year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.ID = id;
        this.department = department;
        this.year = year;

    }

    public String get_first_name() {
        return first_name;
    }

    public String get_last_name() {
        return last_name;
    }

    public String get_id() {
        return ID;
    }

    public String get_department() {
        return department;
    }

    public int get_year() {
        return year;
    }

    public void course() {

        // initiallize course hashmap so that
        // super.get_course();

    }

}
