package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Room: ImageVector
    get() {
        if (_Room != null) return _Room!!
        
        _Room = ImageVector.Builder(
            name = "room",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                    curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                    curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(12f, 12f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    curveTo(14f, 11.1f, 13.1f, 12f, 12f, 12f)
                    close()
                }
            }
        }.build()
        
        return _Room!!
    }

private var _Room: ImageVector? = null

