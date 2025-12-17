package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Headphones: ImageVector
    get() {
        if (_Headphones != null) return _Headphones!!
        
        _Headphones = ImageVector.Builder(
            name = "headphones",
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
                    moveTo(12f, 3f)
                    curveToRelative(-4.97f, 0f, -9f, 4.03f, -9f, 9f)
                    verticalLineToRelative(7f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(4f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                    reflectiveCurveToRelative(7f, 3.13f, 7f, 7f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(8f)
                    horizontalLineToRelative(4f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-7f)
                    curveTo(21f, 7.03f, 16.97f, 3f, 12f, 3f)
                    close()
                    moveTo(7f, 15f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(19f, 19f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Headphones!!
    }

private var _Headphones: ImageVector? = null

