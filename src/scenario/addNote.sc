theme: /

    state: ДобавлениеЭлемента
        q!: (добавить|~установить|запиши|поставь|закинь|~напомнить) 
            [~напоминание|~заметка|~задание|~задача]
            $AnyText::anyText
            
        script:
            addNote($parseTree._anyText, $context);
        
        go!: /ДобавленаНоваяЗапись
