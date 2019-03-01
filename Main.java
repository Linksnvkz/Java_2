public class Main {

    public static void main(String[] args) {

        Sportsman[] boys = {
                new Sportsman("Игорек",  8),
                new Sportsman("Валера",  7),
                new Sportsman("Саня",  9),
                new Sportsman("Пашка",  10),
        };
        Course c = new Course(); // Создаем полосу препятствий
        Team team1 = new Team("Мальчишки", boys); // Создаем команду
        team1.getTeamName(); //Вызываем название команды
        c.doIt(team1); // Просим команду пройти полосу

    }
}
