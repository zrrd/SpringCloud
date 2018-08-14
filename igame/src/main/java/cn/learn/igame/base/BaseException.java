package cn.learn.igame.base;

import lombok.Getter;

/**
 * 基础错误类.
 *
 * @author shaoyijiong
 * @date 2018/7/19
 */
@Getter
public abstract class BaseException extends RuntimeException {

  /**
   * 错误码.
   */
  protected Integer code;

  public BaseException() {
  }

  public BaseException(String message) {
    super(message);
  }

  public BaseException(String message, Throwable cause) {
    super(message, cause);
  }

  public BaseException(Throwable cause) {
    super(cause);
  }

  public BaseException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
