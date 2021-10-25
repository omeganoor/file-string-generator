package com.ulven.fileGenerator.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.MockitoAnnotations.initMocks;

class StringUtilsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    void getRandomString() {
        StringUtils st = new StringUtils();
        String randomString = st.getRandomString(100);
        Assert.assertEquals(100, randomString.length());
    }
}