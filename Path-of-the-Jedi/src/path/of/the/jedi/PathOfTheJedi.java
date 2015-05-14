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
        //First Player information
        Player playerOne = new Player ();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //First ship information
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
        
        //First room information
        Room roomOne = new Room ();
        
        roomOne.setName("Kashyyyk");
        roomOne.setDescription("This is the first planet, where the player starts at.");
        roomOne.setxCoordinate(1.00);
        roomOne.setyCoordinate(1.00);
        
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
        
        
        
    }
    
}
