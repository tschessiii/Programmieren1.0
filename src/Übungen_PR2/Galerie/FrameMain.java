package Übungen_PR2.Galerie;

import Übungen_PR2.Enums.Shop;

import java.util.ArrayList;
import java.util.List;

public class FrameMain {
    public static void main(String[] args) {
        BackBoard backBoard = new BackBoard(Material.CORK, 300.0, Color.BLACK, Fastening.GLUE, true, false, true);
        Passepartout passepartout = new Passepartout(Color.ORANGE, BoardWeight.STANDARD, PositionCutOut.MIDDLE,true, 12.5, 16.5);

        Frame frame = new Frame(17.5,20.5, 2, 3, Material.WOOD, Glass.RECYCELD, Color.GREEN, backBoard, passepartout);

        List<Frame> ShoppingCart = new ArrayList<>();

        ShoppingCart.add(frame);
        ShoppingCart.add(new Frame(18,21.4,4,2,Material.METAL, Glass.GLASS, Color.BLUE,backBoard, passepartout));

        System.out.println("Es sind zurzeit: "+ShoppingCart.size()+" Frames im Einkaufswagen!");

        for(Frame f: ShoppingCart){
            System.out.println(f);
        }



    }
}
