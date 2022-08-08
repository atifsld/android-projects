package com.atif.spatify.service

import com.atif.spatify.entity.Album
import com.atif.spatify.entity.AlbumCredit
import com.atif.spatify.entity.Song

object SpatifyDataGenerator {
    fun getAlbumCredits(): List<AlbumCredit> {
        val albumCreditList: MutableList<AlbumCredit> = mutableListOf()
        albumCreditList.addAll(
            listOf(
                AlbumCredit(
                    id = "d775bdd0-b602-45a0-9056-0f49e5d31b22",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Andy Warhol",
                    creditContribution = "Cover [Cover Concept]",
                    creditImageUrl = "https://i.discogs.com/spRp7EWrkJFhFO6OCS-kQTI95i-ydfJoQjaH6qYOooc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI0MDEy/MC0xMTQxMDU0Mjkx/LmpwZWc.jpeg"
                ),
                AlbumCredit(
                    id = "bc288071-4c1a-41ed-9a60-570804da7402",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Acy R. Lehman",
                    creditContribution = "Design [Cover]",
                    creditImageUrl = "https://i.discogs.com/PkmqjHCGbJZSl6SEgXoi6W1yRGhdEbf9K9Gnugw64hE/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUwNDY5/OC0xMzE4NzYxOTM0/LmpwZWc.jpeg"
                ),
                AlbumCredit(
                    id = "f134dccd-dcdd-40ff-bd92-0f2036efefad",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Val Valentin",
                    creditContribution = "Engineer [Director Of]",
                    creditImageUrl = "https://i.discogs.com/f-Wo1Z4WnpMlk7Fj0DHrdFmy7hG2oiMltay6PM_vFdI/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTMzOTE4/Ny0xNDE5MTE5Mzgx/LTYzOTYuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "7505d591-1531-48ca-927f-8498cf1ca604",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Gary Kellgren",
                    creditContribution = "Engineer [Recording]",
                    creditImageUrl = "https://i.discogs.com/trldtr8zjBONv0xZ5KcC2iTrOB9caY-XAY4TG1cveoQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI3MTIz/Ni0xMjk1MTc5MTk5/LmpwZWc.jpeg"
                ),
                AlbumCredit(
                    id = "5a2afcc1-d9d0-44f9-92c8-d1090cc2f8a3",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Maureen Tucker",
                    creditContribution = "Percussion",
                    creditImageUrl = "https://i.discogs.com/B2wFhyHsdWROT51wWZMPWmfBQGKsiQmPFmmnQD5OZz8/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI4MDI4/Ni0xMzQzMzY5MDUx/LTc3MzAuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "b3c879db-23ac-4382-bcd2-b6402c4afba4",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Billy Name",
                    creditContribution = "Photography By [Cover]",
                    creditImageUrl = "https://i.discogs.com/QiZ1k-pIZgHJHb_wVKzm6qt5qyZg0GYMG3iJS1rdfpM/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE1NTcz/NTUtMTM2MjEzOTM3/Mi01NTQzLmpwZWc.jpeg"
                ),
                AlbumCredit(
                    id = "e90700f4-105a-440a-9818-e34044e9af47",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Tom Wilson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/zK1Yy7OCkNiaFvXKIBjQei_PyU2NMy1xTpjI8JkYIEc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MzAy/MS0xNDcxODg1MDk5/LTI1MjMuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "8606b118-1178-4a6b-aa7f-4a6e5b7266dd",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Sterling Morrison",
                    creditContribution = "Vocals, Guitar, Bass Guitar",
                    creditImageUrl = "https://i.discogs.com/fvKQSp73gE6DCrLH5Up88y2HN38UyVZqY1U9BO4zqI4/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI4MDI4/MS0xNjE4NDI0MDg2/LTc0MTEuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "f2232125-0244-4b32-ba66-28296e3340c2",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "John Cale",
                    creditContribution = "Vocals, Viola [Electric], Organ, Bass Guitar",
                    creditImageUrl = "https://i.discogs.com/C0GmK19i8KtySYGU9-UfFGNye2JSjr0Xly2cMsHZ9pk/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTY2MzU4/LTEzNjM5NzAzMzct/Njk3OC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "3c9df880-cbe4-4e03-b76d-2ce429bfdbe1",
                    creditAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    creditName = "Tom Wilson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/zK1Yy7OCkNiaFvXKIBjQei_PyU2NMy1xTpjI8JkYIEc/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MzAy/MS0xNDcxODg1MDk5/LTI1MjMuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "768294b6-eee9-4257-8d2f-b1ddce109f50",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Julian Adderly",
                    creditContribution = "Alto Saxophone",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "e865d407-d5d0-45bd-9dab-9026bb8fe559",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Paul Chambers",
                    creditContribution = "Bass",
                    creditImageUrl = "https://i.discogs.com/G3V3okWAe3oiwSXQA1ijuWLONqHXDhlmGg7hWN8V6jw/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1OTc3/OC0xNjEwMTc1MDgz/LTE1NzYuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "e7e839ce-315d-4f82-9c81-882f89a6551f",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Drums",
                    creditContribution = "James Cobb",
                    creditImageUrl = "https://i.discogs.com/B-azWw9MEvd_2ZOVbpBXc4TH3pilr_wIndWlDh5jDMY/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MS0xNjQzODMxNzcx/LTQ0MzUuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "ca60f3f3-687c-4f02-a92b-6f83ef058b8a",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Liner Notes",
                    creditContribution = "Bill Evans",
                    creditImageUrl = "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "3ce3335f-ab30-4d93-aba8-c8361d96a71d",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Piano",
                    creditContribution = "Bill Evans",
                    creditImageUrl = "https://i.discogs.com/lIuzUoUyZbmwdVfCLOiMVpja8Qtfni4yJkv2PmasCIA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMx/MC0xNjM3NTQ5NDM4/LTk1NTMuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "1e269f42-6de7-46da-8544-877f9663ce11",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Tenor Saxophone",
                    creditContribution = "John Coltrane",
                    creditImageUrl = "https://i.discogs.com/MIlw5bt2eU0KOgO2LDKlpoL-YWz7onKm-XNyHiqfrkQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTk3NTQ1/LTE0NTE0ODkwOTQt/Nzk1Mi5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "a269c4ec-fb4e-4428-beb7-68569136a7da",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Wynton Kelly",
                    creditContribution = "Piano",
                    creditImageUrl = "https://i.discogs.com/3-kjprBhwYcvzz8vkviPN0YXy5N5TDQ3uj_fZdyprJk/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjMw/OC0xMTA3NzY2Mzg2/LmpwZw.jpeg"
                ),
                AlbumCredit(
                    id = "3f15c771-01cc-40eb-84dc-2920bdc35269",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Trumpet",
                    creditContribution = "Miles Davis",
                    creditImageUrl = "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "3f15c771-01cc-40eb-84dc-2920bdc35269",
                    creditAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    creditName = "Written-By",
                    creditContribution = "M. Davis",
                    creditImageUrl = "https://i.discogs.com/yltaZJsmNzRCpXqtq3dekVIuHjnu_BTh35d5tH1McgU/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTIzNzU1/LTEzOTQzODczNDMt/NDUwMC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "116054db-e7c3-4746-9419-01d823155866",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Victor Moscoco",
                    creditContribution = "Design [Cover]",
                    creditImageUrl = "https://i.discogs.com/zaOJfPbCnkgl2LFz3K_W0Oqqxh6v9FrAieX5Z9oC59I/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE4Mjc5/MzAtMTU4OTIwMDE0/OS00NjMyLmpwZWc.jpeg"
                ),
                AlbumCredit(
                    id = "08cb7fe4-0cd9-4f9b-94c7-7111db5fe8ce",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Fred Catero",
                    creditContribution = "Engineer [Recording]",
                    creditImageUrl = "https://i.discogs.com/xYaOnI_E3ks0CKRefjf91B4u1xo2YyPBW2ImeoOnqTs/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTI1MjAw/Ny0xNTY2ODg2ODc0/LTI3NzIuanBlZw.jpeg"
                ),
                AlbumCredit(
                    id = "4e5ecb6d-445e-4c71-b6d0-37f6e9e8feab",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Bennie Maupin",
                    creditContribution = "Soprano Saxophone/Tenor Saxophone",
                    creditImageUrl = "https://i.discogs.com/_f2yBxnYgW08RGPh1z9wvNJ_3sDESrhnWLql-bmSb7s/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE1NDQ4/LTE1NTk1MTUyNzAt/Mjg3MC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "6a6e9358-d2e7-4c21-943d-ee1500a77549",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "David Rubinson",
                    creditContribution = "Producer",
                    creditImageUrl = "https://i.discogs.com/M5SHEAOG_soSkUuIrerefZVJb0SVcxWJfwFEvSp3EzQ/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTUzMjE3/LTE1NTc3NTkyMzYt/MzA4MS5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "7cec7334-2ec8-40b8-a314-d5ebc8b2b495",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Herbie Hancock",
                    creditContribution = "Synthesizer, Electric Piano, Clavinet",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "0a45bab1-8563-49eb-be85-88aaca1cc079",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Paul Jackson",
                    creditContribution = "Electric Bass",
                    creditImageUrl = "https://i.discogs.com/aj45WJx5f5GM39gt5cw_B4Z-xaOkRtwCdFoMm1OAQP0/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTYxNTg1/LTE2MzcxNTQ4MjQt/NjUzOC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "0a45bab1-8563-49eb-be85-88aaca1cc079",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Harvey Mason",
                    creditContribution = "Drums [Yamaha]",
                    creditImageUrl = "https://i.discogs.com/m9IyJjlLYdqTuJrsNrXqQA0Lia9vYgpvphufQ4h75-k/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTY0NjUy/LTE1MDE2OTMzNDUt/ODQ0NC5qcGVn.jpeg"
                ),
                AlbumCredit(
                    id = "91e61a00-b659-48d3-9fb6-2c3f41aae016",
                    creditAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    creditName = "Bill Summers",
                    creditContribution = "Conga, Shekere, Tambourine",
                    creditImageUrl = "https://i.discogs.com/moG3RSm2h3SEts8kAcrmEd7pY2wsrTVP9LNaYQJBsHA/rs:fit/g:sm/q:40/h:300/w:300/czM6Ly9kaXNjb2dz/LWRhdGFiYXNlLWlt/YWdlcy9BLTE4MTgt/MTUxMTEwNzA1Ni05/NDczLmpwZWc.jpeg"
                )
            )
        )
        return albumCreditList
    }

    fun getAlbums(): List<Album> {
        val albumList: MutableList<Album> = mutableListOf()
        albumList.addAll(
            listOf(
                Album(
                    id = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    albumArtists = "The Rolling Stones  ",
                    albumDescription = "The Stones were better than anybody else at making a slightly sloppy approach work for them rather than against them, and \"Let It Bleed\" could be the best illustration. The amiable, highly hummable blues-rock tune has a jerky, somewhat uneven rhythm slightly suggestive of a tipsy party guest who's imbibed just enough booze to make him less inhibited and more entertaining, but not enough to make him a truly annoying drunk.",
                    albumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    albumSpotifyUrl = "https://open.spotify.com/album/4l4u9e9jSbotSXNjYfOugy?si=VEJw6xuIRxCLAKG4SEW7jg",
                    albumGeniusUrl = "https://genius.com/The-rolling-stones-let-it-bleed-lyrics",
                    albumWikipediaUrl = "https://en.wikipedia.org/wiki/Let_It_Bleed",
                    albumLabel = "Decca Records",
                    albumName = "Let It Bleed",
                    albumTags = "Blues Rock",
                    albumYear = 1968
                ),
                Album(
                    id = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    albumArtists = "The Velvet Underground",
                    albumDescription = "White Light/White Heat contains a distorted, feedback-driven, and roughly recorded sound, which is regarded as influential; it foreshadowed the start of punk rock and the no wave genre. The Social Distortion album White Light, White Heat, White Trash would be named after White Light/White Heat.",
                    albumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    albumSpotifyUrl = "https://open.spotify.com/album/0HHmJpwOXXRJu9HI9iQiEO?si=Z8BDHkGyRdWEN3LHyyz_ZQ",
                    albumGeniusUrl = "https://genius.com/albums/The-velvet-underground/White-light-white-heat",
                    albumWikipediaUrl = "https://en.wikipedia.org/wiki/White_Light/White_Heat",
                    albumLabel = "Verve Records",
                    albumName = "White Light/White Heat",
                    albumTags = "Avantgarde, Experimental, Noise, Art Rock",
                    albumYear = 1968
                ),
                Album(
                    id = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    albumArtists = "Miles Davis",
                    albumDescription = "Kind of Blue is a studio album by American jazz trumpeter, composer, and bandleader Miles Davis. It was recorded on March 2 and April 22, 1959, at Columbia's 30th Street Studio in New York City, and released on August 17 of that year by Columbia Records.",
                    albumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    albumSpotifyUrl = "https://open.spotify.com/album/1weenld61qoidwYuZ1GESA?si=CsrQI5dKSi6-9StJndQYKw",
                    albumGeniusUrl = null,
                    albumWikipediaUrl = "https://en.wikipedia.org/wiki/Kind_of_Blue",
                    albumLabel = "Columbia",
                    albumName = "Kind Of Blue",
                    albumTags = "Modal",
                    albumYear = 1959
                ),
                Album(
                    id = "06e00675-980b-4435-be2e-5ec17d942865",
                    albumArtists = "Herbie Hancock",
                    albumDescription = "Head Hunters by Herbie Hancock is among the best and most influential jazz-funk albums in jazz history. Recorded and released in the last quarter of 1973, it featured electric synthesizers, elements of funk music and Hancock’s trademark Fender Rhodes,",
                    albumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    albumSpotifyUrl = "https://open.spotify.com/album/5fmIolILp5NAtNYiRPjhzA?si=LYzXH1bVQPOS-4lvYcIhgw",
                    albumGeniusUrl = null,
                    albumWikipediaUrl = "https://en.wikipedia.org/wiki/Head_Hunters",
                    albumLabel = "Columbia",
                    albumName = "Head Hunters",
                    albumTags = "Jazz, Jazz-Funk",
                    albumYear = 1973
                )
            )
        )
        return albumList
    }

    fun getSongs(): List<Song> {
        val songList: MutableList<Song> = mutableListOf()
        songList.addAll(
            listOf(
                Song(
                    id = "64a639fa-ca70-402c-93e8-f9418fbb4c74",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6H3kDe7CGoWYBabAeVWGiD?si=1f13f383129b4b03",
                    songDuration = "4:30",
                    songName = "Gimme Shelter",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "50dd0d93-0cf9-4519-97ca-e68cab21296d",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/4GNEqWXhKEoMyL3k5wF0r7?si=35f829d809f64772",
                    songDuration = "4:19",
                    songName = "Love In Vain",
                    songTrackNumber = 2,
                    songIsFavorite = false
                ),
                Song(
                    id = "a4027680-fee2-48e2-8b6e-5955eb762615",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6zD3VBPn2VNDdmLEg0coPt?si=80185f6fa2264fa2",
                    songDuration = "3:07",
                    songName = "Country Honk",
                    songTrackNumber = 3,
                    songIsFavorite = false
                ),
                Song(
                    id = "09762bc8-f31d-4992-ac60-1eccdd7dc9e9",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/31YMV7aMItO8jzyc10iRrS?si=c6fa4e54e6744845",
                    songDuration = "3:33",
                    songName = "Live With Me",
                    songTrackNumber = 4,
                    songIsFavorite = false
                ),
                Song(
                    id = "a57aaec2-acae-478a-bcf2-c3fde2a310a0",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/06FcMPcosZg13x2QODDDK6?si=59cdbfd9dfe64101",
                    songDuration = "5:27",
                    songName = "Let It Bleed",
                    songTrackNumber = 5,
                    songIsFavorite = false
                ),
                Song(
                    id = "1ddc2318-8f65-4986-8f2a-7f643ccff01f",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3tIvHt7VaIenprWXrYzgwb?si=e06edbdedcb842cd",
                    songDuration = "6:52",
                    songName = "Midnight Rambler",
                    songTrackNumber = 6,
                    songIsFavorite = false
                ),
                Song(
                    id = "ed87ed84-03ed-4903-ba41-5015438003aa",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/2pbHaKsIRuIqjZHCLpyQMv?si=9a4b3b24ae764789",
                    songDuration = "2:50",
                    songName = "You Got The Silver",
                    songTrackNumber = 7,
                    songIsFavorite = false
                ),
                Song(
                    id = "f142a2c8-fe99-4e4d-9f1b-3ad9ebeb3292",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/5m6livL7ccIS92wq16n52r?si=1884830c6d7d468f",
                    songDuration = "4:11",
                    songName = "Monkey Man",
                    songTrackNumber = 8,
                    songIsFavorite = false
                ),
                Song(
                    id = "1bf6f676-5071-4ca5-8609-d194d3442d3c",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6lFZbCc7pn6Lme1NP7qQqQ?si=f0d9f09fb5df448d",
                    songDuration = "7:28",
                    songName = "You Can't Always Get What You Want",
                    songTrackNumber = 9,
                    songIsFavorite = false
                ),

                Song(
                    id = "b679b24b-f8cd-4c60-b41a-d65aff0c9ae6",
                    songAlbumId = "095b74a7-4092-42e3-b9fc-c79f650ae39c",
                    songArtists = "The Rolling Stones",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/c/c0/LetitbleedRS.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
                    songDuration = "2:47",
                    songName = "White Light/White Heat",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "667df405-d8b6-484b-b084-9910fefbea5e",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0Evhu0dKCkIuEn88Pmb9mj?si=15d43ff31b3d4f70",
                    songDuration = "2:47",
                    songName = "White Light/White Heat",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "cfef36fd-9750-4a6b-a052-c0e3496b9041",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6xst1yRHJ2IkMQE0ebeU11?si=fd9394ec484c4077",
                    songDuration = "8:19",
                    songName = "The Gift",
                    songTrackNumber = 2,
                    songIsFavorite = false
                ),
                Song(
                    id = "1b5b722d-56c0-4e3d-9136-fb7da944eec5",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/00bScuvzFpyRMGWlgfu5sp?si=bfebbef11d71466c",
                    songDuration = "4:56",
                    songName = "Lady Godiva's Operation",
                    songTrackNumber = 3,
                    songIsFavorite = false
                ),
                Song(
                    id = "089b2d86-e32d-4ebd-8ceb-1acc5c4f322f",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/23LNLIpFwrcHAVpN3fx9cT?si=9f4015cba1cd4f0f",
                    songDuration = "2:05",
                    songName = "Here She Comes Now",
                    songTrackNumber = 4,
                    songIsFavorite = false
                ),
                Song(
                    id = "ebb8356e-fd88-4e8d-a3db-180d0de547e5",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/2Kvh9rYfJ7oczyCJZdzVPm?si=c302c35ba25d4385",
                    songDuration = "4:38",
                    songName = "I Heard Her Call My Name",
                    songTrackNumber = 5,
                    songIsFavorite = false
                ),
                Song(
                    id = "bb2c6582-bcf1-47a0-9bbc-b97dcbbecab1",
                    songAlbumId = "5583e514-cf7b-4214-8397-dfd7e10dfb33",
                    songArtists = "The Velvet Underground",
                    songAlbumArtUrl = "https://ia903403.us.archive.org/27/items/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e/mbid-3603f98f-0dce-3cbd-8bde-2f294225aa2e-8015457006_thumb500.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3lwKNjchZuU5ZCVZVXwj5Y?si=b2b98edb3d0342da",
                    songDuration = "17:30",
                    songName = "Sister Ray",
                    songTrackNumber = 6,
                    songIsFavorite = false
                ),
                Song(
                    id = "b165dfab-68e3-4cca-babb-ddf875687afb",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                    songDuration = "9:22",
                    songName = "So What",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                    songDuration = "9:46",
                    songName = "Freddie Freeloader",
                    songTrackNumber = 2,
                    songIsFavorite = false
                ),
                Song(
                    id = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                    songDuration = "5:37",
                    songName = "Blue In Green",
                    songTrackNumber = 3,
                    songIsFavorite = false
                ),
                Song(
                    id = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                    songDuration = "11:32",
                    songName = "All Blues",
                    songTrackNumber = 4,
                    songIsFavorite = false
                ),
                Song(
                    id = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                    songDuration = "9:26",
                    songName = "Flamenco Sketches",
                    songTrackNumber = 5,
                    songIsFavorite = false
                ),
                Song(
                    id = "b165dfab-68e3-4cca-babb-ddf875687afb",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/7q3kkfAVpmcZ8g6JUThi3o?si=00879984be2a48ce",
                    songDuration = "9:22",
                    songName = "So What",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "8f6f58e2-ac95-4c8b-ad03-76ce0ad06412",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3NvYPUNu6nwQgN31UnoDbn?si=9a415adfcd4f43e3",
                    songDuration = "9:46",
                    songName = "Freddie Freeloader",
                    songTrackNumber = 2,
                    songIsFavorite = false
                ),
                Song(
                    id = "aa58a275-cd40-4986-8d1a-593d40b7a934",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/6bP4GyrKNbcKPMDqWJqpxI?si=2219ad5973fc4cab",
                    songDuration = "5:37",
                    songName = "Blue In Green",
                    songTrackNumber = 3,
                    songIsFavorite = false
                ),
                Song(
                    id = "d3d6ca38-cf1b-4151-9937-dd35cff2a336",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/0TUa7gBg7LJH6B8dkNVioU?si=d23c31e6e9e24c5c",
                    songDuration = "11:32",
                    songName = "All Blues",
                    songTrackNumber = 4,
                    songIsFavorite = false
                ),
                Song(
                    id = "4a6dfd30-ed2f-4cc3-9809-c2918f11e928",
                    songAlbumId = "2080f161-c553-408d-9724-9c1e2f1b8c87",
                    songArtists = "Miles Davis",
                    songAlbumArtUrl = "https://ia802703.us.archive.org/26/items/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf/mbid-e7ba3cb7-a074-45ee-870f-3baeb6d3e8bf-12708426541.jpg",
                    songSpotifyUrl = "https://open.spotify.com/track/3R3fcrKaeBr3U6s9R2belr?si=c7688a94b60e49f3",
                    songDuration = "9:26",
                    songName = "Flamenco Sketches",
                    songTrackNumber = 5,
                    songIsFavorite = false
                ),
                Song(
                    id = "2a53544d-18cd-4737-a0a1-c0c38b19d1eb",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4Ce66JznW8QbeyTdSzdGwR?si=46bd038005e2438e",
                    songDuration = "15:41",
                    songName = "Chameleon",
                    songTrackNumber = 1,
                    songIsFavorite = false
                ),
                Song(
                    id = "baa36752-1c21-4d34-9062-4da237b10cbc",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/2zQl59dZMzwhrmeSBEgiXY?si=6a4afcdd21204ba5",
                    songDuration = "6:28",
                    songName = "Watermelon Man",
                    songTrackNumber = 2,
                    songIsFavorite = false
                ),
                Song(
                    id = "76bdb16a-0906-47fd-aae2-10720ccd2f93",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/4WyVRn3L2uXnSUkY762gqN?si=c387e41f38204a3e",
                    songDuration = "10:15",
                    songName = "Sly",
                    songTrackNumber = 3,
                    songIsFavorite = false
                ),
                Song(
                    id = "4e9a4ff7-65a4-42a9-8c99-e6a34f4f68fa",
                    songAlbumId = "06e00675-980b-4435-be2e-5ec17d942865",
                    songArtists = "Herbie Hancock",
                    songAlbumArtUrl = "https://upload.wikimedia.org/wikipedia/en/5/54/Herbie-Hancock-Head-Hunters.png",
                    songSpotifyUrl = "https://open.spotify.com/track/6c0ziyel6ZMTQ37vKRooGZ?si=9502b7ddd6b84d9a",
                    songDuration = "9:09",
                    songName = "Vein Meter",
                    songTrackNumber = 4,
                    songIsFavorite = false
                )
            )
        )
        return songList
    }

}