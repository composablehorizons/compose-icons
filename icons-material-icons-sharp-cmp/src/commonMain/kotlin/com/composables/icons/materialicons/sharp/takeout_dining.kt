package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
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
                        moveTo(22f, 7.46f)
                        lineTo(20.59f, 6.05f)
                        lineTo(19f, 7.63f)
                        lineTo(19.03f, 7.07f)
                        lineTo(14.98f, 3f)
                        lineTo(9.02f, 3f)
                        lineTo(4.97f, 7.07f)
                        lineTo(5f, 7.57f)
                        lineTo(3.41f, 6.01f)
                        lineTo(2f, 7.44f)
                        lineTo(4.66f, 10f)
                        lineTo(19.35f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.93f, 20f)
                        lineTo(18.07f, 20f)
                        lineTo(18.7f, 11.55f)
                        lineTo(5.3f, 11.55f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

