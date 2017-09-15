Instructions for Building and Running the Project
-------------------------------------

Refer the blog post http://www.securityinternal.com/2017/04/retrieving-user-resources-from-facebook.html . 

Get your OAuth application registered in Facebook Developer account and obtain App ID and App Secret values.

The OAuth redirection endpoint of the client application is http://localhost:8080/facebookapp/callback .
Above is valid if you host this web application in a web server (tomcat) running in port 8080.

Once you download/clone this project, you need to modify the following two files.

1. /src/main/java/com/tharindu/oauth/facebookapp/servlet/OAuthCallbackListener.java
------------------------------------------------------------------------------------

This has following code.

            final String REDIRECT_URI = "http://localhost:8080/facebookapp/callback";
            final String CLIENT_ID = "145481119385038";
            final String CLIENT_SECRET = "1c2a31e707cc10f367a7dfa7a76442ae";

Put your App ID and App Secret in above. If the port number is different from 8080 when you deploy this application, change the redirect URI accordingly.

2. /src/main/webapp/index.jsp
-----------------------------

            var CLIENT_ID = "145481119385038";
            var REDIRECT_URI = "http://localhost:8080/facebookapp/callback";

Put your App ID in client id above.

Put your App ID and App Secret in above. If the port number is different from 8080 when you deploy this application, change the redirect URI accordingly.

After the above changes, build the project with Maven. (eg: mvn clean install).

Once you have got the facebookapp.war file in the target directory, deploy it in a web server (eg: tomcat).

You can access the application with the URL http://localhost:<port>/facebookapp


