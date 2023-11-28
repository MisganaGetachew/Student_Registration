package Student_Registration;

public class Output {
    public void show_output(Registration obj, int val) {
        String slip = """


                |---------------------------------------------------- R E G I S T R A T I O N    S L I P -----------------------------------------------------|

                |S T U D E N T  I N F O R M A T I O N|

                            |S C H O O L: - HARAMAYA UNIVERSITY|                                   D E P A R T M E N T: - %s|

                            |F I R S T  N A M E: - %s               L A S T  N A M E: - %s          ID: - %s               | Y E A R: - %s |

                                         ---------------------------------------------------------------------------------------------------
                                                 """;
        System.out.println(
                String.format(slip, obj.get_department(), obj.get_first_name(), obj.get_last_name(), obj.get_id(),
                        obj.get_year()));
        System.out.println("""

                        C O U R C E S  T O  B E  T A K E N:

                """);
        if (val == 1) {
            obj.get_course_swe().forEach((key, value) -> System.out.println(key + " " + value));
        }

        else if (val == 2) {
            obj.get_course_cmp_eng().forEach((key, value) -> System.out.println(key + " " + value));
        }

        else if (val == 3) {
            obj.get_course_econ().forEach((key, value) -> System.out.println(key + " " + value));

        }

        System.out.println("""

                                                                    -------------------------------------------
                                                                        |  YOU'VE SUCCESSFULLY REGISTERED  |
                                                                    ------------------------------------------

                """);

    }
}
