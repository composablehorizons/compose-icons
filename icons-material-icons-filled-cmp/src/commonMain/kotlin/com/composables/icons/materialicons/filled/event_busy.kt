package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Event_busy: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.31f, 17f)
                lineToRelative(2.44f, -2.44f)
                lineTo(14.19f, 17f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.44f, -2.44f)
                lineTo(14.19f, 10f)
                lineToRelative(-2.44f, 2.44f)
                lineTo(9.31f, 10f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineTo(9.31f, 17f)
                close()
                moveTo(19f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(3f, 19f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Event_busy!!
    }

private var _Event_busy: ImageVector? = null

