 function bookSuccess(type, book){
    switch(type){
        case "getAll":
           return {
                type: "getAll",
                book_info: book
            }
        default: return [];
    }
}

export function getAllBooks(url) {
    return (dispatch) =>{
        fetch(url)
            .then(response =>{
                if(response.status!==200){
                    throw new Error(response.statusText)
                }
                return response;
            })
            .then(response => response.json())
            .then(book => dispatch(bookSuccess("getAll", book)))
    }
}