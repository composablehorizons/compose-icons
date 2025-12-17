package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Stat_1: ImageVector
    get() {
        if (_Stat_1 != null) return _Stat_1!!
        
        _Stat_1 = ImageVector.Builder(
            name = "stat_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 615f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -183f)
                lineToRelative(-184f, 183f)
                close()
            }
        }.build()
        
        return _Stat_1!!
    }

private var _Stat_1: ImageVector? = null

