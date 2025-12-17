package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Read_more: ImageVector
    get() {
        if (_Read_more != null) return _Read_more!!
        
        _Read_more = ImageVector.Builder(
            name = "read_more",
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
                        moveTo(13f, 7f)
                        horizontalLineTo(22f)
                        verticalLineTo(9f)
                        horizontalLineTo(13f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 15f)
                        horizontalLineTo(22f)
                        verticalLineTo(17f)
                        horizontalLineTo(13f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 11f)
                        horizontalLineTo(22f)
                        verticalLineTo(13f)
                        horizontalLineTo(16f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 12f)
                        lineTo(8f, 7f)
                        lineTo(8f, 11f)
                        lineTo(2f, 11f)
                        lineTo(2f, 13f)
                        lineTo(8f, 13f)
                        lineTo(8f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Read_more!!
    }

private var _Read_more: ImageVector? = null

