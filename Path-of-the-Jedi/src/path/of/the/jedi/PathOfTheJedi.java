/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package path.of.the.jedi;

/**
 *
 * @author kayla
 */
public class PathOfTheJedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        ship shipOne = new ship ();
        
        shipOne.setName("Millenium Falcon");
        shipOne.setDescription("This is our ship.");
        shipOne.setxCoordinate(1.00);
        shipOne.setyCoordinate(1.00);
        shipOne.setShield(10.00);
        shipOne.setArmor(10.00);
        shipOne.setWeapon(10.00);
        
        String shipInfo = shipOne.toString();
        System.out.println (shipInfo);
        
        
        
    }
    
}
