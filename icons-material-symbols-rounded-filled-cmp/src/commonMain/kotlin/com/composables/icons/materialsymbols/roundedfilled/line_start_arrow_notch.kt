package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Line_start_arrow_notch: ImageVector
    get() {
        if (_Line_start_arrow_notch != null) return _Line_start_arrow_notch!!
        
        _Line_start_arrow_notch = ImageVector.Builder(
            name = "line_start_arrow_notch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383f, 520f)
                lineToRelative(97f, 170f)
                quadToRelative(8f, 14f, -3f, 24.5f)
                reflectiveQuadToRelative(-25f, 2.5f)
                lineTo(133f, 514f)
                quadToRelative(-19f, -12f, -19f, -34f)
                reflectiveQuadToRelative(19f, -34f)
                lineToRelative(319f, -203f)
                quadToRelative(14f, -8f, 25f, 2.5f)
                reflectiveQuadToRelative(3f, 24.5f)
                lineToRelative(-97f, 170f)
                horizontalLineToRelative(457f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(383f)
                close()
            }
        }.build()
        
        return _Line_start_arrow_notch!!
    }

private var _Line_start_arrow_notch: ImageVector? = null

