package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bubble: ImageVector
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
                moveTo(480f, 120f)
                quadToRelative(74f, 0f, 139.5f, 28.5f)
                reflectiveQuadTo(734f, 226f)
                quadToRelative(49f, 49f, 77.5f, 114.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 734f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-41f, 0f, -79f, -9f)
                reflectiveQuadToRelative(-76f, -26f)
                lineToRelative(61f, -61f)
                quadToRelative(23f, 8f, 46.5f, 12f)
                reflectiveQuadToRelative(47.5f, 4f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 24f, 4f, 47.5f)
                reflectiveQuadToRelative(12f, 46.5f)
                lineToRelative(-60f, 60f)
                quadToRelative(-18f, -36f, -27f, -74.5f)
                reflectiveQuadToRelative(-9f, -79.5f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 226f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 120f)
                close()
                moveToRelative(40f, 520f)
                verticalLineToRelative(-144f)
                lineTo(176f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(344f, -344f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Bubble!!
    }

private var _Bubble: ImageVector? = null

