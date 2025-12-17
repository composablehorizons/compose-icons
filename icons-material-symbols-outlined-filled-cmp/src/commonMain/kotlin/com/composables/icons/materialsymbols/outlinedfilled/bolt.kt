package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                lineToRelative(40f, -280f)
                horizontalLineTo(160f)
                lineToRelative(360f, -520f)
                horizontalLineToRelative(80f)
                lineToRelative(-40f, 320f)
                horizontalLineToRelative(240f)
                lineTo(400f, 880f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

