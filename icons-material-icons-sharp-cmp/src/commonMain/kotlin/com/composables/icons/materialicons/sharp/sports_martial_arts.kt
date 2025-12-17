package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sports_martial_arts: ImageVector
    get() {
        if (_Sports_martial_arts != null) return _Sports_martial_arts!!
        
        _Sports_martial_arts = ImageVector.Builder(
            name = "sports_martial_arts",
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
                        moveTo(19.8f, 2f)
                        lineTo(11.6f, 8.7f)
                        lineTo(10.39f, 7.66f)
                        lineTo(13.99f, 5.58f)
                        lineTo(9.41f, 1f)
                        lineTo(8f, 2.41f)
                        lineTo(10.74f, 5.15f)
                        lineTo(5f, 8.46f)
                        lineTo(3.81f, 12.75f)
                        lineTo(6.27f, 17f)
                        lineTo(8f, 16f)
                        lineTo(5.97f, 12.48f)
                        lineTo(6.32f, 11.18f)
                        lineTo(9.5f, 13f)
                        lineTo(10f, 22f)
                        lineTo(12f, 22f)
                        lineTo(12.5f, 12f)
                        lineTo(21f, 3.4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 5f)
                        arcTo(2f, 2f, 0f, false, true, 5f, 7f)
                        arcTo(2f, 2f, 0f, false, true, 3f, 5f)
                        arcTo(2f, 2f, 0f, false, true, 7f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_martial_arts!!
    }

private var _Sports_martial_arts: ImageVector? = null

