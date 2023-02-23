
public class ChessTest {

	public static void main(String[] args) {
		Chess chess =new Chess();
		chess.moveBisop();
		
	}
}
final class Chess
{
	void moveKing()
	{
		System.out.println("move the king");
	}
	void moveQween()
	{
		System.out.println("move the qween");
	}
	void moveBisop()
	{
		System.out.println("move the bishop");
	}
}

class GraphicalChess extends Chess
{
	void moveBishop()
	{
		System.out.println("hai");
	}
}

