public class Main {
    public static void main(String[] args){

            GriffindorStudent harry = new GriffindorStudent("Гарри Потер", 26, 38, 49, 58, 97);
            GriffindorStudent germiona = new GriffindorStudent("Гермиона Грейнджер", 49, 85, 27, 46, 29);
            GriffindorStudent ron = new GriffindorStudent("Рон Уилзи", 59, 43, 92, 67, 27);

            HufflepuffStudent zahariya = new HufflepuffStudent("Захария Смитт", 64, 28, 47, 39, 41);
            HufflepuffStudent sedrig = new HufflepuffStudent("Седриг Диггори", 59, 67, 38, 72, 40);
            HufflepuffStudent dzhastin = new HufflepuffStudent("Джастин Финч-Флетчли", 49, 83, 71, 93, 58);

            RevenclawStudent chzoy = new RevenclawStudent("Чжоу Чанг", 72, 45, 59, 67, 81, 94);
            RevenclawStudent padma = new RevenclawStudent("Падма Патил", 57, 43, 92, 86, 74, 56);
            RevenclawStudent markys = new RevenclawStudent("Маркус Белби", 57, 28, 38, 97, 46, 67);

            SlytherinStudent drako = new SlytherinStudent("Драко Малфой", 76, 83, 46, 98, 47, 68, 41);
            SlytherinStudent grehem = new SlytherinStudent("Грэхэм Монтегю", 89, 76, 85, 67, 49, 81, 73);
            SlytherinStudent gregori = new SlytherinStudent("Грегори Гойл", 83, 71, 97, 67, 48, 83, 59);

    harry.print();
    germiona.print();
    ron.print();
    zahariya.print();
    sedrig.print();
    dzhastin.print();
    chzoy.print();
    padma.print();
    markys.print();
    drako.print();
    grehem.print();
    gregori.print();

    harry.compareGriffindor(germiona);
    ron.compareGriffindor(germiona);
    zahariya.compareHufflepuff(sedrig);
        };


}