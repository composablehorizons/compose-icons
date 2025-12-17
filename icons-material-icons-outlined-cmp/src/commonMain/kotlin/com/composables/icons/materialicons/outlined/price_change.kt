package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Price_change: ImageVector
    get() {
        if (_Price_change != null) return _Price_change!!
        
        _Price_change = ImageVector.Builder(
            name = "price_change",
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
                        moveTo(8f, 17f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(7f)
                        curveTo(6.45f, 8f, 6f, 8.45f, 6f, 9f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(17f)
                        close()
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.89f, 4f, 2.01f, 4.89f, 2.01f, 6f)
                        lineTo(2f, 18f)
                        curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                        close()
                        moveTo(20f, 18f)
                        horizontalLineTo(4f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(18f)
                        close()
                        moveTo(14f, 10f)
                        lineToRelative(2f, -2f)
                        lineToRelative(2f, 2f)
                        moveTo(18f, 14.25f)
                        lineToRelative(-2f, 2f)
                        lineToRelative(-2f, -2f)
                    }
                }
            }
        }.build()
        
        return _Price_change!!
    }

private var _Price_change: ImageVector? = null

