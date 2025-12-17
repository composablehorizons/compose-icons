package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Security_update: ImageVector
    get() {
        if (_Security_update != null) return _Security_update!!
        
        _Security_update = ImageVector.Builder(
            name = "security_update",
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
                    moveTo(17f, 1.01f)
                    lineTo(7f, 1f)
                    curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(10f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(19f, 1.9f, 18.1f, 1.01f, 17f, 1.01f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(18f)
                    close()
                    moveTo(14.79f, 12.21f)
                    horizontalLineTo(13f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3.21f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                    lineToRelative(2.79f, 2.79f)
                    curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                    lineToRelative(2.79f, -2.79f)
                    curveTo(15.46f, 12.75f, 15.24f, 12.21f, 14.79f, 12.21f)
                    close()
                }
            }
        }.build()
        
        return _Security_update!!
    }

private var _Security_update: ImageVector? = null

