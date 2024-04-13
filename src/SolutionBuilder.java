import task1.Doctor;
import task1.Patient;
import taskStar.Apple;
import taskStar.HandOfGod;

public class SolutionBuilder {
    public static void buildTaskOne(){
        System.out.println("\n\n____________________________________________\n");
        System.out.println("                 Задача 1\n");

        System.out.println("Пациент 1\n");

        Patient patient = new Patient(1);

        // Назначение врача в соответствии с планом лечения и лечение
        patient.assignDoctor();
        patient.receiveTreatment();

        patient.assignDoctor();
        patient.receiveTreatment();

        patient.assignDoctor();
        patient.receiveTreatment();

        System.out.println("*********************************************************************************************");

        System.out.println("Пациент 2\n");

        Patient patient2 = new Patient(2);

        patient2.assignDoctor();
        patient2.receiveTreatment();

        patient2.assignDoctor();
        patient2.receiveTreatment();

        patient2.assignDoctor();
        patient2.receiveTreatment();


        System.out.println("\n____________________________________________\n\n");
    }

//    Задача 1:
//    Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//    хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//    по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//    «Доктор».
//
//    Создать объект класса «Пациент» и добавить пациенту план лечения. У
//    терапевта создать метод, который будет назначать врача пациенту согласно плану
//    лечения:
//    Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//    Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//    Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//    лечить.

    public static void buildTaskStar(){
        System.out.println("\n\n____________________________________________\n");
        System.out.println("                 Задача *\n");

        Apple apple = new Apple("Red");
        System.out.println("Первоночальный цвет яблока -> " + apple.getColor());
        HandOfGod.giveAColor(apple, "Purple");
        System.out.println("Новый цвет яблока -> " + apple.getColor());

        System.out.println("\n____________________________________________\n\n");

    }

//    Задача *:
//    Создать класс Apple и добавить в него поле color с модификатором доступа private и
//    инициализировать его. В методе main другого класса создать объект Apple, и не
//    используя сеттеры изменить значение поля color.
}
