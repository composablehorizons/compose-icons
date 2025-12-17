package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.U_turn_left: ImageVector
    get() {
        if (_U_turn_left != null) return _U_turn_left!!
        
        _U_turn_left = ImageVector.Builder(
            name = "u_turn_left",
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
                    moveTo(3.71f, 12.29f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(6f, 13.17f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                    reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                    verticalLineToRelative(11f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveTo(8f, 6.79f, 8f, 9f)
                    verticalLineToRelative(4.17f)
                    lineToRelative(0.88f, -0.88f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-2.59f, 2.59f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(-2.59f, -2.59f)
                    curveTo(3.32f, 13.32f, 3.32f, 12.68f, 3.71f, 12.29f)
                    close()
                }
            }
        }.build()
        
        return _U_turn_left!!
    }

private var _U_turn_left: ImageVector? = null

