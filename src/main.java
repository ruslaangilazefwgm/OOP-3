import Animals.*;

public class main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Газель", 3,
                "Россия", 50, "Трава");
        Herbivores giraf = new Herbivores("Жираф", 5,
                "Африка", 70, "Трава");
        Herbivores horse = new Herbivores("Лошадь", 7,
                "Россия", 60, "Трава");
        System.out.println(horse);
        System.out.println(giraf);
        System.out.println(gazel);
        System.out.println();

        Predators hyena = new Predators("Гиена", 1,
                "Африка", 70, "Мясо");
        Predators tyger = new Predators("Тигр", 1,
                "Африка", 80, "Мясо");
        Predators bear = new Predators("Медведь", 4,
                "Россия", 30, "Мясо");
        System.out.println(hyena);
        System.out.println(tyger);
        System.out.println(bear);
        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 1, "Россия");
        Amphibians uzch = new Amphibians("Уж пресноводный", 1, "Россия");
        System.out.println(frog);
        System.out.println(uzch);
        System.out.println();

        Flightless pavlin = new Flightless("Павлин", 2, "Россия", "гуляет");
        Flightless pingvin = new Flightless("Пингвин", 3, "Антарктика", "гуляет");
        Flightless dodo = new Flightless("Павлин", 2, "Россия", "гуляет");
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);
        System.out.println();

        Flying chaika = new Flying("Чайка", 3, "Россия", "летает");
        Flying albatros = new Flying("Альбатрос", 2, "Россия", "летает");
        Flying sokol = new Flying("Сокол", 1, "Россия", "летает");
        System.out.println(chaika);
        System.out.println(albatros);
        System.out.println(sokol);


    }
}
