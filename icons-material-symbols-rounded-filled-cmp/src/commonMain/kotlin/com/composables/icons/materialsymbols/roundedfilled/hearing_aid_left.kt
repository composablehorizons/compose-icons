package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hearing_aid_left: ImageVector
    get() {
        if (_Hearing_aid_left != null) return _Hearing_aid_left!!
        
        _Hearing_aid_left = ImageVector.Builder(
            name = "hearing_aid_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-57f, 0f, -100f, -34f)
                reflectiveQuadToRelative(-62f, -90f)
                quadToRelative(-17f, -50f, -36.5f, -74f)
                reflectiveQuadTo(417f, 626f)
                quadToRelative(-67f, -48f, -102f, -119.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, -118f, 81f, -199f)
                reflectiveQuadToRelative(199f, -81f)
                quadToRelative(106f, 0f, 182.5f, 65.5f)
                reflectiveQuadTo(836f, 312f)
                quadToRelative(3f, 17f, -6.5f, 30f)
                reflectiveQuadTo(803f, 358f)
                quadToRelative(-17f, 3f, -30f, -6.5f)
                reflectiveQuadTo(757f, 325f)
                quadToRelative(-12f, -72f, -67f, -118.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(-85f, 0f, -142.5f, 57.5f)
                reflectiveQuadTo(360f, 360f)
                quadToRelative(0f, 59f, 28f, 113.5f)
                reflectiveQuadToRelative(79f, 90.5f)
                quadToRelative(48f, 34f, 76.5f, 65.5f)
                reflectiveQuadTo(589f, 715f)
                quadToRelative(11f, 35f, 33.5f, 60f)
                reflectiveQuadToRelative(57.5f, 25f)
                quadToRelative(32f, 0f, 56f, -23.5f)
                reflectiveQuadToRelative(24f, -56.5f)
                quadToRelative(0f, -26f, -5f, -51.5f)
                reflectiveQuadTo(739f, 622f)
                lineToRelative(-32f, 25f)
                quadToRelative(-14f, 11f, -32f, 8f)
                reflectiveQuadToRelative(-27f, -19f)
                lineToRelative(-77f, -136f)
                quadToRelative(-61f, 5f, -106f, -36.5f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(65f, 0f, 106.5f, 49f)
                reflectiveQuadTo(698f, 381f)
                lineToRelative(129f, 112f)
                quadToRelative(14f, 12f, 13f, 30.5f)
                reflectiveQuadTo(825f, 554f)
                lineToRelative(-22f, 18f)
                quadToRelative(20f, 32f, 28.5f, 70.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(277f, 642f)
                quadToRelative(-12f, 12f, -28.5f, 11f)
                reflectiveQuadTo(221f, 639f)
                quadToRelative(-49f, -60f, -75f, -131.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(0f, -78f, 26f, -150f)
                reflectiveQuadToRelative(75f, -132f)
                quadToRelative(11f, -13f, 27.5f, -13.5f)
                reflectiveQuadTo(277f, 76f)
                quadToRelative(12f, 12f, 12.5f, 28.5f)
                reflectiveQuadTo(279f, 135f)
                quadToRelative(-38f, 48f, -58.5f, 105f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, 62f, 20.5f, 119f)
                reflectiveQuadTo(279f, 584f)
                quadToRelative(11f, 14f, 10.5f, 30.5f)
                reflectiveQuadTo(277f, 642f)
                close()
            }
        }.build()
        
        return _Hearing_aid_left!!
    }

private var _Hearing_aid_left: ImageVector? = null

