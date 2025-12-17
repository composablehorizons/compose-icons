package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Play_disabled: ImageVector
    get() {
        if (_Play_disabled != null) return _Play_disabled!!
        
        _Play_disabled = ImageVector.Builder(
            name = "play_disabled",
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
                        moveTo(16.45f, 13.62f)
                        lineTo(19f, 12f)
                        lineTo(8f, 5f)
                        lineTo(8f, 5.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineTo(8f, 10.83f)
                        verticalLineTo(19f)
                        lineToRelative(4.99f, -3.18f)
                        lineToRelative(6.78f, 6.78f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(10f, 15.36f)
                        verticalLineToRelative(-2.53f)
                        lineToRelative(1.55f, 1.55f)
                        lineTo(10f, 15.36f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Play_disabled!!
    }

private var _Play_disabled: ImageVector? = null

