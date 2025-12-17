package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bubble: ImageVector
    get() {
        if (_Bubble != null) return _Bubble!!
        
        _Bubble = ImageVector.Builder(
            name = "bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-20f, 0f, -38.5f, -2f)
                reflectiveQuadToRelative(-36.5f, -6f)
                quadToRelative(-17f, -4f, -26f, -17f)
                reflectiveQuadToRelative(-5f, -30f)
                quadToRelative(4f, -17f, 17f, -26f)
                reflectiveQuadToRelative(30f, -5f)
                quadToRelative(14f, 3f, 29f, 4.5f)
                reflectiveQuadToRelative(30f, 1.5f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 15f, 1.5f, 29.5f)
                reflectiveQuadTo(206f, 538f)
                quadToRelative(4f, 17f, -5f, 30f)
                reflectiveQuadToRelative(-26f, 17f)
                quadToRelative(-17f, 4f, -30f, -5f)
                reflectiveQuadToRelative(-17f, -26f)
                quadToRelative(-4f, -18f, -6f, -36.5f)
                reflectiveQuadToRelative(-2f, -37.5f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 226f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(74f, 0f, 139.5f, 28.5f)
                reflectiveQuadTo(734f, 226f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 734f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(-332f, -28f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(316f, -316f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 360f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 400f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-104f)
                lineTo(204f, 812f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Bubble!!
    }

private var _Bubble: ImageVector? = null

