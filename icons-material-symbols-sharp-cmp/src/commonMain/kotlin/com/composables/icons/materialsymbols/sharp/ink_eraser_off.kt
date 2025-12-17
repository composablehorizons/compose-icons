package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ink_eraser_off: ImageVector
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
                moveTo(224f, 720f)
                horizontalLineToRelative(262f)
                lineToRelative(59f, -61f)
                lineToRelative(-197f, -197f)
                lineToRelative(-188f, 194f)
                lineToRelative(64f, 64f)
                close()
                moveToRelative(491f, -119f)
                lineToRelative(-57f, -57f)
                lineToRelative(142f, -146f)
                lineToRelative(-198f, -198f)
                lineToRelative(-142f, 146f)
                lineToRelative(-56f, -56f)
                lineToRelative(196f, -204f)
                lineToRelative(312f, 312f)
                lineToRelative(-197f, 203f)
                close()
                moveTo(559f, 445f)
                close()
                moveTo(447f, 560f)
                close()
            }
        }.build()
        
        return _Ink_eraser_off!!
    }

private var _Ink_eraser_off: ImageVector? = null

