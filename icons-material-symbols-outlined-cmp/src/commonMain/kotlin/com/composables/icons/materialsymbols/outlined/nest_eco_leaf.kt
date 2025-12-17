package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Nest_eco_leaf: ImageVector
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
                moveTo(480f, 800f)
                quadToRelative(-56f, 0f, -105.5f, -17.5f)
                reflectiveQuadTo(284f, 733f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(55f, -55f)
                quadToRelative(-32f, -41f, -49.5f, -91f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 39f, 12f, 74.5f)
                reflectiveQuadToRelative(33f, 64.5f)
                lineToRelative(207f, -207f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(548f, 469f)
                lineTo(341f, 676f)
                quadToRelative(29f, 21f, 64.5f, 32.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(0f, -240f)
                close()
            }
        }.build()
        
        return _Nest_eco_leaf!!
    }

private var _Nest_eco_leaf: ImageVector? = null

