package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shift_lock: ImageVector
    get() {
        if (_Shift_lock != null) return _Shift_lock!!
        
        _Shift_lock = ImageVector.Builder(
            name = "shift_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                verticalLineToRelative(-200f)
                horizontalLineTo(120f)
                lineToRelative(360f, -440f)
                lineToRelative(360f, 440f)
                horizontalLineTo(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Shift_lock!!
    }

private var _Shift_lock: ImageVector? = null

