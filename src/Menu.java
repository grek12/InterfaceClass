import java.util.Scanner;

public class Menu {

    Cont cont = new Cont();
    Scanner scan = new Scanner(System.in);
    String s = "";
    int x = 0;
    String name,name2,n3,n4;
    public void  menu1(){
        while (!"6".equals(s)) {
            System.out.println("1. Добавить Студента");
            System.out.println("2. Добавить Сотрудника ");
            System.out.println("3. Добавить Студента-сотрудника");
            System.out.println("4. Вывод всех данных");
            System.out.println("5. Запрос данных ");
            System.out.println("6. Выход");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }
            switch (x) {
                case 1:
                    Student student = new Student();
                    System.out.println("Введите фамилию студента ");
                    name = scan.next();
                    student.setFam(name);
                    System.out.println("Введите cтоимость обучения студента");
                    name2 = scan.next();
                    student.setOplata(Integer.parseInt(name2));
                    cont.addPerson(student);
                    break;
                case 2:
                    Staff staff = new Staff();
                    System.out.println("Введите фамилию сотрудника ");
                    name = scan.next();
                    staff.setFam(name);
                    System.out.println("Введите ЗП сотрудника");
                    name2 = scan.next();
                    staff.setZP(Integer.parseInt(name2));
                    cont.addPerson(staff);
                    break;

                case 3:
                    StudStaff studStaff = new StudStaff();
                    System.out.println("Введите фамилию сотрудника-студента ");
                    name = scan.next();
                    studStaff.setFam(name);
                    System.out.println("Введите ЗП сотрудника-студента");
                    name2 = scan.next();
                    studStaff.setZP(Integer.parseInt(name2));
                    System.out.println("Введите стоимость обучения сотрудника-студента");
                    n3 = scan.next();
                    studStaff.setOplata(Integer.parseInt(n3));
                    cont.addPerson(studStaff);
                    break;

                case 4:
                   System.out.println(     cont.getAllPeoples());
                    break;
                case 5:
                    System.out.println("Введите фамилию для поиска ");
                    n4 = scan.next();
                    System.out.println( cont.getPeople(n4));
                    break;


            }
        }}}
