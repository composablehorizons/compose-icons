package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MicrophoneSlash: ImageVector
    get() {
        if (_MicrophoneSlash != null) return _MicrophoneSlash!!
        
        _MicrophoneSlash = ImageVector.Builder(
            name = "microphone-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.82f, 458.1f)
                lineToRelative(-157.8f, -121.96f)
                curveTo(488.61f, 312.13f, 496f, 285.01f, 496f, 256f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 17.92f, -3.96f, 34.8f, -10.72f, 50.2f)
                lineToRelative(-26.55f, -20.52f)
                curveToRelative(3.1f, -9.4f, 5.28f, -19.22f, 5.28f, -29.67f)
                verticalLineTo(96f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 42.98f, -96f, 96f)
                verticalLineToRelative(45.36f)
                lineTo(45.47f, 3.37f)
                curveTo(38.49f, -2.05f, 28.43f, -0.8f, 23.01f, 6.18f)
                lineTo(3.37f, 31.45f)
                curveTo(-2.05f, 38.42f, -0.8f, 48.47f, 6.18f, 53.9f)
                lineToRelative(588.36f, 454.73f)
                curveToRelative(6.98f, 5.43f, 17.03f, 4.17f, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                curveToRelative(5.41f, -6.97f, 4.16f, -17.02f, -2.82f, -22.45f)
                close()
                moveTo(400f, 464f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-33.77f)
                curveToRelative(11.66f, -1.6f, 22.85f, -4.54f, 33.67f, -8.31f)
                lineToRelative(-50.11f, -38.73f)
                curveToRelative(-6.71f, 0.4f, -13.41f, 0.87f, -20.35f, 0.2f)
                curveToRelative(-55.85f, -5.45f, -98.74f, -48.63f, -111.18f, -101.85f)
                lineTo(144f, 241.31f)
                verticalLineToRelative(6.85f)
                curveToRelative(0f, 89.64f, 63.97f, 169.55f, 152f, 181.69f)
                verticalLineTo(464f)
                horizontalLineToRelative(-56f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(160f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _MicrophoneSlash!!
    }

private var _MicrophoneSlash: ImageVector? = null

