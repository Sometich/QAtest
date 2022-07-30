package com.balayan.testtretyakovka;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;

import static com.codeborne.selenide.Selenide.*;

/**
 * Идентификатор – TEST001
 * Описание – Проверка наличия контактов в разделе ‘Контакты’
 * Шаги:
 * - Открываем главную страницу - https://www.tretyakovgallery.ru/
 * - Переходим в footer и нажимаем 'Контакты’
 * - Переходим на новую страницу
 * - Проверяем наличие номера ‘+7 (495) 957 07 27’
 * Входные данные - Отсутствуют
 * Ожидаемый результат – Пользователь попадает на страницу с контактами и видит номер телефона
 * Фактический результат – Как ожидали
 * Статут – Пройдено успешно
 */

public class MainPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        Configuration.browser = "chrome";
    }

    @BeforeEach
    public void setUp() {
        open("https://www.tretyakovgallery.ru/");
    }

    @Test
    public void search() {
        SelenideElement contacts = $x("//a[contains(@href,\"/about/contacts/\") and @class='footer-nav__link']");
        contacts.click();
        SelenideElement contactsPage = $x("//ul[@class='contacts-item__info-list']/li[1]/span");
        contactsPage.shouldHave(text("+7 (495) 957 07 27"));
    }
}
