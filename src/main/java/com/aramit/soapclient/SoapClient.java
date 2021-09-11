package com.aramit.soapclient;
import soap.service.HelloService;

public class SoapClient {
    public static void main(String[] args){
            HelloService service = new HelloService();
            System.out.println(service.getHelloPort().sayHello("Almir"));
    }
}
