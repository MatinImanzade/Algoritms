package coders.iyun22;

import java.util.Scanner;

public enum Month {
    JANUARY(1, "Yanvar", "Январь", "Ocak"),
    FEBRUARY(2, "Fevral", "Февраль", "Şubat"),
    MARCH(3, "Mart", "Март", "Mart"),
    APRIL(4, "Aprel", "Апрель", "Nisan"),
    MAY(5, "May", "Май", "Mayıs"),
    JUNE(6, "İyun", "Июнь", "Haziran"),
    JULY(7, "İyul", "Июль", "Temmuz"),
    AUGUST(8, "Avqust", "Август", "Ağustos"),
    SEPTEMBER(9, "Sentyabr", "Сентябрь", "Eylül"),
    OCTOBER(10, "Oktyabr", "Октябрь", "Ekim"),
    NOVEMBER(11, "Noyabr", "Ноябрь", "Kasım"),
    DECEMBER(12, "Dekabr", "Декабрь", "Aralık");

    private final int monthNumber;
    private final String AZE;
    private final String RU;
    private final String TR;

    Month(int monthNumber, String AZE, String RU, String TR) {
        this.monthNumber = monthNumber;
        this.AZE = AZE;
        this.RU = RU;
        this.TR = TR;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getNameByLanguage(LanguageEnum languageEnum) {
        switch (languageEnum) {
            case AZ:
                return AZE;
            case EN:
                return name();
            case RU:
                return RU;
            case TR:
                return TR;
            default:
                return "Nothing";
        }
    }

    public static Month getMonthByNumber(int number) {
        for (Month month : values()) {
            if (month.getMonthNumber() == number) {
                return month;
            }
        }
        return null;
    }
}

enum LanguageEnum {
    AZ("AZ"),
    EN("EN"),
    RU("RU"),
    TR("TR");

    private final String languageCode;

    LanguageEnum(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getCode() {
        return languageCode;
    }

    public static LanguageEnum getByCode(String languageCode) {
        for (LanguageEnum code : values()) {
            if (code.getCode().equals(languageCode)) {
                return code;
            }
        }
        return null;
    }
}


