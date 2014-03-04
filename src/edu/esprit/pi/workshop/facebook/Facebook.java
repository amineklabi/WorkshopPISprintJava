/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.workshop.facebook;

/**
 *
 * @author Amine
 */
public class Facebook {

    private String fb_url = "http://www.facebook.com/";
    private String apiKey;
    private String secretKey;
    private String accessToken;
    private String firstRequest = "https://graph.facebook.com/oauth/authorize?"
            + "client_id="
            + apiKey
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "scope=publish_stream,offline_access,create_event,read_stream,email,user_birthday";

    private String secondRequest = "https://graph.facebook.com/oauth/access_token?"
            + "client_id="
            + apiKey
            + "&redirect_uri=http://www.facebook.com/connect/login_success.html&"
            + "client_secret=" + secretKey + "&code=";

    private boolean firstRequestDone = false;
    private boolean secondRequestDone = false;
    
    
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getFirstRequest() {
        return firstRequest;
    }

    public void setFirstRequest(String firstRequest) {
        this.firstRequest = firstRequest;
    }

    public String getSecondRequest() {
        return secondRequest;
    }

    public void setSecondRequest(String secondRequest) {
        this.secondRequest = secondRequest;
    }

    public boolean isFirstRequestDone() {
        return firstRequestDone;
    }

    public void setFirstRequestDone(boolean firstRequestDone) {
        this.firstRequestDone = firstRequestDone;
    }

    public boolean isSecondRequestDone() {
        return secondRequestDone;
    }

    public void setSecondRequestDone(boolean secondRequestDone) {
        this.secondRequestDone = secondRequestDone;
    }

    public String getFb_url() {
        return fb_url;
    }

    public void setFb_url(String fb_url) {
        this.fb_url = fb_url;
    }
    
}
