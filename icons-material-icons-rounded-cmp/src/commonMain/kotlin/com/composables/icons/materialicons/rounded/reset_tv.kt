package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Reset_tv: ImageVector
    get() {
        if (_Reset_tv != null) return _Reset_tv!!
        
        _Reset_tv = ImageVector.Builder(
            name = "reset_tv",
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
                    moveTo(20f, 10f)
                    horizontalLineToRelative(-7.01f)
                    verticalLineTo(8.21f)
                    curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                    lineToRelative(-2.78f, 2.79f)
                    curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0f, 0.71f)
                    lineToRelative(2.78f, 2.79f)
                    curveToRelative(0.31f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f)
                    verticalLineTo(12f)
                    horizontalLineTo(20f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    lineToRelative(0f, -2f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-5f)
                    curveTo(22f, 10.9f, 21.1f, 10f, 20f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Reset_tv!!
    }

private var _Reset_tv: ImageVector? = null

