package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Flag_circle: ImageVector
    get() {
        if (_Flag_circle != null) return _Flag_circle!!
        
        _Flag_circle = ImageVector.Builder(
            name = "flag_circle",
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
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(18f, 15f)
                        horizontalLineToRelative(-5f)
                        lineToRelative(-1f, -2f)
                        horizontalLineTo(9.5f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(8f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(6f)
                        lineToRelative(1f, 2f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Flag_circle!!
    }

private var _Flag_circle: ImageVector? = null

