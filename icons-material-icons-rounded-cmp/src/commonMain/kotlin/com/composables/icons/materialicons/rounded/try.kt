package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Try: ImageVector
    get() {
        if (_Try != null) return _Try!!
        
        _Try = ImageVector.Builder(
            name = "try",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(15.59f)
                    curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                    lineTo(6f, 18f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(13.57f, 11.57f)
                    lineToRelative(-1.12f, 2.44f)
                    curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0f)
                    lineToRelative(-1.12f, -2.44f)
                    lineToRelative(-2.44f, -1.12f)
                    curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0f, -0.91f)
                    lineToRelative(2.44f, -1.12f)
                    lineToRelative(1.12f, -2.44f)
                    curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0f)
                    lineToRelative(1.12f, 2.44f)
                    lineToRelative(2.44f, 1.12f)
                    curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0f, 0.91f)
                    lineTo(13.57f, 11.57f)
                    close()
                }
            }
        }.build()
        
        return _Try!!
    }

private var _Try: ImageVector? = null

