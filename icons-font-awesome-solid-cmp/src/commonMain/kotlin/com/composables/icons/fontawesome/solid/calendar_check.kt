package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CalendarCheck: ImageVector
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
                moveTo(436f, 160f)
                horizontalLineTo(12f)
                curveToRelative(-6.627f, 0f, -12f, -5.373f, -12f, -12f)
                verticalLineToRelative(-36f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(48f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(128f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(48f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
                close()
                moveTo(12f, 192f)
                horizontalLineToRelative(424f)
                curveToRelative(6.627f, 0f, 12f, 5.373f, 12f, 12f)
                verticalLineToRelative(260f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(204f)
                curveToRelative(0f, -6.627f, 5.373f, -12f, 12f, -12f)
                close()
                moveToRelative(333.296f, 95.947f)
                lineToRelative(-28.169f, -28.398f)
                curveToRelative(-4.667f, -4.705f, -12.265f, -4.736f, -16.97f, -0.068f)
                lineTo(194.12f, 364.665f)
                lineToRelative(-45.98f, -46.352f)
                curveToRelative(-4.667f, -4.705f, -12.266f, -4.736f, -16.971f, -0.068f)
                lineToRelative(-28.397f, 28.17f)
                curveToRelative(-4.705f, 4.667f, -4.736f, 12.265f, -0.068f, 16.97f)
                lineToRelative(82.601f, 83.269f)
                curveToRelative(4.667f, 4.705f, 12.265f, 4.736f, 16.97f, 0.068f)
                lineToRelative(142.953f, -141.805f)
                curveToRelative(4.705f, -4.667f, 4.736f, -12.265f, 0.068f, -16.97f)
                close()
            }
        }.build()
        
        return _CalendarCheck!!
    }

private var _CalendarCheck: ImageVector? = null

