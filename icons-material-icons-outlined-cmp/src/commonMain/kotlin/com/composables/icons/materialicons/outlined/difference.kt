package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Difference: ImageVector
    get() {
        if (_Difference != null) return _Difference!!
        
        _Difference = ImageVector.Builder(
            name = "difference",
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
                    moveTo(18f, 23f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(23f)
                    close()
                    moveTo(14.5f, 7f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineTo(14.5f)
                    close()
                    moveTo(16.5f, 13f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(13f)
                    close()
                    moveTo(15f, 1f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 1f, 6.01f, 1.9f, 6.01f, 3f)
                    lineTo(6f, 17f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(19f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7f)
                    lineTo(15f, 1f)
                    close()
                    moveTo(19f, 17f)
                    horizontalLineTo(8f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(6.17f)
                    lineTo(19f, 7.83f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

