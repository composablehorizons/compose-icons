package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Earbuds: ImageVector
    get() {
        if (_Earbuds != null) return _Earbuds!!
        
        _Earbuds = ImageVector.Builder(
            name = "earbuds",
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
                        moveTo(6.2f, 3.01f)
                        curveTo(4.44f, 2.89f, 3f, 4.42f, 3f, 6.19f)
                        lineTo(3f, 16f)
                        curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                        horizontalLineToRelative(0f)
                        curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                        verticalLineToRelative(7f)
                        lineToRelative(-0.83f, 0f)
                        curveToRelative(-1.61f, 0f, -3.06f, 1.18f, -3.17f, 2.79f)
                        curveToRelative(-0.12f, 1.69f, 1.16f, 3.1f, 2.8f, 3.21f)
                        curveToRelative(1.76f, 0.12f, 3.2f, -1.42f, 3.2f, -3.18f)
                        lineTo(21f, 8f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        verticalLineToRelative(8f)
                        curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                        verticalLineTo(9f)
                        lineToRelative(0.83f, 0f)
                        curveTo(7.44f, 9f, 8.89f, 7.82f, 9f, 6.21f)
                        curveTo(9.11f, 4.53f, 7.83f, 3.11f, 6.2f, 3.01f)
                        close()
                    }
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(6f, 3f)
                    horizontalLineTo(9f)
                    verticalLineTo(9f)
                    horizontalLineTo(6f)
                    verticalLineTo(3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(15f, 15f)
                    horizontalLineTo(18f)
                    verticalLineTo(21f)
                    horizontalLineTo(15f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Earbuds!!
    }

private var _Earbuds: ImageVector? = null

