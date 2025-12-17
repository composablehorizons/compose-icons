package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Upgrade: ImageVector
    get() {
        if (_Upgrade != null) return _Upgrade!!
        
        _Upgrade = ImageVector.Builder(
            name = "upgrade",
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
                    moveTo(16f, 19f)
                    lineTo(16f, 19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    curveTo(15.55f, 18f, 16f, 18.45f, 16f, 19f)
                    close()
                    moveTo(11f, 7.99f)
                    verticalLineTo(15f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7.99f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                    lineToRelative(-2.79f, -2.78f)
                    curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                    lineTo(8.86f, 7.14f)
                    curveTo(8.54f, 7.45f, 8.76f, 7.99f, 9.21f, 7.99f)
                    horizontalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Upgrade!!
    }

private var _Upgrade: ImageVector? = null

