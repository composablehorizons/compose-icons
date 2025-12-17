package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Shop_2: ImageVector
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
                        moveTo(2f, 9f)
                        lineTo(2f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(15f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(3f)
                        verticalLineTo(10f)
                        curveTo(3f, 9.45f, 2.55f, 9f, 2f, 9f)
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
                        moveTo(12f, 14.09f)
                        verticalLineTo(8.91f)
                        curveToRelative(0f, -0.39f, 0.44f, -0.63f, 0.77f, -0.42f)
                        lineToRelative(4.07f, 2.59f)
                        curveToRelative(0.31f, 0.2f, 0.31f, 0.65f, 0f, 0.84f)
                        lineToRelative(-4.07f, 2.59f)
                        curveTo(12.44f, 14.72f, 12f, 14.48f, 12f, 14.09f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Shop_2!!
    }

private var _Shop_2: ImageVector? = null

