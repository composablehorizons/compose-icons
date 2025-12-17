package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Surfing: ImageVector
    get() {
        if (_Surfing != null) return _Surfing!!
        
        _Surfing = ImageVector.Builder(
            name = "surfing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(32f, 0f, 62f, -10f)
                reflectiveQuadToRelative(58f, -30f)
                quadToRelative(28f, 20f, 58f, 29.5f)
                reflectiveQuadToRelative(62f, 9.5f)
                quadToRelative(32f, 0f, 62.5f, -9.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(28f, 20f, 58f, 29.5f)
                reflectiveQuadToRelative(62f, 9.5f)
                quadToRelative(32f, 0f, 62.5f, -9.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(27f, 20f, 57.5f, 30f)
                reflectiveQuadToRelative(62.5f, 10f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(720f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(480f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(360f, 920f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(240f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(120f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(260f, -760f)
                lineToRelative(222f, 41f)
                quadToRelative(14f, 2f, 27f, 11f)
                reflectiveQuadToRelative(22f, 25f)
                lineToRelative(35f, 62f)
                quadToRelative(26f, 45f, 72f, 73f)
                reflectiveQuadToRelative(102f, 28f)
                verticalLineToRelative(80f)
                quadToRelative(-78f, 0f, -142f, -39f)
                reflectiveQuadTo(577f, 339f)
                lineToRelative(-90f, 61f)
                lineToRelative(153f, 120f)
                verticalLineToRelative(154f)
                quadToRelative(16f, 11f, 31f, 23f)
                reflectiveQuadToRelative(29f, 23f)
                quadToRelative(-21f, 18f, -46f, 29f)
                reflectiveQuadToRelative(-54f, 11f)
                quadToRelative(-36f, 0f, -67f, -17f)
                reflectiveQuadToRelative(-53f, -43f)
                quadToRelative(-22f, 26f, -53f, 43f)
                reflectiveQuadToRelative(-67f, 17f)
                quadToRelative(-10f, 0f, -19.5f, -1.5f)
                reflectiveQuadTo(322f, 754f)
                quadToRelative(-86f, -59f, -144f, -119f)
                reflectiveQuadToRelative(-58f, -104f)
                quadToRelative(0f, -31f, 24f, -41f)
                reflectiveQuadToRelative(50f, -10f)
                quadToRelative(29f, 0f, 67f, 8.5f)
                reflectiveQuadToRelative(81f, 24.5f)
                lineToRelative(-21f, -124f)
                quadToRelative(-4f, -20f, 4.5f, -39.5f)
                reflectiveQuadTo(352f, 318f)
                lineToRelative(86f, -58f)
                quadToRelative(-3f, 0f, -14.5f, -2.5f)
                reflectiveQuadToRelative(-25.5f, -5f)
                reflectiveQuadToRelative(-25.5f, -5f)
                quadTo(361f, 245f, 358f, 245f)
                lineToRelative(-113f, 77f)
                lineToRelative(-45f, -66f)
                lineToRelative(140f, -96f)
                close()
                moveToRelative(72f, 284f)
                lineToRelative(18f, 106f)
                quadToRelative(27f, 13f, 67f, 34.5f)
                reflectiveQuadToRelative(63f, 35.5f)
                verticalLineToRelative(-60f)
                lineTo(412f, 444f)
                close()
                moveToRelative(268f, -224f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(680f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 220f)
                close()
            }
        }.build()
        
        return _Surfing!!
    }

private var _Surfing: ImageVector? = null

