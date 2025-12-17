package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Autoplay: ImageVector
    get() {
        if (_Autoplay != null) return _Autoplay!!
        
        _Autoplay = ImageVector.Builder(
            name = "autoplay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 623f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -12f, 10.5f, -18f)
                reflectiveQuadToRelative(20.5f, 1f)
                lineToRelative(223f, 143f)
                quadToRelative(9f, 6f, 9f, 17f)
                reflectiveQuadToRelative(-9f, 17f)
                lineTo(411f, 640f)
                quadToRelative(-10f, 7f, -20.5f, 1f)
                reflectiveQuadTo(380f, 623f)
                close()
                moveTo(120f, 732f)
                verticalLineToRelative(68f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(80f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 600f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 680f)
                horizontalLineToRelative(-58f)
                quadToRelative(51f, 75f, 129.5f, 117.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(104f, 0f, 190f, -54f)
                reflectiveQuadToRelative(132f, -145f)
                quadToRelative(9f, -17f, 23.5f, -27f)
                reflectiveQuadToRelative(33.5f, -6f)
                quadToRelative(18f, 4f, 23.5f, 20.5f)
                reflectiveQuadTo(879f, 664f)
                quadToRelative(-54f, 116f, -161f, 186f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-108f, 0f, -202.5f, -49.5f)
                reflectiveQuadTo(120f, 732f)
                close()
                moveTo(83f, 440f)
                quadToRelative(-17f, 0f, -27.5f, -12.5f)
                reflectiveQuadTo(48f, 398f)
                quadToRelative(10f, -47f, 26f, -86.5f)
                reflectiveQuadToRelative(43f, -79.5f)
                quadToRelative(10f, -15f, 26f, -17f)
                reflectiveQuadToRelative(29f, 11f)
                quadToRelative(14f, 14f, 14f, 30.5f)
                reflectiveQuadTo(175f, 290f)
                quadToRelative(-17f, 26f, -27f, 52f)
                reflectiveQuadToRelative(-18f, 57f)
                quadToRelative(-4f, 18f, -16.5f, 29.5f)
                reflectiveQuadTo(83f, 440f)
                close()
                moveToRelative(357f, -358f)
                quadToRelative(0f, 19f, -11.5f, 31f)
                reflectiveQuadTo(398f, 129f)
                quadToRelative(-30f, 7f, -55.5f, 18f)
                reflectiveQuadTo(291f, 175f)
                quadToRelative(-16f, 11f, -32.5f, 10f)
                reflectiveQuadTo(228f, 170f)
                quadToRelative(-12f, -12f, -10.5f, -27.5f)
                reflectiveQuadTo(233f, 116f)
                quadToRelative(39f, -26f, 77.5f, -42.5f)
                reflectiveQuadTo(396f, 48f)
                quadToRelative(18f, -3f, 31f, 7f)
                reflectiveQuadToRelative(13f, 27f)
                close()
                moveToRelative(294f, 88f)
                quadToRelative(-14f, 14f, -31f, 14.5f)
                reflectiveQuadTo(670f, 174f)
                quadToRelative(-26f, -17f, -52f, -27f)
                reflectiveQuadToRelative(-57f, -18f)
                quadToRelative(-18f, -4f, -29.5f, -16.5f)
                reflectiveQuadTo(520f, 82f)
                quadToRelative(0f, -17f, 12.5f, -27f)
                reflectiveQuadToRelative(29.5f, -7f)
                quadToRelative(48f, 9f, 87f, 25f)
                reflectiveQuadToRelative(79f, 43f)
                quadToRelative(14f, 10f, 16f, 26f)
                reflectiveQuadToRelative(-10f, 28f)
                close()
                moveToRelative(144f, 270f)
                quadToRelative(-19f, 0f, -31f, -11.5f)
                reflectiveQuadTo(831f, 398f)
                quadToRelative(-8f, -31f, -18.5f, -56.5f)
                reflectiveQuadTo(785f, 289f)
                quadToRelative(-11f, -16f, -10f, -32.5f)
                reflectiveQuadToRelative(15f, -30.5f)
                quadToRelative(12f, -12f, 27.5f, -10f)
                reflectiveQuadToRelative(26.5f, 16f)
                quadToRelative(27f, 40f, 43f, 79f)
                reflectiveQuadToRelative(25f, 87f)
                quadToRelative(3f, 17f, -7f, 29.5f)
                reflectiveQuadTo(878f, 440f)
                close()
            }
        }.build()
        
        return _Autoplay!!
    }

private var _Autoplay: ImageVector? = null

