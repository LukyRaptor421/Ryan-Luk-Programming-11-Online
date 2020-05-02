public class Main {
    public static void main(String[] args) {
        School semiahmoo = new School("Semiahmoo", "Bal Ranu", "South Surrey");
        System.out.println(semiahmoo.getSchoolCity());

        Teacher bob = new Teacher("Bob", "Roberts", "Social Studies");
        Teacher steve = new Teacher ("Steven", "Luke", "Physics");
        Teacher melanie = new Teacher ("Melanie", "Friesen", "Mathematics");
        Teacher lydia = new Teacher ("Lydia", "Larson", "Biology");
        Teacher tony = new Teacher ("Tony", "Chio", "Chemistry");
        Teacher roger = new Teacher ("Roger", "Federer", "Physical Health Education");
        Teacher paul = new Teacher ("Paul", "Zaremba", "Computers");
        Teacher matthew = new Teacher ("Matthew", "Mitchell", "English");
        Teacher sophie = new Teacher ("Sophie", "Brouillard", "French");
        Teacher johnson = new Teacher ("Johnson", "Blair", "Careers");
        Teacher kayla = new Teacher ("Kayla", "Ray", "P.E. Leadership");
        Teacher fernando = new Teacher ("Fernando", "Rodriguez", "Spanish");
        Teacher aisha = new Teacher ("Aisha", "Singh", "Concert Band");
        Teacher alex = new Teacher ("Alex", "Kim", "Art");
        Teacher hugh = new Teacher ("Hugh", "Stolkholm", "Drama");


        Student maximo = new Student ("Maximo", "Cannon", 10);
        Student ryaan = new Student ("Ryaan", "Huber", 11);
        Student michelle = new Student ("Michelle", "Osipova", 9);
        Student angeline = new Student ("Angeline", "Castenada", 12);
        Student amber = new Student ("Amber", "Stark", 8);
        Student michael = new Student ("Michael", "Kennedy", 10);
        Student tristan = new Student ("Tristan", "Salzmann", 11);
        Student kevin = new Student ("Kevin", "Chang", 9);
        Student jarvis = new Student ("Jarvis", "Palmer", 12);
        Student louis = new Student ("Louis", "Wheeler", 8);
        Student james = new Student ("James", "Peterson", 10);
        Student christian = new Student ("Christian", "Poole", 11);
        Student jayden = new Student ("Jayden", "Halabi", 9);
        Student john = new Student ("John", "Hudson", 12);
        Student summer = new Student ("Summer", "Ballard", 8);
        Student jordan = new Student ("Jordan", "Matter", 10);
        Student rico = new Student ("Rico", "Perez", 11);
        Student daniel = new Student ("Daniel", "Lee", 9);
        Student benjamin = new Student ("Benjamin", "Farmer", 12);
        Student alexander = new Student ("Alexander", "Gordon", 8);
        Student rey = new Student ("Rey", "Booker", 10);
        Student elena = new Student ("Elena", "McGill", 11);
        Student mackenzie = new Student ("Mackenzie", "Payne", 9);
        Student mira = new Student ("Mira", "Salinas", 12);
        Student stefanos = new Student ("Stefanos", "Dell", 8);
        Student elias = new Student ("Elias", "Kim", 10);
        Student lex = new Student ("Lex", "Spencer", 11);
        Student harley = new Student ("Harley", "Davidson", 9);
        Student maya = new Student ("Maya", "Djokovic", 12);
        Student kyle = new Student ("Kyle", "Terrell", 8);
        Student bryce = new Student ("Bryce", "Monroe", 10);
        Student edward = new Student ("Edward", "Lyell", 11);
        Student marcus = new Student ("Marcus", "Eaton", 9);
        Student jacob = new Student ("Jacob", "Robertson", 12);
        Student antonio = new Student ("Antonio", "Baldeserra", 8);
        Student katie = new Student ("Katie", "Myles", 10);
        Student bill = new Student ("Bill", "Clements", 11);
        Student hassan = new Student ("Hassan", "Khan", 9);
        Student avery = new Student ("Avery", "Ponce", 12);
        Student jelena = new Student ("Jelena", "Harrington", 8);

        System.out.println(aisha.getLastName());
        System.out.println(avery.getStudentNum());
    }
}