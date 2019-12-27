package com.atguigu.gmall.service;



import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();


    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
