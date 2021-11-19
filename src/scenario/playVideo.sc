theme: /

    state: ЗапускВидеоТизера
        q!: (~покажи|расскажи про новые проекты|покажи еще раз) 
           
            
        script:
            $response.replies = response.replies || [];
           // reply($response)
                var body = {
                    items:[{
                        command:{
                                type: "smart_app_data",
                                action :{
                                    type: "play_video", 
                                    clip:{
                                        srcVideo: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video1.jpeg" ,
                                        srcPoster: "",
                                        isPlay: true
                                        }
                                }
                            }
                        }]
                    }; 
    
            
            //response.replies.push(replyData);
            $response.replies.push({ type : "raw", body: body});
            
        buttons:
            "Расскажи про новые проекты"
            "Покажи клип"
            "Останови видео"
            "Выйти"
     
    state: ЗапускВидеоТизераРаз
        q!: (~покажика|покажи клип) 
           
            
        script:
        
            $response.replies = $response.replies || [];
                
                var body = {
                    items:[{
                        command:{
                            type: "smart_app_data",
                            action :{
                                type: "play_video", 
                                clip:{
                                    srcVideo: "",
                                    srcPoster: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/foto2.jpeg" ,
                                    isPlay: false
                                    }
                            }
                        }
                    }]
                }; 
                
            $response.replies.push({ type : "raw", body: body});      
            
            
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
            