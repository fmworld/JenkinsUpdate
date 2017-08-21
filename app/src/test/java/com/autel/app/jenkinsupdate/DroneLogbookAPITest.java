package com.autel.app.jenkinsupdate;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;


/**
 * Created by AndrewSheehan on 6/1/2017.
 */


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class DroneLogbookAPITest {

    @After
    public void tearDown() {

    }

    @Test
    public void testBuildURLNoPrivateLabel() {
        String privateLabel = "";
        String expectedURL = "";

    }

    @Test
    public void testBuildURLWithPrivateLabel() {
        String privateLabel = "privateLabel";
        String expectedURL = "";

    }

    @Test
    public void testGetMD5Hash() {
        String input = "input";
        String expectedOutput = "";
    }
}