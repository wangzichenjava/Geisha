package com.nosuchfield.geisha.mvc;

import com.nosuchfield.geisha.mvc.beans.MethodDetail;
import com.nosuchfield.geisha.mvc.enums.RequestMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UrlMappings {

    private static UrlMappings urlMappings;

    public static UrlMappings getInstance() {
        if (urlMappings == null)
            urlMappings = new UrlMappings();
        return urlMappings;
    }

    private List<MethodDetail> methodDetails = new ArrayList<>();

    public MethodDetail getMap(String url, RequestMethod requestMethod) {
        for (MethodDetail methodDetail : methodDetails) {
            if (methodDetail.getUrl().equals(url) && methodDetail.getRequestMethod() == requestMethod)
                return methodDetail;
        }
        return null;
    }

    public void setMap(String url, Method method, RequestMethod requestMethod) {
        MethodDetail methodDetail = MethodDetail.builder()
                .url(url)
                .method(method)
                .requestMethod(requestMethod)
                .build();

        methodDetails.add(methodDetail);
    }

    public void setMap(String url, MethodDetail methodDetail) {
        methodDetails.add(methodDetail);
    }

}