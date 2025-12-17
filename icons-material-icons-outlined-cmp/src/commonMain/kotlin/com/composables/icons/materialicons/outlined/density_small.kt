package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Density_small: ImageVector
    get() {
        if (_Density_small != null) return _Density_small!!
        
        _Density_small = ImageVector.Builder(
            name = "density_small",
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
                        moveTo(3f, 2f)
                        horizontalLineTo(21f)
                        verticalLineTo(4f)
                        horizontalLineTo(3f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 20f)
                        horizontalLineTo(21f)
                        verticalLineTo(22f)
                        horizontalLineTo(3f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 14f)
                        horizontalLineTo(21f)
                        verticalLineTo(16f)
                        horizontalLineTo(3f)
                        verticalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 8f)
                        horizontalLineTo(21f)
                        verticalLineTo(10f)
                        horizontalLineTo(3f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Density_small!!
    }

private var _Density_small: ImageVector? = null

