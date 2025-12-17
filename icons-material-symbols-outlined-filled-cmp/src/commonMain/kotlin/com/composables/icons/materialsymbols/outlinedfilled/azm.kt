package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Azm: ImageVector
    get() {
        if (_Azm != null) return _Azm!!
        
        _Azm = ImageVector.Builder(
            name = "azm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 680f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-360f)
                horizontalLineTo(440f)
                lineTo(280f, 320f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(360f)
                close()
                moveTo(400f, 920f)
                lineToRelative(160f, -160f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                lineTo(40f, 560f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Azm!!
    }

private var _Azm: ImageVector? = null

