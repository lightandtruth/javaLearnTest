package com.cdsxt.ego.beans;

public class PictureResult {
    private Integer error;
    private String url;
    private String message;

    public PictureResult() {
    }

    public PictureResult(Integer error, String url) {
        this.error = error;
        this.url = url;
    }

    public Integer getError() {
        return this.error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
