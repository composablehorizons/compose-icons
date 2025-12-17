package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Nearby_error: ImageVector
    get() {
        if (_Nearby_error != null) return _Nearby_error!!
        
        _Nearby_error = ImageVector.Builder(
            name = "nearby_error",
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
                        moveTo(12f, 7.57f)
                        lineToRelative(4.42f, 4.42f)
                        lineTo(12f, 16.41f)
                        lineToRelative(-4.42f, -4.42f)
                        lineTo(12f, 7.57f)
                        close()
                        moveTo(12f, 19.19f)
                        lineToRelative(-7.2f, -7.2f)
                        lineToRelative(7.2f, -7.2f)
                        lineToRelative(6f, 6f)
                        verticalLineTo(7.16f)
                        lineToRelative(-4.58f, -4.58f)
                        curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                        lineToRelative(-8.01f, 8f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0f, 2.83f)
                        lineToRelative(8.01f, 8f)
                        curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0f)
                        lineTo(18f, 16.82f)
                        verticalLineToRelative(-3.63f)
                        lineTo(12f, 19.19f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(20f)
                        close()
                        moveTo(22f, 10f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(10f)
                    }
                }
            }
        }.build()
        
        return _Nearby_error!!
    }

private var _Nearby_error: ImageVector? = null

