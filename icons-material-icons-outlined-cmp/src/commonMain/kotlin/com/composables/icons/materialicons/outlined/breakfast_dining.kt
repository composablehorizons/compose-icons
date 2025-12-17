package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Breakfast_dining: ImageVector
    get() {
        if (_Breakfast_dining != null) return _Breakfast_dining!!
        
        _Breakfast_dining = ImageVector.Builder(
            name = "breakfast_dining",
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
                        moveTo(18f, 3f)
                        horizontalLineTo(6f)
                        curveTo(3.79f, 3f, 2f, 4.79f, 2f, 7f)
                        curveToRelative(0f, 1.48f, 0.81f, 2.75f, 2f, 3.45f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-8.55f)
                        curveToRelative(1.19f, -0.69f, 2f, -1.97f, 2f, -3.45f)
                        curveTo(22f, 4.79f, 20.21f, 3f, 18f, 3f)
                        close()
                        moveTo(19f, 8.72f)
                        lineTo(18f, 9.3f)
                        verticalLineTo(19f)
                        horizontalLineTo(6f)
                        verticalLineTo(9.31f)
                        lineTo(5.01f, 8.73f)
                        curveTo(4.38f, 8.35f, 4f, 7.71f, 4f, 7f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        curveTo(20f, 7.71f, 19.62f, 8.36f, 19f, 8.72f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.71f, 9.29f)
                        curveTo(12.51f, 9.1f, 12.26f, 9f, 12f, 9f)
                        reflectiveCurveToRelative(-0.51f, 0.1f, -0.71f, 0.29f)
                        lineToRelative(-3f, 3f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(3f, 3f)
                        curveTo(11.49f, 16.9f, 11.74f, 17f, 12f, 17f)
                        reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                        lineToRelative(3f, -3f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(12.71f, 9.29f)
                        close()
                        moveTo(12f, 14.58f)
                        lineTo(10.41f, 13f)
                        lineTo(12f, 11.41f)
                        lineTo(13.59f, 13f)
                        lineTo(12f, 14.58f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Breakfast_dining!!
    }

private var _Breakfast_dining: ImageVector? = null

