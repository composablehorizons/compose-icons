package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Circle: ImageVector
    get() {
        if (_Circle != null) return _Circle!!
        
        _Circle = ImageVector.Builder(
            name = "circle",
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
                        curveTo(6.47f, 2f, 2f, 6.47f, 2f, 12f)
                        reflectiveCurveToRelative(4.47f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.47f, 10f, -10f)
                        reflectiveCurveTo(17.53f, 2f, 12f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Circle!!
    }

private var _Circle: ImageVector? = null

