/**
 * Error automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.sdkfabric.discord;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Error {
    private Integer code;
    private String message;
    private Object errors;
    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }
    @JsonGetter("code")
    public Integer getCode() {
        return this.code;
    }
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }
    @JsonSetter("errors")
    public void setErrors(Object errors) {
        this.errors = errors;
    }
    @JsonGetter("errors")
    public Object getErrors() {
        return this.errors;
    }
}