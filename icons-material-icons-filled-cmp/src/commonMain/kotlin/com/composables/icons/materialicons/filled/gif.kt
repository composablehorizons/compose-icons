package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Gif: ImageVector
    get() {
        if (_Gif != null) return _Gif!!
        
        _Gif = ImageVector.Builder(
            name = "gif",
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
                        moveTo(11.5f, 9f)
                        horizontalLineTo(13f)
                        verticalLineTo(15f)
                        horizontalLineTo(11.5f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 9f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.6f, 0f, -1f, 0.5f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.5f, 0.4f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.6f, 0f, 1f, -0.5f, 1f, -1f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(10f)
                        verticalLineTo(10f)
                        curveTo(10f, 9.5f, 9.6f, 9f, 9f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 10.5f)
                        lineTo(19f, 9f)
                        lineTo(14.5f, 9f)
                        lineTo(14.5f, 15f)
                        lineTo(16f, 15f)
                        lineTo(16f, 13f)
                        lineTo(18f, 13f)
                        lineTo(18f, 11.5f)
                        lineTo(16f, 11.5f)
                        lineTo(16f, 10.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Gif!!
    }

private var _Gif: ImageVector? = null

