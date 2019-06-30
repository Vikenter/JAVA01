package Lesson04;

public class Main {

    public static void main(String[] args) {
        Employee emp01 = new Employee("имя", "отчевство", "фамилия", "позиция", 1020304050, 5000, 87);
        System.out.println(emp01.getFirstName());
        System.out.println(emp01.getMidName());
        System.out.println(emp01.getLastName());
        System.out.println(emp01.getPosition());

        System.out.println();

        Employee emp02 = new Employee("имя2", "отчевство2", "фамилия2", "позиция2", 1120304050, 8200, 48);
        System.out.println(emp02.getFirstName());
        System.out.println(emp02.getMidName());
        System.out.println(emp02.getLastName());
        System.out.println(emp02.getPosition());

        Employee emp03 = new Employee("имя3", "отчевство3", "фамилия3", "позиция3", 1220304050, 8200, 24);
        Employee emp04 = new Employee("имя4", "отчевство5", "фамилия4", "позиция4", 1320304050, 8200, 38);
        Employee emp05 = new Employee("имя5", "отчевство5", "фамилия5", "позиция5", 1420304050, 8200, 50);

        System.out.println();

        Employee employeesArr[] = {emp01, emp02, emp03, emp04, emp05};

        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40)
            System.out.println(employeesArr[i].getFirstName() + ' ' + employeesArr[i].getLastName() + ' '
                    + employeesArr[i].getMidName() + ' ' + employeesArr[i].getPosition());
        }

        riseSalariesOver40(employeesArr);

        System.out.println();
        System.out.println("salary raised");
        System.out.println();

        for (int i = 0; i < employeesArr.length; i++) {
                System.out.println(employeesArr[i].getFirstName() + ' ' + employeesArr[i].getLastName() + ' '
                        + employeesArr[i].getMidName() + ' ' + employeesArr[i].getPosition() + " salary "
                        + employeesArr[i].getWages());
        }

    }

    public static void riseSalariesOver40(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40)
                arr[i].setWages(arr[i].getWages() + 5000);
        }

    }
}
