package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Table_sign: ImageVector
    get() {
        if (_Table_sign != null) return _Table_sign!!
        
        _Table_sign = ImageVector.Builder(
            name = "table_sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 360f)
                close()
                moveTo(200f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-110f)
                quadToRelative(-18f, -11f, -29f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(520f, 689f)
                verticalLineToRelative(111f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(-80f, -240f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(560f)
                horizontalLineTo(639f)
                quadToRelative(2f, -20f, -0.5f, -40.5f)
                reflectiveQuadTo(628f, 560f)
                horizontalLineToRelative(132f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(131f)
                quadToRelative(-8f, 19f, -10f, 39.5f)
                reflectiveQuadToRelative(0f, 40.5f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Table_sign!!
    }

private var _Table_sign: ImageVector? = null

