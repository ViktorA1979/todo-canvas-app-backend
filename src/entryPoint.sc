require: slotfilling/slotFilling.sc
  module = sys.zb-common
  

require: js/videoActions.js
require: js/serviceActions.js

require: scenario/playVideo.sc

require: script.yaml
    var = script

patterns:
    $AnyText = $nonEmptyGarbage
    
    # Паттерны для запуска сценария
    $OpenSkipWords = (хочу|мне|мое|моё|пожалуйста|в|прошу|тебя|может|с)
    $OpenKeyWords = (включи|включить|включай|запусти|запустить|запускай|играть|
        поиграть|поиграем|навык|игра|игру|скил|скилл|приложение|апп|сыграем|
        открой|поиграй со мной|сыграть|давай играть|активируй|давай|поиграем)
    $projectName = (Название вашего навыка)
    
    $StartVideo = (расскажи про новые проекты)


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
           
            $reactions.buttons([script.clip1.question, "Выйти"]);
            
        if: $temp.appeal == "official"
            a: Чем могу помочь
        elseif: $temp.appeal == "no_official"
            a: Чем могу помочь 
        else:
            a: Чем могу помочь
            
            
        
    state: Fallback
        event!: noMatch
        a: Я не понимаю.
    
        buttons:
            "Расскажи про сбер"
            "Выйти"