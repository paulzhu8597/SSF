package com.jiaxy.ssf.intercept;

import java.util.List;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 *
 * @author <a href=mailto:taobaorun@gmail.com>wutao</a>
 *
 * @since 2016/04/07 14:11
 */
public interface MessageInvocation extends Invocation{


    List<MessageInterceptor> interceptors();

}
