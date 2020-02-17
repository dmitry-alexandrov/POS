package com.example.tests.test;


import org.testng.annotations.Test;


public class PollDeletionTests extends TestBase {
  @Test
  public void testPollDeletion() throws Exception {
    app.getNavigationHelper().gotoPollListPage();
    app.getPollHelper().selectPoll();
    app.getPollHelper().deletePoll();
  }

}
