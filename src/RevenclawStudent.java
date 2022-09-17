public class RevenclawStudent extends HogwardsStudent{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public RevenclawStudent(String name, int magic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, magic, transgression);
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
    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return mind+wisdom+wit+creation;
    }

    public void compareRevenclaw(RevenclawStudent revenclawStudent) {
        int ability1 = this.ability();
        int ability2 = revenclawStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", getName(), revenclawStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", revenclawStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %S:%d VS %d%n", revenclawStudent.getName(), getName(), ability2, ability1);


        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; остроумие: %d; творчество: %d", super.toString(), mind, wisdom, wit, creation);
    }
}
