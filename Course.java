class Course {

    private int[] course = {30, 60, 100, 400};

    void doIt(Team team) {
        double result;
        for (int i = 0; i< course.length; i++)
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[j] / team.getTeam()[i].getAverageSpeed();
                System.out.println("Дистанция: " + course[i] + "| Спорстмен: " + team.getTeam()[i].getName() + "| Время: " + result);
                System.out.println();
            }
    }
}

