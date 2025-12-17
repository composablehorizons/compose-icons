package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Install_desktop: ImageVector
    get() {
        if (_Install_desktop != null) return _Install_desktop!!
        
        _Install_desktop = ImageVector.Builder(
            name = "install_desktop",
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
                        moveTo(20f, 17f)
                        lineTo(4f, 17f)
                        lineTo(4f, 5f)
                        lineTo(12f, 5f)
                        lineTo(12f, 3f)
                        lineTo(2f, 3f)
                        lineTo(2f, 19f)
                        lineTo(8f, 19f)
                        lineTo(8f, 21f)
                        lineTo(16f, 21f)
                        lineTo(16f, 19f)
                        lineTo(22f, 19f)
                        lineTo(22f, 14f)
                        lineTo(20f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 14f)
                        lineTo(22f, 9f)
                        lineTo(20.59f, 7.59f)
                        lineTo(18f, 10.17f)
                        lineTo(18f, 3f)
                        lineTo(16f, 3f)
                        lineTo(16f, 10.17f)
                        lineTo(13.41f, 7.59f)
                        lineTo(12f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Install_desktop!!
    }

private var _Install_desktop: ImageVector? = null

