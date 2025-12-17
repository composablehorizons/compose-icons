package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tty: ImageVector
    get() {
        if (_Tty != null) return _Tty!!
        
        _Tty = ImageVector.Builder(
            name = "tty",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 15f)
                    verticalLineToRelative(6f)
                    curveToRelative(-3.28f, 0f, -6.35f, -0.89f, -9f, -2.43f)
                    curveTo(8.27f, 16.99f, 6.01f, 14.73f, 4.43f, 12f)
                    curveTo(2.89f, 9.35f, 2f, 6.28f, 2f, 3f)
                    horizontalLineToRelative(6f)
                    lineToRelative(1f, 5f)
                    lineToRelative(-2.9f, 2.9f)
                    curveToRelative(1.43f, 2.5f, 3.5f, 4.57f, 6f, 6f)
                    lineTo(15f, 14f)
                    lineTo(20f, 15f)
                    close()
                    moveTo(14f, 6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6f)
                    close()
                    moveTo(13f, 9f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(11f, 6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(6f)
                    close()
                    moveTo(18f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(19f, 4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(21f, 7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7f)
                    close()
                    moveTo(22f, 4f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(4f)
                    close()
                    moveTo(14f, 12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(11f, 12f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    close()
                    moveTo(19f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                    moveTo(22f, 10f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Tty!!
    }

private var _Tty: ImageVector? = null

