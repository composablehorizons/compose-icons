package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Screen_rotation_alt: ImageVector
    get() {
        if (_Screen_rotation_alt != null) return _Screen_rotation_alt!!
        
        _Screen_rotation_alt = ImageVector.Builder(
            name = "screen_rotation_alt",
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
                    moveTo(18.53f, 9.29f)
                    curveTo(19.16f, 9.92f, 18.71f, 11f, 17.82f, 11f)
                    curveToRelative(-0.27f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                    lineTo(10.4f, 4f)
                    lineTo(5.41f, 9f)
                    horizontalLineTo(7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    horizontalLineTo(3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1.59f)
                    lineToRelative(5f, -5f)
                    curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                    lineTo(18.53f, 9.29f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5.47f, 14.71f)
                    curveTo(4.84f, 14.08f, 5.29f, 13f, 6.18f, 13f)
                    curveToRelative(0.27f, 0f, 0.52f, 0.11f, 0.71f, 0.29f)
                    lineTo(13.6f, 20f)
                    lineToRelative(4.99f, -5f)
                    horizontalLineTo(17f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1.59f)
                    lineToRelative(-5f, 5f)
                    curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                    lineTo(5.47f, 14.71f)
                    close()
                }
            }
        }.build()
        
        return _Screen_rotation_alt!!
    }

private var _Screen_rotation_alt: ImageVector? = null

