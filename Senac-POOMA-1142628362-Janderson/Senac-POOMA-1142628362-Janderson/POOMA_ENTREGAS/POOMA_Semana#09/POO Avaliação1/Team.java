public class Team {
    
    import java.util.ArrayList;

    public class Team {
        private String teamName;
        private ArrayList<Player> players;
        private ArrayList<Game> games;
    
        // Construtor
        public Team(String teamName) {
            this.teamName = teamName;
            this.players = new ArrayList<>();
            this.games = new ArrayList<>();
        }
    
        // Métodos para adicionar jogador e jogo
        public void addPlayer(Player player) {
            players.add(player);
        }
    
        public void addGame(Game game) {
            games.add(game);
        }
    }}
