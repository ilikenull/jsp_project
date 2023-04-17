package com.jsframe.membermanager.dto;

import lombok.Data;

@Data
public class MemberDto {
    //DB 테이블의 컬럼 이름과 개수를 똑같이.
    private String m_id;
    private String m_pwd;
    private String m_name;
    private String m_birth;
    private String m_phone;
}
