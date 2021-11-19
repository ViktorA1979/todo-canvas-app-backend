  function reply(body, response) {
        var replyData = {
            type: "raw",
            body: body
        };
    //         var body = {
    //             items:[{
    //                 command:{
    //                         type: "smart_app_data",
    //                         action :{
    //                             type: "play_video", 
    //                             clip:{
    //                                 srcPoster: "",
    //                                 srcVideo: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video1.jpeg" ,
    //                                 isPlay: true
    //                                 }
    //                         }
    //                     }
    //                 }]
    //             }; 
    
    // response.replies = response.replies || [];
    // //response.replies.push(replyData);
    // response.replies.push({ type : "raw", body: body});
    
    
                
                

                
            response.replies = response.replies || [];   
            response.replies.push(replyData); 
    
}



function startMedia(context) {
    
    
    
    // var command = {
    //     type: "smart_app_data",
    //     action: {
    //                 type: "play_video", 
    //                     clip:{
    //                         srcVideo: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud./Resources/video1.mp4",
    //                         srcPoster: "",
    //                         isPlay: true
    //                     }
    //         }
    //     };
    
                    var body = {
                    items:[{
                        command:{
                            type: "smart_app_data",
                            action :{
                                type: "play_video", 
                                clip:{
                                    srcVideo: "https://tiserstorege.obs.ru-moscow-1.hc.sbercloud.ru/Resources/video1.mp4",
                                    srcPoster: "" ,
                                    isPlay: true
                                    }
                            }
                        }
                    }]
                }; 

    return reply(body, context.response);
    
}
