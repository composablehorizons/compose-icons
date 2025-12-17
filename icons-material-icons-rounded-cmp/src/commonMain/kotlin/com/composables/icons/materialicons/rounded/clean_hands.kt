package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Clean_hands: ImageVector
    get() {
        if (_Clean_hands != null) return _Clean_hands!!
        
        _Clean_hands = ImageVector.Builder(
            name = "clean_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.99f, 7f)
                    lineToRelative(1.37f, -0.63f)
                    lineTo(16.99f, 5f)
                    lineToRelative(0.63f, 1.37f)
                    lineTo(18.99f, 7f)
                    lineToRelative(-1.37f, 0.63f)
                    lineTo(16.99f, 9f)
                    lineToRelative(-0.63f, -1.37f)
                    lineTo(14.99f, 7f)
                    close()
                    moveTo(20f, 14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    curveToRelative(0f, -0.78f, -0.99f, -2.44f, -1.58f, -3.36f)
                    curveToRelative(-0.2f, -0.31f, -0.64f, -0.31f, -0.84f, 0f)
                    curveTo(18.99f, 9.56f, 18f, 11.22f, 18f, 12f)
                    curveTo(18f, 13.1f, 18.9f, 14f, 20f, 14f)
                    close()
                    moveTo(9.24f, 9.5f)
                    lineTo(15f, 11.65f)
                    verticalLineTo(11f)
                    curveToRelative(0f, -2.42f, -1.72f, -4.44f, -4f, -4.9f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.35f, 0f, 0.68f, 0.06f, 1f, 0.18f)
                    curveToRelative(0.37f, 0.13f, 0.78f, 0.05f, 1.05f, -0.22f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.51f, -0.51f, 0.34f, -1.39f, -0.33f, -1.64f)
                    curveTo(14.19f, 2.11f, 13.61f, 2f, 13f, 2f)
                    horizontalLineTo(8.5f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2.11f)
                    curveTo(7.22f, 6.48f, 5.8f, 7.79f, 5.25f, 9.5f)
                    horizontalLineTo(9.24f)
                    close()
                    moveTo(3f, 11f)
                    lineTo(3f, 11f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(7f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(0f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-7f)
                    curveTo(5f, 11.9f, 4.1f, 11f, 3f, 11f)
                    close()
                    moveTo(19.99f, 17f)
                    horizontalLineToRelative(-6.83f)
                    curveToRelative(-0.11f, 0f, -0.22f, -0.02f, -0.33f, -0.06f)
                    lineToRelative(-1.47f, -0.51f)
                    curveToRelative(-0.26f, -0.09f, -0.39f, -0.37f, -0.3f, -0.63f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.09f, -0.26f, 0.38f, -0.4f, 0.64f, -0.3f)
                    lineToRelative(1.12f, 0.43f)
                    curveToRelative(0.11f, 0.04f, 0.24f, 0.07f, 0.36f, 0.07f)
                    horizontalLineToRelative(2.63f)
                    curveToRelative(0.65f, 0f, 1.18f, -0.53f, 1.18f, -1.18f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.49f, -0.31f, -0.93f, -0.77f, -1.11f)
                    lineTo(9.3f, 11.13f)
                    curveTo(9.08f, 11.04f, 8.84f, 11f, 8.6f, 11f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(9.02f)
                    lineToRelative(6.37f, 1.81f)
                    curveToRelative(0.41f, 0.12f, 0.85f, 0.1f, 1.25f, -0.05f)
                    lineTo(22f, 19f)
                    lineToRelative(0f, 0f)
                    curveTo(22f, 17.89f, 21.1f, 17f, 19.99f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Clean_hands!!
    }

private var _Clean_hands: ImageVector? = null

