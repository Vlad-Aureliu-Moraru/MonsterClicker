package Game.Entities.PlayerDesc;

import Game.Items.generalItem;

public class PlayerInventory {
    private generalItem[] items = new generalItem[6];

    private generalItem[] getAllItems(){
        return items;
    }
    private void printAllItems(){
        for(int i = 0; i < items.length; i++){
            System.out.println(i + ": " + items[i]);
        }
    }
}
