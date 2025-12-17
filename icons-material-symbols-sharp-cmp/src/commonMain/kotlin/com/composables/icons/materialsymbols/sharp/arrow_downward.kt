package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_downward: ImageVector
    get() {
        if (_Arrow_downward != null) return _Arrow_downward!!
        
        _Arrow_downward = ImageVector.Builder(
            name = "arrow_downward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 160f)
                verticalLineToRelative(487f)
                lineTo(216f, 423f)
                lineToRelative(-56f, 57f)
                lineToRelative(320f, 320f)
                lineToRelative(320f, -320f)
                lineToRelative(-56f, -57f)
                lineToRelative(-224f, 224f)
                verticalLineToRelative(-487f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_downward!!
    }

private var _Arrow_downward: ImageVector? = null

