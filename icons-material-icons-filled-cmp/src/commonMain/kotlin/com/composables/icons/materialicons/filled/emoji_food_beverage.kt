package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Emoji_food_beverage: ImageVector
    get() {
        if (_Emoji_food_beverage != null) return _Emoji_food_beverage!!
        
        _Emoji_food_beverage = ImageVector.Builder(
            name = "emoji_food_beverage",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2.4f)
                        lineToRelative(1.81f, 1.45f)
                        curveTo(10.93f, 6.94f, 11f, 7.09f, 11f, 7.24f)
                        verticalLineToRelative(4.26f)
                        curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                        horizontalLineToRelative(-4f)
                        curveTo(6.22f, 12f, 6f, 11.78f, 6f, 11.5f)
                        verticalLineTo(7.24f)
                        curveToRelative(0f, -0.15f, 0.07f, -0.3f, 0.19f, -0.39f)
                        lineTo(8f, 5.4f)
                        verticalLineTo(3f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        horizontalLineToRelative(6f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.89f, 21.11f, 3f, 20f, 3f)
                        close()
                        moveTo(20f, 8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 19f)
                        horizontalLineTo(20f)
                        verticalLineTo(21f)
                        horizontalLineTo(4f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_food_beverage!!
    }

private var _Emoji_food_beverage: ImageVector? = null

