package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Heart: ImageVector
    get() {
        if (_Heart != null) return _Heart!!
        
        _Heart = ImageVector.Builder(
            name = "heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(462.3f, 62.6f)
                curveTo(407.5f, 15.9f, 326f, 24.3f, 275.7f, 76.2f)
                lineTo(256f, 96.5f)
                lineToRelative(-19.7f, -20.3f)
                curveTo(186.1f, 24.3f, 104.5f, 15.9f, 49.7f, 62.6f)
                curveToRelative(-62.8f, 53.6f, -66.1f, 149.8f, -9.9f, 207.9f)
                lineToRelative(193.5f, 199.8f)
                curveToRelative(12.5f, 12.9f, 32.8f, 12.9f, 45.3f, 0f)
                lineToRelative(193.5f, -199.8f)
                curveToRelative(56.3f, -58.1f, 53f, -154.3f, -9.8f, -207.9f)
                close()
            }
        }.build()
        
        return _Heart!!
    }

private var _Heart: ImageVector? = null

