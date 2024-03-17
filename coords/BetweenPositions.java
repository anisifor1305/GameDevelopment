package coords;

//Межпозиционный класс для шлюзов. При открытии шлюза у него запрашиваются две координаты, 
// анализируется активный объект, с этим обёъектом начинается action
public abstract class BetweenPositions {
    int x1, у1, x2, у2;
    public BetweenPositions(int x1, int у1, int x2, int у2){
        this.x1 = x1;
        this.у1 = у1;
        this.x2 = x2;
        this.у2 = у2;
    }
}
