theme: /

    state: ЗапускВидеоТизера
        q!: (поставь|покажи) 
            [тизер|отчет]
            $AnyText::anyText
            
       # script:
        #    addNote($parseTree._anyText, $context);
        buttons:
            "Видосик SBI"
            