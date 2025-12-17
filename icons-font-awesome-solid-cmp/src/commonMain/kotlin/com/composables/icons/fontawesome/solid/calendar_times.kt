package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CalendarTimes: ImageVector
    get() {
        if (_CalendarTimes != null) return _CalendarTimes!!
        
        _CalendarTimes = ImageVector.Builder(
            name = "calendar-times",
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
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-36f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(48f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(128f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(52f)
                horizontalLineToRelative(48f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                close()
                moveTo(12f, 192f)
                horizontalLineToRelative(424f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(260f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(204f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                close()
                moveToRelative(257.3f, 160f)
                lineToRelative(48.1f, -48.1f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineToRelative(-28.3f, -28.3f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineTo(224f, 306.7f)
                lineToRelative(-48.1f, -48.1f)
                curveToRelative(-4.7f, -4.7f, -12.3f, -4.7f, -17f, 0f)
                lineToRelative(-28.3f, 28.3f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(48.1f, 48.1f)
                lineToRelative(-48.1f, 48.1f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.3f, 0f, 17f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                lineToRelative(48.1f, -48.1f)
                lineToRelative(48.1f, 48.1f)
                curveToRelative(4.7f, 4.7f, 12.3f, 4.7f, 17f, 0f)
                lineToRelative(28.3f, -28.3f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.3f, 0f, -17f)
                lineTo(269.3f, 352f)
                close()
            }
        }.build()
        
        return _CalendarTimes!!
    }

private var _CalendarTimes: ImageVector? = null

