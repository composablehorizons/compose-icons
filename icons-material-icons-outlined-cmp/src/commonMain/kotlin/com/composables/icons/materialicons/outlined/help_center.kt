package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Help_center: ImageVector
    get() {
        if (_Help_center != null) return _Help_center!!
        
        _Help_center = ImageVector.Builder(
            name = "help_center",
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
                    moveTo(13.25f, 16.74f)
                    curveToRelative(0f, 0.69f, -0.53f, 1.26f, -1.25f, 1.26f)
                    curveToRelative(-0.7f, 0f, -1.26f, -0.56f, -1.26f, -1.26f)
                    curveToRelative(0f, -0.71f, 0.56f, -1.25f, 1.26f, -1.25f)
                    curveTo(12.71f, 15.49f, 13.25f, 16.04f, 13.25f, 16.74f)
                    close()
                    moveTo(11.99f, 6f)
                    curveToRelative(-1.77f, 0f, -2.98f, 1.15f, -3.43f, 2.49f)
                    lineToRelative(1.64f, 0.69f)
                    curveToRelative(0.22f, -0.67f, 0.74f, -1.48f, 1.8f, -1.48f)
                    curveToRelative(1.62f, 0f, 1.94f, 1.52f, 1.37f, 2.33f)
                    curveToRelative(-0.54f, 0.77f, -1.47f, 1.29f, -1.96f, 2.16f)
                    curveToRelative(-0.39f, 0.69f, -0.31f, 1.49f, -0.31f, 1.98f)
                    horizontalLineToRelative(1.82f)
                    curveToRelative(0f, -0.93f, 0.07f, -1.12f, 0.22f, -1.41f)
                    curveToRelative(0.39f, -0.72f, 1.11f, -1.06f, 1.87f, -2.17f)
                    curveToRelative(0.68f, -1f, 0.42f, -2.36f, -0.02f, -3.08f)
                    curveTo(14.48f, 6.67f, 13.47f, 6f, 11.99f, 6f)
                    close()
                    moveTo(19f, 5f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(5f)
                    moveTo(19f, 3f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(5f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(19f)
                    lineTo(19f, 3f)
                    close()
                }
            }
        }.build()
        
        return _Help_center!!
    }

private var _Help_center: ImageVector? = null

