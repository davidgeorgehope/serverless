package com.serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

//AppDynamics tracer imports
import com.appdynamics.serverless.tracers.aws.api.AppDynamics;
import com.appdynamics.serverless.tracers.aws.api.MonitoredRequestStreamHandler;
import com.appdynamics.serverless.tracers.aws.api.ExitCall;
import com.appdynamics.serverless.tracers.aws.api.Tracer;
import com.appdynamics.serverless.tracers.aws.api.Transaction;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//RequestStreamHandler

public class LambdaAutoExample{// extends MonitoredRequestStreamHandler {

/*@Override
public void handleMonitoredRequest(InputStream input, OutputStream output, Context context) throws IOException {

  Response responseBody = new Response("Hello, the current time is " + new Date());
  Map<String, String> headers = new HashMap<>();
  headers.put("X-Powered-By", "AWS Lambda & Serverless");
  headers.put("Content-Type", "application/json");
  ApiGatewayResponse apiGatewayResponse = ApiGatewayResponse.builder()
    .setStatusCode(200)
    .setObjectBody(responseBody)
    .setHeaders(headers)
    .build();

}*/

}

