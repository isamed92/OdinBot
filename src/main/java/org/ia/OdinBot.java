package org.ia;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.send.SendSticker;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * @author ia
 * @version 14/05/17.
 */
public class OdinBot extends TelegramLongPollingBot implements IOdinBot {
    private Long id_mensaje;
    private OdinBotPresenter presenter = new OdinBotPresenter(this);

    @Override
    public void onUpdateReceived(Update update) {
        presenter.analizarMensajeUsuario(update);
    }

    @Override
    public String getBotUsername() {
        return "OdinBot";
    }

    @Override
    public String getBotToken() {
        //Versión de Pruebas - Pongan otro...
        return "";
    }

    //...Interface OdinBot................................................................
    @Override
    public void setChatId(Long id) {
        id_mensaje = id;
    }

    @Override
    public Long getChatId() {
        return id_mensaje;
    }

    @Override
    public void enviarMensajeTextoPlano(String mensaje) throws TelegramApiException {
        SendMessage message = new SendMessage()
                .setText(mensaje)
                .setChatId(id_mensaje);

        sendMessage(message);
    }

    @Override
    public void enviarMensajeSticker(String sticker) throws TelegramApiException {
        SendSticker sendSticker = new SendSticker()
                .setSticker(sticker)
                .setChatId(id_mensaje);

        sendSticker(sendSticker);
    }

    @Override
    public void enviarMensajeConKeyboardPersonalized(String mensaje, String[] opciones) {
        //TODO: realizar funcion
        // - mensaje: String del mensaje que recibira el usuario junto con...
        // - opciones: Cadena de String con las opciones que tiene el usuario para escoger.

    }
}
