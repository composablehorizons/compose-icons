package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Output: ImageVector
    get() {
        if (_Output != null) return _Output!!
        
        _Output = ImageVector.Builder(
            name = "output",
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
                        moveTo(17f, 17f)
                        lineTo(22f, 12f)
                        lineTo(17f, 7f)
                        lineTo(15.59f, 8.41f)
                        lineTo(18.17f, 11f)
                        lineTo(9f, 11f)
                        lineTo(9f, 13f)
                        lineTo(18.17f, 13f)
                        lineTo(15.59f, 15.59f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 19f)
                        lineTo(5f, 19f)
                        lineTo(5f, 5f)
                        lineTo(19f, 5f)
                        lineTo(19f, 7f)
                        lineTo(21f, 7f)
                        lineTo(21f, 3f)
                        lineTo(3f, 3f)
                        lineTo(3f, 21f)
                        lineTo(21f, 21f)
                        lineTo(21f, 17f)
                        lineTo(19f, 17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Output!!
    }

private var _Output: ImageVector? = null

