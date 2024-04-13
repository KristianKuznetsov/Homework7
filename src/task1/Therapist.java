package task1;

//Класс терапевт (начледник класса Doctor)
class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Терапевт:");
        System.out.println("Что же это вы пациент самолечением занимаетесь, но ничего, сейчас быстро с вами разберемся...");
        System.out.println();
    }
}
