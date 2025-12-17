package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fence: ImageVector
    get() {
        if (_Fence != null) return _Fence!!
        
        _Fence = ImageVector.Builder(
            name = "fence",
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
                    moveTo(21f, 11f)
                    lineTo(21f, 11f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineTo(7f)
                    lineToRelative(-2.29f, -2.29f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(14f, 6f)
                    lineToRelative(-1.29f, -1.29f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(10f, 6f)
                    lineTo(8.71f, 4.71f)
                    curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                    lineTo(5f, 7f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(12f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(1f)
                    curveTo(20.55f, 12f, 21f, 11.55f, 21f, 11f)
                    close()
                    moveTo(16f, 6.83f)
                    lineToRelative(1f, 1f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7.83f)
                    lineToRelative(0.41f, -0.41f)
                    lineTo(16f, 6.83f)
                    close()
                    moveTo(12f, 6.83f)
                    lineToRelative(0.59f, 0.59f)
                    lineTo(13f, 7.83f)
                    verticalLineTo(10f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7.83f)
                    lineToRelative(0.41f, -0.41f)
                    lineTo(12f, 6.83f)
                    close()
                    moveTo(11f, 14f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(13f, 16f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(7f, 7.83f)
                    lineToRelative(1f, -1f)
                    lineToRelative(0.59f, 0.59f)
                    lineTo(9f, 7.83f)
                    verticalLineTo(10f)
                    horizontalLineTo(7f)
                    verticalLineTo(7.83f)
                    close()
                    moveTo(7f, 12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(12f)
                    close()
                    moveTo(7f, 16f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(16f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Fence!!
    }

private var _Fence: ImageVector? = null

