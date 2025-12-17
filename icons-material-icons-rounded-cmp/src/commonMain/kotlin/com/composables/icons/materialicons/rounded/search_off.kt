package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Search_off: ImageVector
    get() {
        if (_Search_off != null) return _Search_off!!
        
        _Search_off = ImageVector.Builder(
            name = "search_off",
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
                        moveTo(15.5f, 14f)
                        horizontalLineToRelative(-0.79f)
                        lineToRelative(-0.28f, -0.27f)
                        curveToRelative(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f)
                        curveToRelative(-0.47f, -2.78f, -2.79f, -4.99f, -5.58f, -5.34f)
                        curveTo(6.54f, 2.58f, 3.3f, 5.38f, 3.03f, 9f)
                        horizontalLineToRelative(2.02f)
                        curveToRelative(0.24f, -2.12f, 1.92f, -3.8f, 4.06f, -3.98f)
                        curveTo(11.65f, 4.8f, 14f, 6.95f, 14f, 9.5f)
                        curveToRelative(0f, 2.49f, -2.01f, 4.5f, -4.5f, 4.5f)
                        curveToRelative(-0.17f, 0f, -0.33f, -0.03f, -0.5f, -0.05f)
                        lineToRelative(0f, 2.02f)
                        curveToRelative(0f, 0f, 0f, 0f, 0.01f, 0.01f)
                        curveToRelative(1.8f, 0.13f, 3.47f, -0.47f, 4.72f, -1.55f)
                        lineTo(14f, 14.71f)
                        verticalLineToRelative(0.79f)
                        lineToRelative(4.25f, 4.25f)
                        curveToRelative(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.41f, -0.41f, 0.41f, -1.08f, 0f, -1.49f)
                        lineTo(15.5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6.12f, 11.17f)
                        lineTo(4f, 13.29f)
                        lineToRelative(-2.12f, -2.12f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        lineTo(3.29f, 14f)
                        lineToRelative(-2.12f, 2.12f)
                        curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        lineTo(4f, 14.71f)
                        lineToRelative(2.12f, 2.12f)
                        curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineTo(4.71f, 14f)
                        lineToRelative(2.12f, -2.12f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(0f, 0f)
                        curveTo(6.63f, 10.98f, 6.32f, 10.98f, 6.12f, 11.17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Search_off!!
    }

private var _Search_off: ImageVector? = null

