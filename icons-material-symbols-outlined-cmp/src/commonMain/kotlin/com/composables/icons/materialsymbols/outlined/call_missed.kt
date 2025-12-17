package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Call_missed: ImageVector
    get() {
        if (_Call_missed != null) return _Call_missed!!
        
        _Call_missed = ImageVector.Builder(
            name = "call_missed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 697f)
                lineTo(200f, 417f)
                verticalLineToRelative(183f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(256f)
                lineToRelative(224f, 224f)
                lineToRelative(304f, -304f)
                lineToRelative(56f, 57f)
                lineToRelative(-360f, 360f)
                close()
            }
        }.build()
        
        return _Call_missed!!
    }

private var _Call_missed: ImageVector? = null

