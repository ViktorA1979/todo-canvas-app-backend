// "udovolstvie" - id эмоции
function startVideo(note, context) {
 
     var command = {
        type: "smart_app_data",
        action: action
    };
    var emotion = {
        emotionId: emotion_type
    };


    for (var index = 0; context.response.replies && index < context.response.replies.length; index ++) {
        if (context.response.replies[index].type === "raw" &&
            context.response.replies[index].body &&
            context.response.replies[index].body.items
        ) {
            context.response.replies[index].body.items.push({command: command});
            context.response.replies[index].body["emotion"] = emotion;
            return;
        }
    }
    
    return reply({emotion: emotion, items: [{command: command}]}, context.response);


    
}