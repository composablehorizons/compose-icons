package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hearing_aid: ImageVector
    get() {
        if (_Hearing_aid != null) return _Hearing_aid!!
        
        _Hearing_aid = ImageVector.Builder(
            name = "hearing_aid",
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
                quadToRelative(118f, 0f, 199f, 81f)
                reflectiveQuadToRelative(81f, 199f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -85f, -57.5f, -142.5f)
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
                lineToRelative(-68f, 54f)
                lineToRelative(-100f, -176f)
                quadToRelative(-61f, 5f, -106f, -36.5f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(65f, 0f, 106.5f, 49f)
                reflectiveQuadTo(698f, 381f)
                lineToRelative(165f, 143f)
                lineToRelative(-60f, 48f)
                quadToRelative(20f, 32f, 28.5f, 70.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(248f, 670f)
                quadToRelative(-62f, -63f, -95f, -143.5f)
                reflectiveQuadTo(120f, 360f)
                quadToRelative(0f, -88f, 33f, -168.5f)
                reflectiveQuadTo(248f, 48f)
                lineToRelative(58f, 56f)
                quadToRelative(-51f, 51f, -78.5f, 117f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, 72f, 27.5f, 137.5f)
                reflectiveQuadTo(306f, 614f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(447f, -114f)
                lineToRelative(42f, -34f)
                lineToRelative(-75f, -66f)
                lineToRelative(-7.5f, 7.5f)
                quadTo(651f, 467f, 647f, 470f)
                lineToRelative(48f, 86f)
                close()
                moveTo(560f, 420f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(620f, 360f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(560f, 300f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(500f, 360f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(560f, 420f)
                close()
                moveToRelative(132f, 86f)
                close()
                moveTo(560f, 360f)
                close()
            }
        }.build()
        
        return _Hearing_aid!!
    }

private var _Hearing_aid: ImageVector? = null

