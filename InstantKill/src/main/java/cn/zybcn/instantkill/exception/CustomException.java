package cn.zybcn.instantkill.exception;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-18 15:57
 * @Desc 用户自定义异常
 */
public class CustomException extends RuntimeException {

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException() {
        super();
    }
}
