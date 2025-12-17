package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 160f)
                curveToRelative(-52.9f, 0f, -96f, 43.1f, -96f, 96f)
                reflectiveCurveToRelative(43.1f, 96f, 96f, 96f)
                reflectiveCurveToRelative(96f, -43.1f, 96f, -96f)
                reflectiveCurveToRelative(-43.1f, -96f, -96f, -96f)
                close()
                moveToRelative(246.4f, 80.5f)
                lineToRelative(-94.7f, -47.3f)
                lineToRelative(33.5f, -100.4f)
                curveToRelative(4.5f, -13.6f, -8.4f, -26.5f, -21.9f, -21.9f)
                lineToRelative(-100.4f, 33.5f)
                lineToRelative(-47.4f, -94.8f)
                curveToRelative(-6.4f, -12.8f, -24.6f, -12.8f, -31f, 0f)
                lineToRelative(-47.3f, 94.7f)
                lineTo(92.7f, 70.8f)
                curveToRelative(-13.6f, -4.5f, -26.5f, 8.4f, -21.9f, 21.9f)
                lineToRelative(33.5f, 100.4f)
                lineToRelative(-94.7f, 47.4f)
                curveToRelative(-12.8f, 6.4f, -12.8f, 24.6f, 0f, 31f)
                lineToRelative(94.7f, 47.3f)
                lineToRelative(-33.5f, 100.5f)
                curveToRelative(-4.5f, 13.6f, 8.4f, 26.5f, 21.9f, 21.9f)
                lineToRelative(100.4f, -33.5f)
                lineToRelative(47.3f, 94.7f)
                curveToRelative(6.4f, 12.8f, 24.6f, 12.8f, 31f, 0f)
                lineToRelative(47.3f, -94.7f)
                lineToRelative(100.4f, 33.5f)
                curveToRelative(13.6f, 4.5f, 26.5f, -8.4f, 21.9f, -21.9f)
                lineToRelative(-33.5f, -100.4f)
                lineToRelative(94.7f, -47.3f)
                curveToRelative(13f, -6.5f, 13f, -24.7f, 0.2f, -31.1f)
                close()
                moveToRelative(-155.9f, 106f)
                curveToRelative(-49.9f, 49.9f, -131.1f, 49.9f, -181f, 0f)
                curveToRelative(-49.9f, -49.9f, -49.9f, -131.1f, 0f, -181f)
                curveToRelative(49.9f, -49.9f, 131.1f, -49.9f, 181f, 0f)
                curveToRelative(49.9f, 49.9f, 49.9f, 131.1f, 0f, 181f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

