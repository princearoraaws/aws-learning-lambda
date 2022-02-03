package com.aws.photoapp.users;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.JsonObject;

public class GetUserHandler implements RequestHandler<APIGatewayProxyRequestEvent,APIGatewayProxyResponseEvent> {


	@Override
	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
		// TODO Auto-generated method stub
		
		Map <String,String> param  = input.getPathParameters();
		String userid = param.get("userid");
		
		JsonObject returnValue = new JsonObject();
		returnValue.addProperty("firstName", "Prince");
		returnValue.addProperty("lastName", "Prince");
		returnValue.addProperty("id", userid);
		
		APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
		response.withStatusCode(200).withBody(returnValue.toString());
		
		return response;
	}

}
