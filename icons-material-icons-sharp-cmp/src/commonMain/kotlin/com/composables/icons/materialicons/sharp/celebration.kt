package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Celebration: ImageVector
    get() {
        if (_Celebration != null) return _Celebration!!
        
        _Celebration = ImageVector.Builder(
            name = "celebration",
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
                            moveTo(2f, 22f)
                            lineTo(16f, 17f)
                            lineTo(7f, 8f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(14.53f, 12.53f)
                            lineTo(21f, 6.05f)
                            lineToRelative(1.48f, 1.48f)
                            lineToRelative(1.06f, -1.06f)
                            lineTo(21f, 3.93f)
                            lineToRelative(-7.53f, 7.53f)
                            lineTo(14.53f, 12.53f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(10.94f, 6f)
                            lineTo(9.47f, 7.47f)
                            lineToRelative(1.06f, 1.06f)
                            lineToRelative(2.54f, -2.54f)
                            lineToRelative(-2.54f, -2.53f)
                            lineTo(9.47f, 4.53f)
                            lineTo(10.94f, 6f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18.97f, 9.97f)
                            lineToRelative(-3.5f, 3.5f)
                            lineToRelative(1.06f, 1.06f)
                            lineTo(19f, 12.06f)
                            lineToRelative(2.5f, 2.49f)
                            lineToRelative(1.06f, -1.06f)
                            lineTo(18.97f, 9.97f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(15.97f, 4.97f)
                            lineToRelative(-4.5f, 4.5f)
                            lineToRelative(1.06f, 1.06f)
                            lineTo(18.07f, 5f)
                            lineToRelative(-3.53f, -3.53f)
                            lineToRelative(-1.06f, 1.06f)
                            lineTo(15.97f, 4.97f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Celebration!!
    }

private var _Celebration: ImageVector? = null

