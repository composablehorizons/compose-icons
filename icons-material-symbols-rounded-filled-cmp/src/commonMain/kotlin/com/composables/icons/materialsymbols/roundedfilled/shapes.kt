package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Shapes: ImageVector
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
                moveToRelative(40f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 800f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -14f, 10.5f, -24.5f)
                reflectiveQuadTo(356f, 719f)
                quadToRelative(75f, 0f, 140f, -25f)
                reflectiveQuadToRelative(119f, -79f)
                quadToRelative(54f, -54f, 79f, -119f)
                reflectiveQuadToRelative(25f, -140f)
                quadToRelative(0f, -15f, 10.5f, -25.5f)
                reflectiveQuadTo(754f, 320f)
                horizontalLineToRelative(46f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Shapes!!
    }

private var _Shapes: ImageVector? = null

