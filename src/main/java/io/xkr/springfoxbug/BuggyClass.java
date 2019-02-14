package io.xkr.springfoxbug;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class BuggyClass {

    @JsonProperty("someValue")
    @ApiModelProperty(name = "someValue")
    private String someValue;

    public String getSomeValue() {
        return someValue;
    }

    public void setSomeValue(String someValue) {
        this.someValue = someValue;
    }
}
