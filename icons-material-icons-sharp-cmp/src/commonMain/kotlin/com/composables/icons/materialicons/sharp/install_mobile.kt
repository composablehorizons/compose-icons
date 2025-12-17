package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Install_mobile: ImageVector
    get() {
        if (_Install_mobile != null) return _Install_mobile!!
        
        _Install_mobile = ImageVector.Builder(
            name = "install_mobile",
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
                        moveTo(17f, 18f)
                        lineTo(7f, 18f)
                        lineTo(7f, 6f)
                        lineTo(14f, 6f)
                        lineTo(14f, 1f)
                        lineTo(5f, 1f)
                        lineTo(5f, 23f)
                        lineTo(19f, 23f)
                        lineTo(19f, 16f)
                        lineTo(17f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 14f)
                        lineTo(23f, 9f)
                        lineTo(21.59f, 7.59f)
                        lineTo(19f, 10.17f)
                        lineTo(19f, 3f)
                        lineTo(17f, 3f)
                        lineTo(17f, 10.17f)
                        lineTo(14.41f, 7.59f)
                        lineTo(13f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Install_mobile!!
    }

private var _Install_mobile: ImageVector? = null

