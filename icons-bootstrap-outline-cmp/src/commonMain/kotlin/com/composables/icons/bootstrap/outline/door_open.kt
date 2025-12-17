package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) return _DoorOpen!!
        
        _DoorOpen = ImageVector.Builder(
            name = "door-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 10f)
                curveToRelative(-0.276f, 0f, -0.5f, -0.448f, -0.5f, -1f)
                reflectiveCurveToRelative(0.224f, -1f, 0.5f, -1f)
                reflectiveCurveToRelative(0.5f, 0.448f, 0.5f, 1f)
                reflectiveCurveToRelative(-0.224f, 1f, -0.5f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.828f, 0.122f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 0.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(0.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 2.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(3f)
                verticalLineTo(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.43f, -0.495f)
                lineToRelative(7f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.398f, 0.117f)
                moveTo(11.5f, 2f)
                horizontalLineTo(11f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                moveTo(4f, 1.934f)
                verticalLineTo(15f)
                horizontalLineToRelative(6f)
                verticalLineTo(1.077f)
                close()
            }
        }.build()
        
        return _DoorOpen!!
    }

private var _DoorOpen: ImageVector? = null

