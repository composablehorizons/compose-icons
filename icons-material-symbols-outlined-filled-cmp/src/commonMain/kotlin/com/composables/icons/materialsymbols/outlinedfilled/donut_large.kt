package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Donut_large: ImageVector
    get() {
        if (_Donut_large != null) return _Donut_large!!
        
        _Donut_large = ImageVector.Builder(
            name = "donut_large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(441f, 878f)
                quadTo(287f, 863f, 184f, 749f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -155f, 103f, -269f)
                reflectiveQuadToRelative(257f, -129f)
                verticalLineToRelative(120f)
                quadToRelative(-104f, 14f, -172f, 93f)
                reflectiveQuadToRelative(-68f, 185f)
                quadToRelative(0f, 106f, 68f, 185f)
                reflectiveQuadToRelative(172f, 93f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-120f)
                quadToRelative(94f, -12f, 159f, -78f)
                reflectiveQuadToRelative(79f, -160f)
                horizontalLineToRelative(120f)
                quadToRelative(-14f, 143f, -114.5f, 243.5f)
                reflectiveQuadTo(521f, 878f)
                close()
                moveToRelative(238f, -438f)
                quadToRelative(-14f, -94f, -79f, -160f)
                reflectiveQuadToRelative(-159f, -78f)
                verticalLineToRelative(-120f)
                quadToRelative(143f, 14f, 243.5f, 114.5f)
                reflectiveQuadTo(879f, 440f)
                horizontalLineTo(759f)
                close()
            }
        }.build()
        
        return _Donut_large!!
    }

private var _Donut_large: ImageVector? = null

