package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Single_bed: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 12f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 5f, 6f, 5.9f, 6f, 7f)
                    verticalLineToRelative(3f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(1.33f)
                    lineTo(6f, 19f)
                    horizontalLineToRelative(1f)
                    lineToRelative(0.67f, -2f)
                    horizontalLineToRelative(8.67f)
                    lineTo(17f, 19f)
                    horizontalLineToRelative(1f)
                    lineToRelative(0.67f, -2f)
                    horizontalLineTo(20f)
                    verticalLineTo(12f)
                    close()
                    moveTo(16f, 10f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(10f)
                    close()
                    moveTo(8f, 7f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(8f)
                    verticalLineTo(7f)
                    close()
                    moveTo(6f, 12f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(6f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Single_bed!!
    }

private var _Single_bed: ImageVector? = null

