package com.example.fashioncommuni.chat.domain;

import com.example.fashioncommuni.member.domain.User;
import lombok.*;

import java.io.Serializable;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {

    private Long chatRoomId;

    private Long senderId;

    private String content;

    private String createdAt;
    private int readCount;

    private ChatType chatType; // 채팅 타입 필드 추가('TEXT', 'IMAGE')

    private String imageName; // 이미지 파일 이름
    private String imageUrl; // 이미지 URL


    public ChatMessage convertToChatMessage() {
        return ChatMessage.builder()
                .chatRoomId(chatRoomId)
                .senderId(senderId)
                .content(content)
                .createdAt(createdAt)
                .chatType(chatType)
                .imageUrl(imageUrl)
                .build();
    }
}