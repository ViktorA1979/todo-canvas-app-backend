theme: /

    state: ЗапускВидеоСбер
        q!:  расскажи про сбер
           
        script:

            playVideo(script.clip1.videoSrc, $context);
            $reactions.buttons([script.clip2.question, "Выйти"]);
            



    state: ЗапускВидеоГород
        q!:  расскажи про город
           
        script:

            playVideo(script.clip2.videoSrc, $context);
            $reactions.buttons(script.clip3.question, "Выйти"]);

 
 
    state: ЗапускВидеоПогода
        q!:  расскажи про снег
           
        script:

            playVideo(script.clip3.videoSrc, $context);
            $reactions.buttons([script.poster1.question, "Выйти"]);


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
            