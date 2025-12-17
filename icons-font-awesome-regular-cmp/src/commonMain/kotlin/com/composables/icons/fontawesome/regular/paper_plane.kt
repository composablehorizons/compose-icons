package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.PaperPlane: ImageVector
    get() {
        if (_PaperPlane != null) return _PaperPlane!!
        
        _PaperPlane = ImageVector.Builder(
            name = "paper-plane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 6.5f)
                lineTo(24f, 246.4f)
                curveToRelative(-34.4f, 19.9f, -31.1f, 70.8f, 5.7f, 85.9f)
                lineTo(144f, 379.6f)
                verticalLineTo(464f)
                curveToRelative(0f, 46.4f, 59.2f, 65.5f, 86.6f, 28.6f)
                lineToRelative(43.8f, -59.1f)
                lineToRelative(111.9f, 46.2f)
                curveToRelative(5.9f, 2.4f, 12.1f, 3.6f, 18.3f, 3.6f)
                curveToRelative(8.2f, 0f, 16.3f, -2.1f, 23.6f, -6.2f)
                curveToRelative(12.8f, -7.2f, 21.6f, -20f, 23.9f, -34.5f)
                lineToRelative(59.4f, -387.2f)
                curveToRelative(6.1f, -40.1f, -36.9f, -68.8f, -71.5f, -48.9f)
                close()
                moveTo(192f, 464f)
                verticalLineToRelative(-64.6f)
                lineToRelative(36.6f, 15.1f)
                lineTo(192f, 464f)
                close()
                moveToRelative(212.6f, -28.7f)
                lineToRelative(-153.8f, -63.5f)
                lineTo(391f, 169.5f)
                curveToRelative(10.7f, -15.5f, -9.5f, -33.5f, -23.7f, -21.2f)
                lineTo(155.8f, 332.6f)
                lineTo(48f, 288f)
                lineTo(464f, 48f)
                lineToRelative(-59.4f, 387.3f)
                close()
            }
        }.build()
        
        return _PaperPlane!!
    }

private var _PaperPlane: ImageVector? = null

