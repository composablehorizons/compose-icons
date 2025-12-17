package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
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
                        moveTo(21.71f, 11.29f)
                        lineToRelative(-9f, -9f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineTo(8.21f, 5.38f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(12f, 4.42f)
                        lineTo(19.58f, 12f)
                        lineToRelative(-2.38f, 2.38f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(3.09f, -3.09f)
                        curveTo(22.1f, 12.33f, 22.1f, 11.7f, 21.71f, 11.29f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 7.5f)
                        lineTo(13f, 10.17f)
                        lineTo(15.17f, 12.34f)
                        lineTo(16.5f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1.39f, 4.22f)
                        lineToRelative(3.99f, 3.99f)
                        lineToRelative(-3.09f, 3.09f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(9f, 9f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(3.09f, -3.09f)
                        lineToRelative(3.99f, 3.99f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        close()
                        moveTo(8.03f, 10.85f)
                        curveTo(8.02f, 10.9f, 7.99f, 10.95f, 7.99f, 11f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2.18f)
                        lineToRelative(4.38f, 4.38f)
                        lineTo(12f, 19.58f)
                        lineTo(4.42f, 12f)
                        lineToRelative(2.38f, -2.38f)
                        lineTo(8.03f, 10.85f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

