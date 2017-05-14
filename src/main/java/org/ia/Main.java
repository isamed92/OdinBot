package org.ia;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

/**
 * @author bruino
 * @version 14/05/17.
 */
public class Main {

    public static void main(String[] args) throws TelegramApiRequestException {
        ApiContextInitializer.init();
        TelegramBotsApi bot = new TelegramBotsApi();
        bot.registerBot(new OdinBot());

        System.out.printf("¡Estoy vivo!");
    }
}
