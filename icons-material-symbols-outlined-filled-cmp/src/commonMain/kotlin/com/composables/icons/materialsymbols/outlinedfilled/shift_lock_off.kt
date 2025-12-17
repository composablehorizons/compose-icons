package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shift_lock_off: ImageVector
    get() {
        if (_Shift_lock_off != null) return _Shift_lock_off!!
        
        _Shift_lock_off = ImageVector.Builder(
            name = "shift_lock_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-200f)
                horizontalLineTo(120f)
                lineToRelative(180f, -221f)
                lineToRelative(340f, 340f)
                verticalLineToRelative(81f)
                horizontalLineTo(320f)
                close()
                moveToRelative(314f, -200f)
                lineTo(351f, 237f)
                lineToRelative(129f, -157f)
                lineToRelative(360f, 440f)
                horizontalLineTo(634f)
                close()
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Shift_lock_off!!
    }

private var _Shift_lock_off: ImageVector? = null

