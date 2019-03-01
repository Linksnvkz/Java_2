class Sportsman {
    private String name;
    private int averageSpeed;

    Sportsman(String name, int averageSpeed) {
        this.name = name;
        this.averageSpeed = averageSpeed;
    }

    String getName() {
        return name;
    }

    double getAverageSpeed() {
        return averageSpeed;
    }
}
