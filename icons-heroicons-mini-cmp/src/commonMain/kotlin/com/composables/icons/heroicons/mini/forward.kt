package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.288f, 4.818f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 6.095f)
                verticalLineToRelative(7.81f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 2.288f, 1.276f)
                lineToRelative(6.323f, -3.905f)
                curveToRelative(0.155f, -0.096f, 0.285f, -0.213f, 0.389f, -0.344f)
                verticalLineToRelative(2.973f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 2.288f, 1.276f)
                lineToRelative(6.323f, -3.905f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -2.552f)
                lineToRelative(-6.323f, -3.906f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10f, 6.095f)
                verticalLineToRelative(2.972f)
                arcToRelative(1.506f, 1.506f, 0f, false, false, -0.389f, -0.343f)
                lineTo(3.288f, 4.818f)
                close()
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

