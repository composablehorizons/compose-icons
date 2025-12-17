package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mintmark: ImageVector
    get() {
        if (_Mintmark != null) return _Mintmark!!
        
        _Mintmark = ImageVector.Builder(
            name = "mintmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(184f)
                lineTo(520f, 576f)
                verticalLineToRelative(-112f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(-184f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineTo(520f)
                close()
                moveTo(240f, 680f)
                verticalLineToRelative(-40f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mintmark!!
    }

private var _Mintmark: ImageVector? = null

