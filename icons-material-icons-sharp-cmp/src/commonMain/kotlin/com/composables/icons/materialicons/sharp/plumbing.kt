package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Plumbing: ImageVector
    get() {
        if (_Plumbing != null) return _Plumbing!!
        
        _Plumbing = ImageVector.Builder(
            name = "plumbing",
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
                        moveTo(16.16f, 5.64f)
                        lineToRelative(3.54f, 3.54f)
                        curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                        lineToRelative(-3.54f, -3.54f)
                        lineToRelative(-4.24f, 4.24f)
                        lineToRelative(2.12f, 2.12f)
                        lineTo(16.16f, 5.64f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.8419566f, 12.708142f)
                        lineTo(8.377457f, 9.172642f)
                        lineTo(10.498756f, 11.293942f)
                        lineTo(6.9632573f, 14.829443f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.45f, 7.76f)
                        lineToRelative(-1.41f, 1.41f)
                        lineTo(9.79f, 4.93f)
                        lineTo(7.67f, 7.05f)
                        lineToRelative(4.24f, 4.24f)
                        lineToRelative(-8.49f, 8.49f)
                        lineToRelative(2.83f, 2.83f)
                        lineTo(16.86f, 12f)
                        lineToRelative(0.71f, 0.71f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(15.45f, 7.76f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Plumbing!!
    }

private var _Plumbing: ImageVector? = null

