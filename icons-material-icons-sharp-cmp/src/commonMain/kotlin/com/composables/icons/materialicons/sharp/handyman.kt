package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Handyman: ImageVector
    get() {
        if (_Handyman != null) return _Handyman!!
        
        _Handyman = ImageVector.Builder(
            name = "handyman",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(16.37f, 12.87f)
                            horizontalLineToRelative(-0.99f)
                            lineToRelative(-2.54f, 2.54f)
                            verticalLineToRelative(0.99f)
                            lineToRelative(6.01f, 6.01f)
                            lineToRelative(3.54f, -3.54f)
                            lineTo(16.37f, 12.87f)
                            close()
                        }
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.34f, 10.19f)
                            lineToRelative(1.41f, -1.41f)
                            lineToRelative(2.12f, 2.12f)
                            curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                            lineToRelative(-3.54f, -3.54f)
                            lineToRelative(-1.41f, 1.41f)
                            verticalLineTo(1.71f)
                            lineTo(15.22f, 1f)
                            lineToRelative(-3.54f, 3.54f)
                            lineToRelative(0.71f, 0.71f)
                            horizontalLineToRelative(2.83f)
                            lineToRelative(-1.41f, 1.41f)
                            lineToRelative(1.06f, 1.06f)
                            lineToRelative(-2.89f, 2.89f)
                            lineTo(7.85f, 6.48f)
                            verticalLineTo(5.06f)
                            lineTo(4.83f, 2.04f)
                            lineTo(2f, 4.87f)
                            lineToRelative(3.03f, 3.03f)
                            horizontalLineToRelative(1.41f)
                            lineToRelative(4.13f, 4.13f)
                            lineToRelative(-0.85f, 0.85f)
                            horizontalLineTo(7.6f)
                            lineToRelative(-6.01f, 6.01f)
                            lineToRelative(3.54f, 3.54f)
                            lineToRelative(6.01f, -6.01f)
                            verticalLineToRelative(-2.12f)
                            lineToRelative(5.15f, -5.15f)
                            lineTo(17.34f, 10.19f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Handyman!!
    }

private var _Handyman: ImageVector? = null

