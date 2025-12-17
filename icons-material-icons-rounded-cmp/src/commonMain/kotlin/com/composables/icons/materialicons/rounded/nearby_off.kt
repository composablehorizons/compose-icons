package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Nearby_off: ImageVector
    get() {
        if (_Nearby_off != null) return _Nearby_off!!
        
        _Nearby_off = ImageVector.Builder(
            name = "nearby_off",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(21.41f, 13.42f)
                        lineTo(18.83f, 16f)
                        lineToRelative(-1.81f, -1.81f)
                        lineTo(19.2f, 12f)
                        lineTo(12f, 4.8f)
                        lineTo(9.81f, 6.99f)
                        lineTo(8f, 5.17f)
                        lineToRelative(2.58f, -2.58f)
                        curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                        lineToRelative(8f, 8f)
                        curveTo(22.2f, 11.37f, 22.2f, 12.63f, 21.41f, 13.42f)
                        close()
                        moveTo(20.48f, 21.9f)
                        lineTo(20.48f, 21.9f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        lineTo(16f, 18.83f)
                        lineToRelative(-2.58f, 2.58f)
                        curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                        lineToRelative(-8f, -8f)
                        curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                        lineTo(5.17f, 8f)
                        lineTo(2.1f, 4.93f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(16.98f, 16.97f)
                        curveTo(20.87f, 20.87f, 20.87f, 21.51f, 20.48f, 21.9f)
                        close()
                        moveTo(14.19f, 17.02f)
                        lineToRelative(-1.39f, -1.39f)
                        lineToRelative(-0.09f, 0.09f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0f)
                        lineToRelative(-3.01f, -3.01f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(0.09f, -0.09f)
                        lineToRelative(-1.4f, -1.39f)
                        lineTo(4.8f, 12f)
                        lineToRelative(7.2f, 7.2f)
                        lineTo(14.19f, 17.02f)
                        close()
                        moveTo(15.71f, 11.29f)
                        lineToRelative(-3.01f, -3.01f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineTo(11.2f, 8.38f)
                        lineToRelative(4.42f, 4.42f)
                        lineToRelative(0.09f, -0.09f)
                        curveTo(16.1f, 12.32f, 16.1f, 11.68f, 15.71f, 11.29f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Nearby_off!!
    }

private var _Nearby_off: ImageVector? = null

