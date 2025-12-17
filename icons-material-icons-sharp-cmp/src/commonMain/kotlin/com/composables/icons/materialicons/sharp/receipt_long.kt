package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Receipt_long: ImageVector
    get() {
        if (_Receipt_long != null) return _Receipt_long!!
        
        _Receipt_long = ImageVector.Builder(
            name = "receipt_long",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.5f, 3.5f)
                    lineTo(18f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(15f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(12f, 2f)
                    lineToRelative(-1.5f, 1.5f)
                    lineTo(9f, 2f)
                    lineTo(7.5f, 3.5f)
                    lineTo(6f, 2f)
                    verticalLineToRelative(14f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                    horizontalLineToRelative(12f)
                    curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                    verticalLineTo(2f)
                    lineTo(19.5f, 3.5f)
                    close()
                    moveTo(15f, 20f)
                    horizontalLineTo(6f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(20f)
                    close()
                    moveTo(19f, 19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-3f)
                    horizontalLineTo(8f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(11f)
                    verticalLineTo(19f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 7f)
                    horizontalLineTo(15f)
                    verticalLineTo(9f)
                    horizontalLineTo(9f)
                    verticalLineTo(7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(9f, 10f)
                    horizontalLineTo(15f)
                    verticalLineTo(12f)
                    horizontalLineTo(9f)
                    verticalLineTo(10f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 7f)
                    horizontalLineTo(18f)
                    verticalLineTo(9f)
                    horizontalLineTo(16f)
                    verticalLineTo(7f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 10f)
                    horizontalLineTo(18f)
                    verticalLineTo(12f)
                    horizontalLineTo(16f)
                    verticalLineTo(10f)
                    close()
                }
            }
        }.build()
        
        return _Receipt_long!!
    }

private var _Receipt_long: ImageVector? = null

