package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
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
                        moveTo(6.6f, 11f)
                        lineTo(17.4f, 11f)
                        lineTo(16.5f, 8f)
                        lineTo(7.5f, 8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 11f)
                        lineTo(20f, 13f)
                        lineTo(4f, 13f)
                        lineTo(4f, 11f)
                        lineTo(2f, 11f)
                        lineTo(2f, 22f)
                        lineTo(10f, 22f)
                        lineTo(10f, 17f)
                        lineTo(14f, 17f)
                        lineTo(14f, 22f)
                        lineTo(22f, 22f)
                        lineTo(22f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.9f, 6f)
                        lineTo(15f, 3f)
                        lineTo(15f, 1f)
                        lineTo(13f, 1f)
                        lineTo(13f, 3f)
                        lineTo(10.97f, 3f)
                        lineTo(10.97f, 1f)
                        lineTo(8.97f, 1f)
                        lineTo(8.97f, 3.12f)
                        lineTo(8.1f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

