package edu.upeu.chatspring.model;


import lombok.*;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ChatMessage {
    private String message;
    private String fromLogin;
}
