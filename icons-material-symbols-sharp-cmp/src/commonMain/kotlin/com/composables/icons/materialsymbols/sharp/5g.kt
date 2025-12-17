package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`5g`: ImageVector
    get() {
        if (_5g != null) return _5g!!
        
        _5g = ImageVector.Builder(
            name = "5g",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(120f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(720f, -240f)
                verticalLineToRelative(240f)
                horizontalLineTo(480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(660f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _5g!!
    }

private var _5g: ImageVector? = null

