package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Model_training: ImageVector
    get() {
        if (_Model_training != null) return _Model_training!!
        
        _Model_training = ImageVector.Builder(
            name = "model_training",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15.5f, 13.5f)
                    curveToRelative(0f, 2f, -2.5f, 3.5f, -2.5f, 5f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(0f, -1.5f, -2.5f, -3f, -2.5f, -5f)
                    curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                    horizontalLineToRelative(0f)
                    curveTo(13.93f, 10f, 15.5f, 11.57f, 15.5f, 13.5f)
                    close()
                    moveTo(13f, 19.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(19.5f)
                    close()
                    moveTo(19f, 13f)
                    curveToRelative(0f, 1.39f, -0.41f, 2.69f, -1.12f, 3.78f)
                    curveToRelative(-0.25f, 0.39f, -0.19f, 0.91f, 0.14f, 1.24f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.44f, 0.44f, 1.2f, 0.38f, 1.54f, -0.15f)
                    curveTo(20.47f, 16.47f, 21f, 14.8f, 21f, 13f)
                    curveToRelative(0f, -2.36f, -0.91f, -4.51f, -2.4f, -6.12f)
                    curveToRelative(-0.39f, -0.42f, -1.05f, -0.43f, -1.45f, -0.03f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.38f, 0.38f, -0.38f, 0.99f, -0.02f, 1.39f)
                    curveTo(18.29f, 9.49f, 19f, 11.16f, 19f, 13f)
                    close()
                    moveTo(15.65f, 4.65f)
                    lineToRelative(-2.79f, -2.79f)
                    curveTo(12.54f, 1.54f, 12f, 1.76f, 12f, 2.21f)
                    verticalLineTo(4f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                    curveToRelative(0f, 1.8f, 0.53f, 3.47f, 1.44f, 4.88f)
                    curveToRelative(0.34f, 0.53f, 1.1f, 0.59f, 1.54f, 0.15f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.33f, -0.33f, 0.39f, -0.84f, 0.14f, -1.23f)
                    curveTo(4.73f, 14.65f, 4.48f, 11.7f, 6.25f, 8.8f)
                    curveTo(7.45f, 6.85f, 9.71f, 5.81f, 12f, 6f)
                    lineToRelative(0f, 0f)
                    verticalLineToRelative(1.79f)
                    curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                    lineToRelative(2.79f, -2.79f)
                    curveTo(15.84f, 5.16f, 15.84f, 4.84f, 15.65f, 4.65f)
                    close()
                }
            }
        }.build()
        
        return _Model_training!!
    }

private var _Model_training: ImageVector? = null

