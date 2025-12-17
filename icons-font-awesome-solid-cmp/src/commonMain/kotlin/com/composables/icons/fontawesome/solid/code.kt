package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(278.9f, 511.5f)
                lineToRelative(-61f, -17.7f)
                curveToRelative(-6.4f, -1.8f, -10f, -8.5f, -8.2f, -14.9f)
                lineTo(346.2f, 8.7f)
                curveToRelative(1.8f, -6.4f, 8.5f, -10f, 14.9f, -8.2f)
                lineToRelative(61f, 17.7f)
                curveToRelative(6.4f, 1.8f, 10f, 8.5f, 8.2f, 14.9f)
                lineTo(293.8f, 503.3f)
                curveToRelative(-1.9f, 6.4f, -8.5f, 10.1f, -14.9f, 8.2f)
                close()
                moveToRelative(-114f, -112.2f)
                lineToRelative(43.5f, -46.4f)
                curveToRelative(4.6f, -4.9f, 4.3f, -12.7f, -0.8f, -17.2f)
                lineTo(117f, 256f)
                lineToRelative(90.6f, -79.7f)
                curveToRelative(5.1f, -4.5f, 5.5f, -12.3f, 0.8f, -17.2f)
                lineToRelative(-43.5f, -46.4f)
                curveToRelative(-4.5f, -4.8f, -12.1f, -5.1f, -17f, -0.5f)
                lineTo(3.8f, 247.2f)
                curveToRelative(-5.1f, 4.7f, -5.1f, 12.8f, 0f, 17.5f)
                lineToRelative(144.1f, 135.1f)
                curveToRelative(4.9f, 4.6f, 12.5f, 4.4f, 17f, -0.5f)
                close()
                moveToRelative(327.2f, 0.6f)
                lineToRelative(144.1f, -135.1f)
                curveToRelative(5.1f, -4.7f, 5.1f, -12.8f, 0f, -17.5f)
                lineTo(492.1f, 112.1f)
                curveToRelative(-4.8f, -4.5f, -12.4f, -4.3f, -17f, 0.5f)
                lineTo(431.6f, 159f)
                curveToRelative(-4.6f, 4.9f, -4.3f, 12.7f, 0.8f, 17.2f)
                lineTo(523f, 256f)
                lineToRelative(-90.6f, 79.7f)
                curveToRelative(-5.1f, 4.5f, -5.5f, 12.3f, -0.8f, 17.2f)
                lineToRelative(43.5f, 46.4f)
                curveToRelative(4.5f, 4.9f, 12.1f, 5.1f, 17f, 0.6f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

