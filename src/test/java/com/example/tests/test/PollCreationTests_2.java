package com.example.tests.test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PollCreationTests_2  extends TestBase {

   @Test
    public void testPollCreation() throws Exception {

//        app.getNavigationHelper().gotoPollListPage();
 //       app.getPollHelper().initPollCreation();
 //       app.getPollHelper().fillPollForm(new PollData("Тестовый опрос", "Описание тестового опроса", "Вопрос №1", "2", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вопрос №2", "3", "Вариант ответа 1", "Вариант ответа 2", "Вариант ответа 3", "Вариант ответа 4"));
 //       app.getPollHelper().submitPollCreation();
       Thread.sleep(1000);


       //JSONObject requestBody = new JSONObject();
      // JSONObject requestAnswers = new JSONObject();
      // JSONObject requestPollQuestionOptionId = new JSONObject();
      // JSONObject requestPollQuestionId = new JSONObject();
      // requestBody.put("esia_id", "01234567");
      // requestBody.put("email", "ivan.ivanov@bk.ru");
      // requestBody.put("answers", requestAnswers);
       //requestAnswers.put("")
       //requestPollQuestionId.put("poll_question_id", "316");

      // requestAnswers.put("poll_question_option_id", requestPollQuestionOptionId);
      // requestPollQuestionOptionId.put("id", "954");




       Map<String, Object> body = new HashMap<>();
       Map<String, Object> answers = new HashMap<>();
       ArrayList<Map<String, Object>> answersArray = new ArrayList<>();
       Map<String, Object> pollQuestionOptionId = new HashMap<>();
       ArrayList<Map<String, Object>> pollQuestionOptionIdArray = new ArrayList<>();
       pollQuestionOptionId.put("id", "956");
       pollQuestionOptionIdArray.add(pollQuestionOptionId);
       answers.put("poll_question_option_id", pollQuestionOptionIdArray);
       answers.put("poll_question_id", "317");
       body.put("email", "ivan.ivanov@bk.ru");
       body.put("esia_id", "01234567");
       answersArray.add(answers);
       body.put("answers", answersArray);

       JSONObject json = new JSONObject(body);
       System.out.println(json);
       RequestSpecification request = RestAssured.given();
       request.header("Content-Type", "application/json");
       request.header("Authorization", "Bearer 0Mrir_7tdEWDODERle6Sxzrdz9PTRF6-_1583312601");
       request.body(json.toString());
       //request.body(jsonAsMap.toString());
       Response response = request.post("http://pos.maxitlab.com/og/api/v1/poll/154/answer");

       int statusCode = response.getStatusCode();
       Assert.assertEquals(statusCode, 200);
       String successCode = response.jsonPath().get("SuccessCode");
       // Assert.assertEquals(successCode, "OPERATION_SUCCESS");
       System.out.println(response.getBody().asString());



        //app.getPollHelper().waitPollCreation();
    }

}
