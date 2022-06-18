package cn.zybcn.instantkill.exception;

/**
 * @Author ZhangYiBo
 * @Date 2022-06-18 15:58
 */
public class SystemException extends RuntimeException {
    public SystemException(String msg) {
        super(msg);
    }

    public SystemException() {
        super();
    }
}
