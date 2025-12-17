package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Line_start_circle: ImageVector
    get() {
        if (_Line_start_circle != null) return _Line_start_circle!!
        
        _Line_start_circle = ImageVector.Builder(
            name = "line_start_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(90f, 0f, 156.5f, 57f)
                reflectiveQuadTo(557f, 440f)
                horizontalLineToRelative(283f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(557f)
                quadToRelative(-14f, 86f, -80.5f, 143f)
                reflectiveQuadTo(320f, 720f)
                close()
            }
        }.build()
        
        return _Line_start_circle!!
    }

private var _Line_start_circle: ImageVector? = null

