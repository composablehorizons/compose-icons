package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TextSize: ImageVector
    get() {
        if (_TextSize != null) return _TextSize!!
        
        _TextSize = ImageVector.Builder(
            name = "text-size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.9699f, 2.32913f)
                curveTo(10.8981f, 2.13153f, 10.7103f, 2f, 10.5f, 2f)
                curveTo(10.2898f, 2f, 10.102f, 2.13153f, 10.0301f, 2.32913f)
                lineTo(6.46834f, 12.124f)
                lineTo(6.13267f, 11.3184f)
                curveTo(6.12991f, 11.3113f, 6.12699f, 11.3043f, 6.12391f, 11.2974f)
                lineTo(4.46155f, 7.30769f)
                curveTo(4.38391f, 7.12137f, 4.20186f, 7f, 4.00001f, 7f)
                curveTo(3.79816f, 7f, 3.6161f, 7.12137f, 3.53847f, 7.30769f)
                lineTo(1.8761f, 11.2974f)
                curveTo(1.87303f, 11.3043f, 1.87011f, 11.3113f, 1.86735f, 11.3184f)
                lineTo(1.03847f, 13.3077f)
                curveTo(0.932261f, 13.5626f, 1.0528f, 13.8553f, 1.3077f, 13.9615f)
                curveTo(1.5626f, 14.0677f, 1.85534f, 13.9472f, 1.96155f, 13.6923f)
                lineTo(2.66667f, 12f)
                horizontalLineTo(5.33334f)
                lineTo(6.03776f, 13.6906f)
                curveTo(6.03897f, 13.6935f, 6.04021f, 13.6965f, 6.04148f, 13.6994f)
                curveTo(6.06887f, 13.7624f, 6.10777f, 13.817f, 6.15467f, 13.8618f)
                curveTo(6.20148f, 13.9065f, 6.25776f, 13.9428f, 6.32193f, 13.9672f)
                curveTo(6.33406f, 13.9718f, 6.34638f, 13.976f, 6.35885f, 13.9797f)
                curveTo(6.46237f, 14.0102f, 6.56886f, 14.0056f, 6.66467f, 13.9721f)
                curveTo(6.67641f, 13.968f, 6.688f, 13.9635f, 6.69939f, 13.9585f)
                curveTo(6.76233f, 13.9312f, 6.81686f, 13.8924f, 6.86155f, 13.8456f)
                curveTo(6.90638f, 13.7987f, 6.94275f, 13.7423f, 6.96722f, 13.6781f)
                curveTo(6.96834f, 13.6751f, 6.96944f, 13.6722f, 6.9705f, 13.6692f)
                lineTo(8.30477f, 10f)
                horizontalLineTo(12.6952f)
                lineTo(14.0301f, 13.6709f)
                curveTo(14.1245f, 13.9304f, 14.4114f, 14.0643f, 14.6709f, 13.9699f)
                curveTo(14.9304f, 13.8755f, 15.0643f, 13.5886f, 14.9699f, 13.3291f)
                lineTo(10.9699f, 2.32913f)
                close()
                moveTo(10.5f, 3.96309f)
                lineTo(12.3316f, 9f)
                horizontalLineTo(8.6684f)
                lineTo(10.5f, 3.96309f)
                close()
                moveTo(4.00001f, 8.8f)
                lineTo(4.91668f, 11f)
                horizontalLineTo(3.08334f)
                lineTo(4.00001f, 8.8f)
                close()
            }
        }.build()
        
        return _TextSize!!
    }

private var _TextSize: ImageVector? = null

