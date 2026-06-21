import clases.Developer;
import clases.Game;
import clases.User;
import enumerados.GameStatus;


void main() {
    Developer dev1 = new Developer("From Software", 1986);
    User user1 = new User("artuurx","aoreaf@gmail.com", "a1234567890a.");
Game game1 = new Game ("Dark Souls",2011,dev1, GameStatus.COMPLETED);
    System.out.println(game1);

}
