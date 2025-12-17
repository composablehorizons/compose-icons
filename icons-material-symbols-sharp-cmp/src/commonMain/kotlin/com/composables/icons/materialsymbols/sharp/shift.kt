package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shift: ImageVector
    get() {
        if (_Shift != null) return _Shift!!
        
        _Shift = ImageVector.Builder(
            name = "shift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-320f)
                horizontalLineTo(120f)
                lineToRelative(360f, -440f)
                lineToRelative(360f, 440f)
                horizontalLineTo(640f)
                verticalLineToRelative(320f)
                horizontalLineTo(320f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(111f)
                lineTo(480f, 206f)
                lineTo(289f, 440f)
                horizontalLineToRelative(111f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(80f, -320f)
                close()
            }
        }.build()
        
        return _Shift!!
    }

private var _Shift: ImageVector? = null

