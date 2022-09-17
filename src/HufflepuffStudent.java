public class HufflepuffStudent extends HogwardsStudent{
    private int industrionsness;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name, int magic, int transgression, int industrionsness, int loyalty, int honesty) {
        super(name, magic, transgression);
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
    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return honesty+loyalty+industrionsness;
    }

    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent) {
        int ability1 = this.ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", getName(), hufflepuffStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %S:%d VS %d%n", hufflepuffStudent.getName(), getName(), ability2, ability1);


        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d", super.toString(), industrionsness, loyalty, honesty);
    }
}
