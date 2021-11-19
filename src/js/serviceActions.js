  function reply(body, response) {
      
        var replyData = {
            type: "raw",
            body: body
        };
        
        response.replies = response.replies || [];   
        response.replies.push(replyData); 
   
}

function playVideo(vsrc, context) {
    
    var body = {
        items:[{
            command:{
                type: "smart_app_data",
                action :{
                    type: "play_video", 
                    clip:{
                        srcVideo: vsrc,
                        srcPoster: "",
                        isPlay: true
                        }
                }
            }
        }]
    }; 

    return reply(body, context.response);
    
}

function setPoster(psrc, context) {
    
    var body = {
        items:[{
            command:{
                type: "smart_app_data",
                action :{
                    type: "play_video", 
                    clip:{
                        srcVideo: "",
                        srcPoster: psrc,
                        isPlay: false
                        }
                }
            }
        }]
    }; 

    return reply(body, context.response);
    
}
