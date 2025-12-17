package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Fort: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    lineToRelative(2f, 2f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(9f)
                    verticalLineTo(9f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(7f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineTo(3f)
                    horizontalLineTo(1f)
                    verticalLineToRelative(4f)
                    lineToRelative(2f, 2f)
                    verticalLineToRelative(6f)
                    lineToRelative(-2f, 2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(-4f)
                    lineToRelative(-2f, -2f)
                    verticalLineTo(9f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(3f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(21f, 19f)
                    horizontalLineToRelative(-5f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(-1.17f)
                    lineToRelative(2f, -2f)
                    verticalLineTo(8.17f)
                    lineTo(3.83f, 7f)
                    horizontalLineToRelative(4.34f)
                    lineTo(7f, 8.17f)
                    verticalLineTo(12f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(8.17f)
                    lineTo(15.83f, 7f)
                    horizontalLineToRelative(4.34f)
                    lineTo(19f, 8.17f)
                    verticalLineToRelative(7.66f)
                    lineToRelative(2f, 2f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Fort!!
    }

private var _Fort: ImageVector? = null

