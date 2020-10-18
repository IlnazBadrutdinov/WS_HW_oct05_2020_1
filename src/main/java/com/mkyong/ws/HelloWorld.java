package com.mkyong.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class HelloWorld {

    @WebMethod(operationName = "getHelloWorld")
    public ResponseData getHelloWorld(@WebParam(name = "requestData") RequestData requestData) {
        ResponseData resp = new ResponseData();
        return resp;

    }


}