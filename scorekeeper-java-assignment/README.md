# "I'm Your new PO" Workshop

### Description

In this workshop 'The new PO' will constantly throw requirements your way. It's up to you to let your application grow. Good practices and discipline should
help you with keeping up the pace. You will be evaluated on the number of customers you can gain. [Determined by workshop facilitator]. The speed of feature
delivery and the approval of your users will determine this. A new cool feature will give you more users. An unstable application with a lot of bugs will reduce
your approval and decrease the speed which with you earn new customers. So be aware of your reputation!

### Format workshop

In this workshop you will *NOT* be evaluated based on your code. As a PO I only care about customers and new features. So you can organize the code how you
like, work the way you like, use whatever you like. The goal of the workshop is to focus on development technique, not on technology. So you should be able to
do everything with pure java.

### Existing code

In this code repository there is some simple start code to get things going. I've chosen to use java8 maven and junit5. However, feel free to throw it away and
to it in other way.
**The sole requirement is that the application can be run using the 'scorekeeper' command.**

Because this is how the users wil use you application and evaluate it. If this command does not work, you application does not work! After all, we can not
expect our users to be technical.

### Getting started

If you checked out the code make sure that the launch command works.

This is what you should see on windows

```batch
>scorekeeper.bat
**************************
**    Scorekeeper       **
**************************
> q to quit
```

This is what you should see on mac/linux

```batch
>./scorekeeper
**************************
**    Scorekeeper       **
**************************
> q to quit
```

Make sure that you can work on the code in your favorite IDEA.
And you are ready to receive your first feature request.


### Automated Test runs

In order to simulate users it is possible to run the application as a web application by adding web to the command. The rest controller will then just delegate to
the same ScoreKeeperService that the Console does.

```batch
./scorekeeper web
```

In order to allow the New Product owner to reach your local run application you must enable NGROK, as described in [AutomatedRuns](./AutomatedRuns.md)
In order to let the Spring boot application automatically restart each time the code gets recompiled, start the application with

```batch
./mvnw install spring-boot:run
```

The API for the web application is just a data entry point. It is not a proper api, nor is it intended to be so. It serves as an entry point so we can quickly run the exact same scenarios that we would on your local machine. So don't change it. You entry point should be the ScoreKeeperService. 

If the webshop is run using the automated users for verification, you should not change anything  in the CLi or WEB package. The entry point is
**ScoreKeeperService**, it is where all your logic should go and the entry point for the CLI as well as Web front end adapter. So do not change the API!
