package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CalendarWeek: ImageVector
    get() {
        if (_CalendarWeek != null) return _CalendarWeek!!
        
        _CalendarWeek = ImageVector.Builder(
            name = "calendar-week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(192f)
                horizontalLineTo(0f)
                verticalLineToRelative(272f)
                close()
                moveToRelative(64f, -192f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                horizontalLineToRelative(288f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                horizontalLineTo(80f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                verticalLineToRelative(-64f)
                close()
                moveTo(400f, 64f)
                horizontalLineToRelative(-48f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(160f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
            }
        }.build()
        
        return _CalendarWeek!!
    }

private var _CalendarWeek: ImageVector? = null

