package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pie_chart: ImageVector
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
                verticalLineToRelative(-356f)
                quadToRelative(143f, 15f, 241.5f, 114f)
                reflectiveQuadTo(876f, 440f)
                horizontalLineTo(520f)
                close()
                moveTo(441f, 875f)
                quadToRelative(-152f, -15f, -254.5f, -128f)
                reflectiveQuadTo(84f, 480f)
                quadToRelative(0f, -155f, 102.5f, -268f)
                reflectiveQuadTo(441f, 84f)
                verticalLineToRelative(791f)
                close()
                moveToRelative(79f, 0f)
                verticalLineToRelative(-356f)
                horizontalLineToRelative(356f)
                quadToRelative(-14f, 143f, -113.5f, 242.5f)
                reflectiveQuadTo(520f, 875f)
                close()
            }
        }.build()
        
        return _Pie_chart!!
    }

private var _Pie_chart: ImageVector? = null

