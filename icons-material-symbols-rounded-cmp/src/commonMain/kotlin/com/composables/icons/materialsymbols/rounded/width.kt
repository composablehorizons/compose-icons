package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Width: ImageVector
    get() {
        if (_Width != null) return _Width!!
        
        _Width = ImageVector.Builder(
            name = "width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(273f, 520f)
                lineToRelative(35f, 37f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(308f, 612f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(252f, 612f)
                lineTo(148f, 509f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(308f, 405f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(414f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(103f, 104f)
                quadToRelative(6f, 6f, 9f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-9f, 13.5f)
                lineTo(707f, 613f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(651f, 612f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(36f, -37f)
                horizontalLineTo(273f)
                close()
            }
        }.build()
        
        return _Width!!
    }

private var _Width: ImageVector? = null

