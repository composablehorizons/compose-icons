package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shop_2: ImageVector
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
                        moveTo(3f, 9f)
                        lineTo(1f, 9f)
                        lineTo(1f, 22f)
                        lineTo(19f, 22f)
                        lineTo(19f, 20f)
                        lineTo(3f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 5f)
                        verticalLineTo(1f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(13f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(5f)
                        horizontalLineTo(18f)
                        close()
                        moveTo(12f, 3f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        close()
                        moveTo(12f, 15f)
                        verticalLineTo(8f)
                        lineToRelative(5.5f, 3.5f)
                        lineTo(12f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Shop_2!!
    }

private var _Shop_2: ImageVector? = null

