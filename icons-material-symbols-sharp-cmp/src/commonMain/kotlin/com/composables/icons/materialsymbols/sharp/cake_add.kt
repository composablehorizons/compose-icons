package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cake_add: ImageVector
    get() {
        if (_Cake_add != null) return _Cake_add!!
        
        _Cake_add = ImageVector.Builder(
            name = "cake_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-58f)
                quadToRelative(-18f, -12f, -29f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                quadToRelative(12f, 12f, 18f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 24f, -11f, 41f)
                reflectiveQuadToRelative(-29f, 29f)
                verticalLineToRelative(58f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -320f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-80f, 240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, -240f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
                moveToRelative(-80f, 240f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
                moveToRelative(560f, -240f)
                horizontalLineTo(160f)
                horizontalLineToRelative(560f)
                close()
                moveToRelative(40f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Cake_add!!
    }

private var _Cake_add: ImageVector? = null

