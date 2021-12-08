patterns:
        
        $ESG =  {* (Герман* | Европ*) * ((ESG | и эс джи | еэс джи) | ((зелен*|green|грин|грим) (банк*|бэнк*|bank*|продукт*))) *} 
        
        $DBK = {* (Digital|дигит*|диджит*|цифров*|прилож*|нео|необанк*) * [банк*] * (Герман* | Европ*) *}
        
        $Q1 = {* результат* * (междунар* | SBI | sberbank international | сбербанк international) * блок* *}
        
        $Q2 = {* результат* * казахстан* *}
        
        $Q3 = {* результат* * беларус* *}
        
        $Q4 = {* результат* * казахстан* * беларус* *}
        
        $Q5 = {* результат* * украин* *}
        
        $Q6 = {* развит* * трансгран* * бизнес* *}
        
        $Q7 = {* работ* * проблемн* задолж* *}
        
        $Q8 = {* развит* * экосист* *}
        
        $Q9 = {* цифров* * трансформ* *}
        
        $Q10 = {* работ* * други* *}
        
        $Q11 = {* наград* *}
        
        $Q12 = {* внедр* * экосист* *}
        
        $Q = {* результат* * [ДБ|дочерн* банк*] * СНГ *}
        
        
        


theme: /

    state: ЗапускВидеоDBK
        q!:  $DBK
       
           
        script:

            playVideo(script.clip1.videoSrc, script.clip1.posterSrc, $context);
            $reactions.buttons([script.clip2.question, "Выйти"]);
            

    state: ЗапускВидеоQ1
        q!: $Q1 
           
        script:

            playVideo(script.Q1.videoSrc, script.Q1.posterSrc, $context);
            $reactions.buttons([script.Q2.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ2
        q!: $Q2 
           
        script:

            playVideo(script.Q2.videoSrc, script.Q2.posterSrc, $context);
            $reactions.buttons([script.Q3.question, "Выйти"]);

    state: ЗапускВидеоQ3
        q!: $Q3 
           
        script:

            playVideo(script.Q3.videoSrc, script.Q3.posterSrc, $context);
            $reactions.buttons([script.Q4.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ4
        q!: $Q4
           
        script:

            playVideo(script.Q4.videoSrc, script.Q4.posterSrc, $context);
            $reactions.buttons([script.Q5.question, "Выйти"]);

    state: ЗапускВидеоQ5
        q!: $Q5
           
        script:

            playVideo(script.Q5.videoSrc, script.Q5.posterSrc, $context);
            $reactions.buttons([script.Q6.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ6
        q!: $Q6
           
        script:

            playVideo(script.Q6.videoSrc, script.Q6.posterSrc, $context);
            $reactions.buttons([script.Q7.question, "Выйти"]);

    state: ЗапускВидеоQ7
        q!: $Q7
           
        script:

            playVideo(script.Q7.videoSrc, script.Q7.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ8
        q!: $Q8
           
        script:

            playVideo(script.Q8.videoSrc, script.Q8.posterSrc, $context);
            $reactions.buttons([script.Q9.question, "Выйти"]);
            
    state: ЗапускВидеоQ9
        q!: $Q9
           
        script:

            playVideo(script.Q9.videoSrc, script.Q9.posterSrc, $context);
            $reactions.buttons([script.Q10.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ10
        q!: $Q10
           
        script:

            playVideo(script.Q10.videoSrc, script.Q10.posterSrc, $context);
            $reactions.buttons([script.Q11.question, "Выйти"]);

    state: ЗапускВидеоQ11
        q!: $Q11 
           
        script:

            playVideo(script.Q11.videoSrc, script.Q11.posterSrc, $context);
            $reactions.buttons([script.Q12.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ12
        q!: $Q12 
           
        script:

            playVideo(script.Q12.videoSrc, script.Q12.posterSrc, $context);
            $reactions.buttons([script.Q1.question, "Выйти"]);
            
    state: ЗапускВидеоQ13
        q!: $Q13
           
        script:

            playVideo(script.Q13.videoSrc, script.Q13.posterSrc, $context);
            $reactions.buttons([script.Q13.question, "Выйти"]);           
  
            
            
    state: ЗапускВидеоESG
        q!: $ESG 
           
        script:

            playVideo(script.clip2.videoSrc, script.clip2.posterSrc, $context);
            $reactions.buttons([script.Q8.question, "Выйти"]);


    state: ЗапускСлайдБиометрия
        q!:  покажи биометрию
           
        script:

            setPoster(script.poster1.posterSrc, $context);
            $reactions.buttons([script.poster2.question, "Выйти"]);
           
 
    state: ЗапускСлайдГрафик
        q!:  покажи график
           
        script:

            setPoster(script.poster2.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);            

    state: ЗапускПостер
        q!:  покажи постер
           
        script:

            setPoster(script.poster0.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);              

            
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
            