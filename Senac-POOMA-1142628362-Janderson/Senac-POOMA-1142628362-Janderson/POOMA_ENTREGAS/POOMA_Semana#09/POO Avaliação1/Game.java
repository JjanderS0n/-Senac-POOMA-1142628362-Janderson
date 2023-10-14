public class Game {
    
    public class Game {
        private String opponent;
        private int gameResult;  // Example: 1 for win, 0 for draw, -1 for loss
    
        // Construtor
        public Game(String opponent, int gameResult) {
            this.opponent = opponent;
            this.gameResult = gameResult;
        }
    
        // Getters e Setters
        public String getOpponent() {
            return opponent;
        }
    
        public void setOpponent(String opponent) {
            this.opponent = opponent;
        }
    
        public int getGameResult() {
            return gameResult;
        }
    
        public void setGameResult(int gameResult) {
            this.gameResult = gameResult;
        }
    }
    Classe Team:
    java
    Copy code
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
    }
    Classe NFLSystem:
    java
    Copy code
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
    Certifique-se de criar os arquivos correspondentes para cada classe (por exemplo, Player.java, Statistics.java, Game.java, Team.java e NFLSystem.java) e organize-os em uma estrutura de pasta adequada para o seu projeto no Visual Studio Code. Certifique-se de que o JDK (Java Development Kit) esteja instalado e configurado corretamente no seu ambiente para compilar e executar o código no VSC.
    
    
    
    
    
    }
