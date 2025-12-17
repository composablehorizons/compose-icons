package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Auto_awesome: ImageVector
    get() {
        if (_Auto_awesome != null) return _Auto_awesome!!
        
        _Auto_awesome = ImageVector.Builder(
            name = "auto_awesome",
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
                        moveTo(9.99f, 11.01f)
                        lineTo(9f, 8.83f)
                        lineTo(8.01f, 11.01f)
                        lineTo(5.83f, 12f)
                        lineTo(8.01f, 12.99f)
                        lineTo(9f, 15.17f)
                        lineTo(9.99f, 12.99f)
                        lineTo(12.17f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 9f)
                        lineTo(20.25f, 6.25f)
                        lineTo(23f, 5f)
                        lineTo(20.25f, 3.75f)
                        lineTo(19f, 1f)
                        lineTo(17.75f, 3.75f)
                        lineTo(15f, 5f)
                        lineTo(17.75f, 6.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 15f)
                        lineTo(17.75f, 17.75f)
                        lineTo(15f, 19f)
                        lineTo(17.75f, 20.25f)
                        lineTo(19f, 23f)
                        lineTo(20.25f, 20.25f)
                        lineTo(23f, 19f)
                        lineTo(20.25f, 17.75f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.5f, 9.5f)
                        lineTo(9f, 4f)
                        lineTo(6.5f, 9.5f)
                        lineTo(1f, 12f)
                        lineToRelative(5.5f, 2.5f)
                        lineTo(9f, 20f)
                        lineToRelative(2.5f, -5.5f)
                        lineTo(17f, 12f)
                        lineTo(11.5f, 9.5f)
                        close()
                        moveTo(9.99f, 12.99f)
                        lineTo(9f, 15.17f)
                        lineToRelative(-0.99f, -2.18f)
                        lineTo(5.83f, 12f)
                        lineToRelative(2.18f, -0.99f)
                        lineTo(9f, 8.83f)
                        lineToRelative(0.99f, 2.18f)
                        lineTo(12.17f, 12f)
                        lineTo(9.99f, 12.99f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Auto_awesome!!
    }

private var _Auto_awesome: ImageVector? = null

