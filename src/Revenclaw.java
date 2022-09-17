public class Revenclaw extends Person{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Revenclaw(String name, int cunning, int determination, int ambition, int resourcefulnes, int listForPower, int powerOfMagic, int distance, int mind, int wisdom, int wit, int creation) {
        super(name, cunning, determination, ambition, resourcefulnes, listForPower, powerOfMagic, distance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return ", ум=" + mind + " баллов" +
                ", мудрость=" + wisdom + " баллов" +
                ", остроумие=" + wit + " баллов" +
                ", творчество=" + creation + " баллов";
    }
}
