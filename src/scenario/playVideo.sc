theme: /

    state: ЗапускВидеоТизера
        q!: (поставь) 
            [тизер|отчет]
            $AnyText::anyText
            
        script:
            addNote($parseTree._anyText, $context);
