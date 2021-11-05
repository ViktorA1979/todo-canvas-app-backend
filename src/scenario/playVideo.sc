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
                                note: $parseTree._anyText
                            }
                        }
                    }]
                };  
                var reply = {
                        type: "raw",
                        body: {
                            "items": [{
                            "command": {
                                "type": "close_app"
                             }
                            }]
                        }
                };
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
            "Покажи еще раз"
            "Выйти"
            