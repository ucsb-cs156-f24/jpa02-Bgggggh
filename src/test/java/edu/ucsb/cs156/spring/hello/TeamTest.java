package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equalReturnsTrue_when_same() {
        assertTrue(team.equals(team));
    }

    @Test
    public void equalReturnsFalse_when_differentType() {
        assertFalse(team.equals(""));
    }

    @Test
    public void equalReturnsTrue_when_TT() {
        Team t1 = new Team("test-team");

        Team t2 = new Team("test-team");

        t1.addMember("A");

        t2.addMember("A");
        assertTrue(t1.equals(t2));
    }

    @Test
    public void equalReturnsFalse_when_TF() {
        Team t1 = new Team("test-team");

        Team t2 = new Team("test-team");

        t1.addMember("A");

        t2.addMember("B");
        assertFalse(t1.equals(t2));
    }

    @Test
    public void equalReturnsFalse_when_FT() {
        Team t1 = new Team("test-team1");

        Team t2 = new Team("test-team");

        t1.addMember("A");

        t2.addMember("A");
        assertFalse(t1.equals(t2));
    }

    @Test
public void hashCode_returns_same_value_for_equal_objects() {
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");

    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("bar");

    assertEquals(t1.hashCode(), t2.hashCode());
}

@Test
public void hashCode_returns_different_value_for_different_objects() {
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");

    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("baz");

    assertFalse(t1.hashCode() == t2.hashCode());
}

    

}
