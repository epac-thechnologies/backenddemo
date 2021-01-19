package com.OrdreArchive.Entity;

import java.math.BigInteger;

public class Conftoken {
    private String access_token;
    private String token_type;
    private BigInteger expires_in;
    private String scope;

    public Conftoken(String access_token, String token_type, BigInteger expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.scope = scope;
    }

    public Conftoken(String access_token) {
        this.access_token = access_token;
    }
    public Conftoken (){

    }

    public Conftoken(Conftoken body) {

    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public BigInteger getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(BigInteger expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
