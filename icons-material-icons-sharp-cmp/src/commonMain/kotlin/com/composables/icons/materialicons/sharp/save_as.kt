package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Save_as: ImageVector
    get() {
        if (_Save_as != null) return _Save_as!!
        
        _Save_as = ImageVector.Builder(
            name = "save_as",
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
                    moveTo(21f, 12.4f)
                    verticalLineTo(7f)
                    lineToRelative(-4f, -4f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(9.4f)
                    lineTo(21f, 12.4f)
                    close()
                    moveTo(15f, 15f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                    reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                    reflectiveCurveTo(15f, 13.34f, 15f, 15f)
                    close()
                    moveTo(6f, 6f)
                    horizontalLineToRelative(9f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(6f)
                    verticalLineTo(6f)
                    close()
                    moveTo(19.99f, 16.25f)
                    lineToRelative(1.77f, 1.77f)
                    lineTo(16.77f, 23f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(-1.77f)
                    lineTo(19.99f, 16.25f)
                    close()
                    moveTo(23.61f, 16.16f)
                    lineToRelative(-1.2f, 1.2f)
                    lineToRelative(-1.77f, -1.77f)
                    lineToRelative(1.2f, -1.2f)
                    lineTo(23.61f, 16.16f)
                    close()
                }
            }
        }.build()
        
        return _Save_as!!
    }

private var _Save_as: ImageVector? = null

