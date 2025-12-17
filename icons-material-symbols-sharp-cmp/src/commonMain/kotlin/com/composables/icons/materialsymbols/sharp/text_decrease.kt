package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Text_decrease: ImageVector
    get() {
        if (_Text_decrease != null) return _Text_decrease!!
        
        _Text_decrease = ImageVector.Builder(
            name = "text_decrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                lineToRelative(210f, -560f)
                horizontalLineToRelative(100f)
                lineToRelative(210f, 560f)
                horizontalLineToRelative(-96f)
                lineToRelative(-51f, -143f)
                horizontalLineTo(187f)
                lineToRelative(-51f, 143f)
                horizontalLineTo(40f)
                close()
                moveToRelative(176f, -224f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
                moveToRelative(384f, -16f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Text_decrease!!
    }

private var _Text_decrease: ImageVector? = null

