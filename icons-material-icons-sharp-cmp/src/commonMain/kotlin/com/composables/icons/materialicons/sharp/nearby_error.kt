package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Nearby_error: ImageVector
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
                        moveTo(12f, 7.58f)
                        lineTo(16.42f, 12f)
                        lineTo(12f, 16.42f)
                        lineTo(7.58f, 12f)
                        lineTo(12f, 7.58f)
                        close()
                        moveTo(12f, 19.2f)
                        lineTo(4.8f, 12f)
                        lineTo(12f, 4.8f)
                        lineToRelative(6f, 6f)
                        verticalLineTo(7.17f)
                        lineToRelative(-5.99f, -5.99f)
                        lineTo(1.18f, 12.01f)
                        lineToRelative(10.83f, 10.83f)
                        lineTo(18f, 16.83f)
                        verticalLineTo(13.2f)
                        lineTo(12f, 19.2f)
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

