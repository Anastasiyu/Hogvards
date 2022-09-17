public class SlytherinStudent extends HogwardsStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulnes;
    private int listForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulnes, int listForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulnes = resourcefulnes;
        this.listForPower = listForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
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
    public void print() {
        System.out.println(this);
    }

    private int ability() {
        return cunning+determination+ambition+resourcefulnes+listForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = this.ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("Студент %s лучше, чем студент %S:%d VS %d%n", slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Студент %s такой же, как студент %S:%d VS %d%n", slytherinStudent.getName(), getName(), ability2, ability1);

        }
    }
    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), cunning, determination, ambition, resourcefulnes, listForPower);
    }
}
