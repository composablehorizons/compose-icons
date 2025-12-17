package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.DoorOpen: ImageVector
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
                moveTo(1.5f, 15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(13f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 1f)
                horizontalLineTo(11f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.57f, -0.495f)
                lineToRelative(-7f, 1f)
                arcTo(0.5f, 0.5f, 0f, false, false, 3f, 1.5f)
                verticalLineTo(15f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-2.5f, 8f)
                curveToRelative(-0.276f, 0f, -0.5f, -0.448f, -0.5f, -1f)
                reflectiveCurveToRelative(0.224f, -1f, 0.5f, -1f)
                reflectiveCurveToRelative(0.5f, 0.448f, 0.5f, 1f)
                reflectiveCurveToRelative(-0.224f, 1f, -0.5f, 1f)
            }
        }.build()
        
        return _DoorOpen!!
    }

private var _DoorOpen: ImageVector? = null

