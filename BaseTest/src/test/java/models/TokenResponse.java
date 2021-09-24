package models;

import org.apache.commons.lang3.StringUtils;

public class TokenResponse {

    public String access_token;
    public String instance_url;
    public String id;
    public String token_type;
    public String issued_at;
    public String signature;
    public Integer expires_in;

    public String authorization() {
        return StringUtils.capitalize(token_type) + " " + access_token;
    }


}
