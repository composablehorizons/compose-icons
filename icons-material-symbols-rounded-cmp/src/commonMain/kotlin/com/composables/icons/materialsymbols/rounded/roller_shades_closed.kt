package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Roller_shades_closed: ImageVector
    get() {
        if (_Roller_shades_closed != null) return _Roller_shades_closed!!
        
        _Roller_shades_closed = ImageVector.Builder(
            name = "roller_shades_closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 910f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(410f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(550f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(480f, 910f)
                close()
                moveTo(240f, 600f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(280f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 200f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Roller_shades_closed!!
    }

private var _Roller_shades_closed: ImageVector? = null

