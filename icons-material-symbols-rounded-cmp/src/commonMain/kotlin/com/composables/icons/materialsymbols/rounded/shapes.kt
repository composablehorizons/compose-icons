package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shapes: ImageVector
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
                moveTo(400f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 760f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 320f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-40f, -240f)
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

