package com.jiaxy.ssf.client;

import com.jiaxy.ssf.message.RequestMessage;
import com.jiaxy.ssf.message.ResponseMessage;

/**
 * Title: <br>
 * <p>
 * Description: <br>
 * </p>
 *
 * @author <a href=mailto:taobaorun@gmail.com>wutao</a>
 *
 * @since 2016/04/15 16:34
 */
public interface Client {


    public ResponseMessage sendMsg(RequestMessage requestMessage);



    public void close();



}
