package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hearing_disabled: ImageVector
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
                    moveTo(6.03f, 3.2f)
                    curveTo(7.15f, 2.44f, 8.51f, 2f, 10f, 2f)
                    curveToRelative(3.93f, 0f, 7f, 3.07f, 7f, 7f)
                    curveToRelative(0f, 1.26f, -0.38f, 2.65f, -1.07f, 3.9f)
                    curveToRelative(-0.02f, 0.04f, -0.05f, 0.08f, -0.08f, 0.13f)
                    lineToRelative(-1.48f, -1.48f)
                    curveTo(14.77f, 10.69f, 15f, 9.8f, 15f, 9f)
                    curveToRelative(0f, -2.8f, -2.2f, -5f, -5f, -5f)
                    curveTo(9.08f, 4f, 8.24f, 4.26f, 7.5f, 4.67f)
                    lineTo(6.03f, 3.2f)
                    close()
                    moveTo(17.21f, 14.38f)
                    lineToRelative(1.43f, 1.43f)
                    curveTo(20.11f, 13.93f, 21f, 11.57f, 21f, 9f)
                    curveToRelative(0f, -3.04f, -1.23f, -5.79f, -3.22f, -7.78f)
                    lineToRelative(-1.42f, 1.42f)
                    curveTo(17.99f, 4.26f, 19f, 6.51f, 19f, 9f)
                    curveTo(19f, 11.02f, 18.33f, 12.88f, 17.21f, 14.38f)
                    close()
                    moveTo(10f, 6.5f)
                    curveToRelative(-0.21f, 0f, -0.4f, 0.03f, -0.59f, 0.08f)
                    lineToRelative(3.01f, 3.01f)
                    curveTo(12.47f, 9.4f, 12.5f, 9.21f, 12.5f, 9f)
                    curveTo(12.5f, 7.62f, 11.38f, 6.5f, 10f, 6.5f)
                    close()
                    moveTo(21.19f, 21.19f)
                    lineTo(2.81f, 2.81f)
                    lineTo(1.39f, 4.22f)
                    lineToRelative(2.13f, 2.13f)
                    curveTo(3.19f, 7.16f, 3f, 8.05f, 3f, 9f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, -0.36f, 0.05f, -0.71f, 0.12f, -1.05f)
                    lineToRelative(6.61f, 6.61f)
                    curveToRelative(-0.88f, 0.68f, -1.78f, 1.41f, -2.27f, 2.9f)
                    curveToRelative(-0.5f, 1.5f, -1f, 2.01f, -1.71f, 2.38f)
                    curveTo(7.56f, 19.94f, 7.29f, 20f, 7f, 20f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    horizontalLineTo(3f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    curveToRelative(0.57f, 0f, 1.13f, -0.12f, 1.64f, -0.35f)
                    curveToRelative(1.36f, -0.71f, 2.13f, -1.73f, 2.73f, -3.55f)
                    curveToRelative(0.32f, -0.98f, 0.9f, -1.43f, 1.71f, -2.05f)
                    curveToRelative(0.03f, -0.02f, 0.05f, -0.04f, 0.08f, -0.06f)
                    lineToRelative(6.62f, 6.62f)
                    lineTo(21.19f, 21.19f)
                    close()
                }
            }
        }.build()
        
        return _Hearing_disabled!!
    }

private var _Hearing_disabled: ImageVector? = null

