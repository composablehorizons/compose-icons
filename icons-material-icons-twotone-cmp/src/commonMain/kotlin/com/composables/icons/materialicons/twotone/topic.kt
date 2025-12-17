package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Topic: ImageVector
    get() {
        if (_Topic != null) return _Topic!!
        
        _Topic = ImageVector.Builder(
            name = "topic",
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
                    moveTo(20f, 18f)
                    lineTo(4f, 18f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(5.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                    moveTo(18f, 12f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(12f)
                    close()
                    moveTo(14f, 16f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(16f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 6f)
                    horizontalLineToRelative(-8f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
                    lineTo(2f, 18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16.77f)
                    curveToRelative(0.68f, 0f, 1.23f, -0.56f, 1.23f, -1.23f)
                    verticalLineTo(8f)
                    curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                    close()
                    moveTo(20f, 18f)
                    lineTo(4f, 18f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(5.17f)
                    lineToRelative(2f, 2f)
                    horizontalLineTo(20f)
                    verticalLineTo(18f)
                    close()
                    moveTo(18f, 12f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(12f)
                    close()
                    moveTo(14f, 16f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(16f)
                    close()
                }
            }
        }.build()
        
        return _Topic!!
    }

private var _Topic: ImageVector? = null

