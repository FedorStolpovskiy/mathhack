import telebot

bot = telebot.TeleBot("1288067636:AAECQyobWJUOkt8W2i-NXF7ywpidVQp6RiQ")


keyboardstart = telebot.types.ReplyKeyboardMarkup()
keyboardstart.row('Приветвапавв', 'Покавыывы')


@bot.message_handler(commands=['start', 'help'])
def send_welcome(message):
    	bot.send_message(message, "Этот бот показывает количество заболевших в россии/украине/белоруссии", reply_markup=keyboardstart)

		

@bot.message_handler(content_types=['text'])
def echo_all(message):
    	if message = 'Приветвапавв':
	bot.reply_to(message, message.text)

bot.polling()