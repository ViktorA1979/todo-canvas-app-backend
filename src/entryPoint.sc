require: slotfilling/slotFilling.sc
  module = sys.zb-common
  
# Подключение javascript обработчиков
require: js/getters.js
require: js/reply.js
require: js/actions.js
require: js/findItem.js
require: js/videoActions.js

# Подключение сценарных файлов
require: scenario/addNote.sc
require: scenario/doNote.sc
require: scenario/deleteNote.sc
require: scenario/serverActions.sc
require: scenario/playVideo.sc

patterns:
    $AnyText = $nonEmptyGarbage
    
    # Паттерны для запуска сценария
    $OpenSkipWords = (хочу|мне|мое|моё|пожалуйста|в|прошу|тебя|может|с)
    $OpenKeyWords = (включи|включить|включай|запусти|запустить|запускай|играть|
        поиграть|поиграем|навык|игра|игру|скил|скилл|приложение|апп|сыграем|
        открой|поиграй со мной|сыграть|давай играть|активируй|давай|поиграем)
    $projectName = (Название вашего навыка)


theme: /
    state: Запуск
        # При запуске приложения с кнопки прилетит сообщение /start.
        q!: $regex</start>
        
        # При запуске приложения с голоса прилетит сказанная фраза.
        q!: [$repeat<$OpenSkipWords>] 
            $repeat<$OpenKeyWords>
            [$repeat<$OpenSkipWords>] 
            $projectName
        script:
            log($jsapi.cailaService.getCurrentClassifierToken());
            $temp.appeal = $request.rawRequest.payload.character.appeal;
            
        if: $temp.appeal == "official"
            a: Добро пожаловать в приложение международного блока Сбера! Позвольте продемонстрировать наши достижения за 2021 год.
        elseif: $temp.appeal == "no_official"
            a: Добро пожаловать в приложение международного блока Сбера! Позвольте продемонстрировать наши достижения за 2021 год.
        else:
            a: Добро пожаловать в SBI! Хочу показать наши достижения!

        
    state: Fallback
        event!: noMatch
        a: Я не понимаю.
