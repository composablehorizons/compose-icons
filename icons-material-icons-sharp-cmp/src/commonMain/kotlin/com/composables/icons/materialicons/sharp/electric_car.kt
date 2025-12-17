package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Electric_car: ImageVector
    get() {
        if (_Electric_car != null) return _Electric_car!!
        
        _Electric_car = ImageVector.Builder(
            name = "electric_car",
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
                    moveTo(18.58f, 1f)
                    horizontalLineTo(5.43f)
                    lineTo(3f, 8f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(8f)
                    lineTo(18.58f, 1f)
                    close()
                    moveTo(6.5f, 12f)
                    curveTo(5.67f, 12f, 5f, 11.33f, 5f, 10.5f)
                    reflectiveCurveTo(5.67f, 9f, 6.5f, 9f)
                    reflectiveCurveTo(8f, 9.67f, 8f, 10.5f)
                    reflectiveCurveTo(7.33f, 12f, 6.5f, 12f)
                    close()
                    moveTo(17.5f, 12f)
                    curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                    reflectiveCurveTo(16.67f, 9f, 17.5f, 9f)
                    reflectiveCurveTo(19f, 9.67f, 19f, 10.5f)
                    reflectiveCurveTo(18.33f, 12f, 17.5f, 12f)
                    close()
                    moveTo(5f, 7f)
                    lineToRelative(1.5f, -4.5f)
                    horizontalLineToRelative(11f)
                    lineTo(19f, 7f)
                    horizontalLineTo(5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7f, 20f)
                    lineTo(11f, 20f)
                    lineTo(11f, 18f)
                    lineTo(17f, 21f)
                    lineTo(13f, 21f)
                    lineTo(13f, 23f)
                    close()
                }
            }
        }.build()
        
        return _Electric_car!!
    }

private var _Electric_car: ImageVector? = null

