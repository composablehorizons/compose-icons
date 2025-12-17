package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Rotate_90_degrees_cw: ImageVector
    get() {
        if (_Rotate_90_degrees_cw != null) return _Rotate_90_degrees_cw!!
        
        _Rotate_90_degrees_cw = ImageVector.Builder(
            name = "rotate_90_degrees_cw",
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
                        moveTo(2f, 13f)
                        curveToRelative(0f, 4.97f, 4.03f, 9f, 9f, 9f)
                        curveToRelative(1.76f, 0f, 3.4f, -0.51f, 4.79f, -1.38f)
                        lineToRelative(-1.46f, -1.46f)
                        curveTo(13.34f, 19.69f, 12.2f, 20f, 11f, 20f)
                        curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                        reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                        horizontalLineToRelative(0.17f)
                        lineTo(9.59f, 7.59f)
                        lineTo(11f, 9f)
                        lineToRelative(4f, -4f)
                        lineToRelative(-4f, -4f)
                        lineTo(9.58f, 2.41f)
                        lineTo(11.17f, 4f)
                        horizontalLineTo(11f)
                        curveTo(6.03f, 4f, 2f, 8.03f, 2f, 13f)
                        close()
                        moveTo(11f, 13f)
                        lineToRelative(6f, 6f)
                        lineToRelative(6f, -6f)
                        lineToRelative(-6f, -6f)
                        lineTo(11f, 13f)
                        close()
                        moveTo(17f, 16.17f)
                        lineTo(13.83f, 13f)
                        lineTo(17f, 9.83f)
                        lineTo(20.17f, 13f)
                        lineTo(17f, 16.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rotate_90_degrees_cw!!
    }

private var _Rotate_90_degrees_cw: ImageVector? = null

