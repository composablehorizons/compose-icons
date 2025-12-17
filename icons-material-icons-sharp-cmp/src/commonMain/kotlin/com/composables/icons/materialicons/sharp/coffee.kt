package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Coffee: ImageVector
    get() {
        if (_Coffee != null) return _Coffee!!
        
        _Coffee = ImageVector.Builder(
            name = "coffee",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(18.5f, 3f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(8f)
                    curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                    horizontalLineToRelative(0f)
                    curveToRelative(3.87f, 0f, 7f, -3.13f, 7f, -7f)
                    verticalLineToRelative(-1f)
                    lineToRelative(0.4f, 0f)
                    curveToRelative(1.67f, 0f, 3.19f, -1.13f, 3.52f, -2.77f)
                    curveTo(22.39f, 4.98f, 20.67f, 3f, 18.5f, 3f)
                    close()
                    moveTo(16f, 5f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(6f)
                    verticalLineTo(5f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(18.5f, 8f)
                    horizontalLineTo(18f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(0.5f)
                    curveTo(19.33f, 5f, 20f, 5.67f, 20f, 6.5f)
                    reflectiveCurveTo(19.33f, 8f, 18.5f, 8f)
                    close()
                    moveTo(4f, 19f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(4f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

