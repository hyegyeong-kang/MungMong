package com.metanet.metamungmung.service.meeting;

import com.metanet.metamungmung.dto.meeting.OnMeetingBoardDTO;
import com.metanet.metamungmung.dto.meeting.OnMeetingMemDTO;

import java.util.List;

public interface OnMeetingBoardService {

    // 게시글 목록 조회
    public List<OnMeetingBoardDTO> getBoardList(Long onMeetingIdx);

    // 온모임 가입한 사용자 리스트
    public List<OnMeetingMemDTO> getOnMeetingMembers(Long onMeetingIdx);

    // 게시글 상세 조회

    // 게시글 작성

    // 게시글 수정

    // 게시글 삭제

    // 게시글 검색

}
