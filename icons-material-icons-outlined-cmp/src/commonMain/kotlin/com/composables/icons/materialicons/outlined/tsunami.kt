package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tsunami: ImageVector
    get() {
        if (_Tsunami != null) return _Tsunami!!
        
        _Tsunami = ImageVector.Builder(
            name = "tsunami",
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
                        moveTo(18.67f, 17.63f)
                        curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0f)
                        curveToRelative(-0.66f, 0.49f, -2.92f, 2.76f, -6.67f, 0f)
                        curveTo(3.43f, 19.03f, 2.65f, 19f, 2f, 19f)
                        verticalLineToRelative(2f)
                        curveToRelative(1.16f, 0f, 2.3f, -0.32f, 3.33f, -0.93f)
                        curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0f)
                        curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0f)
                        curveTo(19.7f, 20.68f, 20.84f, 21f, 22f, 21f)
                        verticalLineToRelative(-2f)
                        curveTo(21.34f, 19f, 20.5f, 18.98f, 18.67f, 17.63f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.33f, 12f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2.67f)
                        curveTo(17.5f, 10f, 16f, 8.5f, 16f, 6.67f)
                        curveToRelative(0f, -1.02f, 0.38f, -1.74f, 1.09f, -3.34f)
                        curveTo(15.72f, 3.12f, 15.09f, 3f, 14f, 3f)
                        curveTo(7.36f, 3f, 2.15f, 8.03f, 2.01f, 14.5f)
                        curveToRelative(0f, 0f, -0.01f, 2f, -0.01f, 2f)
                        curveToRelative(1.16f, 0f, 2.3f, -0.32f, 3.33f, -0.93f)
                        curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0f)
                        curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0f)
                        curveToRelative(1.03f, 0.61f, 2.17f, 0.93f, 3.33f, 0.93f)
                        verticalLineToRelative(-2f)
                        curveToRelative(-0.66f, 0f, -1.5f, -0.02f, -3.33f, -1.37f)
                        curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0f)
                        curveToRelative(-0.9f, 0.67f, -0.54f, 0.41f, -0.91f, 0.63f)
                        curveTo(10.39f, 12.82f, 10f, 11.7f, 10f, 10.5f)
                        curveToRelative(0f, -2.58f, 1.77f, -4.74f, 4.21f, -5.33f)
                        curveTo(14.08f, 5.68f, 14f, 6.19f, 14f, 6.67f)
                        curveTo(14f, 9.61f, 16.39f, 12f, 19.33f, 12f)
                        close()
                        moveTo(5.33f, 13.13f)
                        curveToRelative(-0.62f, 0.46f, -0.82f, 0.63f, -1.3f, 0.87f)
                        curveToRelative(0.27f, -3.53f, 2.38f, -6.48f, 5.43f, -7.96f)
                        curveTo(8.54f, 7.29f, 8f, 8.83f, 8f, 10.5f)
                        curveToRelative(0f, 1.42f, 0.4f, 2.77f, 1.13f, 3.95f)
                        curveTo(8.41f, 14.52f, 7.34f, 14.6f, 5.33f, 13.13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Tsunami!!
    }

private var _Tsunami: ImageVector? = null

