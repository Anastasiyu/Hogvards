public class PrintService {
    public void print(Hogwards[] hogwards){
        for (int i = 0; i < hogwards.length; i++) {
            Hogwards hogwards1 = hogwards[i];
            System.out.println(" " + hogwards.toString());
        }
    }
    public void print(Griffindor[] griffindors){
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println(" " + griffindor.toString());
        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println( " " + hufflepuff.toString());
        }
    }
        public void print(Revenclaw[] revenclaws) {
            for (int i = 0; i < revenclaws.length; i++) {
                Revenclaw revenclaw = revenclaws[i];
                System.out.println(" " + revenclaw.toString());
            }
        }
    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(" " + slytherin.toString());
        }
    }

}
