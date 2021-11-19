theme: /

    state: ЗапускВидеоТизера
        q!: (~покажи|расскажи про новые проекты|покажи еще раз) 
           
            
        script:

            playVideo("https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video1.mp4", $context);

        buttons:
            "Расскажи про новые проекты"
            "Покажи клип"
            "Останови видео"
            "Выйти"
     
    state: ЗапускВидеоТизераРаз
        q!: (~покажика|покажи клип) 
           
            
        script:
        
            setPoster("https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/foto2.jpeg", $context);
                 
        buttons:
            "Расскажи про новые проекты"
            "Покажи клип"
            "Останови видео"
            "Выйти"
            
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
            