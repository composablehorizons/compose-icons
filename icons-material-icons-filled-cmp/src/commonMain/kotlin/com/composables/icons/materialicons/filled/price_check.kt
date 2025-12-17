package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Price_check: ImageVector
    get() {
        if (_Price_check != null) return _Price_check!!
        
        _Price_check = ImageVector.Builder(
            name = "price_check",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(12f, 13f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(4f)
                        horizontalLineTo(9.5f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(6f)
                        curveTo(5.45f, 4f, 5f, 4.45f, 5f, 5f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2.5f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(11f)
                        curveTo(11.55f, 14f, 12f, 13.55f, 12f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.59f, 12.52f)
                        lineTo(13.93f, 18.17f)
                        lineTo(11.1f, 15.34f)
                        lineTo(9.69f, 16.76f)
                        lineTo(13.93f, 21f)
                        lineTo(21f, 13.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null

