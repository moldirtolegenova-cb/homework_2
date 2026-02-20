package com.narxoz.rpg;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.prototype.EnemyRegistry;
public class Main {
    public static void main(String[] args) {
        EnemyDirector director = new EnemyDirector();
        EnemyRegistry registry = new EnemyRegistry();
        Enemy dragonTemplate = director.createRaidBoss(new BossEnemyBuilder(), new FireComponentFactory());
        Enemy goblinTemplate = director.createMinion(new BasicEnemyBuilder(), new IceComponentFactory());
        Enemy orcTemplate    = director.createOrcWarrior(new EliteEnemyBuilder(), new NatureComponentFactory());
        registry.registerTemplate("dragon", dragonTemplate);
        registry.registerTemplate("goblin", goblinTemplate);
        registry.registerTemplate("orc", orcTemplate);
        System.out.println("--Created:--");
        dragonTemplate.show();
        goblinTemplate.show();
        orcTemplate.show();
        System.out.println("--Cloning variants:--");
        DragonBoss eliteDragon = (DragonBoss) registry.createFromTemplate("dragon");
        eliteDragon.setName("Ultra elite fire dragon");
        eliteDragon.setHealth(100000);
        eliteDragon.show();
        Enemy shinyGoblin = registry.createFromTemplate("goblin");
        shinyGoblin.setName("Shiny Gold Goblin");
        shinyGoblin.setHealth(500);
        shinyGoblin.show();
    }
}