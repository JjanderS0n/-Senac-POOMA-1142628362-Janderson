public class NFLSystem {
    public static void main(String[] args) {
        // Exemplo de uso para criar um time, jogadores e jogos
        Team team = new Team("New England Patriots");

        Player player1 = new Player("Tom Brady", 12);
        Player player2 = new Player("Rob Gronkowski", 87);

        team.addPlayer(player1);
        team.addPlayer(player2);

        Game game1 = new Game("Kansas City Chiefs", 1);
        Game game2 = new Game("Buffalo Bills", -1);

        team.addGame(game1);
        team.addGame(game2);
    }
}