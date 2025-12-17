package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Switch_account: ImageVector
    get() {
        if (_Switch_account != null) return _Switch_account!!
        
        _Switch_account = ImageVector.Builder(
            name = "switch_account",
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
                    moveTo(4f, 6f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    close()
                    moveTo(6f, 2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(14f, 5f)
                    curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                    curveTo(11f, 6.34f, 12.34f, 5f, 14f, 5f)
                    close()
                    moveTo(7.76f, 16f)
                    curveToRelative(1.47f, -1.83f, 3.71f, -3f, 6.24f, -3f)
                    reflectiveCurveToRelative(4.77f, 1.17f, 6.24f, 3f)
                    horizontalLineTo(7.76f)
                    close()
                }
            }
        }.build()
        
        return _Switch_account!!
    }

private var _Switch_account: ImageVector? = null

