public class Hufflepuff extends Person {
    private int industrionsness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int cunning, int determination, int ambition, int resourcefulnes, int listForPower, int powerOfMagic, int distance, int industrionsness, int loyalty, int honesty) {
        super(name, cunning, determination, ambition, resourcefulnes, listForPower, powerOfMagic, distance);
        this.industrionsness = industrionsness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustrionsness() {
        return industrionsness;
    }

    public void setIndustrionsness(int industrionsness) {
        this.industrionsness = industrionsness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return ", благородство=" + industrionsness + " баллов" +
                ", верность=" + loyalty + " баллов" +
                ", честность=" + honesty + " баллов";
    }
}
