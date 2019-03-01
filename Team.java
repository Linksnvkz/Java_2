class Team {
 
    private String teamName;
    private Sportsman[] team;


    Team( String teamName, Sportsman[] team) {
        this.teamName = teamName;
        this.team = team;
    }

    void getTeamName() {
        System.out.println(teamName);
    }

    Sportsman[] getTeam() {
        return team;
    }
}
