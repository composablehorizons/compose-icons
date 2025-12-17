package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sync_lock: ImageVector
    get() {
        if (_Sync_lock != null) return _Sync_lock!!
        
        _Sync_lock = ImageVector.Builder(
            name = "sync_lock",
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
                    moveTo(10f, 4.26f)
                    verticalLineToRelative(2.09f)
                    curveTo(7.67f, 7.18f, 6f, 9.39f, 6f, 12f)
                    curveToRelative(0f, 1.77f, 0.78f, 3.34f, 2f, 4.44f)
                    verticalLineTo(14f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2.73f)
                    curveTo(5.06f, 16.54f, 4f, 14.4f, 4f, 12f)
                    curveTo(4f, 8.27f, 6.55f, 5.15f, 10f, 4.26f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7.56f)
                    curveToRelative(1.22f, 1.1f, 2f, 2.67f, 2f, 4.44f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, -2.4f, -1.06f, -4.54f, -2.73f, -6f)
                    horizontalLineTo(20f)
                    verticalLineTo(4f)
                    close()
                    moveTo(20f, 17f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                    verticalLineToRelative(1f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(3f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(4f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-3f)
                    curveTo(21f, 17.45f, 20.55f, 17f, 20f, 17f)
                    close()
                    moveTo(19f, 17f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-1f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                    verticalLineTo(17f)
                    close()
                }
            }
        }.build()
        
        return _Sync_lock!!
    }

private var _Sync_lock: ImageVector? = null

