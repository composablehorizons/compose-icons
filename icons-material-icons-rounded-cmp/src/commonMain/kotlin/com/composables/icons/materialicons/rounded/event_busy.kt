package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Event_busy: ImageVector
    get() {
        if (_Event_busy != null) return _Event_busy!!
        
        _Event_busy = ImageVector.Builder(
            name = "event_busy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.84f, 16.47f)
                lineToRelative(1.91f, -1.91f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineToRelative(-1.91f, -1.91f)
                lineToRelative(1.91f, -1.91f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                lineToRelative(-1.91f, 1.91f)
                lineToRelative(-1.91f, -1.91f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(1.91f, 1.91f)
                lineToRelative(-1.91f, 1.91f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(3f, 19f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-1f, 16f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Event_busy!!
    }

private var _Event_busy: ImageVector? = null

