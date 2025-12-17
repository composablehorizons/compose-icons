package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lan: ImageVector
    get() {
        if (_Lan != null) return _Lan!!
        
        _Lan = ImageVector.Builder(
            name = "lan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(280f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Lan!!
    }

private var _Lan: ImageVector? = null

