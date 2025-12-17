package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Emoji_food_beverage: ImageVector
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
                        moveTo(2f, 19f)
                        horizontalLineTo(20f)
                        verticalLineTo(21f)
                        horizontalLineTo(2f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 3f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2.4f)
                        lineTo(11f, 7f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        lineToRelative(2f, -1.6f)
                        verticalLineTo(3f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(14f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                        close()
                        moveTo(20f, 8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Emoji_food_beverage!!
    }

private var _Emoji_food_beverage: ImageVector? = null

