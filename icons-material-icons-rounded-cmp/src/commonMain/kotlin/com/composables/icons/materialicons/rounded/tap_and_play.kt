package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tap_and_play: ImageVector
    get() {
        if (_Tap_and_play != null) return _Tap_and_play!!
        
        _Tap_and_play = ImageVector.Builder(
            name = "tap_and_play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.14f, 16.09f)
                curveToRelative(-0.6f, -0.1f, -1.14f, 0.39f, -1.14f, 1f)
                curveToRelative(0f, 0.49f, 0.36f, 0.9f, 0.85f, 0.98f)
                curveToRelative(2.08f, 0.36f, 3.72f, 2f, 4.08f, 4.08f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0f, 1.09f, -0.54f, 1f, -1.14f)
                curveToRelative(-0.48f, -2.95f, -2.81f, -5.29f, -5.77f, -5.77f)
                close()
                moveTo(2f, 20f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(1.11f, -7.94f)
                curveToRelative(-0.59f, -0.06f, -1.11f, 0.4f, -1.11f, 0.99f)
                curveToRelative(0f, 0.5f, 0.37f, 0.94f, 0.87f, 0.99f)
                curveToRelative(4.27f, 0.41f, 7.67f, 3.81f, 8.08f, 8.08f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f)
                curveToRelative(0.59f, 0f, 1.06f, -0.51f, 1f, -1.1f)
                curveToRelative(-0.51f, -5.2f, -4.63f, -9.32f, -9.83f, -9.84f)
                close()
                moveTo(17f, 1.01f)
                lineTo(7f, 1f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(7.37f)
                curveToRelative(0.69f, 0.16f, 1.36f, 0.37f, 2f, 0.64f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(0.52f, 1.25f, 0.84f, 2.59f, 0.95f, 4f)
                horizontalLineTo(17f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -1.99f, -2f, -1.99f)
                close()
            }
        }.build()
        
        return _Tap_and_play!!
    }

private var _Tap_and_play: ImageVector? = null

