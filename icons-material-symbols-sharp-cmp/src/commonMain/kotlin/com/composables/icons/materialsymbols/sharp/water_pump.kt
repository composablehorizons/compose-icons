package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Water_pump: ImageVector
    get() {
        if (_Water_pump != null) return _Water_pump!!
        
        _Water_pump = ImageVector.Builder(
            name = "water_pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                horizontalLineToRelative(164f)
                quadToRelative(-17f, -17f, -31.5f, -37f)
                reflectiveQuadTo(227f, 600f)
                horizontalLineTo(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(253f, -320f)
                horizontalLineToRelative(107f)
                verticalLineToRelative(-80f)
                horizontalLineTo(676f)
                quadToRelative(17f, 17f, 31.5f, 37f)
                reflectiveQuadToRelative(25.5f, 43f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(83f)
                quadToRelative(-2f, -10f, -2.5f, -19.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-83f)
                quadToRelative(2f, 10f, 2.5f, 19.5f)
                reflectiveQuadToRelative(0.5f, 20.5f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 760f)
                horizontalLineTo(120f)
                verticalLineToRelative(40f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(720f, -320f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -23f, 9.5f, -45.5f)
                reflectiveQuadTo(446f, 410f)
                lineToRelative(34f, -50f)
                lineToRelative(34f, 50f)
                quadToRelative(27f, 42f, 36.5f, 64.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
            }
        }.build()
        
        return _Water_pump!!
    }

private var _Water_pump: ImageVector? = null

