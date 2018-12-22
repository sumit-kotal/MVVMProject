package com.aztechz.projectbinaryveda.Network

import com.aztechz.projectbinaryveda.Models.Seeker
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface Api {

    @get:Headers("$key:$value")
    @get:GET("438")
    val seeker: Call<Seeker>

    companion object {

        const val key = "Authorization"
        const val value = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjU0YjZiNDY3ZjcxM2YzNzgwM2MyYzdhYzJhNTYyOTcyOGU3NDc3OTMyOWNhYzBkNmM2MzY5MDVhMzFlNzcwMzNiMzFjYTgwNjJhMDczNDQzIn0.eyJhdWQiOiIzIiwianRpIjoiNTRiNmI0NjdmNzEzZjM3ODAzYzJjN2FjMmE1NjI5NzI4ZTc0Nzc5MzI5Y2FjMGQ2YzYzNjkwNWEzMWU3NzAzM2IzMWNhODA2MmEwNzM0NDMiLCJpYXQiOjE1NDUyMTgzMzAsIm5iZiI6MTU0NTIxODMzMCwiZXhwIjoxNTc2NzU0MzMwLCJzdWIiOiI0NDMiLCJzY29wZXMiOltdfQ.CXy81AaZj0NwutZQKdjjrqk_jCbiBUHmI-9rxP_qpOPIF3e7jAoiiH6WOud7G4ebXSQjO9pqrew6tAyeptTI6cMgIyUEtHZD0aEZ2KzwsSXuN6Z9QIvpgATer586KM2VYtHXh7qSMH5OIG0rhJtFPfqL55KvvpRCEsh0mjAjBP5XaL2XYJbESGAYpwjVXOUP-XpOHYr0YroU1V82-n64u9BGCaEqLBv5O7QFrIKJf-5OSH5m7vyU1WArO2UWdyK-1mGEX7-oBi2g_u0t9iAOk7JfllKzWXQsvIAl2f48xriEo0lUYPR13DUUKfzLdW95uk4dwo_W204Y9Va2inVpnbsZBOUa-qBT1gzUKRT3N0p7GqSIscbTiYNThorMiC62xwHIHjH2PY5rcGvESb5wUZUkOMMygS2jbMA7brq35COurdGJvPwWN5UaXZECttvaUgK89riKD528Ly28_RaT8Mp31BmduYRUGAkRPSiovGzIJCQisDRozcS-cm1tmtgf2AqtsJLr7coQErwjKwzmfoHDN2pg-lDetsH8r6OII59ifbXIOopnVi53bIHE31EsbGfTUmg7iL-4R5shpe_8FgHBiE0vrvcjLA80EjQaXaWrxtXQiZQv1fRdRtw3c_oRhl_Ycry5wzZw0uWLA7hHQorJq1sJWkAa1W_PVTuBXxM"


        const val BASE_URL = "https://apistage.thewift.com/1.0/profiles/"
    }
}
