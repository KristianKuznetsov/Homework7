package task1;

// Класс пациент
public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    //выбор доктора
    public void assignDoctor() {
        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }

    //лечение
    public void receiveTreatment() {
        doctor.heal();
        this.treatmentPlan = 0;
    }
}