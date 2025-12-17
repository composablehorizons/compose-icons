package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Auto_fix_normal: ImageVector
    get() {
        if (_Auto_fix_normal != null) return _Auto_fix_normal!!
        
        _Auto_fix_normal = ImageVector.Builder(
            name = "auto_fix_normal",
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
                moveTo(5.825f, 22.425f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(12.6f, -12.6f)
                lineToRelative(4.25f, 4.25f)
                close()
                moveToRelative(8.35f, -11.2f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-1.4f, -1.4f)
                lineToRelative(-1.4f, 1.4f)
                close()
            }
        }.build()
        
        return _Auto_fix_normal!!
    }

private var _Auto_fix_normal: ImageVector? = null

