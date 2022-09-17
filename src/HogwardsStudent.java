public abstract class HogwardsStudent {

    private String name;
    private int magic;
    private int transgression;

    public HogwardsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return magic+transgression;
    }

    public void compareHogwarts(HogwardsStudent hogwardsStudent) {
        int ability1 = this.ability();
        int ability2 = hogwardsStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", getName(), hogwardsStudent.getName(), ability1, ability2);
        }else if (ability1<ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", hogwardsStudent.getName(), getName(), ability2, ability1);
        }else {
            System.out.printf("Студент %s такой же, как студент %S:%d VS %d%n", hogwardsStudent.getName(), getName(), ability2, ability1);


        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгресии: %d", name, magic, transgression);
    }
}


