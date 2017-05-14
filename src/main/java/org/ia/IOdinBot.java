package org.ia;

import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * @author ia
 * @version 14/05/17.
 */
public interface IOdinBot {
    void setChatId(Long id);
    Long getChatId();

    void enviarMensajeTextoPlano(String mensaje) throws TelegramApiException;
    void enviarMensajeSticker(String sticker) throws TelegramApiException;
    void enviarMensajeConKeyboardPersonalized(String mensaje, String[] opciones);
}
