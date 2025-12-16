package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.SpeakerModerate: ImageVector
    get() {
        if (_SpeakerModerate != null) return _SpeakerModerate!!
        
        _SpeakerModerate = ImageVector.Builder(
            name = "speaker-moderate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25879f, 1.06173f)
                curveTo(7.40141f, 0.983238f, 7.5754f, 0.978824f, 7.72363f, 1.05294f)
                curveTo(7.89302f, 1.13764f, 8f, 1.31082f, 8f, 1.50021f)
                verticalLineTo(13.5002f)
                curveTo(8f, 13.6896f, 7.89302f, 13.8628f, 7.72363f, 13.9475f)
                curveTo(7.55436f, 14.0321f, 7.35167f, 14.014f, 7.2002f, 13.9006f)
                lineTo(3.33301f, 11.0002f)
                horizontalLineTo(1.5f)
                curveTo(0.723336f, 11.0002f, 0.0846097f, 10.4099f, 0.0078125f, 9.65353f)
                lineTo(0f, 9.50021f)
                verticalLineTo(5.50021f)
                curveTo(1.61064E-6f, 4.67178f, 0.671574f, 4.00021f, 1.5f, 4.00021f)
                horizontalLineTo(3.33301f)
                lineTo(7.2002f, 1.09982f)
                lineTo(7.25879f, 1.06173f)
                close()
                moveTo(3.7998f, 4.9006f)
                curveTo(3.71332f, 4.96536f, 3.60805f, 5.00021f, 3.5f, 5.00021f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5.00021f, 1f, 5.22407f, 1f, 5.50021f)
                verticalLineTo(9.50021f)
                lineTo(1.00977f, 9.60079f)
                curveTo(1.05629f, 9.82876f, 1.25829f, 10.0002f, 1.5f, 10.0002f)
                horizontalLineTo(3.5f)
                curveTo(3.60805f, 10.0002f, 3.71332f, 10.0351f, 3.7998f, 10.0998f)
                lineTo(7f, 12.4992f)
                verticalLineTo(2.50021f)
                lineTo(3.7998f, 4.9006f)
                close()
                moveTo(10.2783f, 3.84786f)
                curveTo(10.4391f, 3.74101f, 10.6493f, 3.76594f, 10.7812f, 3.89669f)
                lineTo(10.833f, 3.95919f)
                lineTo(10.9629f, 4.16232f)
                curveTo(12.2548f, 6.27294f, 12.2112f, 8.96972f, 10.833f, 11.0412f)
                curveTo(10.7106f, 11.2248f, 10.4621f, 11.2747f, 10.2783f, 11.1526f)
                curveTo(10.0945f, 11.0302f, 10.0448f, 10.7818f, 10.167f, 10.5979f)
                curveTo(11.3724f, 8.78619f, 11.4094f, 6.42524f, 10.2793f, 4.57931f)
                lineTo(10.166f, 4.40255f)
                lineTo(10.1289f, 4.33126f)
                curveTo(10.059f, 4.15887f, 10.1174f, 3.95493f, 10.2783f, 3.84786f)
                close()
            }
        }.build()
        
        return _SpeakerModerate!!
    }

private var _SpeakerModerate: ImageVector? = null

