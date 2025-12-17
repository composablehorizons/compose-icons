package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Show_chart: ImageVector
    get() {
        if (_Show_chart != null) return _Show_chart!!
        
        _Show_chart = ImageVector.Builder(
            name = "show_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(140f, 740f)
                lineToRelative(-60f, -60f)
                lineToRelative(300f, -300f)
                lineToRelative(160f, 160f)
                lineToRelative(284f, -320f)
                lineToRelative(56f, 56f)
                lineToRelative(-340f, 384f)
                lineToRelative(-160f, -160f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Show_chart!!
    }

private var _Show_chart: ImageVector? = null

