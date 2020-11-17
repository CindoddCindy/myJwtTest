package myjwt.myjwttest.model;

import myjwt.myjwttest.model.audit.DateAudit;

public class UserBuyBaggage  extends DateAudit {
    private Long userBuyerId;

    private String userBuyerName;

    private String userBuyerEmail;

    private String userBuyerPhone;

    private String userBuyerPassword;

    public UserBuyBaggage(Long userBuyerId, String userBuyerName, String userBuyerEmail, String userBuyerPhone, String userBuyerPassword) {
        this.userBuyerId = userBuyerId;
        this.userBuyerName = userBuyerName;
        this.userBuyerEmail = userBuyerEmail;
        this.userBuyerPhone = userBuyerPhone;
        this.userBuyerPassword = userBuyerPassword;
    }

    public Long getUserBuyerId() {
        return userBuyerId;
    }

    public void setUserBuyerId(Long userBuyerId) {
        this.userBuyerId = userBuyerId;
    }

    public String getUserBuyerName() {
        return userBuyerName;
    }

    public void setUserBuyerName(String userBuyerName) {
        this.userBuyerName = userBuyerName;
    }

    public String getUserBuyerEmail() {
        return userBuyerEmail;
    }

    public void setUserBuyerEmail(String userBuyerEmail) {
        this.userBuyerEmail = userBuyerEmail;
    }

    public String getUserBuyerPhone() {
        return userBuyerPhone;
    }

    public void setUserBuyerPhone(String userBuyerPhone) {
        this.userBuyerPhone = userBuyerPhone;
    }

    public String getUserBuyerPassword() {
        return userBuyerPassword;
    }

    public void setUserBuyerPassword(String userBuyerPassword) {
        this.userBuyerPassword = userBuyerPassword;
    }
}
