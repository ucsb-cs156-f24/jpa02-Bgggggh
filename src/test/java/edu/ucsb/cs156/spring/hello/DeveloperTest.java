package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Baige", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("bgggggh", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f24-05", t.getName());
        // assertTrue(t.getMembers().contains("Ben"),"Team should contain Ben");
        // assertTrue(t.getMembers().contains("Alex"),"Team should contain Alex");
        // assertTrue(t.getMembers().contains("Baige"),"Team should contain Baige");
        // assertTrue(t.getMembers().contains("Ishan"),"Team should contain Ishan");
        // assertTrue(t.getMembers().contains("William"),"Team should contain William");
        // assertTrue(t.getMembers().contains("Ryan"),"Team should contain Ryan");
    }

    @Test
    public void getTeam_returns_team_with_Ben() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ben"),"Team should contain Ben");
    }

    @Test
    public void getTeam_returns_team_with_Alex() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Alex"),"Team should contain Alex");
    }

    @Test
    public void getTeam_returns_team_with_Baige() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Baige"),"Team should contain Baige");
    }

    @Test
    public void getTeam_returns_team_with_Ishan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ishan"),"Team should contain Ishan");
    }

    @Test
    public void getTeam_returns_team_with_William() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("William"),"Team should contain William");
    }

    @Test
    public void getTeam_returns_team_with_Ryan() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Ryan"),"Team should contain Ryan");
    }


}
