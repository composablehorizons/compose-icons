package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shapes: ImageVector
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
                moveTo(360f, 640f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(80f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(360f, 640f)
                close()
                moveTo(320f, 880f)
                verticalLineToRelative(-162f)
                quadToRelative(10f, 1f, 20f, 1.5f)
                reflectiveQuadToRelative(20f, 0.5f)
                quadToRelative(150f, 0f, 255f, -105f)
                reflectiveQuadToRelative(105f, -255f)
                quadToRelative(0f, -10f, -0.5f, -20f)
                reflectiveQuadToRelative(-1.5f, -20f)
                horizontalLineToRelative(162f)
                verticalLineToRelative(560f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Shapes!!
    }

private var _Shapes: ImageVector? = null

