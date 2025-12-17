package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flyover: ImageVector
    get() {
        if (_Flyover != null) return _Flyover!!
        
        _Flyover = ImageVector.Builder(
            name = "flyover",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 429f)
                lineToRelative(-20f, 4f)
                lineToRelative(-20f, 4f)
                quadToRelative(-17f, 4f, -28.5f, -8.5f)
                reflectiveQuadTo(80f, 399f)
                quadToRelative(0f, -14f, 9.5f, -26.5f)
                reflectiveQuadTo(121f, 355f)
                quadToRelative(89f, -19f, 178.5f, -27f)
                reflectiveQuadToRelative(180.5f, -8f)
                quadToRelative(91f, 0f, 181f, 8f)
                reflectiveQuadToRelative(179f, 27f)
                quadToRelative(22f, 5f, 31.5f, 17.5f)
                reflectiveQuadTo(881f, 399f)
                quadToRelative(0f, 17f, -11.5f, 30f)
                reflectiveQuadToRelative(-28.5f, 9f)
                lineToRelative(-20f, -4f)
                quadToRelative(-10f, -2f, -21f, -4f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 520f)
                verticalLineToRelative(-104f)
                quadToRelative(-60f, -8f, -120f, -12f)
                reflectiveQuadToRelative(-120f, -4f)
                quadToRelative(-60f, 0f, -120f, 3.5f)
                reflectiveQuadTo(240f, 415f)
                verticalLineToRelative(105f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 520f)
                verticalLineToRelative(-91f)
                close()
                moveToRelative(88f, 365f)
                lineToRelative(45f, -274f)
                quadToRelative(2f, -14f, 12f, -23f)
                reflectiveQuadToRelative(24f, -10f)
                quadToRelative(20f, -2f, 32.5f, 12.5f)
                reflectiveQuadTo(371f, 533f)
                lineToRelative(-46f, 274f)
                quadToRelative(-2f, 14f, -13f, 23.5f)
                reflectiveQuadToRelative(-25f, 9.5f)
                quadToRelative(-18f, 0f, -30f, -14f)
                reflectiveQuadToRelative(-9f, -32f)
                close()
                moveToRelative(99f, -599f)
                lineToRelative(8f, -42f)
                quadToRelative(2f, -14f, 13f, -23.5f)
                reflectiveQuadToRelative(25f, -9.5f)
                quadToRelative(18f, 0f, 30f, 14f)
                reflectiveQuadToRelative(9f, 32f)
                lineToRelative(-7f, 43f)
                quadToRelative(-2f, 14f, -12f, 22.5f)
                reflectiveQuadToRelative(-24f, 9.5f)
                quadToRelative(-19f, 2f, -32f, -12.5f)
                reflectiveQuadTo(347f, 195f)
                close()
                moveToRelative(93f, 525f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 720f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                verticalLineToRelative(-39f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 481f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 521f)
                verticalLineToRelative(39f)
                close()
                moveToRelative(173f, -364f)
                quadToRelative(3f, 19f, -9.5f, 33f)
                reflectiveQuadTo(571f, 241f)
                quadToRelative(-14f, -1f, -24f, -10f)
                reflectiveQuadToRelative(-12f, -23f)
                lineToRelative(-7f, -42f)
                quadToRelative(-3f, -18f, 9f, -32f)
                reflectiveQuadToRelative(30f, -14f)
                quadToRelative(14f, 0f, 25f, 9.5f)
                reflectiveQuadToRelative(13f, 23.5f)
                lineToRelative(8f, 43f)
                close()
                moveToRelative(99f, 598f)
                quadToRelative(3f, 18f, -9f, 32f)
                reflectiveQuadToRelative(-30f, 14f)
                quadToRelative(-14f, 0f, -25f, -9.5f)
                reflectiveQuadTo(635f, 807f)
                lineToRelative(-46f, -274f)
                quadToRelative(-3f, -19f, 9.5f, -33.5f)
                reflectiveQuadTo(631f, 487f)
                quadToRelative(14f, 2f, 24f, 10.5f)
                reflectiveQuadToRelative(12f, 22.5f)
                lineToRelative(45f, 274f)
                close()
            }
        }.build()
        
        return _Flyover!!
    }

private var _Flyover: ImageVector? = null

