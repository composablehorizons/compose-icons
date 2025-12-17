package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Quiz: ImageVector
    get() {
        if (_Quiz != null) return _Quiz!!
        
        _Quiz = ImageVector.Builder(
            name = "quiz",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 4f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(4f)
                    horizontalLineTo(8f)
                    close()
                    moveTo(14.74f, 14.69f)
                    curveTo(14.54f, 14.9f, 14.3f, 15f, 14.01f, 15f)
                    curveToRelative(-0.29f, 0f, -0.54f, -0.1f, -0.74f, -0.31f)
                    curveToRelative(-0.21f, -0.21f, -0.31f, -0.45f, -0.31f, -0.74f)
                    curveToRelative(0f, -0.29f, 0.1f, -0.54f, 0.31f, -0.74f)
                    curveToRelative(0.21f, -0.2f, 0.45f, -0.3f, 0.74f, -0.3f)
                    curveToRelative(0.29f, 0f, 0.54f, 0.1f, 0.74f, 0.3f)
                    curveToRelative(0.2f, 0.2f, 0.3f, 0.45f, 0.3f, 0.74f)
                    curveTo(15.05f, 14.24f, 14.94f, 14.49f, 14.74f, 14.69f)
                    close()
                    moveTo(16.51f, 8.83f)
                    curveToRelative(-0.23f, 0.34f, -0.54f, 0.69f, -0.92f, 1.06f)
                    curveToRelative(-0.3f, 0.27f, -0.51f, 0.52f, -0.64f, 0.75f)
                    curveToRelative(-0.12f, 0.23f, -0.18f, 0.49f, -0.18f, 0.78f)
                    verticalLineToRelative(0.4f)
                    horizontalLineToRelative(-1.52f)
                    verticalLineToRelative(-0.56f)
                    curveToRelative(0f, -0.42f, 0.09f, -0.78f, 0.26f, -1.09f)
                    curveTo(13.69f, 9.85f, 14f, 9.5f, 14.46f, 9.1f)
                    curveToRelative(0.32f, -0.29f, 0.55f, -0.54f, 0.69f, -0.74f)
                    curveToRelative(0.14f, -0.2f, 0.21f, -0.44f, 0.21f, -0.72f)
                    curveToRelative(0f, -0.36f, -0.12f, -0.65f, -0.36f, -0.87f)
                    curveToRelative(-0.24f, -0.23f, -0.57f, -0.34f, -0.99f, -0.34f)
                    curveToRelative(-0.4f, 0f, -0.72f, 0.12f, -0.97f, 0.36f)
                    curveToRelative(-0.25f, 0.24f, -0.42f, 0.53f, -0.53f, 0.87f)
                    lineToRelative(-1.37f, -0.57f)
                    curveToRelative(0.18f, -0.55f, 0.52f, -1.03f, 1f, -1.45f)
                    curveTo(12.63f, 5.21f, 13.25f, 5f, 13.99f, 5f)
                    curveToRelative(0.56f, 0f, 1.05f, 0.11f, 1.49f, 0.33f)
                    curveToRelative(0.44f, 0.22f, 0.78f, 0.53f, 1.02f, 0.93f)
                    curveToRelative(0.24f, 0.4f, 0.36f, 0.84f, 0.36f, 1.33f)
                    curveTo(16.86f, 8.08f, 16.75f, 8.49f, 16.51f, 8.83f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    close()
                    moveTo(20f, 2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(20f, 16f)
                    horizontalLineTo(8f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(16f)
                    close()
                    moveTo(13.51f, 10.16f)
                    curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                    curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                    curveToRelative(-0.88f, 0f, -1.32f, 0.67f, -1.5f, 1.23f)
                    lineToRelative(-1.37f, -0.57f)
                    curveTo(11.51f, 5.96f, 12.52f, 5f, 13.99f, 5f)
                    curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                    curveToRelative(0.37f, 0.6f, 0.58f, 1.73f, 0.01f, 2.57f)
                    curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                    curveToRelative(-0.13f, 0.24f, -0.18f, 0.4f, -0.18f, 1.18f)
                    horizontalLineToRelative(-1.52f)
                    curveTo(13.26f, 11.41f, 13.19f, 10.74f, 13.51f, 10.16f)
                    close()
                    moveTo(12.95f, 13.95f)
                    curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                    curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                    curveToRelative(0f, 0.58f, -0.44f, 1.05f, -1.04f, 1.05f)
                    curveTo(13.42f, 15f, 12.95f, 14.53f, 12.95f, 13.95f)
                    close()
                }
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

