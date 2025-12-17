package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Eco: ImageVector
    get() {
        if (_Eco != null) return _Eco!!
        
        _Eco = ImageVector.Builder(
            name = "eco",
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
                        moveTo(6.05f, 8.05f)
                        curveToRelative(-2.73f, 2.73f, -2.73f, 7.15f, -0.02f, 9.88f)
                        curveToRelative(1.47f, -3.4f, 4.09f, -6.24f, 7.36f, -7.93f)
                        curveToRelative(-2.77f, 2.34f, -4.71f, 5.61f, -5.39f, 9.32f)
                        curveToRelative(2.6f, 1.23f, 5.8f, 0.78f, 7.95f, -1.37f)
                        curveTo(19.43f, 14.47f, 20f, 4f, 20f, 4f)
                        reflectiveCurveTo(9.53f, 4.57f, 6.05f, 8.05f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Eco!!
    }

private var _Eco: ImageVector? = null

