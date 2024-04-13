package task1;

//Класс хирург (начледник класса Doctor)
class Surgeon extends Doctor {
    @Override
    public void heal() {
        System.out.println("Хирург:");
        System.out.println("Раа___ааз конечность...");
        System.out.println("ДВА конечность...");
        System.out.println("Три четыре...");
        System.out.println("Да с вами все нормально пациент!!!!");
        System.out.println("Спасибо доктор");
        System.out.println();
    }
}