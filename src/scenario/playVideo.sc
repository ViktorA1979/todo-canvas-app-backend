patterns:
        
        $ESG =  {* (Герман* | Европ*) * ((ESG | и эс джи | еэс джи) | ((зелен*|green|грин|грим) (банк*|бэнк*|bank*|продукт*))) *} 
        
        $DBK = {* покаж* (Digital|дигит*|диджит*|цифров*|прилож*|нео банк*|необанк*)  * (Герман* | Европ*) *}
        
        $Q1 = {* результат* * (междунар* | SBI | sberbank international | сбербанк international) * блок* *}
        
        $Q2 = {* результат* * казахстан* *}
        
        $Q3 = {* результат* * беларус* *}
        
        $Q4 = {* (результат* | достиж*) * казахстан* * беларус* *}
        
        $Q5 = {* результат* * украин* *}
        
        $Q6 = {* развит* * трансгран* * бизнес* *}
        
        $Q7 = {* работ* * проблемн* задолж* *}
        
        $Q8 = {* расскаж* * (необанк*|нео банк*) * (герман*|европ*) *}
        
        $Q9 = {* развит* * экосист* *}
        
        $Q10 = {* цифров* * трансформ* *}
        
        $Q11 = {* работ* * други* *}
        
        $Q12 = {* наград* *}
        
        $Q13 = {* внедр* * экосист* *}
        
        $Q14 = {* результат* * [ДБ|дочерн* банк*] * СНГ *}
        
        
        


theme: /

    state: ЗапускВидео
        q!:  (запуст*|старт*|игра*)
       
        script:
            playVideo("play", "", $context);
 
            
    state: ПаузаВидео
        q!:  (стоп*|останов*|пауз*)
       
        script:
            playVideo("pause", "", $context);

    state: СвернутьВидео
        q!:  (сверн*|уменьш*)
       
        script:
            playVideo("doun", "", $context);            
            
    state: РазвернутьВидео
        q!:  (разверн*|раскр*|на весь экран|увелич*)
       
        script:
            playVideo("up", "", $context);    
            

            

    state: ЗапускВидеоQ1
        q!: $Q1 
           
        script:

            playVideo(script.q1.videoSrc, script.q1.posterSrc, $context);
            $reactions.buttons([script.q2.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ2
        q!: $Q2 
           
        script:

            playVideo(script.q2.videoSrc, script.q2.posterSrc, $context);
            $reactions.buttons([script.q3.question, "Выйти"]);

    state: ЗапускВидеоQ3
        q!: $Q3 
           
        script:

            playVideo(script.q3.videoSrc, script.q3.posterSrc, $context);
            $reactions.buttons([script.q4.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ4
        q!: $Q4
           
        script:

            playVideo(script.q4.videoSrc, script.q4.posterSrc, $context);
            $reactions.buttons([script.q5.question, "Выйти"]);

    state: ЗапускВидеоQ5
        q!: $Q5
           
        script:

            playVideo(script.q5.videoSrc, script.q5.posterSrc, $context);
            $reactions.buttons([script.q6.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ6
        q!: $Q6
           
        script:

            playVideo(script.q6.videoSrc, script.q6.posterSrc, $context);
            $reactions.buttons([script.q7.question, "Выйти"]);

    state: ЗапускВидеоQ7
        q!: $Q7
           
        script:

            playVideo(script.q7.videoSrc, script.q7.posterSrc, $context);
            $reactions.buttons([script.q8.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ8
        q!: $Q8
           
        script:

            playVideo(script.q8.videoSrc, script.q8.posterSrc, $context);
            $reactions.buttons([script.q9.question, "Выйти"]);
            
    state: ЗапускВидеоQ9
        q!: $Q9
           
        script:

            playVideo(script.q9.videoSrc, script.q9.posterSrc, $context);
            $reactions.buttons([script.q10.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ10
        q!: $Q10
           
        script:

            playVideo(script.q10.videoSrc, script.q10.posterSrc, $context);
            $reactions.buttons([script.q11.question, "Выйти"]);

    state: ЗапускВидеоQ11
        q!: $Q11 
           
        script:

            playVideo(script.q11.videoSrc, script.q11.posterSrc, $context);
            $reactions.buttons([script.q12.question, "Выйти"]);
            
            
    state: ЗапускВидеоQ12
        q!: $Q12 
           
        script:

            playVideo(script.q12.videoSrc, script.q12.posterSrc, $context);
            $reactions.buttons([script.q13.question, "Выйти"]);
            
    state: ЗапускВидеоQ13
        q!: $Q13
           
        script:

            playVideo(script.q13.videoSrc, script.q13.posterSrc, $context);
            $reactions.buttons([script.q1.question, "Выйти"]);           
    
    state: ЗапускВидеоQ14
        q!: $Q14
           
        script:

            playVideo(script.q14.videoSrc, script.q14.posterSrc, $context);
            $reactions.buttons([script.q14.question, "Выйти"]);           
            
            
    state: ЗапускВидеоESG
        q!: $ESG 
           
        script:

            playVideo(script.clip2.videoSrc, script.clip2.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);
            
    state: ЗапускВидеоDBK
        q!:  $DBK
       
        script:

            playVideo(script.clip1.videoSrc, script.clip1.posterSrc, $context);
            $reactions.buttons([script.clip2.question, "Выйти"]);


    state: ЗапускПостер
        q!:  покажи постер
           
        script:

            setPoster(script.poster0.posterSrc, $context);
            $reactions.buttons([script.clip1.question, "Выйти"]);              