package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Calculate: ImageVector
    get() {
        if (_Calculate != null) return _Calculate!!
        
        _Calculate = ImageVector.Builder(
            name = "calculate",
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
                    moveTo(19f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(13.56f, 6.53f)
                    lineTo(13.56f, 6.53f)
                    curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                    lineToRelative(0.88f, 0.88f)
                    lineToRelative(0.88f, -0.88f)
                    curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                    lineToRelative(-0.88f, 0.88f)
                    lineToRelative(0.88f, 0.88f)
                    curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                    verticalLineToRelative(0f)
                    curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                    lineTo(15.5f, 9.54f)
                    lineToRelative(-0.88f, 0.88f)
                    curveToRelative(-0.29f, 0.29f, -0.77f, 0.29f, -1.06f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.29f, -0.29f, -0.29f, -0.77f, 0f, -1.06f)
                    lineToRelative(0.88f, -0.88f)
                    lineToRelative(-0.88f, -0.88f)
                    curveTo(13.26f, 7.3f, 13.26f, 6.82f, 13.56f, 6.53f)
                    close()
                    moveTo(7f, 7.72f)
                    horizontalLineToRelative(3.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineTo(7f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineToRelative(0f)
                    curveTo(6.25f, 8.06f, 6.59f, 7.72f, 7f, 7.72f)
                    close()
                    moveTo(10.75f, 16f)
                    horizontalLineTo(9.5f)
                    verticalLineToRelative(1.25f)
                    curveTo(9.5f, 17.66f, 9.16f, 18f, 8.75f, 18f)
                    horizontalLineToRelative(0f)
                    curveTo(8.34f, 18f, 8f, 17.66f, 8f, 17.25f)
                    verticalLineTo(16f)
                    horizontalLineTo(6.75f)
                    curveTo(6.34f, 16f, 6f, 15.66f, 6f, 15.25f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-1.25f)
                    curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(1.25f)
                    horizontalLineToRelative(1.25f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(0f)
                    curveTo(11.5f, 15.66f, 11.16f, 16f, 10.75f, 16f)
                    close()
                    moveTo(17.25f, 17.25f)
                    horizontalLineToRelative(-3.5f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                    horizontalLineToRelative(3.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    lineToRelative(0f, 0f)
                    curveTo(18f, 16.91f, 17.66f, 17.25f, 17.25f, 17.25f)
                    close()
                    moveTo(17.25f, 14.75f)
                    horizontalLineToRelative(-3.5f)
                    curveTo(13.34f, 14.75f, 13f, 14.41f, 13f, 14f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                    horizontalLineToRelative(3.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineToRelative(0f)
                    curveTo(18f, 14.41f, 17.66f, 14.75f, 17.25f, 14.75f)
                    close()
                }
            }
        }.build()
        
        return _Calculate!!
    }

private var _Calculate: ImageVector? = null

