package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_fix_off: ImageVector
    get() {
        if (_Auto_fix_off != null) return _Auto_fix_off!!
        
        _Auto_fix_off = ImageVector.Builder(
            name = "auto_fix_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 7f)
                lineToRelative(-0.95f, -2.05f)
                lineTo(17f, 4f)
                lineToRelative(2.05f, -0.95f)
                lineTo(20f, 1f)
                lineToRelative(0.95f, 2.05f)
                lineTo(23f, 4f)
                lineToRelative(-2.05f, 0.95f)
                close()
                moveToRelative(-4.45f, 5.7f)
                lineTo(11.3f, 8.45f)
                lineToRelative(2.875f, -2.875f)
                lineToRelative(4.25f, 4.25f)
                close()
                moveToRelative(4.25f, 9.9f)
                lineToRelative(-7.1f, -7.05f)
                lineToRelative(-6.875f, 6.875f)
                lineTo(1.6f, 18.15f)
                lineToRelative(6.85f, -6.85f)
                lineTo(1.4f, 4.2f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(18.4f, 18.4f)
                close()
            }
        }.build()
        
        return _Auto_fix_off!!
    }

private var _Auto_fix_off: ImageVector? = null

