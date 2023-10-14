public class Player {
    
    public class Player {
        private String playerName;
        private int jerseyNumber;
    
        // Construtor
        public Player(String playerName, int jerseyNumber) {
            this.playerName = playerName;
            this.jerseyNumber = jerseyNumber;
        }
    
        // Getters e Setters
        public String getPlayerName() {
            return playerName;
        }
    
        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }
    
        public int getJerseyNumber() {
            return jerseyNumber;
        }
    
        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }
    }
    Classe Statistics:
    java
    Copy code
    public class Statistics {
        private int goalsScored;
        private int assists;
    
        // Construtor
        public Statistics(int goalsScored, int assists) {
            this.goalsScored = goalsScored;
            this.assists = assists;
        }
    
        // Getters e Setters
        public int getGoalsScored() {
            return goalsScored;
        }
    
        public void setGoalsScored(int goalsScored) {
            this.goalsScored = goalsScored;
        }
    
        public int getAssists() {
            return assists;
        }
    
        public void setAssists(int assists) {
            this.assists = assists;
        }
    }
    Classe Game:
    java
    Copy code
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
