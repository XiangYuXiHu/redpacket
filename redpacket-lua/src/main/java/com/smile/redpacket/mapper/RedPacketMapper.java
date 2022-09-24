package com.smile.redpacket.mapper;


import com.smile.redpacket.domain.RedPacket;
import com.smile.redpacket.domain.UserRedPacket;
import org.apache.catalina.User;

import java.util.List;

/**
 * @author 12780
 */
public interface RedPacketMapper {

    /**
     * 获取红包信息
     *
     * @return
     */
    List<RedPacket> getAllRedPacket();
}
