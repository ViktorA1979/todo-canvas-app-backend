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
                                id: "video1",
                                isPlay: "false"
                            }
                        }
                    }]
                }; 
                $response.replies.push({ type : "raw", body: body});      
            
            
        buttons:
            "Выйти"
            