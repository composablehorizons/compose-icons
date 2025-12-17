package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Screen_lock_landscape: ImageVector
    get() {
        if (_Screen_lock_landscape != null) return _Screen_lock_landscape!!
        
        _Screen_lock_landscape = ImageVector.Builder(
            name = "screen_lock_landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(560f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(400f)
                close()
                moveTo(160f, 280f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(640f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(360f, 640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 400f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Screen_lock_landscape!!
    }

private var _Screen_lock_landscape: ImageVector? = null

