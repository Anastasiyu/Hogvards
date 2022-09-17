public class Hogwards {
    public static void main(String[] args){
    Griffindor[] griffindors = {
            new Griffindor("Гарри Потер", 26, 38, 49, 58, 97, 57, 49, 59, 46, 89),
            new Griffindor("Гермиона Грейнджер", 49, 85, 27, 46, 29, 19, 47, 51, 69, 42),
            new Griffindor("Рон Уилзи", 59, 43, 92, 67, 27, 43, 74, 54, 48, 52),
    };
    Hufflepuff[] hufflepuffs = {
            new Hufflepuff("Захария Смитт", 64, 28, 47, 39, 41, 98, 57, 65, 12, 76),
            new Hufflepuff("Седриг Диггори", 59, 67, 38, 72, 40, 94, 16, 49, 57, 94),
            new Hufflepuff("Джастин Финч-Флетчли", 49, 83, 71, 93, 58, 61, 37, 29, 70, 64),
    };
    Revenclaw[] revenclaws = {
            new Revenclaw("Чжоу Чанг", 72, 45, 59, 67, 81, 94, 73, 58, 29, 38, 46),
            new Revenclaw("Падма Патил", 57, 43, 92, 86, 74, 56, 27, 39, 51, 69, 92),
            new Revenclaw("Маркус Белби", 57, 28, 38, 97, 46, 67, 28, 19, 83, 38, 49),
    };
    Slytherin[] slytherins = {
            new Slytherin("Драко Малфой", 76, 83, 46, 98, 47, 68, 41),
            new Slytherin("Грэхэм Монтегю", 89, 76, 85, 67, 49, 81, 73),
            new Slytherin("Грегори Гойл", 83, 71, 97, 67, 48, 83, 59),
    };
    PrintService printService = new PrintService();
printService.print(griffindors);
   printService.print(hufflepuffs);
   printService.print(revenclaws);
   printService.print(slytherins);

    }

}
