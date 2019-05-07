package com.wen.promfed;

import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.InfoEndpoint;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.*;
import org.springframework.boot.actuate.endpoint.annotation.*;

import java.util.Map;

@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
public class InfoWebEndPointExtention {
    private InfoEndpoint delegate;

    public InfoWebEndPointExtention() {}

    @ReadOperation
    public WebEndpointResponse<Map> info() {
        Map<String, Object> info = this.delegate.info();
        Integer status = getStatus(); //  200; // hardcode http 200 here
        return new WebEndpointResponse<>(info,status);
    }

    private Integer getStatus() {
        return 500; //if it's snapshot
    }
}

