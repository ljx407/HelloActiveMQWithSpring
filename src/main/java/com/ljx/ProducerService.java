package com.ljx;

import javax.jms.Destination;

/**
 * Created by jasonliu on 2016/10/31.
 */
public interface ProducerService {
    public void sendMessage(Destination destination, String message);
}
