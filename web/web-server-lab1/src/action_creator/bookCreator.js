export function bookSuccess(type, book){
    switch(type){
        case "getAll":
           return {
                type: "getAll",
                book_info: book
            }
        default: return [];
    }
}

export default function getAllBooks(url) {
    return (dispatch) => {
        fetch(url, {
            credentials: "same-origin", //передаем сессионные данные
            method: 'GET'
        })
            .then(response => {
                if(response.status !== 200){
                    throw new Error(response.statusText);
                }else{
                    return response;
                }
            })
            .then(response => response.json())
            .then(allBooks => dispatch(bookSuccess("getAll", allBooks)))
    }
    
}