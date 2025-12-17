package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.MicrophoneAlt: ImageVector
    get() {
        if (_MicrophoneAlt != null) return _MicrophoneAlt!!
        
        _MicrophoneAlt = ImageVector.Builder(
            name = "microphone-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 352f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 192f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 74.8f, -64.49f, 134.82f, -140.79f, 127.38f)
                curveTo(96.71f, 376.89f, 48f, 317.11f, 48f, 250.3f)
                verticalLineTo(208f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(40.16f)
                curveToRelative(0f, 89.64f, 63.97f, 169.55f, 152f, 181.69f)
                verticalLineTo(464f)
                horizontalLineTo(96f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(160f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-33.77f)
                curveTo(285.71f, 418.47f, 352f, 344.9f, 352f, 256f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(176f, 352f)
                curveToRelative(53.02f, 0f, 96f, -42.98f, 96f, -96f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0f, -10.67f, -3.58f, -10.67f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 4.78f, -8f, 10.67f, -8f)
                horizontalLineTo(272f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0f, -10.67f, -3.58f, -10.67f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 4.78f, -8f, 10.67f, -8f)
                horizontalLineTo(272f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-85.33f)
                curveToRelative(-5.89f, 0f, -10.67f, -3.58f, -10.67f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 4.78f, -8f, 10.67f, -8f)
                horizontalLineTo(272f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                reflectiveCurveTo(80f, 42.98f, 80f, 96f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 53.02f, 42.98f, 96f, 96f, 96f)
                close()
            }
        }.build()
        
        return _MicrophoneAlt!!
    }

private var _MicrophoneAlt: ImageVector? = null

