package subjects;

import coords.BetweenPositions;


public class Gateway{
    public BetweenPositions bposition;
    boolean opened = false;

    public void open(){
        opened = true;
        //Взаимодействие: что то типо doAction(position)
    }
}
