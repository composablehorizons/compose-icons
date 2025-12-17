package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ink_eraser: ImageVector
    get() {
        if (_Ink_eraser != null) return _Ink_eraser!!
        
        _Ink_eraser = ImageVector.Builder(
            name = "ink_eraser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(690f, 720f)
                horizontalLineToRelative(190f)
                verticalLineToRelative(80f)
                horizontalLineTo(610f)
                lineToRelative(80f, -80f)
                close()
                moveToRelative(-500f, 80f)
                lineTo(48f, 658f)
                lineToRelative(552f, -572f)
                lineToRelative(312f, 312f)
                lineToRelative(-392f, 402f)
                horizontalLineTo(190f)
                close()
                moveToRelative(296f, -80f)
                lineToRelative(314f, -322f)
                lineToRelative(-198f, -198f)
                lineToRelative(-442f, 456f)
                lineToRelative(64f, 64f)
                horizontalLineToRelative(262f)
                close()
                moveToRelative(-6f, -240f)
                close()
            }
        }.build()
        
        return _Ink_eraser!!
    }

private var _Ink_eraser: ImageVector? = null

