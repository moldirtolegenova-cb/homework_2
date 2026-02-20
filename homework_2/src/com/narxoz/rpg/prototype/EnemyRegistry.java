package com.narxoz.rpg.prototype;
import java.util.HashMap;
import java.util.Map;
import com.narxoz.rpg.enemy.Enemy;
public class EnemyRegistry {
    private Map<String, Enemy> templates = new HashMap<>();
    public void registerTemplate(String key, Enemy enemy) {
        templates.put(key, enemy);
    }
    public Enemy createFromTemplate(String key) {
        Enemy template = templates.get(key);
        if (template == null) {
            throw new IllegalArgumentException("No template found for key: " + key);
        }
        return template.clone(); 
    }
    public void listTemplates() {
        System.out.println("Available templates: " + templates.keySet());
    }
}