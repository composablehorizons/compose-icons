package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Edgesensor_high: ImageVector
    get() {
        if (_Edgesensor_high != null) return _Edgesensor_high!!
        
        _Edgesensor_high = ImageVector.Builder(
            name = "edgesensor_high",
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
                        moveTo(3f, 7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(3f)
                        verticalLineTo(7f)
                        close()
                        moveTo(0f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(0f)
                        verticalLineTo(10f)
                        close()
                        moveTo(22f, 7f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(7f)
                        close()
                        moveTo(19f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(10f)
                        close()
                        moveTo(18f, 2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(2f)
                        close()
                        moveTo(16f, 17f)
                        horizontalLineTo(8f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Edgesensor_high!!
    }

private var _Edgesensor_high: ImageVector? = null

