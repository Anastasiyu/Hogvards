public class Person {

    private String name;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulnes;
    private int listForPower;
    private int powerOfMagic;
    private int distance;

    public Person(String name, int cunning, int determination, int ambition, int resourcefulnes, int listForPower, int powerOfMagic, int distance) {
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulnes = resourcefulnes;
        this.listForPower = listForPower;
        this.powerOfMagic = powerOfMagic;
        this.distance = distance;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulnes() {
        return resourcefulnes;
    }

    public void setResourcefulnes(int resourcefulnes) {
        this.resourcefulnes = resourcefulnes;
    }

    public int getListForPower() {
        return listForPower;
    }

    public void setListForPower(int listForPower) {
        this.listForPower = listForPower;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return
                "у  " + name + " хитрость" + cunning + " баллов" +
                ", решительность=" + determination + " баллов" +
                ", амбициозность=" + ambition + " баллов" +
                ", находчивость=" + resourcefulnes + " баллов" +
                ", жажда влисти=" + listForPower + " баллов";
    }
}
