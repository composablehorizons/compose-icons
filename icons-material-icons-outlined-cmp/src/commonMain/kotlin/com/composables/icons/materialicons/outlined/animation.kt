package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Animation: ImageVector
    get() {
        if (_Animation != null) return _Animation!!
        
        _Animation = ImageVector.Builder(
            name = "animation",
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
                        moveTo(15f, 2f)
                        curveToRelative(-2.71f, 0f, -5.05f, 1.54f, -6.22f, 3.78f)
                        curveToRelative(-1.28f, 0.67f, -2.34f, 1.72f, -3f, 3f)
                        curveTo(3.54f, 9.95f, 2f, 12.29f, 2f, 15f)
                        curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                        curveToRelative(2.71f, 0f, 5.05f, -1.54f, 6.22f, -3.78f)
                        curveToRelative(1.28f, -0.67f, 2.34f, -1.72f, 3f, -3f)
                        curveTo(20.46f, 14.05f, 22f, 11.71f, 22f, 9f)
                        curveTo(22f, 5.13f, 18.87f, 2f, 15f, 2f)
                        close()
                        moveTo(9f, 20f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1f, -3f)
                        curveToRelative(0f, 3.87f, 3.13f, 7f, 7f, 7f)
                        curveTo(11.16f, 19.63f, 10.12f, 20f, 9f, 20f)
                        close()
                        moveTo(12f, 17f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -1.12f, 0.37f, -2.16f, 1f, -3f)
                        curveToRelative(0f, 3.86f, 3.13f, 6.99f, 7f, 7f)
                        curveTo(14.16f, 16.63f, 13.12f, 17f, 12f, 17f)
                        close()
                        moveTo(16.7f, 13.7f)
                        curveTo(16.17f, 13.89f, 15.6f, 14f, 15f, 14f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -0.6f, 0.11f, -1.17f, 0.3f, -1.7f)
                        curveTo(10.83f, 7.11f, 11.4f, 7f, 12f, 7f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        curveTo(17f, 12.6f, 16.89f, 13.17f, 16.7f, 13.7f)
                        close()
                        moveTo(19f, 12f)
                        curveToRelative(0f, -3.86f, -3.13f, -6.99f, -7f, -7f)
                        curveToRelative(0.84f, -0.63f, 1.87f, -1f, 3f, -1f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        curveTo(20f, 10.12f, 19.63f, 11.16f, 19f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Animation!!
    }

private var _Animation: ImageVector? = null

