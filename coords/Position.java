package coords;

/**
 * position
 */
/**
 * Position
 */
//Позиция для объекта внутри конкретных координат. 
//Как только происходит открытие шлюза между позициями, происходит действе. 
//(Это должно быть описани в классе BetweenPositions)
public class Position {
    public int x;
    public int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void change(){ //Метод чисто для отладки. Ничего общего с игрой не имеет.
        this.x--;
        this.y--;
    }
    
}
