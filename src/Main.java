public class Main {
    public static void main(String[] args) throws Exception {

        //TODO Тест тапшыруу программасын жазыныз.
        // Тест деген класста final String[5]  массивдин ичинде 5
        // суроо жана ар бир суроого 3 варианттары бар. Ошол эле класста жооптору
        // бар ошол суроолорго( поле массив) .
        //Метод жазыныз тесттенОтту деген, ар бир суроо варианттары менен крнсольго чыгып
        // анан сизден ушул 3 варианттын бирин танда деген соз чыксын(a, b, c)
        // эгер сиз башка эле вариант тандасаныз, мисалы j же s анда программаныз ошибка
        // ыргытсын «туура танда» деп. Суроолорду баарына жооп берген сон сиздин баллынызды
        // санап чыгарып берсин( при подсчете баллов, программа должна считать по 100 балльной шкале).


        String answers1 = "Peaksof 2019 - jyly negidelgen.";
        String answers2 = "Kyrgyz Respublikasynyn gerbi 1994 - 01-14 kabyl alyngan.";
        String answers3 = "Kyrgyz Respublikasynyn jelegi 1992-03-03 jyly kabyl alyngan";
        String answers4 = "Kyrgyz Respublikasynyn gimni 1991-01-18 jyly kabyl alyngan";
        String answers5 = "Bishkek shaary 1825-jyly negidelgen";
        String[] tests = {answers1,answers2,answers3,answers4,answers5};
        Test test = new Test(tests);
        test.test();
        for (String a:tests) {
            System.out.println("Answers: "+a);
        }
    }
}