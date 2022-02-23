/**
 * this class will be extended by every AI, it contains the "guidelines" for what an AI need to have
 */
package AiCompetition.com;

import AiCompetition.com.bullets.Bullet;
import AiCompetition.com.commands.ShootCommand;
import AiCompetition.com.commands.ThrustCommand;

import java.util.ArrayList;

public abstract class Ai
{

    /**
     *
     * @param mySpaceship - the spaceship the AI controls
     * @param otherSpaceship - the enemy (other player) spaceship
     * @param bulletsPositions - list of all the bullets (including your own)
     * @return - returns a list of commands for the spaceship
     */
    public abstract ArrayList<ShootCommand> shootCommands(Spaceship mySpaceship, Spaceship otherSpaceship, ArrayList<Bullet> bulletsPositions);

    public abstract ArrayList<ThrustCommand> thrustCommands(Spaceship mySpaceship,Spaceship otherSpaceship, ArrayList<Bullet> bulletsPositions);


    /**
     * @return - the spaceship structure as specified by the player
     */
    public abstract UpgradeData createStructure();

}
