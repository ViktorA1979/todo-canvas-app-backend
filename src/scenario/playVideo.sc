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
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
            "Выйти"
            