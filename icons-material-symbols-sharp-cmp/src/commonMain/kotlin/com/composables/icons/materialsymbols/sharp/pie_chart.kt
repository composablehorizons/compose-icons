package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pie_chart: ImageVector
    get() {
        if (_Pie_chart != null) return _Pie_chart!!
        
        _Pie_chart = ImageVector.Builder(
            name = "pie_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 440f)
                horizontalLineToRelative(278f)
                quadToRelative(-15f, -110f, -91.5f, -186.5f)
                reflectiveQuadTo(520f, 162f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(-80f, 358f)
                verticalLineToRelative(-636f)
                quadToRelative(-121f, 15f, -200.5f, 105.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 122f, 79.5f, 212.5f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(110f, -14f, 187f, -91f)
                reflectiveQuadToRelative(91f, -187f)
                horizontalLineTo(520f)
                verticalLineToRelative(278f)
                close()
                moveToRelative(-40f, -318f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadTo(763f, 762.5f)
                quadToRelative(-54f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Pie_chart!!
    }

private var _Pie_chart: ImageVector? = null

