package com.narxoz.rpg.builder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.EnemyComponentFactory;
public class EnemyDirector {
    public Enemy createMinion(EnemyBuilder b, EnemyComponentFactory f){
        return b.setName("Goblin Minion")
                .setHealth(100)
                .setDamage(20)
                .setDefense(5)
                .setSpeed(10)
                .setElement("NORMAL")
                .setAbilities(f.createAbilities())
                .setLootTable(f.createLootTable())
                .setAI(f.createAI())
                .build();
    }
    public Enemy createElite(EnemyBuilder b, EnemyComponentFactory f){
        return b.setName("Elite Goblin")
                .setHealth(300)
                .setDamage(60)
                .setDefense(20)
                .setSpeed(15)
                .setElement("ELITE")
                .setAbilities(f.createAbilities())
                .setLootTable(f.createLootTable())
                .setAI(f.createAI())
                .build();
    }
    public Enemy createOrcWarrior(EnemyBuilder b, EnemyComponentFactory f){
        return b.setName("Orc Warrior")
                .setHealth(500)
                .setDamage(80)
                .setDefense(40)
                .setSpeed(12)
                .setElement("VETERAN")
                .setAbilities(f.createAbilities())
                .setLootTable(f.createLootTable())
                .setAI(f.createAI())
                .build();
    }
    public Enemy createRaidBoss(EnemyBuilder b, EnemyComponentFactory f){
        return b.setName("Ancient Dragon")
                .setHealth(50000)
                .setDamage(800)
                .setDefense(300)
                .setSpeed(50)
                .setElement("RAID")
                .setAbilities(f.createAbilities())
                .setLootTable(f.createLootTable())
                .setAI(f.createAI())
                .addPhase(1,75)
                .addPhase(2,50)
                .addPhase(3,25)
                .build();
    }
}