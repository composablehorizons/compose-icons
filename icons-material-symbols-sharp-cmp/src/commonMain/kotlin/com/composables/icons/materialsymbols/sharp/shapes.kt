package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shapes: ImageVector
    get() {
        if (_Shapes != null) return _Shapes!!
        
        _Shapes = ImageVector.Builder(
            name = "shapes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 600f)
                close()
                moveTo(320f, 718f)
                quadToRelative(10f, 1f, 19.5f, 1.5f)
                reflectiveQuadToRelative(20.5f, 0.5f)
                quadToRelative(11f, 0f, 20.5f, -0.5f)
                reflectiveQuadTo(400f, 718f)
                verticalLineToRelative(82f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-82f)
                quadToRelative(1f, -10f, 1.5f, -19.5f)
                reflectiveQuadToRelative(0.5f, -20.5f)
                quadToRelative(0f, -11f, -0.5f, -20.5f)
                reflectiveQuadTo(718f, 320f)
                horizontalLineToRelative(162f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                verticalLineToRelative(-162f)
                close()
                moveToRelative(40f, -78f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(360f, 640f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(360f, 160f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(160f, 360f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(0f, -200f)
                close()
            }
        }.build()
        
        return _Shapes!!
    }

private var _Shapes: ImageVector? = null

