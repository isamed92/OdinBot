package org.ia;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * @author ia
 * @version 14/05/17.
 */
public class OdinBotPresenter implements IOdinBotPresenter {
    private IOdinBot bot;

    public OdinBotPresenter(IOdinBot bot) {
        this.bot = bot;
    }

    @Override
    public void analizarMensajeUsuario(Update update) {
        if (update.getMessage().getText() != null){
            String mensaje_usuario = update.getMessage().getText();
            try {
                bot.setChatId(update.getMessage().getChatId());
                bot.enviarMensajeTextoPlano(mensaje_usuario);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
