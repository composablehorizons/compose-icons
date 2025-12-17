package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hearing_disabled: ImageVector
    get() {
        if (_Hearing_disabled != null) return _Hearing_disabled!!
        
        _Hearing_disabled = ImageVector.Builder(
            name = "hearing_disabled",
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
                    moveTo(16.96f, 3.3f)
                    curveToRelative(-0.32f, -0.39f, -0.29f, -0.96f, 0.07f, -1.32f)
                    lineToRelative(0.01f, -0.01f)
                    curveToRelative(0.42f, -0.42f, 1.12f, -0.38f, 1.49f, 0.08f)
                    curveTo(20.07f, 3.94f, 21f, 6.36f, 21f, 9f)
                    curveToRelative(0f, 2.57f, -0.89f, 4.94f, -2.36f, 6.81f)
                    lineToRelative(-1.43f, -1.43f)
                    curveTo(18.33f, 12.88f, 19f, 11.02f, 19f, 9f)
                    curveTo(19f, 6.83f, 18.23f, 4.84f, 16.96f, 3.3f)
                    close()
                    moveTo(7.49f, 4.66f)
                    curveTo(8.23f, 4.24f, 9.08f, 4f, 10f, 4f)
                    curveToRelative(2.8f, 0f, 5f, 2.2f, 5f, 5f)
                    curveToRelative(0f, 0.8f, -0.23f, 1.69f, -0.63f, 2.54f)
                    lineToRelative(1.48f, 1.48f)
                    curveToRelative(0.02f, -0.04f, 0.05f, -0.08f, 0.08f, -0.13f)
                    curveTo(16.62f, 11.65f, 17f, 10.26f, 17f, 9f)
                    curveToRelative(0f, -3.93f, -3.07f, -7f, -7f, -7f)
                    curveTo(8.51f, 2f, 7.15f, 2.44f, 6.03f, 3.2f)
                    lineTo(7.49f, 4.66f)
                    close()
                    moveTo(10f, 6.5f)
                    curveToRelative(-0.21f, 0f, -0.4f, 0.03f, -0.59f, 0.08f)
                    lineToRelative(3.01f, 3.01f)
                    curveTo(12.47f, 9.4f, 12.5f, 9.21f, 12.5f, 9f)
                    curveTo(12.5f, 7.62f, 11.38f, 6.5f, 10f, 6.5f)
                    close()
                    moveTo(20.49f, 20.49f)
                    lineTo(3.51f, 3.51f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(1.42f, 1.42f)
                    curveToRelative(-0.2f, 0.49f, -0.35f, 1f, -0.43f, 1.54f)
                    curveTo(2.99f, 8.47f, 3.47f, 9f, 4.06f, 9f)
                    horizontalLineTo(4.1f)
                    curveToRelative(0.48f, 0f, 0.89f, -0.35f, 0.96f, -0.82f)
                    curveTo(5.08f, 8.1f, 5.1f, 8.02f, 5.12f, 7.95f)
                    lineToRelative(6.62f, 6.62f)
                    curveToRelative(-0.88f, 0.68f, -1.78f, 1.41f, -2.27f, 2.9f)
                    curveToRelative(-0.5f, 1.5f, -1f, 2.01f, -1.71f, 2.38f)
                    curveTo(7.56f, 19.94f, 7.29f, 20f, 7f, 20f)
                    curveToRelative(-0.88f, 0f, -1.63f, -0.58f, -1.9f, -1.37f)
                    curveTo(4.97f, 18.24f, 4.57f, 18f, 4.15f, 18f)
                    curveTo(3.49f, 18f, 3f, 18.64f, 3.2f, 19.26f)
                    curveTo(3.73f, 20.85f, 5.23f, 22f, 7f, 22f)
                    curveToRelative(0.57f, 0f, 1.13f, -0.12f, 1.64f, -0.35f)
                    curveToRelative(1.36f, -0.71f, 2.13f, -1.73f, 2.73f, -3.55f)
                    curveToRelative(0.32f, -0.98f, 0.9f, -1.43f, 1.71f, -2.05f)
                    curveToRelative(0.03f, -0.02f, 0.05f, -0.04f, 0.08f, -0.06f)
                    lineToRelative(5.91f, 5.91f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                    curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                    close()
                }
            }
        }.build()
        
        return _Hearing_disabled!!
    }

private var _Hearing_disabled: ImageVector? = null

