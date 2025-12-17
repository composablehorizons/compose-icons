package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stairs: ImageVector
    get() {
        if (_Stairs != null) return _Stairs!!
        
        _Stairs = ImageVector.Builder(
            name = "stairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineToRelative(177f)
                verticalLineToRelative(-133f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(-133f)
                horizontalLineToRelative(103f)
                verticalLineToRelative(-134f)
                horizontalLineToRelative(97f)
                verticalLineToRelative(-80f)
                horizontalLineTo(543f)
                verticalLineToRelative(133f)
                horizontalLineTo(440f)
                verticalLineToRelative(133f)
                horizontalLineTo(337f)
                verticalLineToRelative(134f)
                horizontalLineToRelative(-97f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Stairs!!
    }

private var _Stairs: ImageVector? = null

