package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stat_minus_2: ImageVector
    get() {
        if (_Stat_minus_2 != null) return _Stat_minus_2!!
        
        _Stat_minus_2 = ImageVector.Builder(
            name = "stat_minus_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                lineTo(240f, 520f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
                moveToRelative(0f, -240f)
                lineTo(240f, 280f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 183f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Stat_minus_2!!
    }

private var _Stat_minus_2: ImageVector? = null

