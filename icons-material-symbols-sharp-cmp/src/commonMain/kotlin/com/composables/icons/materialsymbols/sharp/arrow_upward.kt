package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Arrow_upward: ImageVector
    get() {
        if (_Arrow_upward != null) return _Arrow_upward!!
        
        _Arrow_upward = ImageVector.Builder(
            name = "arrow_upward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 800f)
                verticalLineToRelative(-487f)
                lineTo(216f, 537f)
                lineToRelative(-56f, -57f)
                lineToRelative(320f, -320f)
                lineToRelative(320f, 320f)
                lineToRelative(-56f, 57f)
                lineToRelative(-224f, -224f)
                verticalLineToRelative(487f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_upward!!
    }

private var _Arrow_upward: ImageVector? = null

