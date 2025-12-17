package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Lunch_dining: ImageVector
    get() {
        if (_Lunch_dining != null) return _Lunch_dining!!
        
        _Lunch_dining = ImageVector.Builder(
            name = "lunch_dining",
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
                        moveTo(4f, 18f)
                        horizontalLineTo(20f)
                        verticalLineTo(19f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 5f)
                        curveTo(8.61f, 5f, 5.01f, 5.81f, 4.18f, 8f)
                        horizontalLineToRelative(15.66f)
                        curveToRelative(-0.13f, -0.37f, -0.35f, -0.7f, -0.66f, -1.01f)
                        curveTo(17.93f, 5.73f, 15.31f, 5f, 12f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(2f)
                        verticalLineTo(19f)
                        close()
                        moveTo(4f, 18f)
                        horizontalLineToRelative(16f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(4f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.66f, 11.5f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        curveToRelative(-1.19f, 0f, -1.42f, -1f, -3.33f, -1f)
                        curveToRelative(-1.95f, 0f, -2.09f, 1f, -3.33f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.9f, 0f, 2.17f, -1f, 3.35f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.42f, 1f, 3.33f, 1f)
                        curveToRelative(1.95f, 0f, 2.09f, -1f, 3.33f, -1f)
                        curveToRelative(1.19f, 0f, 1.4f, 0.98f, 3.32f, 1f)
                        lineToRelative(-0.01f, -1.98f)
                        curveTo(20.38f, 12.19f, 20.37f, 11.5f, 18.66f, 11.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 9f)
                        curveToRelative(0.02f, -4f, -4.28f, -6f, -10f, -6f)
                        curveTo(6.29f, 3f, 2f, 5f, 2f, 9f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(20f)
                        lineTo(22f, 9f)
                        lineTo(22f, 9f)
                        close()
                        moveTo(4.18f, 8f)
                        curveTo(5.01f, 5.81f, 8.61f, 5f, 12f, 5f)
                        curveToRelative(3.31f, 0f, 5.93f, 0.73f, 7.19f, 1.99f)
                        curveTo(19.49f, 7.3f, 19.71f, 7.63f, 19.84f, 8f)
                        horizontalLineTo(4.18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lunch_dining!!
    }

private var _Lunch_dining: ImageVector? = null

