package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.41f, 6.58f)
                        lineTo(12f, 4f)
                        horizontalLineToRelative(0f)
                        lineToRelative(8f, 8f)
                        lineToRelative(-2.58f, 2.59f)
                        lineTo(18.83f, 16f)
                        lineToRelative(2.58f, -2.59f)
                        curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                        lineToRelative(-8f, -8f)
                        curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                        lineTo(8f, 5.17f)
                        lineTo(9.41f, 6.58f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineTo(5.17f, 8f)
                        lineToRelative(-2.58f, 2.59f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(8f, 8f)
                        curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                        lineTo(16f, 18.83f)
                        lineToRelative(3.78f, 3.78f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(12f, 20f)
                        lineToRelative(-8f, -8f)
                        lineToRelative(2.58f, -2.59f)
                        lineTo(8.17f, 11f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(3.17f)
                        lineToRelative(1.5f, 1.5f)
                        lineToRelative(-1.08f, 1.09f)
                        lineTo(12f, 17f)
                        lineToRelative(1.09f, -1.09f)
                        lineToRelative(1.5f, 1.5f)
                        lineTo(12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.91647f, 8.087273f)
                        lineTo(12.0054035f, 6.9983387f)
                        lineTo(17.0046f, 11.997536f)
                        lineTo(15.915666f, 13.08647f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

