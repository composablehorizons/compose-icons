package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Donut_small: ImageVector
    get() {
        if (_Donut_small != null) return _Donut_small!!
        
        _Donut_small = ImageVector.Builder(
            name = "donut_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(593f, 440f)
                quadToRelative(-9f, -26f, -27.5f, -45.5f)
                reflectiveQuadTo(521f, 366f)
                verticalLineToRelative(-284f)
                quadToRelative(143f, 14f, 243.5f, 114.5f)
                reflectiveQuadTo(879f, 440f)
                horizontalLineTo(593f)
                close()
                moveTo(441f, 878f)
                quadTo(287f, 863f, 184f, 749f)
                reflectiveQuadTo(81f, 480f)
                quadToRelative(0f, -155f, 103f, -269f)
                reflectiveQuadToRelative(257f, -129f)
                verticalLineToRelative(284f)
                quadToRelative(-36f, 13f, -58f, 44.5f)
                reflectiveQuadTo(361f, 480f)
                quadToRelative(0f, 38f, 22f, 68.5f)
                reflectiveQuadToRelative(58f, 43.5f)
                verticalLineToRelative(286f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(-286f)
                quadToRelative(26f, -9f, 44.5f, -27.5f)
                reflectiveQuadTo(593f, 520f)
                horizontalLineToRelative(286f)
                quadToRelative(-14f, 143f, -114.5f, 243.5f)
                reflectiveQuadTo(521f, 878f)
                close()
            }
        }.build()
        
        return _Donut_small!!
    }

private var _Donut_small: ImageVector? = null

