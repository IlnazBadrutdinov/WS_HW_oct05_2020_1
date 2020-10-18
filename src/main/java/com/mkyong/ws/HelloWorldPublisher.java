package com.mkyong.ws;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Endpoint.publish("http://localhost:8887/ilnaz2",
                new HelloWorld());

        System.out.println("Server is published!");

    }
}
