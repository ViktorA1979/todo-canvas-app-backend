theme: /

    state: ЗапускВидеоТизера
        q!: (поставь|покажи) 
            [тизер|отчет]
            $AnyText::anyText
            
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
                $response.replies.push({ type : "raw", body: body});      
            
                
        buttons:
            "Покажи отчет"
            
        buttons:
            "Выйти"
            