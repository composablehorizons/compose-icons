package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ad_units: ImageVector
    get() {
        if (_Ad_units != null) return _Ad_units!!
        
        _Ad_units = ImageVector.Builder(
            name = "ad_units",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 1f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(22f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(1f)
                        close()
                        moveTo(17f, 19f)
                        horizontalLineTo(7f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 6f)
                        horizontalLineTo(16f)
                        verticalLineTo(8f)
                        horizontalLineTo(8f)
                        verticalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Ad_units!!
    }

private var _Ad_units: ImageVector? = null

