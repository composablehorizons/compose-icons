package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bubble: ImageVector
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
                quadToRelative(-19f, 0f, -37f, -2f)
                reflectiveQuadToRelative(-36f, -6f)
                quadToRelative(-16f, -4f, -25.5f, -18f)
                reflectiveQuadToRelative(-5.5f, -30f)
                quadToRelative(4f, -16f, 18f, -25f)
                reflectiveQuadToRelative(30f, -5f)
                quadToRelative(14f, 3f, 28f, 4.5f)
                reflectiveQuadToRelative(28f, 1.5f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 14f, 1.5f, 27.5f)
                reflectiveQuadTo(206f, 535f)
                quadToRelative(4f, 17f, -5f, 30.5f)
                reflectiveQuadTo(175f, 583f)
                quadToRelative(-17f, 4f, -30.5f, -5f)
                reflectiveQuadTo(127f, 552f)
                quadToRelative(-4f, -18f, -5.5f, -36f)
                reflectiveQuadToRelative(-1.5f, -36f)
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

