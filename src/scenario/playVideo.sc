theme: /

    state: ЗапускВидео1
        q!:  (Покажи какие функции у нашего цифрового банка в Европе|Продемонстрируй функционал нашего цифрового банка в Европе|Покажи как выглядет приложение Digital банка в Европе|Покажи какое приложение мы хотим запустить в Европе в 2022 году|Покажи цифровой Банк в Европе|Что мы строим в Европе)
           
        script:

            playVideo(script.clip1.videoSrc, script.clip1.posterSrc, $context);
            $reactions.buttons([script.clip2.question, "Выйти"]);
            

    state: ЗапускВидео2
        q!:  (Что мы делаем в Германии в части ESG|Что мы делаем в Германии в части green banking|Что мы делаем в Германии в части развития зелёного банка|Какие зеленые продукты мы будем предлагать клиентам в Европе|Покажи зеленый банк в Европе)
           
        script:

            playVideo(script.clip2.videoSrc, script.clip2.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);


    state: ЗапускСлайдБиометрия
        q!:  покажи биометрию
           
        script:

            setPoster(script.poster1.posterSrc, $context);
            $reactions.buttons([script.poster2.question, "Выйти"]);
           
 
    state: ЗапускСлайдГрафик
        q!:  покажи график
           
        script:

            setPoster(script.poster2.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);            

    state: ЗапускПостер
        q!:  покажи постер
           
        script:

            setPoster(script.poster0.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);              

            
    state: ОстановкаВидеоТизера
        q!: (~останови|Останови видео) 
           
            
        script:
        
        
            $response.replies = $response.replies || [];
                
                var body = {
                    items:[{
                        command:{
                            type: "smart_app_data",
                            action :{
                                type: "stop_video", 
                                clip:{
                                    id: "video1",
                                    isPlay: false
                                    }
                            }
                        }
                    }]
                }; 
                
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
            "Выйти"
            