package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DoorClosed: ImageVector
    get() {
        if (_DoorClosed != null) return _DoorClosed!!
        
        _DoorClosed = ImageVector.Builder(
            name = "door-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 448f)
                horizontalLineTo(512f)
                verticalLineTo(50.8f)
                curveTo(512f, 22.78f, 490.47f, 0f, 464f, 0f)
                horizontalLineTo(175.99f)
                curveToRelative(-26.47f, 0f, -48f, 22.78f, -48f, 50.8f)
                verticalLineTo(448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(415.99f, 288f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                curveToRelative(0.01f, 17.67f, -14.32f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _DoorClosed!!
    }

private var _DoorClosed: ImageVector? = null

