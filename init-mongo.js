db = db.getSiblingDB('CinePeliculas');
db.Peliculas.insertMany([
    {
        _id: ObjectId('67e9e49807f282106e56b3f4'),
        id: 1,
        title: 'Sexo La Pelicula',
        description: 'La pelicula del doctor sexo',
        image: 'https://http2.mlstatic.com/D_NQ_NP_933762-CBT80264083462_112024-O.webp',
        showtimes: [ '11:00AM', '10:00PM' ]
      },
      {
        _id: ObjectId('67e9e60b07f282106e56b3f6'),
        id: 2,
        title: 'Sexo 2 La Pelicula',
        description: 'El regreso del doctor sexo',
        image: 'https://preview.redd.it/zozlzva328291.jpg?width=640&crop=smart&auto=webp&s=13f4f13bfa6e541308b77ededcd134d526d29b5b',
        showtimes: [ '12:00AM', '09:00PM' ]
      }
    ]);