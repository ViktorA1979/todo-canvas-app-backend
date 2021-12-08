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

    state: ЗапускВидео1
        q!:  $DBK
       
           
        script:

            playVideo(script.clip1.videoSrc, script.clip1.posterSrc, $context);
            $reactions.buttons([script.clip2.question, "Выйти"]);
            

    state: ЗапускВидео2
        q!: $ESG 
           
        script:

            playVideo(script.clip2.videoSrc, script.clip2.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);


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
            