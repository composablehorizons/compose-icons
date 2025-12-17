package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tools_wrench: ImageVector
    get() {
        if (_Tools_wrench != null) return _Tools_wrench!!
        
        _Tools_wrench = ImageVector.Builder(
            name = "tools_wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.325f, 22.65f)
                lineToRelative(-8.35f, -8.325f)
                quadToRelative(-0.575f, 0.225f, -1.187f, 0.35f)
                quadToRelative(-0.613f, 0.125f, -1.263f, 0.125f)
                quadToRelative(-2.725f, 0f, -4.612f, -1.888f)
                quadTo(2.025f, 11.025f, 2.025f, 8.3f)
                quadToRelative(0f, -1.05f, 0.313f, -2.025f)
                quadToRelative(0.312f, -0.975f, 0.912f, -1.8f)
                lineTo(7.075f, 8.3f)
                lineTo(8.5f, 6.9f)
                lineTo(4.675f, 3.05f)
                quadToRelative(0.85f, -0.625f, 1.825f, -0.938f)
                quadToRelative(0.975f, -0.312f, 2f, -0.312f)
                quadToRelative(2.725f, 0f, 4.613f, 1.887f)
                quadTo(15f, 5.575f, 15f, 8.3f)
                quadToRelative(0f, 0.65f, -0.125f, 1.287f)
                quadToRelative(-0.125f, 0.638f, -0.375f, 1.213f)
                lineToRelative(8.35f, 8.325f)
                close()
            }
        }.build()
        
        return _Tools_wrench!!
    }

private var _Tools_wrench: ImageVector? = null

