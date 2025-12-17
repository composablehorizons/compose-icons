package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Queue_music: ImageVector
    get() {
        if (_Queue_music != null) return _Queue_music!!
        
        _Queue_music = ImageVector.Builder(
            name = "queue_music",
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
                    moveTo(17f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 16f, 18f)
                    arcTo(1f, 1f, 0f, false, true, 15f, 17f)
                    arcTo(1f, 1f, 0f, false, true, 17f, 17f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(3f, 10f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineTo(10f)
                    close()
                    moveTo(3f, 14f)
                    horizontalLineToRelative(8f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineTo(14f)
                    close()
                    moveTo(3f, 6f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineTo(6f)
                    close()
                    moveTo(17f, 14.18f)
                    curveTo(16.69f, 14.07f, 16.35f, 14f, 16f, 14f)
                    curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                    reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                    reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(-5f)
                    verticalLineTo(14.18f)
                    close()
                }
            }
        }.build()
        
        return _Queue_music!!
    }

private var _Queue_music: ImageVector? = null

