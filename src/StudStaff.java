 class StudStaff extends Person implements IStudent,IStaff{
    private int oplata;
    private int ZP;
     @Override
     public void setZP(int newZP) {
     ZP = newZP;
     }

     @Override
     public int getZP() {
         return ZP;
     }

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
         return "Сотрудник - Студент: " + getFam() + "\nЗарплата: " + ZP + "\nОплата: " + oplata;
     }
 }
