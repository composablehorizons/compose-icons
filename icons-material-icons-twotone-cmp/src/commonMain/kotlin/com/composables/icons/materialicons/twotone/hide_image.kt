package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Hide_image: ImageVector
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
                        moveTo(16.17f, 19f)
                        lineTo(14.17f, 17f)
                        lineTo(6f, 17f)
                        lineTo(9f, 13f)
                        lineTo(11.25f, 16f)
                        lineTo(12.07f, 14.9f)
                        lineTo(5f, 7.83f)
                        lineTo(5f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.83f, 5f)
                        lineTo(19f, 16.17f)
                        lineTo(19f, 5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 5f)
                        verticalLineToRelative(11.17f)
                        lineToRelative(2f, 2f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(5.83f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(19f)
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
                        moveTo(5f, 19f)
                        verticalLineTo(7.83f)
                        lineToRelative(7.07f, 7.07f)
                        lineTo(11.25f, 16f)
                        lineTo(9f, 13f)
                        lineToRelative(-3f, 4f)
                        horizontalLineToRelative(8.17f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hide_image!!
    }

private var _Hide_image: ImageVector? = null

