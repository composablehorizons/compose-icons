package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                horizontalLineTo(122f)
                quadToRelative(-17f, 0f, -28.5f, -12.5f)
                reflectiveQuadTo(83f, 838f)
                quadToRelative(9f, -151f, 86f, -259.5f)
                reflectiveQuadTo(400f, 440f)
                verticalLineToRelative(-120f)
                quadToRelative(-39f, -5f, -88f, -19f)
                reflectiveQuadToRelative(-94.5f, -38f)
                quadTo(172f, 239f, 137f, 205.5f)
                reflectiveQuadTo(92f, 129f)
                quadToRelative(-5f, -19f, 6.5f, -34f)
                reflectiveQuadToRelative(31.5f, -15f)
                horizontalLineToRelative(700f)
                quadToRelative(20f, 0f, 31.5f, 15f)
                reflectiveQuadToRelative(6.5f, 34f)
                quadToRelative(-10f, 43f, -45f, 76.5f)
                reflectiveQuadTo(742.5f, 263f)
                quadTo(697f, 287f, 648f, 301f)
                reflectiveQuadToRelative(-88f, 19f)
                verticalLineToRelative(120f)
                quadToRelative(154f, 30f, 231f, 138.5f)
                reflectiveQuadTo(877f, 838f)
                quadToRelative(1f, 17f, -10.5f, 29.5f)
                reflectiveQuadTo(838f, 880f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(115f)
                quadToRelative(-18f, -152f, -113.5f, -220f)
                reflectiveQuadTo(480f, 512f)
                quadToRelative(-106f, 0f, -201.5f, 68f)
                reflectiveQuadTo(165f, 800f)
                horizontalLineToRelative(115f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 880f)
                close()
                moveToRelative(200f, -635f)
                quadToRelative(91f, 0f, 162f, -24.5f)
                reflectiveQuadTo(755f, 160f)
                horizontalLineTo(205f)
                quadToRelative(42f, 36f, 113f, 60.5f)
                reflectiveQuadTo(480f, 245f)
                close()
                moveToRelative(0f, 635f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -17f, 6.5f, -31f)
                reflectiveQuadToRelative(17.5f, -25f)
                quadToRelative(12f, -12f, 32.5f, -24.5f)
                reflectiveQuadTo(505f, 694f)
                lineToRelative(92f, -37f)
                quadToRelative(12f, -5f, 21.5f, 4.5f)
                reflectiveQuadTo(623f, 683f)
                lineToRelative(-37f, 92f)
                quadToRelative(-13f, 28f, -25.5f, 48.5f)
                reflectiveQuadTo(536f, 856f)
                quadToRelative(-11f, 11f, -25f, 17.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -635f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

