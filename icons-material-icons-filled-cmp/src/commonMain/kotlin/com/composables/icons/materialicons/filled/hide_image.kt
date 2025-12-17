package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Hide_image: ImageVector
    get() {
        if (_Hide_image != null) return _Hide_image!!
        
        _Hide_image = ImageVector.Builder(
            name = "hide_image",
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
                        moveTo(21f, 5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5.83f)
                        lineTo(21f, 18.17f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineTo(3f, 5.83f)
                        verticalLineTo(19f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13.17f)
                        lineToRelative(1.61f, 1.61f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(6f, 17f)
                        lineToRelative(3f, -4f)
                        lineToRelative(2.25f, 3f)
                        lineToRelative(0.82f, -1.1f)
                        lineToRelative(2.1f, 2.1f)
                        horizontalLineTo(6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hide_image!!
    }

private var _Hide_image: ImageVector? = null

