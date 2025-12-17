package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Reset_tv: ImageVector
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
                    verticalLineTo(7f)
                    lineTo(9f, 11f)
                    lineToRelative(3.99f, 4f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(20f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    lineToRelative(0f, -3f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                    verticalLineToRelative(12f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                    lineToRelative(0f, -5f)
                    horizontalLineTo(22f)
                    curveTo(22f, 10.9f, 21.1f, 10f, 20f, 10f)
                    close()
                }
            }
        }.build()
        
        return _Reset_tv!!
    }

private var _Reset_tv: ImageVector? = null

