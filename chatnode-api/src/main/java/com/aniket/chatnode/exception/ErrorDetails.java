package com.aniket.chatnode.exception;

import java.time.LocalDateTime;

public record ErrorDetails(String error, String message, LocalDateTime timeStamp) {
}
