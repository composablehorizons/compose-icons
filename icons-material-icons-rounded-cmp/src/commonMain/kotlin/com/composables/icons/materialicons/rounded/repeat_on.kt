package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Repeat_on: ImageVector
    get() {
        if (_Repeat_on != null) return _Repeat_on!!
        
        _Repeat_on = ImageVector.Builder(
            name = "repeat_on",
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
                    moveTo(21f, 1f)
                    horizontalLineTo(3f)
                    curveTo(1.9f, 1f, 1f, 1.9f, 1f, 3f)
                    verticalLineToRelative(18f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(3f)
                    curveTo(23f, 1.9f, 22.1f, 1f, 21f, 1f)
                    close()
                    moveTo(19f, 18f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(1.79f)
                    curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f)
                    lineToRelative(-2.79f, -2.79f)
                    curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                    lineToRelative(2.79f, -2.79f)
                    curveTo(6.46f, 14.54f, 7f, 14.76f, 7f, 15.21f)
                    verticalLineTo(17f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(-3f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(18f)
                    close()
                    moveTo(20.64f, 6.35f)
                    lineToRelative(-2.79f, 2.79f)
                    curveTo(17.54f, 9.46f, 17f, 9.24f, 17f, 8.79f)
                    verticalLineTo(7f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(6f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(3.21f)
                    curveToRelative(0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.36f)
                    lineToRelative(2.79f, 2.79f)
                    curveTo(20.84f, 5.84f, 20.84f, 6.15f, 20.64f, 6.35f)
                    close()
                }
            }
        }.build()
        
        return _Repeat_on!!
    }

private var _Repeat_on: ImageVector? = null

