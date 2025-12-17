package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Link_off: ImageVector
    get() {
        if (_Link_off != null) return _Link_off!!
        
        _Link_off = ImageVector.Builder(
            name = "link_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(770f, 658f)
                lineToRelative(-60f, -62f)
                quadToRelative(40f, -11f, 65f, -42.5f)
                reflectiveQuadToRelative(25f, -73.5f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 57f, -29.5f, 105f)
                reflectiveQuadTo(770f, 658f)
                close()
                moveTo(634f, 520f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(86f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(792f, 904f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(440f, 680f)
                horizontalLineTo(280f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -69f, 42f, -123f)
                reflectiveQuadToRelative(108f, -71f)
                lineToRelative(74f, 74f)
                horizontalLineToRelative(-24f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveTo(320f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(65f)
                lineToRelative(79f, 80f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Link_off!!
    }

private var _Link_off: ImageVector? = null

