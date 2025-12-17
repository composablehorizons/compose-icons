package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Auto_stories: ImageVector
    get() {
        if (_Auto_stories != null) return _Auto_stories!!
        
        _Auto_stories = ImageVector.Builder(
            name = "auto_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.15f, 1.35f)
                    lineToRelative(-4f, 4f)
                    curveTo(14.05f, 5.45f, 14f, 5.57f, 14f, 5.71f)
                    verticalLineToRelative(8.17f)
                    curveToRelative(0f, 0.43f, 0.51f, 0.66f, 0.83f, 0.37f)
                    lineToRelative(4f, -3.6f)
                    curveToRelative(0.11f, -0.09f, 0.17f, -0.23f, 0.17f, -0.37f)
                    verticalLineTo(1.71f)
                    curveTo(19f, 1.26f, 18.46f, 1.04f, 18.15f, 1.35f)
                    close()
                    moveTo(22.47f, 5.2f)
                    curveTo(22f, 4.96f, 21.51f, 4.76f, 21f, 4.59f)
                    verticalLineToRelative(12.03f)
                    curveTo(19.86f, 16.21f, 18.69f, 16f, 17.5f, 16f)
                    curveToRelative(-1.9f, 0f, -3.78f, 0.54f, -5.5f, 1.58f)
                    verticalLineTo(5.48f)
                    curveTo(10.38f, 4.55f, 8.51f, 4f, 6.5f, 4f)
                    curveTo(4.71f, 4f, 3.02f, 4.44f, 1.53f, 5.2f)
                    curveTo(1.2f, 5.36f, 1f, 5.71f, 1f, 6.08f)
                    verticalLineToRelative(12.08f)
                    curveToRelative(0f, 0.76f, 0.81f, 1.23f, 1.48f, 0.87f)
                    curveTo(3.69f, 18.4f, 5.05f, 18f, 6.5f, 18f)
                    curveToRelative(2.07f, 0f, 3.98f, 0.82f, 5.5f, 2f)
                    curveToRelative(1.52f, -1.18f, 3.43f, -2f, 5.5f, -2f)
                    curveToRelative(1.45f, 0f, 2.81f, 0.4f, 4.02f, 1.04f)
                    curveTo(22.19f, 19.4f, 23f, 18.93f, 23f, 18.17f)
                    verticalLineTo(6.08f)
                    curveTo(23f, 5.71f, 22.8f, 5.36f, 22.47f, 5.2f)
                    close()
                }
            }
        }.build()
        
        return _Auto_stories!!
    }

private var _Auto_stories: ImageVector? = null

