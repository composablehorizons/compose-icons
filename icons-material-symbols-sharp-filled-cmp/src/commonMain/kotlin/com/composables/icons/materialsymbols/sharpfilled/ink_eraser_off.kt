package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ink_eraser_off: ImageVector
    get() {
        if (_Ink_eraser_off != null) return _Ink_eraser_off!!
        
        _Ink_eraser_off = ImageVector.Builder(
            name = "ink_eraser_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(602f, 716f)
                lineToRelative(-82f, 84f)
                horizontalLineTo(190f)
                lineTo(48f, 658f)
                lineToRelative(244f, -252f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-76f, -304f)
                lineTo(404f, 290f)
                lineToRelative(196f, -204f)
                lineToRelative(312f, 312f)
                lineToRelative(-197f, 203f)
                close()
            }
        }.build()
        
        return _Ink_eraser_off!!
    }

private var _Ink_eraser_off: ImageVector? = null

