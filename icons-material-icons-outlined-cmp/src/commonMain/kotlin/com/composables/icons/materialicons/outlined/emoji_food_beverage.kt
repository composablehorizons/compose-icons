package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Emoji_food_beverage: ImageVector
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
                        horizontalLineTo(4f)
                        verticalLineToRelative(10f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        horizontalLineToRelative(6f)
                        curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.89f, 21.11f, 3f, 20f, 3f)
                        close()
                        moveTo(16f, 13f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineTo(8f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(1.4f)
                        lineTo(7.19f, 7.85f)
                        curveTo(7.07f, 7.94f, 7f, 8.09f, 7f, 8.24f)
                        verticalLineToRelative(4.26f)
                        curveTo(7f, 12.78f, 7.22f, 13f, 7.5f, 13f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                        verticalLineTo(8.24f)
                        curveToRelative(0f, -0.15f, -0.07f, -0.3f, -0.19f, -0.39f)
                        lineTo(10f, 6.4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(13f)
                        close()
                        moveTo(9.5f, 7.28f)
                        lineToRelative(1.5f, 1.2f)
                        verticalLineTo(12f)
                        horizontalLineTo(8f)
                        verticalLineTo(8.48f)
                        lineTo(9.5f, 7.28f)
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

