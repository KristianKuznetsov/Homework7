package task1;

//Класс дантист (начледник класса Doctor)
class Dentist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Дантист:");
        System.out.println("Да вы не переживайте, плюс минус зуб, у вас же их еще много...");
        System.out.println("Пациент:");
        System.out.println("НЕТ НЕНАДО ПРОШУ НЕ ФФФ ффф Т, ААА-АААААААААААААААА....");
        System.out.println();
    }
}