package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_sign: ImageVector
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
                moveTo(480f, 540f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(520f, 689f)
                verticalLineToRelative(111f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-110f)
                quadToRelative(-18f, -11f, -29f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                close()
                moveTo(280f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                close()
                moveTo(120f, 640f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(560f)
                horizontalLineTo(639f)
                quadToRelative(5f, -35f, -6f, -67.5f)
                reflectiveQuadTo(600f, 515f)
                quadToRelative(-9f, -11f, -20f, -19.5f)
                reflectiveQuadTo(557f, 480f)
                horizontalLineToRelative(123f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(122f)
                quadToRelative(-12f, 7f, -23f, 15f)
                reflectiveQuadToRelative(-20f, 19f)
                quadToRelative(-22f, 25f, -32.5f, 57.5f)
                reflectiveQuadTo(321f, 640f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Table_sign!!
    }

private var _Table_sign: ImageVector? = null

