let movies = [
    {
        movieId: 1001,
        movieName: 'Dhammal',
        type: 'Comedy'
    },
    {
        movieId: 1002,
        movieName: 'Deewar',
        type: 'Action'
    },
    {
        movieId: 1001,
        movieName: 'Dilwale',
        type: 'Romantic'
    },
]
function getMovies(id, callback) {
    setTimeout(() => {
        let movie = movies.find((movie) => movie.movieId === id)
        callback(movie)
    }, 2500)
}
function getCinemas(movieName, callback) {
    setTimeout(() => {
    let cinemaHall = ['PVR Cinema', 'SUMAN Cinema', 'INOX Cinema']
    callback(cinemaHall)
    }, 1500)
}
function getTickets(cinemaHall, callback) {
    setTimeout(() => {
        let ticket = {
            Premium: '1000 Rs',
            Diamond: '750 Rs',
            Gold: '500 Rs',
            Simple: '300 Rs'
        }
        callback(ticket)
    }, 1000)
}
getMovies(1002, (movie) => {
    console.log(movie)
    getCinemas(movie.movieName, (cinemaHall) => {
        console.log(cinemaHall)
        getTickets(cinemaHall[2], (ticket) => {
            console.log(ticket);
        })
    })
})