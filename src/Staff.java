class Staff extends Person implements IStaff {
    private int ZP;
    @Override
    public void setZP(int newZP) {
ZP=newZP;
    }

    @Override
    public int getZP() {
        return ZP;
    }

    @Override
    public String GetInfo() {
        return "Сотрудник: " + getFam() + "\nЗарплата: " + ZP;
    }
}
