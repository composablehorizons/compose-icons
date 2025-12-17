package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Nearby: ImageVector
    get() {
        if (_Nearby != null) return _Nearby!!
        
        _Nearby = ImageVector.Builder(
            name = "nearby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 656f)
                lineTo(304f, 480f)
                lineToRelative(176f, -176f)
                lineToRelative(176f, 176f)
                lineToRelative(-176f, 176f)
                close()
                moveToRelative(0f, 255f)
                lineTo(49f, 480f)
                lineToRelative(431f, -431f)
                lineToRelative(431f, 431f)
                lineTo(480f, 911f)
                close()
                moveToRelative(0f, -143f)
                lineToRelative(288f, -288f)
                lineToRelative(-288f, -288f)
                lineToRelative(-288f, 288f)
                lineToRelative(288f, 288f)
                close()
            }
        }.build()
        
        return _Nearby!!
    }

private var _Nearby: ImageVector? = null

