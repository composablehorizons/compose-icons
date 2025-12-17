package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Discount: ImageVector
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
                            verticalLineToRelative(2f)
                            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                            lineToRelative(7.79f, 7.79f)
                            curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                            lineToRelative(6.21f, -6.21f)
                            curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                            lineTo(12.79f, 21f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(11.38f, 17.41f)
                            curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                            lineToRelative(6.21f, -6.21f)
                            curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                            lineToRelative(-7.79f, -7.79f)
                            curveTo(12.25f, 0.21f, 11.74f, 0f, 11.21f, 0f)
                            horizontalLineTo(5f)
                            curveTo(3.9f, 0f, 3f, 0.9f, 3f, 2f)
                            verticalLineToRelative(6.21f)
                            curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                            lineTo(11.38f, 17.41f)
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

