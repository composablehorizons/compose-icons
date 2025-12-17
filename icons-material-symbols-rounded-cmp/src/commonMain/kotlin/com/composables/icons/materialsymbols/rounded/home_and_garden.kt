package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Home_and_garden: ImageVector
    get() {
        if (_Home_and_garden != null) return _Home_and_garden!!
        
        _Home_and_garden = ImageVector.Builder(
            name = "home_and_garden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 101f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(360f, 275f)
                quadToRelative(13f, 10f, 15f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -9f)
                lineTo(480f, 180f)
                lineTo(240f, 364f)
                verticalLineToRelative(356f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-13f, 10f, -29.5f, 8f)
                reflectiveQuadTo(64f, 448f)
                quadToRelative(-10f, -13f, -7.5f, -29f)
                reflectiveQuadTo(72f, 393f)
                lineToRelative(359f, -276f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                close()
                moveToRelative(0f, 389f)
                close()
                moveTo(700f, 895f)
                quadToRelative(-42f, 29f, -92.5f, 24.5f)
                reflectiveQuadTo(521f, 879f)
                quadToRelative(-36f, -36f, -40.5f, -86.5f)
                reflectiveQuadTo(505f, 700f)
                quadToRelative(-29f, -42f, -24.5f, -92.5f)
                reflectiveQuadTo(521f, 521f)
                quadToRelative(36f, -36f, 86.5f, -40.5f)
                reflectiveQuadTo(700f, 505f)
                quadToRelative(42f, -29f, 92.5f, -24.5f)
                reflectiveQuadTo(879f, 521f)
                quadToRelative(36f, 36f, 40.5f, 86.5f)
                reflectiveQuadTo(895f, 700f)
                quadToRelative(29f, 42f, 24.5f, 92.5f)
                reflectiveQuadTo(879f, 879f)
                quadToRelative(-36f, 36f, -86.5f, 40.5f)
                reflectiveQuadTo(700f, 895f)
                close()
                moveToRelative(0f, -98f)
                lineToRelative(46f, 32f)
                quadToRelative(18f, 13f, 39f, 11f)
                reflectiveQuadToRelative(37f, -18f)
                quadToRelative(16f, -16f, 18f, -37f)
                reflectiveQuadToRelative(-11f, -39f)
                lineToRelative(-32f, -46f)
                lineToRelative(32f, -46f)
                quadToRelative(13f, -18f, 11f, -39f)
                reflectiveQuadToRelative(-18f, -37f)
                quadToRelative(-16f, -16f, -37f, -18f)
                reflectiveQuadToRelative(-39f, 11f)
                lineToRelative(-46f, 32f)
                lineToRelative(-46f, -32f)
                quadToRelative(-18f, -13f, -39f, -11f)
                reflectiveQuadToRelative(-37f, 18f)
                quadToRelative(-16f, 16f, -18f, 37f)
                reflectiveQuadToRelative(11f, 39f)
                lineToRelative(32f, 46f)
                lineToRelative(-32f, 46f)
                quadToRelative(-13f, 18f, -11f, 39f)
                reflectiveQuadToRelative(18f, 37f)
                quadToRelative(16f, 16f, 37f, 18f)
                reflectiveQuadToRelative(39f, -11f)
                lineToRelative(46f, -32f)
                close()
                moveToRelative(0f, -47f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(750f, 700f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(700f, 650f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(650f, 700f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(700f, 750f)
                close()
                moveToRelative(0f, -50f)
                close()
            }
        }.build()
        
        return _Home_and_garden!!
    }

private var _Home_and_garden: ImageVector? = null

