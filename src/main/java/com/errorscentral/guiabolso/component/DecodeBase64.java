package com.errorscentral.guiabolso.component;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component
public class DecodeBase64 {

    public String decode( String value ) {

        byte[] decodeByte = Base64.decodeBase64(value.getBytes());
        String decodeString = new String(decodeByte);
        return decodeString;
    }

}
