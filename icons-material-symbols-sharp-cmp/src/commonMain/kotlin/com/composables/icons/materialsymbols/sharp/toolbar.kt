package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Toolbar: ImageVector
    get() {
        if (_Toolbar != null) return _Toolbar!!
        
        _Toolbar = ImageVector.Builder(
            name = "toolbar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -520f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(560f, 80f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-360f)
                close()
                moveToRelative(-560f, -80f)
                verticalLineToRelative(80f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 80f)
                verticalLineToRelative(360f)
                verticalLineToRelative(-360f)
                close()
            }
        }.build()
        
        return _Toolbar!!
    }

private var _Toolbar: ImageVector? = null

