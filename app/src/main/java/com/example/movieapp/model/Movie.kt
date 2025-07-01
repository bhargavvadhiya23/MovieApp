package com.example.movieapp.model


data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String,
    val writer: String,
    val storyline: String, // Added storyline field here
)

fun getMovies(): List<Movie> {
    return movieList
}

val movieList = listOf(
    Movie(
        id = "1",
        title = "Inception",
        year = "2010",
        genre = "Sci-Fi, Action",
        director = "Christopher Nolan",
        actors = "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
        plot = "A thief who enters dreams to steal secrets must plant an idea in a person's mind.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_FMjpg_UX700_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTY3MzMzMDgyMF5BMl5BanBnXkFtZTcwMzY0OTk1Mw@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTMxNDExNzM4MV5BMl5BanBnXkFtZTcwNDY0OTk1Mw@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNTdlZGFmMDQtM2RiYi00NzUxLThhZWQtN2M4ZmYwMzllZGYyXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_QL75_UY563_CR177,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTY4MDg3NzM1OV5BMl5BanBnXkFtZTgwNTE5ODIyMzE@._V1_QL75_UY563_CR177,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTQ1ZmIzOTAtNDcwZi00NDVkLWE4NWItYWNhZGY1MmVlZGU0XkEyXkFqcGdeQWRvb2xpbmhk._V1_QL75_UY563_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOTIzNDU5NjA0OV5BMl5BanBnXkFtZTgwNzE2NTczMzE@._V1_QL75_UY563_CR177,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTc3NTQxMzQ4MV5BMl5BanBnXkFtZTcwOTg4NTgwMw@@._V1_QL75_UX1000_CR0,92,1000,563_.jpg",
            ""
        ),
        rating = "8.8",
        writer = "Christopher Nolan",
        storyline = "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Cobb is offered a chance at redemption when he is given a seemingly impossible task: inception, planting an idea into someone's mind. If they succeed, Cobb and his team of specialists must pull off the reverse of extraction: their objective isn't to steal an idea, but to plant one. But no amount of strategic planning can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming."
    ),
    Movie(
        id = "2",
        title = "The Dark Knight",
        year = "2008",
        genre = "Action, Crime, Drama",
        director = "Christopher Nolan",
        actors = "Christian Bale, Heath Ledger, Aaron Eckhart",
        plot = "Batman faces off against the Joker, who seeks to create chaos in Gotham.",
        poster = "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjA5ODU3NTI0Ml5BMl5BanBnXkFtZTcwODczMTk2Mw@@._V1_QL75_UX1026_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM1NTcwMTk4OV5BMl5BanBnXkFtZTcwOTczMTk2Mw@@._V1_QL75_UX1026_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM1Njc5NTE0M15BMl5BanBnXkFtZTcwMDgzMTk2Mw@@._V1_QL75_UX1026_.jpg"
        ),
        rating = "9.0",
        writer = "Jonathan Nolan, Christopher Nolan, David S. Goyer",
        storyline = "Batman raises the stakes in his war on crime. With the help of Lieutenant James Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the city streets. The partnership proves effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known as The Joker, who thrusts Gotham into anarchy and forces the Dark Knight ever closer to crossing the fine line between hero and vigilante."
    ),
    Movie(
        id = "3",
        title = "Avatar",
        year = "2009",
        genre = "Action, Adventure, Sci-Fi",
        director = "James Cameron",
        actors = "Sam Worthington, Zoe Saldana, Sigourney Weaver",
        plot = "A paraplegic marine journeys to the alien world of Pandora and becomes torn between duty and love for its people.",
        poster = "https://m.media-amazon.com/images/M/MV5BMDEzMmQwZjctZWU2My00MWNlLWE0NjItMDJlYTRlNGJiZjcyXkEyXkFqcGc@._V1_QL75_UY562_CR1,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjM2OTkyNTY3N15BMl5BanBnXkFtZTgwNzgzNDc2NjE@._V1_QL75_UY563_CR173,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTMxOTEwNDcxN15BMl5BanBnXkFtZTcwOTg0MTUzNA@@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjEyOTYyMzUxNl5BMl5BanBnXkFtZTcwNTg0MTUzNA@@._V1_QL75_UX656_.jpg"
        ),
        rating = "7.8",
        writer = "James Cameron",
        storyline = "In the lush alien world of Pandora live the Na'vi, beings who appear primitive but are highly evolved. Because the planet's environment is poisonous, human/Na'vi hybrids, called Avatars, must link to human minds to allow for free movement on Pandora. Jake Sully, a paralyzed former marine, becomes mobile again through one such Avatar and falls in love with a Na'vi woman. As a bond with her grows, he is drawn into a battle for the survival of her world."
    ),
    Movie(
        id = "4",
        title = "Interstellar",
        year = "2014",
        genre = "Adventure, Drama, Sci-Fi",
        director = "Christopher Nolan",
        actors = "Matthew McConaughey, Anne Hathaway, Jessica Chastain",
        plot = "Explorers travel through a wormhole in space to ensure humanity's survival.",
        poster = "https://m.media-amazon.com/images/M/MV5BYzdjMDAxZGItMjI2My00ODA1LTlkNzItOWFjMDU5ZDJlYWY3XkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjA3NTEwOTMxMV5BMl5BanBnXkFtZTgwMjMyODgxMzE@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTQ0MjQ3NjE1MF5BMl5BanBnXkFtZTgwMzMyODgxMzE@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMzk3MzIzNzM5NV5BMl5BanBnXkFtZTgwNzIyODgxMzE@._V1_QL75_UX656_.jpg"
        ),
        rating = "8.6",
        writer = "Jonathan Nolan, Christopher Nolan",
        storyline = "When Earth becomes uninhabitable in the future, farmer and former NASA pilot Joseph Cooper is tasked to pilot the spacecraft Endurance to traverse a wormhole near Saturn and find a new planet for humanity. Accompanied by a team of researchers, they embark on a journey to find habitable planets in another galaxy before Earth's resources run out."
    ),
    Movie(
        id = "5",
        title = "The Matrix",
        year = "1999",
        genre = "Action, Sci-Fi",
        director = "Lana Wachowski, Lilly Wachowski",
        actors = "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
        plot = "A hacker discovers that reality is a simulated construct and joins the rebellion against its controllers.",
        poster = "https://m.media-amazon.com/images/M/MV5BN2NmN2VhMTQtMDNiOS00NDlhLTliMjgtODE2ZTY0ODQyNDRhXkEyXkFqcGc@._V1_QL75_UX380_CR0,4,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BNDQ4NTRmN2ItYjgzMS00MzY3LWEwNmYtYmE2ODllZDdhNGI1XkEyXkFqcGdeQXdvbmtpbQ@@._V1_QL75_UY563_CR41,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzM4OTkzMjcxOF5BMl5BanBnXkFtZTgwMTkxMjI1MTI@._V1_QL75_UX1052_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTMxMDg1MjY4OF5BMl5BanBnXkFtZTcwMTU3MTIxNA@@._V1_QL75_UX662_.jpg"
        ),
        rating = "8.7",
        writer = "Lilly Wachowski, Lana Wachowski",
        storyline = "Thomas Anderson, a computer programmer, leads a double life as Neo, a hacker. He feels something is wrong with the world, and he is contacted by Morpheus, who explains to him that the reality he knows is the Matrix, a computer-simulated world created by machines to subdue humanity. Neo joins a group of rebels fighting against the machines and learns to manipulate the Matrix, becoming a powerful figure in the rebellion."
    ),
    Movie(
        id = "6",
        title = "The Social Network",
        year = "2010",
        genre = "Biography, Drama",
        director = "David Fincher",
        actors = "Jesse Eisenberg, Andrew Garfield, Justin Timberlake",
        plot = "The creation of Facebook and the subsequent lawsuits that changed the tech landscape.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjlkNTE5ZTUtNGEwNy00MGVhLThmZjMtZjU1NDE5Zjk1NDZkXkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTMwMzEwMzQxOF5BMl5BanBnXkFtZTcwNTk0NTUxNA@@._V1_QL75_UX668_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE3OTcxMTk1MV5BMl5BanBnXkFtZTcwOTk0NTUxNA@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNmMxZWQ2YjAtMDY3Yi00ZTU4LWEyY2ItM2E3MTgxYzEyOGEyXkEyXkFqcGdeQWpybA@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg"
        ),
        rating = "7.7",
        writer = "Aaron Sorkin",
        storyline = "In 2003, Harvard University student Mark Zuckerberg, facing disciplinary action after hacking into the university's database, creates a website called Facemash. The site gains popularity, and Zuckerberg, along with his friends Eduardo Saverin and the Winklevoss twins, develops it into Facebook. The film follows the rapid rise of Facebook, the ensuing legal battles, and the complex relationships that form and break apart amidst the ambition and success."
    ),
    Movie(
        id = "7",
        title = "The Godfather",
        year = "1972",
        genre = "Crime, Drama",
        director = "Francis Ford Coppola",
        actors = "Marlon Brando, Al Pacino, James Caan",
        plot = "The patriarch of an organized crime dynasty transfers control of his empire to his reluctant son.",
        poster = "https://m.media-amazon.com/images/M/MV5BNGEwYjgwOGQtYjg5ZS00Njc1LTk2ZGEtM2QwZWQ2NjdhZTE5XkEyXkFqcGc@._V1_QL75_UY562_CR8,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BYWNlN2U4YjQtMzI3NC00ZjkxLWEwMTItYWRlNDUxYTYwYjVlXkEyXkFqcGdeQWpvaG5oYXJ0._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTczMTk5MjkwOF5BMl5BanBnXkFtZTgwMDI0Mjk1NDM@._V1_QL75_UX546_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTU4MTgxOTQ0Nl5BMl5BanBnXkFtZTgwNDI0Mjk1NDM@._V1_QL75_UX600_.jpg"
        ),
        rating = "9.2",
        writer = "Mario Puzo, Francis Ford Coppola",
        storyline = "In late 1940s New York, Vito Corleone presides over a Mafia family. As he ages, he considers his successors, particularly his youngest son, Michael, a decorated war hero initially uninterested in the family business.  When Vito is wounded in an assassination attempt and his eldest son Sonny is murdered, Michael steps in to protect his family, becoming deeply involved in the criminal underworld and transforming into a ruthless Mafia boss, much to the disappointment of his father who desired a different life for him."
    ),
    Movie(
        id = "8",
        title = "Forrest Gump",
        year = "1994",
        genre = "Drama, Romance",
        director = "Robert Zemeckis",
        actors = "Tom Hanks, Robin Wright, Gary Sinise",
        plot = "The story of a kind-hearted man whose extraordinary life intersects with historical events.",
        poster = "https://m.media-amazon.com/images/M/MV5BNDYwNzVjMTItZmU5YS00YjQ5LTljYjgtMjY2NDVmYWMyNWFmXkEyXkFqcGc@._V1_QL75_UY562_CR4,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BOTI4NDZjYjQtMjBhZS00NDMxLTljOTktNzBmY2NhOTM1ZjA3XkEyXkFqcGc@._V1_QL75_UX976_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMDc1NmFlMjEtNjE0My00MDkzLTg0MGItOGMxZGFiOWE1ODkxXkEyXkFqcGc@._V1_QL75_UX664_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYzQyMWQ1ODMtZGE2OS00YzQyLWE2OWYtZmU5OGFiMWMwYmIyXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX1000_CR0,94,1000,563_.jpg"
        ),
        rating = "8.8",
        writer = "Winston Groom, Eric Roth",
        storyline = "Sitting on a park bench, Forrest Gump recounts his life story to strangers.  Born with leg braces and a low IQ in Alabama, Forrest experiences a life filled with extraordinary events. He witnesses and unintentionally influences major historical moments of the latter half of the 20th century, from Elvis Presley's rise to fame to the Vietnam War and Watergate scandal. Despite his limitations, Forrest's optimism, kindness, and unwavering love for his childhood sweetheart, Jenny, guide him through a remarkable and moving journey."
    ),
    Movie(
        id = "9",
        title = "Pulp Fiction",
        year = "1994",
        genre = "Crime, Drama",
        director = "Quentin Tarantino",
        actors = "John Travolta, Uma Thurman, Samuel L. Jackson",
        plot = "Interwoven stories of crime and redemption in Los Angeles.",
        poster = "https://m.media-amazon.com/images/M/MV5BYTViYTE3ZGQtNDBlMC00ZTAyLTkyODMtZGRiZDg0MjA2YThkXkEyXkFqcGc@._V1_QL75_UY562_CR3,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjI5MzgxMTQ4M15BMl5BanBnXkFtZTgwNjczMTk0NzE@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjAyMjUyNzg1Ml5BMl5BanBnXkFtZTgwNzAwMzg5MTE@._V1_QL75_UX658_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZTllY2IxNTktMTRmZC00ZTZlLWIwOWItMjcwMDhiMjIyZmE4XkEyXkFqcGdeQXRyYW5zY29kZS13b3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg"
        ),
        rating = "8.9",
        writer = "Quentin Tarantino, Roger Avary",
        storyline = "In Los Angeles, the lives of two hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption. Jules Winnfield and Vincent Vega, hitmen working for mob boss Marsellus Wallace, navigate the criminal underworld and unexpectedly cross paths with other characters, leading to darkly comedic and violent situations as they try to carry out their assignments and survive the chaotic events unfolding around them."
    ),
    Movie(
        id = "10",
        title = "Fight Club",
        year = "1999",
        genre = "Drama",
        director = "David Fincher",
        actors = "Brad Pitt, Edward Norton, Helena Bonham Carter",
        plot = "An insomniac office worker forms an underground fight club as a radical form of therapy.",
        poster = "https://m.media-amazon.com/images/M/MV5BOTgyOGQ1NDItNGU3Ny00MjU3LTg2YWEtNmEyYjBiMjI1Y2M5XkEyXkFqcGc@._V1_QL75_UX380_CR0,4,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjk3NTYyMzc4Nl5BMl5BanBnXkFtZTcwODU3ODMzMw@@._V1_QL75_UX618_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM4MjA2MzI0OF5BMl5BanBnXkFtZTcwNjU3ODMzMw@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTgxNzY2NjIxOV5BMl5BanBnXkFtZTcwNzU3ODMzMw@@._V1_QL75_UX618_.jpg"
        ),
        rating = "8.8",
        writer = "Chuck Palahniuk, Jim Uhls",
        storyline = "An unnamed narrator, disillusioned with consumerist culture and his white-collar job, suffers from insomnia. Seeking a way to change his life, he meets the charismatic soap salesman Tyler Durden and together they form Fight Club, an underground organization where men find release by engaging in brutal fistfights. As Fight Club grows in popularity, it evolves into something far more dangerous and anarchic, led by Tyler, and the narrator finds himself losing control of the very movement he helped create."
    ),
    Movie(
        id = "11",
        title = "Harry Potter and the Sorcerer's Stone",
        year = "2001",
        genre = "Fantasy, Adventure",
        director = "Chris Columbus",
        actors = "Daniel Radcliffe, Emma Watson, Rupert Grint",
        plot = "A young boy discovers he is a wizard and attends a magical school, beginning his epic adventure.",
        poster = "https://m.media-amazon.com/images/M/MV5BNTU1MzgyMDMtMzBlZS00YzczLThmYWEtMjU3YmFlOWEyMjE1XkEyXkFqcGc@._V1_QL75_UY562_CR1,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BYjAzZGNmMDctZWYxNy00YTQ5LTg4YjItZGU5YjAwNTg0NTA2XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTkyMDM1NDA5MV5BMl5BanBnXkFtZTgwMzE0ODAxMTI@._V1_QL75_UX970_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjA5NzU2MDYzMF5BMl5BanBnXkFtZTcwODIzNDc3Mw@@._V1_QL75_UX658_.jpg"
        ),
        rating = "7.6",
        writer = "J.K. Rowling, Steve Kloves",
        storyline = "On his eleventh birthday, Harry Potter, an orphaned boy living with his neglectful aunt and uncle, learns he is a wizard and is invited to attend Hogwarts School of Witchcraft and Wizardry. He discovers the truth about his parents' death and his own fame as 'the boy who lived'. At Hogwarts, he makes friends, learns magic, and becomes entangled in a mystery surrounding a powerful artifact, the Sorcerer's Stone, which is being targeted by the dark wizard Lord Voldemort."
    ),
    Movie(
        id = "12",
        title = "Life",
        year = "2017",
        genre = "Horror, Sci-Fi, Thriller",
        director = "Daniel Espinosa",
        actors = "Jake Gyllenhaal, Rebecca Ferguson, Ryan Reynolds",
        plot = "A team aboard the International Space Station discovers a rapidly evolving life form that threatens all life on Earth.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjU3ZDZmOWMtZjMzOS00ZjQxLThkNWQtNWEzZDcwZTczY2QxXkEyXkFqcGc@._V1_QL75_UY562_CR11,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BNDUyNTM3ZWMtNWNjMC00MjE1LWE2NGUtZjJlNWJiMjAyZGI3XkEyXkFqcGdeQXRoaXJkLXBhcnR5LXZpZGVvLXVwZGF0ZXI@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BODg0Yzc2YTEtZDdlZC00NjBmLWIxODctYzc5N2Q3YjUyYTM4XkEyXkFqcGc@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYTIxMTBlOTAtNDdhYy00NjUzLTk0YTktNTljODQzMjM5ODRkXkEyXkFqcGc@._V1_QL75_UX444_.jpg",
            ""
        ),
        rating = "6.6",
        writer = "Rhett Reese, Paul Wernick",
        storyline = "Six astronauts aboard the International Space Station intercept a probe returning from Mars carrying soil samples.  Within the samples, they discover a dormant single-celled organism that they revive.  As they study it, the organism rapidly grows, demonstrating intelligence and strength.  However, it soon turns hostile, threatening the crew and potentially all life on Earth as the astronauts struggle to contain the increasingly dangerous extraterrestrial life form."
    ),
    Movie(
        id = "13",
        title = "Life of Pi",
        year = "2012",
        genre = "Adventure, Drama, Fantasy",
        director = "Ang Lee",
        actors = "Suraj Sharma, Irrfan Khan, Adil Hussain",
        plot = "After a disaster at sea, a young man survives on a lifeboat with a Bengal tiger.",
        poster = "https://m.media-amazon.com/images/M/MV5BNTg2OTY2ODg5OF5BMl5BanBnXkFtZTcwODM5MTYxOA@@._V1_QL75_UX380_CR0,1,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BOTA2MzYwMzQ5OF5BMl5BanBnXkFtZTcwOTM5OTI3OA@@._V1_QL75_UX778_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjAxMDA3NTkwMV5BMl5BanBnXkFtZTcwMTkyMzQ3OA@@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjIyNTI4MTc2MF5BMl5BanBnXkFtZTgwNzM1NDIzMzE@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOTc3MTQxNzU4NF5BMl5BanBnXkFtZTgwMjY2MzkyMzE@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTQ0MTM3MTY4MF5BMl5BanBnXkFtZTcwMDQ5OTI3OA@@._V1_QL75_UX780_.jpg"
        ),
        rating = "7.9",
        writer = "Yann Martel, David Magee",
        storyline = "Pi Patel, an Indian immigrant to Canada, recounts his extraordinary survival story to a writer. When his family's cargo ship sinks in the Pacific, Pi becomes the sole human survivor on a lifeboat, sharing it with a Bengal tiger, a zebra, a hyena, and an orangutan.  Over 227 days adrift, Pi forms an unlikely bond with the tiger, Richard Parker, battling the elements and his own will to survive in a profound and spiritual journey."
    ),
    Movie(
        id = "14",
        title = "Legend",
        year = "2015",
        genre = "Biography, Crime, Drama",
        director = "Brian Helgeland",
        actors = "Tom Hardy, Emily Browning, Taron Egerton",
        plot = "The story of twin gangsters, the Kray brothers, and their rise in the London underworld.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjE0MjkyODQ3NF5BMl5BanBnXkFtZTgwNDM1OTk1NjE@._V1_QL75_UY562_CR1,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTc3MTc4MDIxN15BMl5BanBnXkFtZTgwNzM5OTI0NzE@._V1_QL75_UX1040_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMzUwNDU4NDk2MF5BMl5BanBnXkFtZTgwOTAxMTE2NjE@._V1_QL75_UX1000_CR0,93,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTU0MjgzNTE4N15BMl5BanBnXkFtZTgwODM5OTI0NzE@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTUwNjAzNTY2N15BMl5BanBnXkFtZTgwMDQ5OTI0NzE@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BODkyMjEzMDM5Nl5BMl5BanBnXkFtZTgwMTQ5OTI0NzE@._V1_QL75_UX1066_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTg0NjI0MzkwOF5BMl5BanBnXkFtZTgwMDQzNTQ1NTE@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE1Mzc4MDgyOF5BMl5BanBnXkFtZTgwNTAyNDE0NzE@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTk0ODIwOTMyOV5BMl5BanBnXkFtZTgwMjQ5OTI0NzE@._V1_QL75_UX600_.jpg"
        ),
        rating = "7.0",
        writer = "John Pearson, Brian Helgeland",
        storyline = "Set in 1960s London, the film portrays the identical twin gangsters Reggie and Ronnie Kray, both played by Tom Hardy.  Reggie, the charming and outwardly more stable brother, tries to legitimize their criminal empire, while Ronnie, a volatile and openly psychotic individual, complicates these efforts.  The film explores their violent reign over London's underworld, their complex relationship, and Reggie's attempts to control Ronnie and maintain order, even as their lives spiral into chaos and violence."
    ),
    Movie(
        id = "15",
        title = "300",
        year = "2006",
        genre = "Action, Drama",
        director = "Zack Snyder",
        actors = "Gerard Butler, Lena Headey, Dominic West",
        plot = "King Leonidas and 300 Spartans fight to the last man against Persian invaders at Thermopylae.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjc4OTc0ODgwNV5BMl5BanBnXkFtZTcwNjM1ODE0MQ@@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BYmQxYmYwZGUtZGZhNS00Y2U5LTk2Y2EtM2VmZDRhOTcwODdmXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZjUwYmM0MjYtZDcxYy00Zjk0LWE2NmUtYjE4Nzc3MmEyYzM5XkEyXkFqcGc@._V1_QL75_UX1038_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZmY0ZGVhMjQtMzMxNy00ZTcyLTlhYzYtOGU1ZjRhZTg2NDdjXkEyXkFqcGc@._V1_QL75_UX1038_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNWI2OTFhZjMtZjg2YS00NzkyLWE0MGItMTYwMmI4MmU1NTAxXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX1000_CR0,94,1000,563_.jpg"
        ),
        rating = "7.6",
        writer = "Frank Miller, Zack Snyder, Kurt Johnstad",
        storyline = "In ancient Greece, King Leonidas of Sparta leads 300 Spartan warriors in a heroic stand against the massive Persian army led by King Xerxes at the Battle of Thermopylae.  Facing overwhelming odds, the Spartans fight with unparalleled courage and ferocity to defend their homeland and way of life, inspiring all of Greece to unite against the Persian invasion. The film depicts the battle as a visually stylized and epic clash of cultures and wills."
    ),
    Movie(
        id = "16",
        title = "The Shawshank Redemption",
        year = "1994",
        genre = "Drama",
        director = "Frank Darabont",
        actors = "Tim Robbins, Morgan Freeman, Bob Gunton",
        plot = "Two imprisoned men bond over several years, finding solace and eventual redemption through acts of common decency.",
        poster = "https://m.media-amazon.com/images/M/MV5BMDAyY2FhYjctNDc5OS00MDNlLThiMGUtY2UxYWVkNGY2ZjljXkEyXkFqcGc@._V1_QL75_UX380_CR0,4,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BNjQ2NDA3MDcxMF5BMl5BanBnXkFtZTgwMjE5NTU0NzE@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM0NjUxMDk5MF5BMl5BanBnXkFtZTcwNDMxNDY3Mw@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTk3NDE2Nzg3Nl5BMl5BanBnXkFtZTcwNTMxNDY3Mw@@._V1_QL75_UX656_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTkzMTY0MjE5MV5BMl5BanBnXkFtZTcwODMxNDY3Mw@@._V1_QL75_UX666_.jpg"
        ),
        rating = "9.3",
        writer = "Stephen King, Frank Darabont",
        storyline = "In 1947, banker Andy Dufresne is wrongly convicted of murdering his wife and her lover and sentenced to life imprisonment at Shawshank Penitentiary.  Over two decades, Andy forms a friendship with fellow inmate Ellis 'Red' Redding, navigating the brutal realities of prison life, enduring corruption and violence while secretly plotting his escape. The film is a powerful story of hope, perseverance, and the enduring strength of the human spirit in the face of despair."
    ),
    Movie(
        id = "17",
        title = "The Lord of the Rings: The Fellowship of the Ring",
        year = "2001",
        genre = "Adventure, Drama, Fantasy",
        director = "Peter Jackson",
        actors = "Elijah Wood, Ian McKellen, Orlando Bloom",
        plot = "A meek hobbit sets out on a journey to destroy a powerful ring and save Middle-earth.",
        poster = "https://m.media-amazon.com/images/M/MV5BNzIxMDQ2YTctNDY4MC00ZTRhLTk4ODQtMTVlOWY4NTdiYmMwXkEyXkFqcGc@._V1_QL75_UX380_CR0,1,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BM2I3MzQwMWItYTA4MS00ZTU4LTgzZGMtMzRjNTBiY2Y4ZWZmXkEyXkFqcGdeQWpoZWZ0bGVy._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMzQ2YjI2YzgtZmNmMy00ZjUyLWE0NGItY2Y3NjUzZWM4NmM3XkEyXkFqcGdeQWxiaWFtb250._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjQ4NDg5MTQwNl5BMl5BanBnXkFtZTgwNTQwMTk2MTI@._V1_QL75_UX776_.jpg"
        ),
        rating = "8.8",
        writer = "J.R.R. Tolkien, Fran Walsh, Philippa Boyens",
        storyline = "In the Shire, the hobbit Frodo Baggins inherits the One Ring, an artifact of immense power sought by the Dark Lord Sauron.  Tasked with destroying the Ring in the fires of Mount Doom, the only place it can be unmade, Frodo embarks on a perilous journey across Middle-earth. He is joined by a Fellowship of companions – hobbits, men, an elf, and a dwarf – who pledge to aid him in his quest, facing dangers and temptations as Sauron's forces hunt them relentlessly."
    ),
    Movie(
        id = "18",
        title = "The Lord of the Rings: The Two Towers",
        year = "2002",
        genre = "Adventure, Drama, Fantasy",
        director = "Peter Jackson",
        actors = "Elijah Wood, Ian McKellen, Viggo Mortensen",
        plot = "The fellowship is broken, and the journey continues as they face new challenges in Middle-earth.",
        poster = "https://m.media-amazon.com/images/M/MV5BMGQxMDdiOWUtYjc1Ni00YzM1LWE2NjMtZTg3Y2JkMjEzMTJjXkEyXkFqcGc@._V1_QL75_UX380_CR0,14,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BNTQ4OGQyNzktMjA1NS00MmQ1LWJjYTUtOGI4ZDNhNTA2NDBlXkEyXkFqcGdeQWxiaWFtb250._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTYzNDM4NzQwN15BMl5BanBnXkFtZTcwMzI2MjY0NA@@._V1_QL75_UX658_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE0MjE5NTI3Ml5BMl5BanBnXkFtZTcwNjY3NDk2Mw@@._V1_QL75_UX670_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE0MjE5NTI3Ml5BMl5BanBnXkFtZTcwNjY3NDk2Mw@@._V1_QL75_UX670_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjA3NDk3NjI5MF5BMl5BanBnXkFtZTcwMTI2MjY0NA@@._V1_QL75_UX1022_.jpg"
        ),
        rating = "8.7",
        writer = "J.R.R. Tolkien, Fran Walsh, Philippa Boyens",
        storyline = "Following the breaking of the Fellowship, Frodo and Sam continue their journey towards Mordor, guided by the treacherous Gollum.  Meanwhile, Aragorn, Legolas, and Gimli track the kidnapped hobbits Merry and Pippin to Rohan, where they become embroiled in the war against Saruman and his Orc armies. The forces of good and evil clash as Middle-earth hurtles toward a crucial confrontation, with the fate of the world hanging in the balance."
    ),
    Movie(
        id = "19",
        title = "The Lord of the Rings: The Return of the King",
        year = "2003",
        genre = "Adventure, Drama, Fantasy",
        director = "Peter Jackson",
        actors = "Elijah Wood, Viggo Mortensen, Ian McKellen",
        plot = "The final confrontation for Middle-earth begins as the forces of good and evil prepare for war.",
        poster = "https://m.media-amazon.com/images/M/MV5BMTZkMjBjNWMtZGI5OC00MGU0LTk4ZTItODg2NWM3NTVmNWQ4XkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BNDRmNjQxOWItNTY3MS00M2ExLWJiYWYtNGQ2OTI5MWRkYWFlXkEyXkFqcGdeQWxiaWFtb250._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTk1ODY0NDg2M15BMl5BanBnXkFtZTcwNTU2MTk2Mw@@._V1_QL75_UX670_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTMzNzQwODg2OV5BMl5BanBnXkFtZTcwMzE2MTk2Mw@@._V1_QL75_UX646_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTMzNzQwODg2OV5BMl5BanBnXkFtZTcwMzE2MTk2Mw@@._V1_QL75_UX646_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNmVhNjhkMTAtN2I1YS00Y2Q1LWI1NTYtOGIxNzVhNzY4OGE0XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg"
        ),
        rating = "8.9",
        writer = "J.R.R. Tolkien, Fran Walsh, Philippa Boyens",
        storyline = "The final battle for Middle-earth is at hand.  While Aragorn leads the forces of Gondor against Sauron's armies at Minas Tirith, diverting the Dark Lord's attention, Frodo and Sam, guided by Gollum, reach Mount Doom to destroy the One Ring. The fate of Middle-earth rests on Frodo's success, as the forces of good and evil clash in a massive and decisive war that will determine the future of all."
    ),
    Movie(
        id = "20",
        title = "Gladiator",
        year = "2000",
        genre = "Action, Drama",
        director = "Ridley Scott",
        actors = "Russell Crowe, Joaquin Phoenix, Connie Nielsen",
        plot = "A former Roman general seeks vengeance against the corrupt emperor who murdered his family.",
        poster = "https://m.media-amazon.com/images/M/MV5BYWQ4YmNjYjEtOWE1Zi00Y2U4LWI4NTAtMTU0MjkxNWQ1ZmJiXkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTU1NTQ0OTkyNF5BMl5BanBnXkFtZTgwMTQzMjIwMDI@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZmYyMDQ5OWItMGZlYi00MDU1LWE4MmMtNTVhYTIwYjE0M2Q3XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BZDlhOWZmODctMmJkNy00M2E0LWE3NjAtMGQ3MWQxNDk4ZTA4XkEyXkFqcGc@._V1_QL75_UX636_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTA0MDEwNDM0MTVeQTJeQWpwZ15BbWU3MDQ0NDY3MTQ@._V1_QL75_UX658_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE1OTc4MzA0NV5BMl5BanBnXkFtZTcwODQ0NjcxNA@@._V1_QL75_UX574_.jpg"
        ),
        rating = "8.5",
        writer = "David Franzoni, James Cameron, William Nicholson",
        storyline = "General Maximus Decimus Meridius, a celebrated Roman general, is betrayed by Commodus, the ambitious son of Emperor Marcus Aurelius.  After Commodus murders his father and seizes power, he orders Maximus's execution and the slaughter of his family.  Maximus escapes, is captured by slave traders, and becomes a gladiator.  Rising through the ranks in the arena, Maximus plots his revenge against Commodus, seeking to restore justice to Rome and avenge his loved ones."
    ),
    Movie(
        id = "21",
        title = "Titanic",
        year = "1997",
        genre = "Drama, Romance",
        director = "James Cameron",
        actors = "Leonardo DiCaprio, Kate Winslet, Billy Zane",
        plot = "A young aristocrat falls in love with a kind but poor artist aboard the ill-fated RMS Titanic.",
        poster = "https://m.media-amazon.com/images/M/MV5BYzYyN2FiZmUtYWYzMy00MzViLWJkZTMtOGY1ZjgzNWMwN2YxXkEyXkFqcGc@._V1_QL75_UX380_CR0,2,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BYzExZDkwNzYtYmI0Mi00OThhLWFhNmMtZTZjYWU2MTdkMDAzXkEyXkFqcGdeQWRpZWdtb25n._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzczNjA2MTY5M15BMl5BanBnXkFtZTgwNTgyNDY2NzE@._V1_QL75_UY563_CR162,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BY2IyNGIzNDQtNjM3OC00ZDYzLWI5YmEtM2Y1NGNhNjEwNjUwXkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTcxNjczODgyMl5BMl5BanBnXkFtZTcwODY0NTk1Nw@@._V1_QL75_UX646_.jpg",
            "https://m.media-amazon.com/images/M/MV5BODQ1MzI0MDkyMF5BMl5BanBnXkFtZTcwMTc0NTk1Nw@@._V1_QL75_UX662_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTYxNDU1Mzk0N15BMl5BanBnXkFtZTcwNDc0NTk1Nw@@._V1_QL75_UX374_.jpg"
        ),
        rating = "7.8",
        writer = "James Cameron",
        storyline = "In 1912, aboard the 'unsinkable' RMS Titanic, a young impoverished artist, Jack Dawson, wins a ticket in a poker game and meets Rose DeWitt Bukater, a young woman from a wealthy family engaged to a condescending millionaire.  Despite their different social classes, Jack and Rose fall deeply in love. Their burgeoning romance blossoms amidst the opulent backdrop of the ship, but their idyllic world is shattered when the Titanic strikes an iceberg, plunging the lovers into a fight for survival and eternal love."
    ),
    Movie(
        id = "22",
        title = "Jurassic Park",
        year = "1993",
        genre = "Adventure, Sci-Fi, Thriller",
        director = "Steven Spielberg",
        actors = "Sam Neill, Laura Dern, Jeff Goldblum",
        plot = "A theme park showcasing genetically recreated dinosaurs turns deadly when the creatures break loose.",
        poster = "https://m.media-amazon.com/images/M/MV5BMjM2MDgxMDg0Nl5BMl5BanBnXkFtZTgwNTM2OTM5NDE@._V1_QL75_UX380_CR0,4,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTQ0MTc1NDkyN15BMl5BanBnXkFtZTgwOTMzOTIwMjE@._V1_QL75_UX644_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNjcyMDc0MTExNV5BMl5BanBnXkFtZTgwMjEzOTIwMjE@._V1_QL75_UX680_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzY5MDIzNTEwNl5BMl5BanBnXkFtZTgwMzEzOTIwMjE@._V1_QL75_UX678_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE2NzI2MTg2Ml5BMl5BanBnXkFtZTgwMzc2MzIyMzE@._V1_QL75_UX1000_CR0,0,1000,563_.jpg"
        ),
        rating = "8.1",
        writer = "Michael Crichton, David Koepp",
        storyline = "Paleontologists Alan Grant and Ellie Sattler, and mathematician Ian Malcolm are invited to Jurassic Park, a theme park populated with cloned dinosaurs, for a preview tour by its eccentric owner John Hammond.  Initially awestruck by the dinosaurs, the visit turns into a nightmare when a sabotaged security system allows the prehistoric creatures to escape their enclosures.  The visitors and Hammond's grandchildren must then fight for survival against the escaped dinosaurs, realizing the terrifying consequences of tampering with nature."
    ),
    Movie(
        id = "23",
        title = "The Avengers",
        year = "2012",
        genre = "Action, Adventure, Sci-Fi",
        director = "Joss Whedon",
        actors = "Robert Downey Jr., Chris Evans, Scarlett Johansson",
        plot = "Earth's mightiest heroes must come together to save the world from an unprecedented threat.",
        poster = "https://m.media-amazon.com/images/M/MV5BNGE0YTVjNzUtNzJjOS00NGNlLTgxMzctZTY4YTE1Y2Y1ZTU4XkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTcwNTg1Nzg2MF5BMl5BanBnXkFtZTcwNDEwOTUwOA@@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTA0NjY0NzE4OTReQTJeQWpwZ15BbWU3MDczODg2Nzc@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOTkxOTIwMzk1OF5BMl5BanBnXkFtZTcwMDM4ODY3Nw@@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM0NjYxMjYwN15BMl5BanBnXkFtZTcwMzM4ODY3Nw@@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjU3NzUyODI5MF5BMl5BanBnXkFtZTcwNzM3NjYzNw@@._V1_QL75_UX1000_CR0,94,1000,563_.jpg"
        ),
        rating = "8.0",
        writer = "Zak Penn, Joss Whedon",
        storyline = "When Loki, the adopted brother of Thor, threatens Earth with an alien invasion, Nick Fury, director of S.H.I.E.L.D., assembles a team of extraordinary individuals – Iron Man, Captain America, Thor, Hulk, Black Widow, and Hawkeye – to defend the planet.  Despite their clashing personalities and initial conflicts, the Avengers must learn to work together to stop Loki and his Chitauri army from conquering Earth, facing a battle that will test their powers and unity."
    ),
    Movie(
        id = "24",
        title = "Spider-Man",
        year = "2002",
        genre = "Action, Adventure, Sci-Fi",
        director = "Sam Raimi",
        actors = "Tobey Maguire, Kirsten Dunst, Willem Dafoe",
        plot = "After being bitten by a genetically altered spider, a young man gains superpowers and becomes the web-slinging hero, Spider-Man.",
        poster = "https://m.media-amazon.com/images/M/MV5BZWM0OWVmNTEtNWVkOS00MzgyLTkyMzgtMmE2ZTZiNjY4MmFiXkEyXkFqcGc@._V1_QL75_UY562_CR0,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BZGI0YmNjOTYtN2FiOC00ZjYxLWJkOWEtYTdiNjczOTZlNGQ0XkEyXkFqcGdeQWRpZWdtb25n._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTY5NzM3MTYyNV5BMl5BanBnXkFtZTgwNDE0ODkxMjI@._V1_QL75_UX644_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjIxNzQ5ODQ4MV5BMl5BanBnXkFtZTgwNjE0ODkxMjI@._V1_QL75_UX650_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjMxMDAwMjUxOV5BMl5BanBnXkFtZTgwMDI0ODkxMjI@._V1_QL75_UX648_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNzE5NTk5NDQ0NV5BMl5BanBnXkFtZTgwNjU3ODIxMjI@._V1_QL75_UX654_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOTQxNTg4MzIwOF5BMl5BanBnXkFtZTgwNzI5OTIwMjE@._V1_QL75_UX680_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTUzODE5MjAxMF5BMl5BanBnXkFtZTgwNzE0ODkxMjI@._V1_QL75_UX648_.jpg"
        ),
        rating = "7.3",
        writer = "Stan Lee, Steve Ditko, David Koepp",
        storyline = "Peter Parker, an awkward and nerdy high school student, is bitten by a genetically engineered spider during a field trip.  He develops spider-like superpowers, including enhanced strength, agility, and the ability to shoot webs.  Initially using his powers for personal gain, Peter learns a harsh lesson about responsibility after tragedy strikes his family. He embraces his destiny as Spider-Man, a web-slinging superhero dedicated to protecting New York City from criminals, including the villainous Green Goblin."
    ),
    Movie(
        id = "25",
        title = "The Lion King",
        year = "1994",
        genre = "Animation, Adventure, Drama",
        director = "Roger Allers, Rob Minkoff",
        actors = "Matthew Broderick, Jeremy Irons, James Earl Jones",
        plot = "A young lion prince flees his kingdom only to learn the true meaning of responsibility and bravery.",
        poster = "https://m.media-amazon.com/images/M/MV5BZGRiZDZhZjItM2M3ZC00Y2IyLTk3Y2MtMWY5YjliNDFkZTJlXkEyXkFqcGc@._V1_QL75_UX380_CR0,1,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTM2ODAwNTc0NV5BMl5BanBnXkFtZTcwMjQ2NTI3Ng@@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTU4ODA5MTEyM15BMl5BanBnXkFtZTcwNDQ2NTI3Ng@@._V1_QL75_UX736_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTM4OTg5NzE4OF5BMl5BanBnXkFtZTcwNjQ2NTI3Ng@@._V1_QL75_UX746_.jpg"
        ),
        rating = "8.5",
        writer = "Irene Mecchi, Jonathan Roberts, Linda Woolverton",
        storyline = "Simba, a young lion cub and heir to the Pride Lands, is tricked by his uncle Scar into believing he caused his father Mufasa's death.  Guilt-ridden, Simba flees his home and grows up in exile with the carefree duo Timon and Pumbaa. Years later, Nala, a childhood friend, finds Simba and urges him to return and reclaim his rightful place as king, as Scar's tyrannical rule has brought ruin to the Pride Lands.  Simba must confront his past, face Scar, and embrace his destiny to become the Lion King."
    ),
    Movie(
        id = "26",
        title = "Star Wars: Episode IV - A New Hope",
        year = "1977",
        genre = "Action, Adventure, Fantasy",
        director = "George Lucas",
        actors = "Mark Hamill, Harrison Ford, Carrie Fisher",
        plot = "A young farm boy joins a rebellion to save the galaxy from the evil Empire.",
        poster = "https://m.media-amazon.com/images/M/MV5BOGUwMDk0Y2MtNjBlNi00NmRiLTk2MWYtMGMyMDlhYmI4ZDBjXkEyXkFqcGc@._V1_QL75_UX380_CR0,9,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTUzNDY0NjY4Nl5BMl5BanBnXkFtZTgwNjY4MTQ0NzE@._V1_QL75_UX1000_CR0,94,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjE1NzI5OTAwMl5BMl5BanBnXkFtZTgwMTgyMzQyNDM@._V1_QL75_UX542_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMjA4OTEwNDM2Nl5BMl5BanBnXkFtZTgwNTcyMzQyNDM@._V1_QL75_UX660_.jpg"
        ),
        rating = "8.6",
        writer = "George Lucas",
        storyline = "On the desert planet Tatooine, young farm boy Luke Skywalker's life is changed forever when he encounters a droid carrying a message from Princess Leia Organa of Alderaan, a leader of the Rebel Alliance.  Drawn into the galactic conflict against the tyrannical Galactic Empire, Luke joins forces with smuggler Han Solo, Chewbacca, and Obi-Wan Kenobi to rescue Princess Leia, fight the evil Darth Vader, and destroy the Empire's planet-destroying superweapon, the Death Star, in a galaxy-spanning adventure."
    ),
    Movie(
        id = "27",
        title = "The Terminator",
        year = "1984",
        genre = "Action, Sci-Fi",
        director = "James Cameron",
        actors = "Arnold Schwarzenegger, Linda Hamilton, Michael Biehn",
        plot = "A cyborg assassin is sent back in time to kill the woman whose unborn son will lead humanity in a war against machines.",
        poster = "https://m.media-amazon.com/images/M/MV5BZmE0YzIxM2QtMGNlMi00MjRmLWE3MWMtOWQzMGVjMmU0YTFmXkEyXkFqcGc@._V1_QL75_UX380_CR0,4,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BODA0OTg0NDgxMF5BMl5BanBnXkFtZTcwMDkzNDQyNA@@._V1_QL75_UX668_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMTQ2NzUxNzY3Nl5BMl5BanBnXkFtZTcwMzkzNDQyNA@@._V1_QL75_UX670_.jpg",
            "https://m.media-amazon.com/images/M/MV5BMzJkYTM3MmItM2I0My00MmMxLWE1MTMtNWY1ZjE2MjE0NGY0XkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX1000_CR0,94,1000,563_.jpg"
        ),
        rating = "8.0",
        writer = "James Cameron, Gale Anne Hurd",
        storyline = "In a dystopian future ruled by machines, Skynet, a sentient artificial intelligence, sends a cyborg assassin, the Terminator, back to 1984 Los Angeles to kill Sarah Connor, whose unborn son, John, will lead the human resistance against the machines.  A human soldier from the future, Kyle Reese, is also sent back to protect Sarah.  As the relentless Terminator hunts Sarah, Kyle and Sarah must fight to survive and prevent the dark future from ever happening."
    ),
    Movie(
        id = "28",
        title = "Back to the Future",
        year = "1985",
        genre = "Adventure, Comedy, Sci-Fi",
        director = "Robert Zemeckis",
        actors = "Michael J. Fox, Christopher Lloyd, Lea Thompson",
        plot = "A teenager is accidentally sent 30 years into the past in a time-traveling DeLorean.",
        poster = "https://m.media-amazon.com/images/M/MV5BZmM3ZjE0NzctNjBiOC00MDZmLTgzMTUtNGVlOWFlOTNiZDJiXkEyXkFqcGc@._V1_QL75_UX380_CR0,14,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BMTk4ZjIxYjItYTkyZC00ZWEwLWI4MTEtNzBiNmNjYTg2NDI2XkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYTQ0MTQ4MTYtOTliMS00YjAwLWI1MjYtOWJmMTc4Mzc2MmNlXkEyXkFqcGc@._V1_QL75_UX676_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYTE2MTY1MjktZTFmMS00MjI1LWFjYzUtNTVlZDVkZDNhMWEyXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_QL75_UX1000_CR0,94,1000,563_.jpg"
        ),
        rating = "8.5",
        writer = "Robert Zemeckis, Bob Gale",
        storyline = "Marty McFly, a teenager in 1985, is accidentally sent back to 1955 in a time-traveling DeLorean invented by his eccentric scientist friend, Doc Brown.  Stranded in the past, Marty inadvertently interferes with his parents' first meeting, threatening his own existence.  He must enlist the help of a younger Doc Brown to repair the timeline, ensure his parents fall in love, and find a way to get back to the future before he ceases to exist."
    ),
    Movie(
        id = "29",
        title = "The Social Dilemma",
        year = "2020",
        genre = "Documentary, Drama",
        director = "Jeff Orlowski",
        actors = "Tristan Harris, Jeff Seibert, Bailey Richardson",
        plot = "Explores the dangerous impact of social media on society and the individuals who use it.",
        poster = "https://m.media-amazon.com/images/M/MV5BNGQyY2E1M2EtZTkzNy00YjYyLWFjMGQtNTI1OGE4Yjc4MTZiXkEyXkFqcGc@._V1_QL75_UY562_CR8,0,380,562_.jpg",
        images = listOf(
            "https://m.media-amazon.com/images/M/MV5BYjI3YTM2YzgtMzMzZS00OTVmLTlhY2MtZjdkMWIzNjFiYzgzXkEyXkFqcGdeQXRyYW5zY29kZS13b3JrZmxvdw@@._V1_QL75_UX1000_CR0,0,1000,563_.jpg",
            "https://m.media-amazon.com/images/M/MV5BOGI4ZGVlMDYtNGYzMS00OWNjLWEzYTItZDU0NDYxMzE2OTFmXkEyXkFqcGc@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BNGZjMzhmOWEtNTE1ZC00NjkxLWE3YTYtMzU5Yjc0YTYyNmY2XkEyXkFqcGc@._V1_QL75_UX776_.jpg",
            "https://m.media-amazon.com/images/M/MV5BYzJjZGE1YWMtNGMyNy00NmUzLWFlZDctMzI4MDY4ZDVmMzc3XkEyXkFqcGc@._V1_QL75_UX776_.jpg"
        ),
        rating = "7.6",
        writer = "Vickie Curtis, Davis Coombe, Jeff Orlowski",
        storyline = "The Social Dilemma is a documentary-drama hybrid that explores the pervasive and often harmful impact of social networking.  Through interviews with tech experts, former employees of social media giants, and dramatized scenarios, the film reveals how social media platforms are designed to be addictive, manipulate user behavior, spread misinformation, and contribute to societal polarization and mental health issues, urging viewers to reconsider their relationship with technology."
    ),
    Movie(
        id = "30",
        title = "The Playlist",
        year = "2021",
        genre = "Documentary , Biography, Drama, Music",
        director = "Per-Olav Sørensen, Hallgrim Haug",
        actors = "Christian Hillborg, Edvin Endre, Severija Janusauskaite",
        plot = "How Swedish tech entrepreneur Daniel Ek and business partner Martin Lorentzon revolutionized the music industry through free and legal music streaming when they launched Spotify.",
        poster = "https://m.media-amazon.com/images/M/MV5BNDExODQ3OGMtOWVlMC00NjgzLWE4YmEtNzY0MGQ2ZjM2NzRhXkEyXkFqcGc@._V1_QL75_UX380_CR0,0,380,562_.jpg",
        images = listOf("https://m.media-amazon.com/images/M/MV5BMTMwNWRmZWItNGI2MS00ZTkwLWE1OWItZGIxYWJhNTdlOTQ3XkEyXkFqcGdeQWRpZWdtb25n._V1_QL75_UX1000_CR0,0,1000,563_.jpg","https://m.media-amazon.com/images/M/MV5BMjNjZGU1YTYtMTAyYS00MjczLTkxNDgtZTQ5ZTVlMzI1MmM3XkEyXkFqcGc@._V1_QL75_UX656_.jpg","https://m.media-amazon.com/images/M/MV5BNjIwYmIwMjctOWM4ZC00YzQ4LTlkODItOTgyNTU2ZWUxYjExXkEyXkFqcGdeQVRoaXJkUGFydHlJbmdlc3Rpb25Xb3JrZmxvdw@@._V1_QL75_UY563_CR0,0,1000,563_.jpg",""),
        rating = "7.4",
        writer = "Christian Spurrier, Sven Carlsson, Jonas Leijonhufvud",
        storyline = "The Playlist is a drama series inspired by real events, fictionalizing the story of how Swedish entrepreneur Daniel Ek and his partner Martin Lorentzon revolutionized the music industry with the creation of Spotify.  The series explores the challenges, legal battles, and innovative thinking behind the launch of the free and legal music streaming service that changed how people listen to music worldwide, focusing on the personalities and conflicts involved in this disruptive technological shift."
    )
)