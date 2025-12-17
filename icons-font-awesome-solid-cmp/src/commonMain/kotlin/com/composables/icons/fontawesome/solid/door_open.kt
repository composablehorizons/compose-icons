package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DoorOpen: ImageVector
    get() {
        if (_DoorOpen != null) return _DoorOpen!!
        
        _DoorOpen = ImageVector.Builder(
            name = "door-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 448f)
                horizontalLineToRelative(-80f)
                verticalLineTo(113.45f)
                curveTo(544f, 86.19f, 522.47f, 64f, 496f, 64f)
                horizontalLineTo(384f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(384f)
                horizontalLineToRelative(144f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(312.24f, 1.01f)
                lineToRelative(-192f, 49.74f)
                curveTo(105.99f, 54.44f, 96f, 67.7f, 96f, 82.92f)
                verticalLineTo(448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(336f)
                verticalLineTo(33.18f)
                curveToRelative(0f, -21.58f, -19.56f, -37.41f, -39.76f, -32.17f)
                close()
                moveTo(264f, 288f)
                curveToRelative(-13.25f, 0f, -24f, -14.33f, -24f, -32f)
                reflectiveCurveToRelative(10.75f, -32f, 24f, -32f)
                reflectiveCurveToRelative(24f, 14.33f, 24f, 32f)
                reflectiveCurveToRelative(-10.75f, 32f, -24f, 32f)
                close()
            }
        }.build()
        
        return _DoorOpen!!
    }

private var _DoorOpen: ImageVector? = null

