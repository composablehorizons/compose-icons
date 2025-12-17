package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nest_eco_leaf: ImageVector
    get() {
        if (_Nest_eco_leaf != null) return _Nest_eco_leaf!!
        
        _Nest_eco_leaf = ImageVector.Builder(
            name = "nest_eco_leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(172f, 788f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(55f, -55f)
                quadToRelative(-32f, -41f, -49.5f, -91f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                quadToRelative(-56f, 0f, -105.5f, -17.5f)
                reflectiveQuadTo(284f, 733f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(162f, -162f)
                quadToRelative(11f, 13f, 28f, 12.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                lineToRelative(157f, -157f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(548f, 412f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                lineTo(334f, 570f)
                quadToRelative(-11f, 11f, -11f, 27.5f)
                reflectiveQuadToRelative(11f, 28.5f)
                close()
            }
        }.build()
        
        return _Nest_eco_leaf!!
    }

private var _Nest_eco_leaf: ImageVector? = null

