import Song from '../models/Song'
import Album from '../models/Album';
import AlbumCredit from '../models/AlbumCredit';

const DUMMYDATA = {
    "ALBUMCREDITS": [
        new AlbumCredit(
            "63cc47d7-aa43-42c7-b6f8-bfc66af4f59b",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Bill Wyman",
            "Bass Guitar",
            "https://i.discogs.com/L9XH2RwFGkxwPJ2iSIeudHWev6RKx58svhVcB4c-_2g/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI3Mjgx/NC0xMzU1NjcwNDkx/LTI3ODcuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "064235c2-74ce-4cd1-a164-1b65271babdd",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Mick Taylor",
            "Slide Guitar",
            "https://i.discogs.com/zLjbAISk1POR4CODXjZbnkaCl-sXfvyMv-tul8LtIG0/rs:fit/g:sm/q:90/h:600/w:600/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9SLTU0Njc2/ODQtMTQxMzg5NTMw/OS03NjYwLmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "28de8cc3-4a4c-4dd0-ade2-0956f911359f",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Brian Jones",
            "Congos & Auto Harp",
            "https://i.discogs.com/xDtf3ZMsMJMUeUBNjwNue7FdD_Qxopiys9wm5tBuP58/rs:fit/g:sm/q:90/h:337/w:600/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTQwOTI5/MC0xNjIwMDc3MDQ1/LTQ4NjQuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "d2b69a76-ab14-4f7b-84d8-9609cae1f3b6",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Charlie Watts",
            "Drums",
            "https://i.discogs.com/VZVskvSw4kSThD23t4tJtDc6m148exd7FEeovx-lQog/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI5OTMy/NS0xNjI5ODI2OTY0/LTkwMjYuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "e1474214-1394-497e-8f15-253356c1a3ae",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Glyn Johns",
            "Engineer",
            "https://i.discogs.com/xbwSirGC6wdmGV4x84GGuN4zSOXh-nDfUxAmoU7dIBU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUyMjMw/LTE1NTQ5MDM2NzIt/NjYyNy5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "1e67d947-f495-4176-9683-da6d6ba6a64d",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Mick Jagger & Keith Richards",
            "Written-By",
            "https://i.discogs.com/Gy3ryFjUawYxZBrNSPvmXs3ZYL62V0XFFo-d6iaNZng/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTg0NTU4/MS0xNDYyMjk2MDc1/LTUxNjMuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "3530826e-b662-4b52-a8b7-7e9f25188e01",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Jimmy Miller",
            "Producer",
            "https://i.discogs.com/27hEanwNtjymkmRWQMjOpLJHisPAqPsMug3GvrwH8Wo/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE3MjA3/LTExNTA3MjgxNzEu/anBlZw.jpeg"
        ),
        new AlbumCredit(
            "d775bdd0-b602-45a0-9056-0f49e5d31b22",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Andy Warhol",
            "Cover [Cover Concept]",
            "https://i.discogs.com/spRp7EWrkJFhFO6OCS-kQTI95i-ydfJoQjaH6qYOooc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI0MDEy/MC0xMTQxMDU0Mjkx/LmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "bc288071-4c1a-41ed-9a60-570804da7402",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Acy R. Lehman",
            "Design [Cover]",
            "https://i.discogs.com/PkmqjHCGbJZSl6SEgXoi6W1yRGhdEbf9K9Gnugw64hE/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUwNDY5/OC0xMzE4NzYxOTM0/LmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "f134dccd-dcdd-40ff-bd92-0f2036efefad",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Val Valentin",
            "Engineer [Director Of]",
            "https://i.discogs.com/f-Wo1Z4WnpMlk7Fj0DHrdFmy7hG2oiMltay6PM_vFdI/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTMzOTE4/Ny0xNDE5MTE5Mzgx/LTYzOTYuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "7505d591-1531-48ca-927f-8498cf1ca604",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Gary Kellgren",
            "Engineer [Recording]",
            "https://i.discogs.com/trldtr8zjBONv0xZ5KcC2iTrOB9caY-XAY4TG1cveoQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI3MTIz/Ni0xMjk1MTc5MTk5/LmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "5a2afcc1-d9d0-44f9-92c8-d1090cc2f8a3",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Maureen Tucker",
            "Percussion",
            "https://i.discogs.com/B2wFhyHsdWROT51wWZMPWmfBQGKsiQmPFmmnQD5OZz8/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI4MDI4/Ni0xMzQzMzY5MDUx/LTc3MzAuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "b3c879db-23ac-4382-bcd2-b6402c4afba4",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Billy Name",
            "Photography By [Cover]",
            "https://i.discogs.com/QiZ1k-pIZgHJHb_wVKzm6qt5qyZg0GYMG3iJS1rdfpM/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE1NTcz/NTUtMTM2MjEzOTM3/Mi01NTQzLmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "e90700f4-105a-440a-9818-e34044e9af47",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Tom Wilson",
            "Producer",
            "https://i.discogs.com/zK1Yy7OCkNiaFvXKIBjQei_PyU2NMy1xTpjI8JkYIEc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MzAy/MS0xNDcxODg1MDk5/LTI1MjMuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "8606b118-1178-4a6b-aa7f-4a6e5b7266dd",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Sterling Morrison",
            "Vocals, Guitar, Bass Guitar",
            "https://i.discogs.com/fvKQSp73gE6DCrLH5Up88y2HN38UyVZqY1U9BO4zqI4/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI4MDI4/MS0xNjE4NDI0MDg2/LTc0MTEuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "f2232125-0244-4b32-ba66-28296e3340c2",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "John Cale",
            "Vocals, Viola [Electric], Organ, Bass Guitar",
            "https://i.discogs.com/C0GmK19i8KtySYGU9-UfFGNye2JSjr0Xly2cMsHZ9pk/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTY2MzU4/LTEzNjM5NzAzMzct/Njk3OC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "3c9df880-cbe4-4e03-b76d-2ce429bfdbe1",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "Tom Wilson",
            "Producer",
            "https://i.discogs.com/zK1Yy7OCkNiaFvXKIBjQei_PyU2NMy1xTpjI8JkYIEc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MzAy/MS0xNDcxODg1MDk5/LTI1MjMuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "768294b6-eee9-4257-8d2f-b1ddce109f50",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Julian Adderly",
            "Alto Saxophone",
            "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "e865d407-d5d0-45bd-9dab-9026bb8fe559",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Paul Chambers",
            "Bass",
            "https://i.discogs.com/G3V3okWAe3oiwSXQA1ijuWLONqHXDhlmGg7hWN8V6jw/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1OTc3/OC0xNjEwMTc1MDgz/LTE1NzYuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "e7e839ce-315d-4f82-9c81-882f89a6551f",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Drums",
            "James Cobb",
            "https://i.discogs.com/B-azWw9MEvd_2ZOVbpBXc4TH3pilr_wIndWlDh5jDMY/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MS0xNjQzODMxNzcx/LTQ0MzUuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "ca60f3f3-687c-4f02-a92b-6f83ef058b8a",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Liner Notes",
            "Bill Evans",
            "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "3ce3335f-ab30-4d93-aba8-c8361d96a71d",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Piano",
            "Bill Evans",
            "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "1e269f42-6de7-46da-8544-877f9663ce11",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Tenor Saxophone",
            "John Coltrane",
            "https://i.discogs.com/MIlw5bt2eU0KOgO2LDKlpoL-YWz7onKm-XNyHiqfrkQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTk3NTQ1/LTE0NTE0ODkwOTQt/Nzk1Mi5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "a269c4ec-fb4e-4428-beb7-68569136a7da",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Wynton Kelly",
            "Piano",
            "https://i.discogs.com/3-kjprBhwYcvzz8vkviPN0YXy5N5TDQ3uj_fZdyprJk/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMw/OC0xMTA3NzY2Mzg2/LmpwZw.jpeg"
        ),
        new AlbumCredit(
            "3f15c771-01cc-40eb-84dc-2920bdc35269",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Trumpet",
            "Miles Davis",
            "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "3f15c771-01cc-40eb-84dc-2920bdc35269",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Written-By",
            "M. Davis",
            "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "116054db-e7c3-4746-9419-01d823155866",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Victor Moscoco",
            "Design [Cover]",
            "https://i.discogs.com/zaOJfPbCnkgl2LFz3K_W0Oqqxh6v9FrAieX5Z9oC59I/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE4Mjc5/MzAtMTU4OTIwMDE0/OS00NjMyLmpwZWc.jpeg"
        ),
        new AlbumCredit(
            "08cb7fe4-0cd9-4f9b-94c7-7111db5fe8ce",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Fred Catero",
            "Engineer [Recording]",
            "https://i.discogs.com/xYaOnI_E3ks0CKRefjf91B4u1xo2YyPBW2ImeoOnqTs/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjAw/Ny0xNTY2ODg2ODc0/LTI3NzIuanBlZw.jpeg"
        ),
        new AlbumCredit(
            "4e5ecb6d-445e-4c71-b6d0-37f6e9e8feab",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Bennie Maupin",
            "Soprano Saxophone/Tenor Saxophone",
            "https://i.discogs.com/_f2yBxnYgW08RGPh1z9wvNJ_3sDESrhnWLql-bmSb7s/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE1NDQ4/LTE1NTk1MTUyNzAt/Mjg3MC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "6a6e9358-d2e7-4c21-943d-ee1500a77549",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "David Rubinson",
            "Producer",
            "https://i.discogs.com/M5SHEAOG_soSkUuIrerefZVJb0SVcxWJfwFEvSp3EzQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUzMjE3/LTE1NTc3NTkyMzYt/MzA4MS5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "7cec7334-2ec8-40b8-a314-d5ebc8b2b495",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Herbie Hancock",
            "Synthesizer, Electric Piano, Clavinet",
            "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "0a45bab1-8563-49eb-be85-88aaca1cc079",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Paul Jackson",
            "Electric Bass",
            "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "0a45bab1-8563-49eb-be85-88aaca1cc079",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Harvey Mason",
            "Drums [Yamaha]",
            "https://i.discogs.com/m9IyJjlLYdqTuJrsNrXqQA0Lia9vYgpvphufQ4h75-k/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTY0NjUy/LTE1MDE2OTMzNDUt/ODQ0NC5qcGVn.jpeg"
        ),
        new AlbumCredit(
            "91e61a00-b659-48d3-9fb6-2c3f41aae016",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Bill Summers",
            "Conga, Shekere, Tambourine",
            "https://i.discogs.com/moG3RSm2h3SEts8kAcrmEd7pY2wsrTVP9LNaYQJBsHA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE4MTgt/MTUxMTEwNzA1Ni05/NDczLmpwZWc.jpeg"
        )
    ],
    "SONGS": [
        new Song(
            "64a639fa-ca70-402c-93e8-f9418fbb4c74",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/6H3kDe7CGoWYBabAeVWGiD?si=1f13f383129b4b03",
            "4:30",
            "Gimme Shelter",
            1,
            false
        ),
        new Song(
            "50dd0d93-0cf9-4519-97ca-e68cab21296d",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/4GNEqWXhKEoMyL3k5wF0r7?si=35f829d809f64772",
            "4:19",
            "Love In Vain",
            2,
            false
        ),
        new Song(
            "a4027680-fee2-48e2-8b6e-5955eb762615",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/6zD3VBPn2VNDdmLEg0coPt?si=80185f6fa2264fa2",
            "3:07",
            "Country Honk",
            3,
            false
        ),
        new Song(
            "09762bc8-f31d-4992-ac60-1eccdd7dc9e9",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/31YMV7aMItO8jzyc10iRrS?si=c6fa4e54e6744845",
            "3:33",
            "Live With Me",
            4,
            false
        ),
        new Song(
            "a57aaec2-acae-478a-bcf2-c3fde2a310a0",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/06FcMPcosZg13x2QODDDK6?si=59cdbfd9dfe64101",
            "5:27",
            "Let It Bleed",
            5,
            false
        ),
        new Song(
            "1ddc2318-8f65-4986-8f2a-7f643ccff01f",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/3tIvHt7VaIenprWXrYzgwb?si=e06edbdedcb842cd",
            "6:52",
            "Midnight Rambler",
            6,
            false
        ),
        new Song(
            "ed87ed84-03ed-4903-ba41-5015438003aa",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/2pbHaKsIRuIqjZHCLpyQMv?si=9a4b3b24ae764789",
            "2:50",
            "You Got The Silver",
            7,
            false
        ),
        new Song(
            "f142a2c8-fe99-4e4d-9f1b-3ad9ebeb3292",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/5m6livL7ccIS92wq16n52r?si=1884830c6d7d468f",
            "4:11",
            "Monkey Man",
            8,
            false
        ),
        new Song(
            "1bf6f676-5071-4ca5-8609-d194d3442d3c",
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "The Rolling Stones",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/track/6lFZbCc7pn6Lme1NP7qQqQ?si=f0d9f09fb5df448d",
            "7:28",
            "You Can't Always Get What You Want",
            9,
            false
        ),
        new Song(
            "667df405-d8b6-484b-b084-9910fefbea5e",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
            "2:47",
            "White Light/White Heat",
            1,
            false
        ),
        new Song(
            "cfef36fd-9750-4a6b-a052-c0e3496b9041",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/6xst1yRHJ2IkMQE0ebeU11?si=fd9394ec484c4077",
            "8:19",
            "The Gift",
            2,
            false
        ),
        new Song(
            "1b5b722d-56c0-4e3d-9136-fb7da944eec5",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/00bScuvzFpyRMGWlgfu5sp?si=bfebbef11d71466c",
            "4:56",
            "Lady Godiva's Operation",
            3,
            false
        ),
        new Song(
            "089b2d86-e32d-4ebd-8ceb-1acc5c4f322f",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/23LNLIpFwrcHAVpN3fx9cT?si=9f4015cba1cd4f0f",
            "2:05",
            "Here She Comes Now",
            4,
            false
        ),
        new Song(
            "ebb8356e-fd88-4e8d-a3db-180d0de547e5",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/2Kvh9rYfJ7oczyCJZdzVPm?si=c302c35ba25d4385",
            "4:38",
            "I Heard Her Call My Name",
            5,
            false
        ),
        new Song(
            "bb2c6582-bcf1-47a0-9bbc-b97dcbbecab1",
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "The Velvet Underground",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/track/3lwKNjchZuU5ZCVZVXwj5Y?si=b2b98edb3d0342da",
            "17:30",
            "Sister Ray",
            6,
            false
        ),
        new Song(
            "b165dfab-68e3-4cca-babb-ddf875687afb",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Miles Davis",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
            "9:22",
            "So What",
            1,
            false
        ),
        new Song(
            "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Miles Davis",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
            "9:46",
            "Freddie Freeloader",
            2,
            false
        ),
        new Song(
            "aa58a275-cd40-4986-8d1a-593d40b7a934",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Miles Davis",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
            "5:37",
            "Blue In Green",
            3,
            false
        ),
        new Song(
            "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Miles Davis",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
            "11:32",
            "All Blues",
            4,
            false
        ),
        new Song(
            "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Miles Davis",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
            "9:26",
            "Flamenco Sketches",
            5,
            false
        ),
        new Song(
            "2a53544d-18cd-4737-a0a1-c0c38b19d1eb",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Herbie Hancock",
            "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            "https://open.spotify.com/track/4Ce66JznW8QbeyTdSzdGwR?si=46bd038005e2438e",
            "15:41",
            "Chameleon",
            1,
            false
        ),
        new Song(
            "baa36752-1c21-4d34-9062-4da237b10cbc",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Herbie Hancock",
            "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            "https://open.spotify.com/track/2zQl59dZMzwhrmeSBEgiXY?si=6a4afcdd21204ba5",
            "6:28",
            "Watermelon Man",
            2,
            false
        ),
        new Song(
            "76bdb16a-0906-47fd-aae2-10720ccd2f93",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Herbie Hancock",
            "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            "https://open.spotify.com/track/4WyVRn3L2uXnSUkY762gqN?si=c387e41f38204a3e",
            "10:15",
            "Sly",
            3,
            false
        ),
        new Song(
            "4e9a4ff7-65a4-42a9-8c99-e6a34f4f68fa",
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Herbie Hancock",
            "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            "https://open.spotify.com/track/6c0ziyel6ZMTQ37vKRooGZ?si=9502b7ddd6b84d9a",
            "9:09",
            "Vein Meter",
            4,
            false
        )
    ],
    "ALBUMS": [
        new Album(
            "095b74a7-4092-42e3-b9fc-c79f650ae39c",
            "Let It Bleed",
            "The Stones were better than anybody else at making a slightly sloppy approach work for them rather than against them, and \"Let It Bleed\" could be the best illustration. The amiable, highly hummable blues-rock tune has a jerky, somewhat uneven rhythm slightly suggestive of a tipsy party guest who's imbibed just enough booze to make him less inhibited and more entertaining, but not enough to make him a truly annoying drunk.",
            "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
            "https://open.spotify.com/album/4l4u9e9jSbotSXNjYfOugy?si=VEJw6xuIRxCLAKG4SEW7jg",
            "https://en.wikipedia.org/wiki/Let_It_Bleed",
            "https://genius.com/The-rolling-stones-let-it-bleed-lyrics",
            "The Rolling Stones",
            "Decca Records",
            "Blues Rock",
            1968
        ),
        new Album(
            "5583e514-cf7b-4214-8397-dfd7e10dfb33",
            "White Light/White Heat",
            "White Light/White Heat contains a distorted, feedback-driven, and roughly recorded sound, which is regarded as influential; it foreshadowed the start of punk rock and the no wave genre. The Social Distortion album White Light, White Heat, White Trash would be named after White Light/White Heat.",
            "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
            "https://open.spotify.com/album/0HHmJpwOXXRJu9HI9iQiEO?si=Z8BDHkGyRdWEN3LHyyz_ZQ",
            "https://en.wikipedia.org/wiki/White_Light/White_Heat",
            "https://genius.com/albums/The-velvet-underground/White-light-white-heat",
            "The Velvet Underground",
            "Verve Records",
            "Avantgarde, Experimental, Noise, Art Rock",
            1968
        ),
        new Album(
            "2080f161-c553-408d-9724-9c1e2f1b8c87",
            "Kind Of Blue",
            "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
            "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
            "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
            "https://en.wikipedia.org/wiki/Kind_of_Blue",
            null,
            "Miles Davis",
            "Columbia",
            "Modal",
            1959
        ),
        new Album(
            "06e00675-980b-4435-be2e-5ec17d942865",
            "Head Hunters",
            "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
            "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
            "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
            "https://en.wikipedia.org/wiki/Head_Hunters",
            null,
            "Herbie Hancock",
            "Columbia",
            "Jazz, Jazz-Funk",
            1973
        )
    ]
}


export default DUMMYDATA;