package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Density_medium: ImageVector
    get() {
        if (_Density_medium != null) return _Density_medium!!
        
        _Density_medium = ImageVector.Builder(
            name = "density_medium",
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
                        moveTo(3f, 3f)
                        horizontalLineTo(21f)
                        verticalLineTo(5f)
                        horizontalLineTo(3f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 19f)
                        horizontalLineTo(21f)
                        verticalLineTo(21f)
                        horizontalLineTo(3f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 11f)
                        horizontalLineTo(21f)
                        verticalLineTo(13f)
                        horizontalLineTo(3f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Density_medium!!
    }

private var _Density_medium: ImageVector? = null

