export function getBook (state =[], action){
    switch(action.type){
        case "getAll":
            return action.book_info;
        default: 
            return state;
    }

}