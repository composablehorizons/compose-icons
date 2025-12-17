package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Single_bed: ImageVector
    get() {
        if (_Single_bed != null) return _Single_bed!!
        
        _Single_bed = ImageVector.Builder(
            name = "single_bed",
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
                    moveTo(18f, 10f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 5f, 6f, 5.9f, 6f, 7f)
                    verticalLineToRelative(3f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(1.33f)
                    lineToRelative(0.51f, 1.53f)
                    curveTo(5.94f, 18.81f, 6.2f, 19f, 6.5f, 19f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.3f, 0f, 0.56f, -0.19f, 0.66f, -0.47f)
                    lineTo(7.67f, 17f)
                    horizontalLineToRelative(8.67f)
                    lineToRelative(0.51f, 1.53f)
                    curveTo(16.94f, 18.81f, 17.2f, 19f, 17.5f, 19f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.3f, 0f, 0.56f, -0.19f, 0.66f, -0.47f)
                    lineTo(18.67f, 17f)
                    horizontalLineTo(20f)
                    verticalLineToRelative(-5f)
                    curveTo(20f, 10.9f, 19.1f, 10f, 18f, 10f)
                    close()
                    moveTo(11f, 10f)
                    horizontalLineTo(8f)
                    verticalLineTo(8f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(16f, 10f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Single_bed!!
    }

private var _Single_bed: ImageVector? = null

