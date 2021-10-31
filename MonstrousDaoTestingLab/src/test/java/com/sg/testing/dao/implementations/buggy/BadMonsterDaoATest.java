/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations.buggy;

import com.sg.testing.dao.MonsterDao;
import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author salon
 */
public class BadMonsterDaoATest {

    MonsterDao testDao;

    public BadMonsterDaoATest() {
    }

    public void testAddGetMonster() {
        // Create our method test inputs
        Monster monster = new Monster();
        int monsterId = 1;
        monster.setName("Asura");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(12);
        monster.setFavoriteFood("people");

        //  Add the monster to the DAO
        testDao.addMonster(monsterId, monster);
        // Get the monster from the DAO
        Monster retrievedMonster = testDao.getMonster(monsterId);

        // Check the data is equal
        assertEquals(monster.getName(),
                retrievedMonster.getName(),
                "Checking Monster Name");
        assertEquals(monster.getType(),
                retrievedMonster.getType(),
                "Checking Monster Type");
        assertEquals(monster.getPeopleEaten(),
                retrievedMonster.getPeopleEaten(),
                "Checking Monster PeopleEaten");
        assertEquals(monster.getFavoriteFood(),
                retrievedMonster.getFavoriteFood(),
                "Checking Monster FavouriteFood");
    }

    @Test
    public void testAddGetAllMonsters() {
        // Create our first monster
        Monster firstMonster = new Monster();
        int monsterId1 = 1;
        firstMonster.setName("Asura");
        firstMonster.setType(MonsterType.YETI);
        firstMonster.setPeopleEaten(12);
        firstMonster.setFavoriteFood("people");

        // Create our second monster
        Monster secondMonster = new Monster();
        int monsterId2 = 2;
        secondMonster.setName("Rakshsha");
        secondMonster.setType(MonsterType.VAMPIRE);
        secondMonster.setPeopleEaten(100);
        secondMonster.setFavoriteFood("animals");

        // Add both our monsters to the DAO
        testDao.addMonster(monsterId1, firstMonster);
        testDao.addMonster(monsterId2, secondMonster);

        // Retrieve the list of all monsters within the DAO
        List<Monster> allMonsters = testDao.getAllMonsters();

        // First check the general contents of the list
        assertNotNull(allMonsters, "The list of monsters must not null");
        assertEquals(2, allMonsters.size(), "List of monsters should have 2 monsters.");

        // Then the specifics
        assertTrue(testDao.getAllMonsters().contains(firstMonster),
                "The list of Monsters should include Asura.");
        assertTrue(testDao.getAllMonsters().contains(secondMonster),
                "The list of Monsters should include Rakshsha.");

    }

    @Test
    public void testRemoveMonster() {
        // Create two new monsters
        // Create our first monsters
        Monster firstMonster = new Monster();
        int monsterId1 = 1;
        firstMonster.setName("Asura");
        firstMonster.setType(MonsterType.YETI);
        firstMonster.setPeopleEaten(12);
        firstMonster.setFavoriteFood("people");

        // Create our second monster
        Monster secondMonster = new Monster();
        int monsterId2 = 2;
        secondMonster.setName("Rakshsha");
        secondMonster.setType(MonsterType.VAMPIRE);
        secondMonster.setPeopleEaten(100);
        secondMonster.setFavoriteFood("animals");

        // Add both to the DAO
        testDao.addMonster(monsterId1, firstMonster);
        testDao.addMonster(monsterId2, secondMonster);

        // remove the first monster
        Monster removedMonster = testDao.removeMonster(monsterId1);

        // Check that the correct object was removed.
        assertEquals(removedMonster, firstMonster, "The removed Monster should be Asura.");

        // Get all the monsters
        List<Monster> allMonsters = testDao.getAllMonsters();

        // First check the general contents of the list
        assertNotNull(allMonsters, "All Monsters list should be not null.");
        assertEquals(1, allMonsters.size(), "All Monsters should only have 1 Monster.");

        // Then the specifics
        assertFalse(allMonsters.contains(firstMonster), "All Monsters should NOT include Asura .");
        assertTrue(allMonsters.contains(secondMonster), "All Monsters should NOT include Rakshsha.");

        // Remove the second monster
        removedMonster = testDao.removeMonster(monsterId2);
        // Check that the correct object was removed.
        assertEquals(removedMonster, secondMonster, "The removed Monster should be Rakshsha.");

        // retrieve all of the monsters again, and check the list.
        allMonsters = testDao.getAllMonsters();

        // Check the contents of the list - it should be empty
        assertTrue(allMonsters.isEmpty(), "The retrieved list of Monsters should be empty.");

        // Try to 'get' both monsters by their old id - they should be null!
        Monster retrievedMonster = testDao.getMonster(monsterId1);
        assertNull(retrievedMonster, "Asura was removed, should be null.");

        retrievedMonster = testDao.getMonster(monsterId2);
        assertNull(retrievedMonster, "Rakshsha was removed, should be null.");

    }

    public void testUpadateMonster() {
        Monster monster = new Monster();

        int monsterId1 = 1;
        monster.setName("Asura");
        monster.setType(MonsterType.YETI);
        monster.setPeopleEaten(12);
        monster.setFavoriteFood("people");

        //  Add the monster to the DAO
        testDao.addMonster(monsterId1, monster);
        // Get the monster from the DAO
        Monster retrievedMonster = testDao.getMonster(monsterId1);

        //update the monster to the DAO
        int monsterId2 = 2;
        retrievedMonster.setName("Rakshsha");
        retrievedMonster.setType(MonsterType.VAMPIRE);
        retrievedMonster.setPeopleEaten(100);
        retrievedMonster.setFavoriteFood("animals");
        
        //add updated monster to the dao
        testDao.updateMonster(monsterId2, retrievedMonster);
        
        //get updated monster from the dao
        Monster retrievedAgain = testDao.getMonster(monsterId2);

        // Check the data is equal
        assertEquals(retrievedMonster.getName(),
                retrievedAgain.getName(),
                "Checking Monster Name");
        assertEquals(retrievedMonster.getType(),
                retrievedAgain.getType(),
                "Checking Monster Type");
        assertEquals(retrievedMonster.getPeopleEaten(),
                retrievedAgain.getPeopleEaten(),
                "Checking Monster PeopleEaten");
        assertEquals(retrievedMonster.getFavoriteFood(),
                retrievedAgain.getFavoriteFood(),
                "Checking Monster FavouriteFood");

    }
}
