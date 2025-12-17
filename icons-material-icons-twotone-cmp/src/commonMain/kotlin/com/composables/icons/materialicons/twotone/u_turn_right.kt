package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.U_turn_right: ImageVector
    get() {
        if (_U_turn_right != null) return _U_turn_right!!
        
        _U_turn_right = ImageVector.Builder(
            name = "u_turn_right",
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
                    moveTo(6f, 9f)
                    verticalLineToRelative(12f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                    reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                    verticalLineToRelative(4.17f)
                    lineToRelative(-1.59f, -1.59f)
                    lineTo(13f, 13f)
                    lineToRelative(4f, 4f)
                    lineToRelative(4f, -4f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(18f, 13.17f)
                    verticalLineTo(9f)
                    curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                    reflectiveCurveTo(6f, 5.69f, 6f, 9f)
                    close()
                }
            }
        }.build()
        
        return _U_turn_right!!
    }

private var _U_turn_right: ImageVector? = null

