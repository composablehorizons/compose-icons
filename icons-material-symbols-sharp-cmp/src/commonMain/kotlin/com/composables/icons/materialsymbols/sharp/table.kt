package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Table: ImageVector
    get() {
        if (_Table != null) return _Table!!
        
        _Table = ImageVector.Builder(
            name = "table",
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
                moveToRelative(80f, -480f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(213f, 200f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-120f)
                horizontalLineTo(413f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(134f)
                verticalLineToRelative(-120f)
                horizontalLineTo(413f)
                verticalLineToRelative(120f)
                close()
                moveTo(200f, 560f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(427f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(627f)
                verticalLineToRelative(120f)
                close()
                moveTo(200f, 760f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(427f, 0f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(627f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Table!!
    }

private var _Table: ImageVector? = null

