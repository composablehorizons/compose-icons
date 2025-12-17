package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Archway: ImageVector
    get() {
        if (_Archway != null) return _Archway!!
        
        _Archway = ImageVector.Builder(
            name = "archway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 448f)
                horizontalLineToRelative(-16f)
                verticalLineTo(96f)
                horizontalLineTo(32f)
                verticalLineToRelative(352f)
                horizontalLineTo(16.02f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineTo(176f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -53.02f, 42.98f, -96f, 96f, -96f)
                reflectiveCurveToRelative(96f, 42.98f, 96f, 96f)
                lineToRelative(0.02f, 160f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineTo(560f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(0f, -448f)
                horizontalLineTo(16f)
                curveTo(7.16f, 0f, 0f, 7.16f, 0f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(544f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Archway!!
    }

private var _Archway: ImageVector? = null

