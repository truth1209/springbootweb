package group.wukong.web.model;

/**
 * Created by zhengli on 2018/7/1.
 */
public class BaseInfo {
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String orderId;

    private String userId;
}
