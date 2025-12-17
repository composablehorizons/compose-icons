package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Candlestick_chart: ImageVector
    get() {
        if (_Candlestick_chart != null) return _Candlestick_chart!!
        
        _Candlestick_chart = ImageVector.Builder(
            name = "candlestick_chart",
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
                        moveTo(9f, 4f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        horizontalLineTo(9f)
                        verticalLineTo(4f)
                        close()
                        moveTo(9f, 16f)
                        horizontalLineTo(7f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 8f)
                        horizontalLineTo(9f)
                        verticalLineTo(16f)
                        horizontalLineTo(7f)
                        verticalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 10f)
                        horizontalLineTo(17f)
                        verticalLineTo(13f)
                        horizontalLineTo(15f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        close()
                        moveTo(17f, 13f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Candlestick_chart!!
    }

private var _Candlestick_chart: ImageVector? = null

