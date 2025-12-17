package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MicrophoneAltSlash: ImageVector
    get() {
        if (_MicrophoneAltSlash != null) return _MicrophoneAltSlash!!
        
        _MicrophoneAltSlash = ImageVector.Builder(
            name = "microphone-alt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.82f, 458.1f)
                lineTo(476.26f, 336.33f)
                curveTo(488.74f, 312.21f, 496f, 284.98f, 496f, 256f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 17.92f, -3.96f, 34.8f, -10.72f, 50.2f)
                lineToRelative(-26.55f, -20.52f)
                curveToRelative(3.1f, -9.4f, 5.28f, -19.22f, 5.28f, -29.67f)
                horizontalLineToRelative(-43.67f)
                lineToRelative(-41.4f, -32f)
                horizontalLineTo(416f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0f, -10.67f, -3.58f, -10.67f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 4.78f, -8f, 10.67f, -8f)
                horizontalLineTo(416f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0f, -10.67f, -3.58f, -10.67f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 4.78f, -8f, 10.67f, -8f)
                horizontalLineTo(416f)
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
                verticalLineToRelative(-33.78f)
                curveToRelative(11.71f, -1.62f, 23.1f, -4.28f, 33.96f, -8.08f)
                lineToRelative(-50.4f, -38.96f)
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
        
        return _MicrophoneAltSlash!!
    }

private var _MicrophoneAltSlash: ImageVector? = null

