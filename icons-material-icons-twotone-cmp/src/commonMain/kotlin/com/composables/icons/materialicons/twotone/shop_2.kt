package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Shop_2: ImageVector
    get() {
        if (_Shop_2 != null) return _Shop_2!!
        
        _Shop_2 = ImageVector.Builder(
            name = "shop_2",
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
                        moveTo(7f, 16f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(7f)
                        horizontalLineTo(7f)
                        verticalLineTo(16f)
                        close()
                        moveTo(12f, 8f)
                        lineToRelative(5.5f, 3.5f)
                        lineTo(12f, 15f)
                        verticalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 9f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(3f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 5f)
                        verticalLineTo(3f)
                        curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(12f, 3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        close()
                        moveTo(21f, 16f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 8f)
                        lineTo(12f, 15f)
                        lineTo(17.5f, 11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Shop_2!!
    }

private var _Shop_2: ImageVector? = null

