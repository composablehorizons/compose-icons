package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fort: ImageVector
    get() {
        if (_Fort != null) return _Fort!!
        
        _Fort = ImageVector.Builder(
            name = "fort",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 4f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2.17f)
                        curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                        lineTo(15f, 9f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(10.79f, 7.21f, 11f, 6.7f, 11f, 6.17f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(9.45f, 3f, 9f, 3.45f, 9f, 4f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(5.45f, 3f, 5f, 3.45f, 5f, 4f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(3f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(1.45f, 3f, 1f, 3.45f, 1f, 4f)
                        verticalLineToRelative(2.17f)
                        curveTo(1f, 6.7f, 1.21f, 7.21f, 1.59f, 7.59f)
                        lineTo(3f, 9f)
                        verticalLineToRelative(6f)
                        lineToRelative(-1.41f, 1.41f)
                        curveTo(1.21f, 16.79f, 1f, 17.3f, 1f, 17.83f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(7f)
                        lineToRelative(0f, -2.89f)
                        curveToRelative(0f, -1f, 0.68f, -1.92f, 1.66f, -2.08f)
                        curveTo(12.92f, 15.82f, 14f, 16.79f, 14f, 18f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(7f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1.17f)
                        curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                        lineTo(21f, 15f)
                        verticalLineTo(9f)
                        lineToRelative(1.41f, -1.41f)
                        curveTo(22.79f, 7.21f, 23f, 6.7f, 23f, 6.17f)
                        verticalLineTo(4f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(0f)
                        curveTo(21.45f, 3f, 21f, 3.45f, 21f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

