public class Griffindor extends Person {
    private  int nobility;
    private int honour;
    private int bravery;

    public Griffindor(String name, int cunning, int determination, int ambition, int resourcefulnes, int listForPower, int powerOfMagic, int distance, int nobility, int honour, int bravery) {
        super(name, cunning, determination, ambition, resourcefulnes, listForPower, powerOfMagic, distance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  ", благородство=" + nobility + " баллов" +
                ", честь=" + honour + " баллов" +
                ", храбрость=" + bravery + " баллов";
    }
}
