package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Difference: ImageVector
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
                    moveTo(3f, 7f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(13f)
                    horizontalLineToRelative(13f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(8f)
                    curveTo(2f, 7.45f, 2.45f, 7f, 3f, 7f)
                    close()
                    moveTo(15.59f, 1.59f)
                    curveTo(15.21f, 1.21f, 14.7f, 1f, 14.17f, 1f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 1f, 6.01f, 1.9f, 6.01f, 3f)
                    lineTo(6f, 17f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(19f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(7.83f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineTo(15.59f, 1.59f)
                    close()
                    moveTo(15.5f, 15f)
                    horizontalLineToRelative(-4f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(16.5f, 14.55f, 16.05f, 15f, 15.5f, 15f)
                    close()
                    moveTo(15.5f, 9f)
                    horizontalLineToRelative(-1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-1f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(1f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(0f)
                    curveTo(16.5f, 8.55f, 16.05f, 9f, 15.5f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

