package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
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
                    moveTo(10.94f, 8.12f)
                    lineTo(7.48f, 4.66f)
                    lineTo(8.4f, 3.65f)
                    curveTo(8.78f, 3.24f, 9.32f, 3f, 9.88f, 3f)
                    horizontalLineToRelative(4.24f)
                    curveToRelative(0.56f, 0f, 1.1f, 0.24f, 1.47f, 0.65f)
                    lineTo(16.83f, 5f)
                    horizontalLineTo(20f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f)
                    lineToRelative(-5.1f, -5.1f)
                    curveTo(16.96f, 13.71f, 17f, 13.36f, 17f, 13f)
                    curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                    curveTo(11.64f, 8f, 11.29f, 8.04f, 10.94f, 8.12f)
                    close()
                    moveTo(19.78f, 22.61f)
                    lineTo(18.17f, 21f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f)
                    lineTo(1.39f, 4.22f)
                    curveTo(1f, 3.83f, 1f, 3.2f, 1.39f, 2.81f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(18.38f, 18.38f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(0f, 0f)
                    curveTo(20.8f, 23f, 20.17f, 23f, 19.78f, 22.61f)
                    close()
                    moveTo(14.49f, 17.32f)
                    lineToRelative(-1.5f, -1.5f)
                    curveTo(12.67f, 15.92f, 12.35f, 16f, 12f, 16f)
                    curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                    curveToRelative(0f, -0.35f, 0.08f, -0.67f, 0.19f, -0.98f)
                    lineToRelative(-1.5f, -1.5f)
                    curveTo(7.25f, 11.24f, 7f, 12.09f, 7f, 13f)
                    curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                    curveTo(12.91f, 18f, 13.76f, 17.75f, 14.49f, 17.32f)
                    close()
                }
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

