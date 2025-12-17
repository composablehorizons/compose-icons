package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Toolbar: ImageVector
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
                moveTo(120f, 320f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(440f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Toolbar!!
    }

private var _Toolbar: ImageVector? = null

