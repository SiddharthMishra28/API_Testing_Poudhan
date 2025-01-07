package com.restassured.jsonpathdemo;

import com.jayway.jsonpath.JsonPath;

import java.util.List;

public class JaywayJsonpathExample1 {
    public static void main(String[] args) {
        String response = "{\n" +
                "  \"expand\": \"\",\n" +
                "  \"fields\": {\n" +
                "    \"flagged\": true,\n" +
                "    \"sprint\": {\n" +
                "      \"id\": 37,\n" +
                "      \"self\": \"https://your-domain.atlassian.net/rest/agile/1.0/sprint/13\",\n" +
                "      \"state\": \"future\",\n" +
                "      \"name\": \"sprint 2\",\n" +
                "      \"goal\": \"sprint 2 goal\"\n" +
                "    },\n" +
                "    \"closedSprints\": [\n" +
                "      {\n" +
                "        \"id\": 37,\n" +
                "        \"self\": \"https://your-domain.atlassian.net/rest/agile/1.0/sprint/23\",\n" +
                "        \"state\": \"closed\",\n" +
                "        \"name\": \"sprint 1\",\n" +
                "        \"startDate\": \"2015-04-11T15:22:00.000+10:00\",\n" +
                "        \"endDate\": \"2015-04-20T01:22:00.000+10:00\",\n" +
                "        \"completeDate\": \"2015-04-20T11:04:00.000+10:00\",\n" +
                "        \"goal\": \"sprint 1 goal\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"description\": \"example bug report\",\n" +
                "    \"project\": {\n" +
                "      \"avatarUrls\": {\n" +
                "        \"16x16\": \"https://your-domain.atlassian.net/secure/projectavatar?size=xsmall&pid=10000\",\n" +
                "        \"24x24\": \"https://your-domain.atlassian.net/secure/projectavatar?size=small&pid=10000\",\n" +
                "        \"32x32\": \"https://your-domain.atlassian.net/secure/projectavatar?size=medium&pid=10000\",\n" +
                "        \"48x48\": \"https://your-domain.atlassian.net/secure/projectavatar?size=large&pid=10000\"\n" +
                "      },\n" +
                "      \"id\": \"10000\",\n" +
                "      \"insight\": {\n" +
                "        \"lastIssueUpdateTime\": \"2021-04-22T05:37:05.000+0000\",\n" +
                "        \"totalIssueCount\": 100\n" +
                "      },\n" +
                "      \"key\": \"EX\",\n" +
                "      \"name\": \"Example\",\n" +
                "      \"projectCategory\": {\n" +
                "        \"description\": \"First Project Category\",\n" +
                "        \"id\": \"10000\",\n" +
                "        \"name\": \"FIRST\",\n" +
                "        \"self\": \"https://your-domain.atlassian.net/rest/api/3/projectCategory/10000\"\n" +
                "      },\n" +
                "      \"self\": \"https://your-domain.atlassian.net/rest/api/3/project/EX\",\n" +
                "      \"simplified\": false,\n" +
                "      \"style\": \"classic\"\n" +
                "    },\n" +
                "    \"comment\": [\n" +
                "      {\n" +
                "        \"author\": {\n" +
                "          \"accountId\": \"5b10a2844c20165700ede21g\",\n" +
                "          \"active\": false,\n" +
                "          \"displayName\": \"Mia Krystof\",\n" +
                "          \"self\": \"https://your-domain.atlassian.net/rest/api/3/user?accountId=5b10a2844c20165700ede21g\"\n" +
                "        },\n" +
                "        \"body\": {\n" +
                "          \"type\": \"doc\",\n" +
                "          \"version\": 1,\n" +
                "          \"content\": [\n" +
                "            {\n" +
                "              \"type\": \"paragraph\",\n" +
                "              \"content\": [\n" +
                "                {\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"text\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"created\": \"2021-01-17T12:34:00.000+0000\",\n" +
                "        \"id\": \"10000\",\n" +
                "        \"self\": \"https://your-domain.atlassian.net/rest/api/3/issue/10010/comment/10000\",\n" +
                "        \"updateAuthor\": {\n" +
                "          \"accountId\": \"5b10a2844c20165700ede21g\",\n" +
                "          \"active\": false,\n" +
                "          \"displayName\": \"Mia Krystof\",\n" +
                "          \"self\": \"https://your-domain.atlassian.net/rest/api/3/user?accountId=5b10a2844c20165700ede21g\"\n" +
                "        },\n" +
                "        \"updated\": \"2021-01-18T23:45:00.000+0000\",\n" +
                "        \"visibility\": {\n" +
                "          \"identifier\": \"Administrators\",\n" +
                "          \"type\": \"role\",\n" +
                "          \"value\": \"Administrators\"\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"epic\": {\n" +
                "      \"id\": 37,\n" +
                "      \"self\": \"https://your-domain.atlassian.net/rest/agile/1.0/epic/23\",\n" +
                "      \"name\": \"epic 1\",\n" +
                "      \"summary\": \"epic 1 summary\",\n" +
                "      \"color\": {\n" +
                "        \"key\": \"color_4\"\n" +
                "      },\n" +
                "      \"done\": true\n" +
                "    },\n" +
                "    \"worklog\": [\n" +
                "      {\n" +
                "        \"author\": {\n" +
                "          \"accountId\": \"5b10a2844c20165700ede21g\",\n" +
                "          \"active\": false,\n" +
                "          \"displayName\": \"Mia Krystof\",\n" +
                "          \"self\": \"https://your-domain.atlassian.net/rest/api/3/user?accountId=5b10a2844c20165700ede21g\"\n" +
                "        },\n" +
                "        \"comment\": {\n" +
                "          \"type\": \"doc\",\n" +
                "          \"version\": 1,\n" +
                "          \"content\": [\n" +
                "            {\n" +
                "              \"type\": \"paragraph\",\n" +
                "              \"content\": [\n" +
                "                {\n" +
                "                  \"type\": \"text\",\n" +
                "                  \"text\": \"I did some work here.\"\n" +
                "                }\n" +
                "              ]\n" +
                "            }\n" +
                "          ]\n" +
                "        },\n" +
                "        \"id\": \"100028\",\n" +
                "        \"issueId\": \"10002\",\n" +
                "        \"self\": \"https://your-domain.atlassian.net/rest/api/3/issue/10010/worklog/10000\",\n" +
                "        \"started\": \"2021-01-17T12:34:00.000+0000\",\n" +
                "        \"timeSpent\": \"3h 20m\",\n" +
                "        \"timeSpentSeconds\": 12000,\n" +
                "        \"updateAuthor\": {\n" +
                "          \"accountId\": \"5b10a2844c20165700ede21g\",\n" +
                "          \"active\": false,\n" +
                "          \"displayName\": \"Mia Krystof\",\n" +
                "          \"self\": \"https://your-domain.atlassian.net/rest/api/3/user?accountId=5b10a2844c20165700ede21g\"\n" +
                "        },\n" +
                "        \"updated\": \"2021-01-18T23:45:00.000+0000\",\n" +
                "        \"visibility\": {\n" +
                "          \"identifier\": \"276f955c-63d7-42c8-9520-92d01dca0625\",\n" +
                "          \"type\": \"group\",\n" +
                "          \"value\": \"jira-developers\"\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"updated\": 1,\n" +
                "    \"timetracking\": {\n" +
                "      \"originalEstimate\": \"10m\",\n" +
                "      \"originalEstimateSeconds\": 600,\n" +
                "      \"remainingEstimate\": \"3m\",\n" +
                "      \"remainingEstimateSeconds\": 200,\n" +
                "      \"timeSpent\": \"6m\",\n" +
                "      \"timeSpentSeconds\": 400\n" +
                "    }\n" +
                "  },\n" +
                "  \"id\": \"10001\",\n" +
                "  \"key\": \"HSP-1\",\n" +
                "  \"self\": \"https://your-domain.atlassian.net/rest/agile/1.0/board/92/issue/10001\"\n" +
                "}";
        String key = JsonPath.read(response, "$.key");
        System.out.println(key);
        List<String> data = JsonPath.read(response, "$..name");
        System.out.println(data.contains("FIRST"));
    }
}
