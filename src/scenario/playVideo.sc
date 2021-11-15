theme: /

    state: ЗапускВидеоТизера
        q!: (~покажи|расскажи про новые проекты|покажи еще раз) 
           
            
        script:
        
            $response.replies = $response.replies || [];
                
                var body = {
                    items:[{
                        command:{
                            type: "smart_app_data",
                            action :{
                                type: "play_video", 
                                clip:{
                                    id: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video1.mp4",
                                    isPlay: true
                                    }
                            }
                        }
                    }]
                }; 
                
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
            "Останови видео"
            "Покажи клип"
            "Выйти"
     
      state: ЗапускВидеоТизера1
        q!: (~покажи|покажи клип) 
           
            
        script:
        
            $response.replies = $response.replies || [];
                
                var body = {
                    items:[{
                        command:{
                            type: "smart_app_data",
                            action :{
                                type: "play_video", 
                                clip:{
                                    id: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video3.mp4",
                                    isPlay: true
                                    }
                            }
                        }
                    }]
                }; 
                
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
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
            