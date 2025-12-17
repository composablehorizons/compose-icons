package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Electric_bolt: ImageVector
    get() {
        if (_Electric_bolt != null) return _Electric_bolt!!
        
        _Electric_bolt = ImageVector.Builder(
            name = "electric_bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                lineToRelative(160f, -300f)
                lineToRelative(-320f, -40f)
                lineToRelative(480f, -460f)
                horizontalLineToRelative(80f)
                lineTo(520f, 380f)
                lineToRelative(320f, 40f)
                lineTo(360f, 880f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Electric_bolt!!
    }

private var _Electric_bolt: ImageVector? = null

