package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CloudRain: ImageVector
    get() {
        if (_CloudRain != null) return _CloudRain!!
        
        _CloudRain = ImageVector.Builder(
            name = "cloud-rain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(416f, 128f)
                curveToRelative(-0.6f, 0f, -1.1f, 0.2f, -1.6f, 0.2f)
                curveToRelative(1.1f, -5.2f, 1.6f, -10.6f, 1.6f, -16.2f)
                curveToRelative(0f, -44.2f, -35.8f, -80f, -80f, -80f)
                curveToRelative(-24.6f, 0f, -46.3f, 11.3f, -61f, 28.8f)
                curveTo(256.4f, 24.8f, 219.3f, 0f, 176f, 0f)
                curveTo(114.1f, 0f, 64f, 50.1f, 64f, 112f)
                curveToRelative(0f, 7.3f, 0.8f, 14.3f, 2.1f, 21.2f)
                curveTo(27.8f, 145.8f, 0f, 181.5f, 0f, 224f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                horizontalLineToRelative(320f)
                curveToRelative(53f, 0f, 96f, -43f, 96f, -96f)
                reflectiveCurveToRelative(-43f, -96f, -96f, -96f)
                close()
                moveTo(88f, 374.2f)
                curveToRelative(-12.8f, 44.4f, -40f, 56.4f, -40f, 87.7f)
                curveToRelative(0f, 27.7f, 21.5f, 50.1f, 48f, 50.1f)
                reflectiveCurveToRelative(48f, -22.4f, 48f, -50.1f)
                curveToRelative(0f, -31.4f, -27.2f, -43.1f, -40f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16f, 0f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(-12.8f, 44.4f, -40f, 56.4f, -40f, 87.7f)
                curveToRelative(0f, 27.7f, 21.5f, 50.1f, 48f, 50.1f)
                reflectiveCurveToRelative(48f, -22.4f, 48f, -50.1f)
                curveToRelative(0f, -31.4f, -27.2f, -43.1f, -40f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16f, 0f)
                close()
                moveToRelative(160f, 0f)
                curveToRelative(-12.8f, 44.4f, -40f, 56.4f, -40f, 87.7f)
                curveToRelative(0f, 27.7f, 21.5f, 50.1f, 48f, 50.1f)
                reflectiveCurveToRelative(48f, -22.4f, 48f, -50.1f)
                curveToRelative(0f, -31.4f, -27.2f, -43.1f, -40f, -87.7f)
                curveToRelative(-2.2f, -8.1f, -13.5f, -8.5f, -16f, 0f)
                close()
            }
        }.build()
        
        return _CloudRain!!
    }

private var _CloudRain: ImageVector? = null

