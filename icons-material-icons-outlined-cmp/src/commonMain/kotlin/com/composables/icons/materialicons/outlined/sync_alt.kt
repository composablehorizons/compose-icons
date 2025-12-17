package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sync_alt: ImageVector
    get() {
        if (_Sync_alt != null) return _Sync_alt!!
        
        _Sync_alt = ImageVector.Builder(
            name = "sync_alt",
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
                        moveTo(7.41f, 13.41f)
                        lineTo(6f, 12f)
                        lineTo(2f, 16f)
                        lineTo(6f, 20f)
                        lineTo(7.41f, 18.59f)
                        lineTo(5.83f, 17f)
                        lineTo(21f, 17f)
                        lineTo(21f, 15f)
                        lineTo(5.83f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.59f, 10.59f)
                        lineTo(18f, 12f)
                        lineTo(22f, 8f)
                        lineTo(18f, 4f)
                        lineTo(16.59f, 5.41f)
                        lineTo(18.17f, 7f)
                        lineTo(3f, 7f)
                        lineTo(3f, 9f)
                        lineTo(18.17f, 9f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sync_alt!!
    }

private var _Sync_alt: ImageVector? = null

