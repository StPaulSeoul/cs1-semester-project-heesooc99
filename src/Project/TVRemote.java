package Project;

import Project.Button;

public class TVRemote extends Button { 

    public boolean increase;
    public TVRemote(){
        increase = true;
    }
    public void IncreaseVolumeButton() {
        if(increase){
            System.out.println("Raising Volume!");
        } else {
            System.out.println("Raising Volume!");
            increase = true;
        }
    }
    public void DecreaseVolumeButton(){
        if(increase){
            System.out.println("Lowering Volume!");
            increase = false;
        } else {
            System.out.println("Lowering Volume!");
        }
    }

}
