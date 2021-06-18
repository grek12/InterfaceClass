public class Cont {
    IPerson[] personsArray = new IPerson[100];
    int count;

    void addPerson(Person person){
        if (this.personsArray != null) {
            personsArray[count] = person;
            count++;
        } else {
            IPerson[] newArr = new IPerson[this.personsArray.length + 10];
            for (int i = 0; i < this.personsArray.length; i++) {
                newArr[i] = this.personsArray[i];
            }
            this.personsArray = newArr;
            this.personsArray[count] = person;
            count++;
        }
    }
    public String getPeople(String fam)
    {
        String result = "";
        for (int i = 0; i < personsArray.length;)
        {
            if (personsArray[i].getFam().equals(fam))
            {
                result = personsArray[i].GetInfo();
                break;
            }
            else
                i++;
        }
        return result;
    }
    public  String getAllPeoples()
    {
        String result = "";
        for (int i = 0; i < personsArray.length;)
        {
            if (personsArray[i] != null)
            {
                result = result + personsArray[i].GetInfo() + "\n\n";
                i++;
            }
            else
                i++;
        }
        return result;
    }
}

