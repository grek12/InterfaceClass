class Student extends Person implements IStudent {
private int oplata;
    @Override
    public void setOplata(int newOplata) {
oplata= newOplata;
    }

    @Override
    public int getOplata() {
        return oplata;
    }

    @Override
    public String GetInfo() {
        return "Студент: " + getFam() + "\nОплата: " + oplata;
    }
}
