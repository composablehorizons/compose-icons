package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CalendarCheck: ImageVector
    get() {
        if (_CalendarCheck != null) return _CalendarCheck!!
        
        _CalendarCheck = ImageVector.Builder(
            name = "calendar-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 64f)
                horizontalLineToRelative(-48f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineTo(160f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineTo(48f)
                curveTo(21.49f, 64f, 0f, 85.49f, 0f, 112f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-6f, 400f)
                horizontalLineTo(54f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, -6f)
                verticalLineTo(160f)
                horizontalLineToRelative(352f)
                verticalLineToRelative(298f)
                arcToRelative(6f, 6f, 0f, false, true, -6f, 6f)
                close()
                moveToRelative(-52.849f, -200.65f)
                lineTo(198.842f, 404.519f)
                curveToRelative(-4.705f, 4.667f, -12.303f, 4.637f, -16.971f, -0.068f)
                lineToRelative(-75.091f, -75.699f)
                curveToRelative(-4.667f, -4.705f, -4.637f, -12.303f, 0.068f, -16.971f)
                lineToRelative(22.719f, -22.536f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.97f, 0.069f)
                lineToRelative(44.104f, 44.461f)
                lineToRelative(111.072f, -110.181f)
                curveToRelative(4.705f, -4.667f, 12.303f, -4.637f, 16.971f, 0.068f)
                lineToRelative(22.536f, 22.718f)
                curveToRelative(4.667f, 4.705f, 4.636f, 12.303f, -0.069f, 16.97f)
                close()
            }
        }.build()
        
        return _CalendarCheck!!
    }

private var _CalendarCheck: ImageVector? = null

