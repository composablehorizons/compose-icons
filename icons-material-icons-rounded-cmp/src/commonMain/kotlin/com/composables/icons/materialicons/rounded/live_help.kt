package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Live_help: ImageVector
    get() {
        if (_Live_help != null) return _Live_help!!
        
        _Live_help = ImageVector.Builder(
            name = "live_help",
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
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(15f, 20f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-6f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2.07f, -7.75f)
                lineToRelative(-0.9f, 0.92f)
                curveToRelative(-0.58f, 0.59f, -0.99f, 1.1f, -1.12f, 2.06f)
                curveToRelative(-0.06f, 0.43f, -0.41f, 0.76f, -0.85f, 0.76f)
                horizontalLineToRelative(-0.31f)
                curveToRelative(-0.52f, 0f, -0.92f, -0.46f, -0.85f, -0.98f)
                curveToRelative(0.11f, -0.91f, 0.53f, -1.72f, 1.14f, -2.34f)
                lineToRelative(1.24f, -1.26f)
                curveToRelative(0.36f, -0.36f, 0.58f, -0.86f, 0.58f, -1.41f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-0.87f, 0f, -1.62f, 0.57f, -1.89f, 1.35f)
                curveToRelative(-0.13f, 0.37f, -0.44f, 0.64f, -0.83f, 0.64f)
                horizontalLineToRelative(-0.3f)
                curveToRelative(-0.58f, 0f, -0.98f, -0.56f, -0.82f, -1.12f)
                curveTo(8.65f, 5.21f, 10.18f, 4f, 12f, 4f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.88f, -0.36f, 1.68f, -0.93f, 2.25f)
                close()
            }
        }.build()
        
        return _Live_help!!
    }

private var _Live_help: ImageVector? = null

