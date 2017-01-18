/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1Test;

/**
 *
 * @author Junghwan Yang
 */
public class RoomCarpet {
    private int price;
    public void setPrice(int price) {
        this.price = price;
    }
    RoomDimension r = new RoomDimension();
    public int totCost() {
        return r.getArea() * this.price;
    }
}
