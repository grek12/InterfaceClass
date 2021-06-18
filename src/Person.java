abstract class Person implements IPerson {
    private String Fam;
    public void setFam(String aFam){
        Fam = aFam;
    }
    public String getFam(){
        return Fam;
    }
    public abstract String GetInfo();
}
