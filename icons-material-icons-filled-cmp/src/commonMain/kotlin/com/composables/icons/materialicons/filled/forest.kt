package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Forest: ImageVector
    get() {
        if (_Forest != null) return _Forest!!
        
        _Forest = ImageVector.Builder(
            name = "forest",
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
                        moveTo(16f, 12f)
                        lineTo(9f, 2f)
                        lineTo(2f, 12f)
                        lineTo(3.86f, 12f)
                        lineTo(0f, 18f)
                        lineTo(7f, 18f)
                        lineTo(7f, 22f)
                        lineTo(11f, 22f)
                        lineTo(11f, 18f)
                        lineTo(18f, 18f)
                        lineTo(14.14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.14f, 12f)
                        lineTo(22f, 12f)
                        lineTo(15f, 2f)
                        lineTo(12.61f, 5.41f)
                        lineTo(17.92f, 13f)
                        lineTo(16f, 13f)
                        lineTo(15.97f, 13f)
                        lineTo(19.19f, 18f)
                        lineTo(24f, 18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 19f)
                        horizontalLineTo(17f)
                        verticalLineTo(22f)
                        horizontalLineTo(13f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forest!!
    }

private var _Forest: ImageVector? = null

