from bs4 import BeautifulSoup
import sqlite3
import re



with open("yandex_covid19_static_bot.html", "r", encoding="utf-8") as f:


    soup = BeautifulSoup(f, "html.parser")

    body = soup.findAll("div",{"class":"today-category__value"})
    body = str(body[1])
    body7 = "<div class=today-category__value>+15 573</div>"
    print(body7)
    body7 = body7.replace(" ", "")
    print(body7)

    try:
        dt = str(re.findall(r"\d{1,8}", body7))
        print(dt + " hello")
    except:
        print('как дела')

        C:\Users\Федор\Program Files\www\covid19bot\script.py


