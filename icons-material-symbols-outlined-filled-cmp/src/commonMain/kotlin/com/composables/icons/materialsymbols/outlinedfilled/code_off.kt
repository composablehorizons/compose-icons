package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Code_off: ImageVector
    get() {
        if (_Code_off != null) return _Code_off!!
        
        _Code_off = ImageVector.Builder(
            name = "code_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 905f)
                lineTo(280f, 394f)
                lineToRelative(-87f, 87f)
                lineToRelative(183f, 183f)
                lineToRelative(-56f, 56f)
                lineTo(80f, 480f)
                lineToRelative(143f, -143f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-54f, -282f)
                lineToRelative(-57f, -57f)
                lineToRelative(87f, -87f)
                lineToRelative(-183f, -183f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-143f, 143f)
                close()
            }
        }.build()
        
        return _Code_off!!
    }

private var _Code_off: ImageVector? = null

