package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Home_max: ImageVector
    get() {
        if (_Home_max != null) return _Home_max!!
        
        _Home_max = ImageVector.Builder(
            name = "home_max",
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
                    moveTo(19f, 5f)
                    horizontalLineTo(5f)
                    curveTo(2.79f, 5f, 1f, 6.79f, 1f, 9f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(2f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    verticalLineTo(9f)
                    curveTo(23f, 6.79f, 21.21f, 5f, 19f, 5f)
                    close()
                    moveTo(21f, 14f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(5f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Home_max!!
    }

private var _Home_max: ImageVector? = null

