package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Square_foot: ImageVector
    get() {
        if (_Square_foot != null) return _Square_foot!!
        
        _Square_foot = ImageVector.Builder(
            name = "square_foot",
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
                        moveTo(17.66f, 17.66f)
                        lineToRelative(-0.71f, 0.71f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0.71f, -0.71f)
                        lineToRelative(-1.94f, -1.94f)
                        lineToRelative(-0.71f, 0.71f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0.71f, -0.71f)
                        lineToRelative(-1.94f, -1.94f)
                        lineToRelative(-0.71f, 0.71f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0.71f, -0.71f)
                        lineTo(9.7f, 9.7f)
                        lineToRelative(-0.71f, 0.71f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0.71f, -0.71f)
                        lineTo(7.05f, 7.05f)
                        lineTo(6.34f, 7.76f)
                        curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0.71f, -0.71f)
                        lineTo(4.85f, 4.85f)
                        curveTo(4.54f, 4.54f, 4f, 4.76f, 4f, 5.21f)
                        verticalLineTo(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12.79f)
                        curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                        lineTo(17.66f, 17.66f)
                        close()
                        moveTo(7f, 16f)
                        verticalLineToRelative(-4.76f)
                        lineTo(12.76f, 17f)
                        horizontalLineTo(8f)
                        curveTo(7.45f, 17f, 7f, 16.55f, 7f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Square_foot!!
    }

private var _Square_foot: ImageVector? = null

