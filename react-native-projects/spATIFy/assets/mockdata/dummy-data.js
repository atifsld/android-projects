import Song from '../models/Song'
import Album from '../models/Album';

const DUMMYDATA = {
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