package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stat_0: ImageVector
    get() {
        if (_Stat_0 != null) return _Stat_0!!
        
        _Stat_0 = ImageVector.Builder(
            name = "stat_0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                lineTo(200f, 480f)
                lineToRelative(280f, -280f)
                lineToRelative(280f, 280f)
                lineToRelative(-280f, 280f)
                close()
            }
        }.build()
        
        return _Stat_0!!
    }

private var _Stat_0: ImageVector? = null

