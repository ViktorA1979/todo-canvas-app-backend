theme: /

    state: ЗапускВидеоТизера
        q!: (поставь|покажи) 
            [тизер|отчет]
            $AnyText::anyText
            
        script:
                $response.replies = $response.replies || [];
    
                var body = {
                      items: [{
                        command :{
                                    type:"add_note",
                                    note $parseTree._anyText
                                 }
                            
                              }]
                            };
                
                $response.replies.push({ type : "raw", body : body });
        buttons:
            "Видосик SBI"
            