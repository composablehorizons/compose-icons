package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tour: ImageVector
    get() {
        if (_Tour != null) return _Tour!!
        
        _Tour = ImageVector.Builder(
            name = "tour",
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
                    moveTo(21f, 4f)
                    horizontalLineToRelative(-8f)
                    horizontalLineToRelative(-1f)
                    horizontalLineTo(7f)
                    verticalLineTo(2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(2f)
                    verticalLineToRelative(10f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(4f)
                    horizontalLineToRelative(1f)
                    horizontalLineToRelative(9f)
                    lineToRelative(-2f, -5f)
                    lineTo(21f, 4f)
                    close()
                    moveTo(17.14f, 9.74f)
                    lineToRelative(0.9f, 2.26f)
                    horizontalLineTo(12f)
                    horizontalLineToRelative(-1f)
                    horizontalLineTo(7f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(5f)
                    horizontalLineToRelative(1f)
                    horizontalLineToRelative(5.05f)
                    lineToRelative(-0.9f, 2.26f)
                    lineTo(16.85f, 9f)
                    lineTo(17.14f, 9.74f)
                    close()
                    moveTo(14f, 9f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(14f, 7.9f, 14f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Tour!!
    }

private var _Tour: ImageVector? = null

