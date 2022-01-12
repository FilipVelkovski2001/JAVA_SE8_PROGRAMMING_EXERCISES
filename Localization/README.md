# Java Localization

As the name suggests util.Locale Class is used to perform locale task and provides locale information for the user. 

Declaration : 

public final class Locale
   extends Object
   implements Cloneable, Serializable
Constructors : 

Locale(String L): Creates Locale form the given language code.
Locale(String L, String C): Creates Locale form the given language, country code.
Locale(String L, String C, String V): Creates Locale form the given language, country, variant code.
Methods: 

1. getDisplayCountry() : java.util.Locale.getDisplayCountry() return the country to which locale belongs to. 



Syntax : 

public final String getDisplayCountry()
Parameters : 
----
Return :
-----
2. getDefault() : java.util.Locale.getDefault() return the current – default value for the locale as per the JVM instance. 

Syntax : 

public static Locale getDefault()
Parameters : 
----
Return :
current - default value for the locale as per the JVM instance.
3. getCountry() : java.util.Locale.getCountry() return the country for the locale which could be empty or ISO 3166 2-letter code. 

Syntax : 

public String getCountry()
Parameters : 
----
Return :
-----
4. equals(Object locale2) : java.util.Locale.equals(Object locale2) checks whether two locales are equal or not. 

Syntax : 

public boolean equals(Object locale2)
Parameters : 
locale2 : another locale to be compare with.
Return :
returns true if two locales are equal, else false. 
5. clone() : java.util.Locale.clone() creates clone of the locale. 



Syntax : 

public Object clone()
Parameters : 
----
Return :
clone of this instance
6. getAvailableLocales() : java.util.Locale.getAvailableLocales() returns array of all the installed locales. 

Syntax : 

public static Locale[] getAvailableLocales()
Parameters : 
---
Return :
array of installed locales.
7. getDisplayLanguage() : java.util.Locale.getDisplayLanguage() returns the language with the locale. 

Syntax : 

public final String getDisplayLanguage()
Parameters : 
----
Return :
---- 
8. getDisplayLanguage(Locale in) : java.util.Locale.getDisplayLanguage(Locale in) returns the language localised according to “in” Locale if possible. 

Syntax : 

public String getDisplayLanguage(Locale in)
Parameters : 
in : the instance local
Return :
---- 
Exception :
NullPointerException : if "in" is null.
9. getDisplayName() : java.util.Locale.getDisplayName() displays name of the Locale 

Syntax : 

public final String getDisplayName()
Parameters : 
----
Return :
-----------
10. getDisplayLanguage(Locale in) : java.util.Locale.getDisplayLanguage(Locale in) returns the language of “in” locale. 

Syntax : 

public final String getDisplayLanguage()
Parameters : 
in : the instance local
Return :
---- 
11. getISO3Country() : java.util.Locale.getISO3Country() displays 3-letter abbreviation of Locale country. 

Syntax : 

public String getISO3Country()
Parameters : 

Return :
-------------

// Java Program illustrating the use of methods :
// getDisplayCountry(), getCountry(), equal(), clone(),
// getAvailableLocales(), getDefault(),
// getDisplayLanguage(Locale in), getDisplayLanguage(),
// getDisplayName(Locale in), getDisplayName(),
// getISO3Country()
import java.util.*;
public class NewClass
{
    public static void main(String[] args)
    {
        // Creating a new Locale
        Locale geek1 = new Locale("English", "IN");
 
        // Use of getDefault() :
        Locale geek2 = Locale.getDefault();
 
        System.out.println("Locale name : " + geek1);
        System.out.println("Locale name Default : " + geek2);
 
        // Use of getDisplayCountry() :
        System.out.println("\nCountry Name : "
                            + geek1.getDisplayCountry());
 
        // Use of getCountry() :
        System.out.println("Country Name ISO 3166 2-letter code : "
                                            + geek1.getCountry());
 
        // Use of equal() :
        System.out.println("\nIs geek1 equals geek2 : "
                                 + geek1.equals(geek2));
 
        // clone() : geek3 is a clone of geek2
        Locale geek3 = (Locale) geek2.clone();
 
        // Locale : geek3
        System.out.println("Locale geek3 same as geek2 : "
                                                + geek3);
 
        // Use of getAvailableLocales()
        Locale[] geek4 = Locale.getAvailableLocales();
 
        // We are not printing all the locales.
        System.out.println("\nInstalled locales are : ");
        for (int i = 1; i < geek4.length/10; i++)
            System.out.println(i + ":" + geek4[i]);
 
        // Use of getDisplayLanguage() :
        System.out.println("\ngeek2 Language : "
                        + geek2.getDisplayLanguage());
 
        // Use of getDisplayLanguage(Locale in) :
        System.out.println("Language of in Locale : "
          + geek1.getDisplayLanguage(new Locale("France", "French")));
 
        // Use of getDisplayName :
        System.out.println("\nUse of getDisplayName : "
                              + geek1.getDisplayName());
 
        // Use of getDisplayName(Locale in) :
        System.out.println("Name of in Locale : "
          + geek2.getDisplayName(new Locale("English", "english")));
 
        // Use of getISO3Country() :
        System.out.println("\nISO3 Country Name of geek3 : "
                                    + geek3.getISO3Country());
 
    }
}

```

Output : 

```

Locale name : english_IN
Locale name Default : en_US

Country Name : India
Country Name ISO 3166 2-letter code : IN

Is geek1 equals geek2 : false
Locale geek3 same as geek2 : en_US

Installed locales are : 
1:ar_AE
2:ar_JO
3:ar_SY
4:hr_HR
5:fr_BE
6:es_PA
7:mt_MT
8:es_VE
9:bg
10:zh_TW
11:it
12:ko
13:uk
14:lv
15:da_DK

geek2 Language : English
Language of in Locale : english

Use of getDisplayName : english (India)
Name of in Locale : English (United States)

ISO3 Country Name of geek3 : USA

```