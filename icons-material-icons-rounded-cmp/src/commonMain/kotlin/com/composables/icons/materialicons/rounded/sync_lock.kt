package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sync_lock: ImageVector
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
                    moveTo(10f, 19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(5f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(1.73f)
                    curveTo(5.06f, 16.54f, 4f, 14.4f, 4f, 12f)
                    curveToRelative(0f, -3.19f, 1.87f, -5.93f, 4.56f, -7.22f)
                    curveTo(9.23f, 4.47f, 10f, 4.96f, 10f, 5.7f)
                    curveToRelative(0f, 0.38f, -0.22f, 0.72f, -0.57f, 0.88f)
                    curveTo(7.41f, 7.55f, 6f, 9.61f, 6f, 12f)
                    curveToRelative(0f, 1.77f, 0.78f, 3.34f, 2f, 4.44f)
                    verticalLineTo(15f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(19f)
                    close()
                    moveTo(15f, 4f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(4f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineTo(7.56f)
                    curveToRelative(1.22f, 1.1f, 2f, 2.67f, 2f, 4.44f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0f, -2.4f, -1.06f, -4.54f, -2.73f, -6f)
                    horizontalLineTo(19f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(15f)
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

