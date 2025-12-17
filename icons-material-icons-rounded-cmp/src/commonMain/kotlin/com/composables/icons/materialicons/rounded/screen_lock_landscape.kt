package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screen_lock_landscape: ImageVector
    get() {
        if (_Screen_lock_landscape != null) return _Screen_lock_landscape!!
        
        _Screen_lock_landscape = ImageVector.Builder(
            name = "screen_lock_landscape",
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
                    moveTo(21f, 5f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 5f, 1.01f, 5.9f, 1.01f, 7f)
                    lineTo(1f, 17f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7f)
                    curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                    close()
                    moveTo(18f, 17f)
                    horizontalLineTo(6f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(17f)
                    close()
                    moveTo(14f, 11f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    curveTo(15f, 11.45f, 14.55f, 11f, 14f, 11f)
                    close()
                    moveTo(13f, 11f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(11f)
                    close()
                }
            }
            group {
            }
        }.build()
        
        return _Screen_lock_landscape!!
    }

private var _Screen_lock_landscape: ImageVector? = null

