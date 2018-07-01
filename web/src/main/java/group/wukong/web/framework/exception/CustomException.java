package group.wukong.web.framework.exception;

import group.wukong.web.model.BaseInfo;

public class CustomException extends RuntimeException {

    public CustomException(String code, String msg, BaseInfo baseInfo) {
        this.code = code;
        this.msg = msg;
        this.baseInfo = baseInfo;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    private BaseInfo baseInfo;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private String msg;
}
