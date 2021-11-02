theme: /

    state: ЗапускВидеоТизера
        q!: (~добавить|~установить|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]

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
            "Выйти"
            