package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Landslide: ImageVector
    get() {
        if (_Landslide != null) return _Landslide!!
        
        _Landslide = ImageVector.Builder(
            name = "landslide",
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
                        moveTo(15.47f, 13.79f)
                        lineTo(12.89f, 12.76f)
                        lineTo(6f, 15.05f)
                        lineTo(2f, 13.51f)
                        lineTo(2f, 15.61f)
                        lineTo(6f, 16.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.57f, 11.42f)
                        lineTo(8f, 8f)
                        lineTo(2f, 8f)
                        lineTo(2f, 11.61f)
                        lineTo(6f, 12.95f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 19.05f)
                        lineTo(2f, 17.72f)
                        lineTo(2f, 22f)
                        lineTo(22f, 22f)
                        lineTo(17.03f, 15.38f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 6f)
                        lineTo(17f, 1f)
                        lineTo(12f, 0f)
                        lineTo(9f, 2f)
                        lineTo(9f, 6f)
                        lineTo(12f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.5f, 7f)
                        lineTo(16f, 9f)
                        lineTo(16f, 12f)
                        lineTo(18.5f, 14f)
                        lineTo(23f, 12f)
                        lineTo(23f, 8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null

