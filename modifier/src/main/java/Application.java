public class Application {

  public static void main(String[] args) {
    Teacher teacherS = new Teacher("Solider");
    Teacher teacherB = new Teacher("Bob");
    teacherS.addStudent("Mary",95);
    teacherB.addStudent("Cindy",80);
    teacherS.addPoints(0,5);
    teacherB.addPoints(0,5);
    teacherS.printTeacherStatus();
    teacherB.printTeacherStatus();
  }

}
