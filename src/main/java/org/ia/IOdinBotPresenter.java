package org.ia;

import org.telegram.telegrambots.api.objects.Update;

/**
 * @author ia
 * @version 14/05/17.
 */
public interface IOdinBotPresenter {
    void analizarMensajeUsuario(Update update);
}
