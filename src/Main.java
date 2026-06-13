package src;


public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        
          Student s1 = new Student(
                1,
                "Kushan",
                "ICT",
                21,
                "kushan@gmail.com",
                "0712345678"
        );

        // INSERT
        manager.addStudentToDB(s1);

        // VIEW
        manager.viewStudentsDB();

        // UPDATE
        manager.updateStudentInDB(1, "Kushan Updated", "SE", 25, "malidukushan2001@gmail.com", "04455688");

        // DELETE
        //manager.deleteStudentFromDB(1);
    }
       
    
    }

