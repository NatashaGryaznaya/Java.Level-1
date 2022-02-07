package ru.geekbrains.lesson5;

public class L5_HomeWorkApp {
        public static void main (String[]args){
            Employee[] emArray = new Employee[5];
            emArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30);
            emArray[1] = new Employee("Petrov Petr", "Engineer", "pepetr@mailbox.com", "89231231111", 31000, 25);
            emArray[2] = new Employee("Lenivaya Lena", "Engineer", "lenilena@mailbox.com", "89231239875", 35000, 35);
            emArray[3] = new Employee("Irova Irina", "Cleaner", "iririna@mailbox.com", "89231288812", 29000, 42);
            emArray[4] = new Employee("Ivanova Ivanna", "Cleaner", "iv-aivanna@mailbox.com", "89254131223", 25000, 45);
            for (Employee employee : emArray)
                if (employee.getAge()>40)
                    System.out.println(employee);
        }
    }

    class Employee {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public int getAge() {
            return age;
        }

        public String toString(){
            return(name+ "\n"
                    +position+ "\n"
                    +email+ "\n"
                    +phone+ "\n"
                    +salary+ "\n"
                    +age);
        }

    }


