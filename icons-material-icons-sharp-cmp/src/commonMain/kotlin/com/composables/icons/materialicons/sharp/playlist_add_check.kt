package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Playlist_add_check: ImageVector
    get() {
        if (_Playlist_add_check != null) return _Playlist_add_check!!
        
        _Playlist_add_check = ImageVector.Builder(
            name = "playlist_add_check",
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
                        moveTo(3f, 10f)
                        horizontalLineTo(14f)
                        verticalLineTo(12f)
                        horizontalLineTo(3f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 6f)
                        horizontalLineTo(14f)
                        verticalLineTo(8f)
                        horizontalLineTo(3f)
                        verticalLineTo(6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 14f)
                        horizontalLineTo(10f)
                        verticalLineTo(16f)
                        horizontalLineTo(3f)
                        verticalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.59f, 11.93f)
                        lineTo(16.34f, 16.17f)
                        lineTo(14.22f, 14.05f)
                        lineTo(12.81f, 15.46f)
                        lineTo(16.34f, 19f)
                        lineTo(22f, 13.34f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Playlist_add_check!!
    }

private var _Playlist_add_check: ImageVector? = null

