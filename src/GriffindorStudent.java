public class GriffindorStudent extends HogwardsStudent {
    private int nobility;
    private int honour;
    private int bravery;

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, magic, transgression);
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

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return bravery + honour + nobility;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = this.ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", getName(), griffindorStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", griffindorStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %S:%d VS %d%n", griffindorStudent.getName(), getName(), ability2, ability1);


        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d", super.toString(),nobility, honour, bravery);
    }
}
