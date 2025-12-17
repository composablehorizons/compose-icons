package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Discount: ImageVector
    get() {
        if (_Discount != null) return _Discount!!
        
        _Discount = ImageVector.Builder(
            name = "discount",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(12.79f, 21f)
                            lineTo(3f, 11.21f)
                            lineTo(3f, 14.04f)
                            lineTo(12.79f, 23.83f)
                            lineTo(21.83f, 14.79f)
                            lineTo(20.41f, 13.38f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 9.04f)
                            lineToRelative(9.79f, 9.79f)
                            lineToRelative(9.04f, -9.04f)
                            lineTo(12.04f, 0f)
                            horizontalLineTo(3f)
                            verticalLineTo(9.04f)
                            close()
                            moveTo(7.25f, 3f)
                            curveTo(7.94f, 3f, 8.5f, 3.56f, 8.5f, 4.25f)
                            reflectiveCurveTo(7.94f, 5.5f, 7.25f, 5.5f)
                            reflectiveCurveTo(6f, 4.94f, 6f, 4.25f)
                            reflectiveCurveTo(6.56f, 3f, 7.25f, 3f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Discount!!
    }

private var _Discount: ImageVector? = null

