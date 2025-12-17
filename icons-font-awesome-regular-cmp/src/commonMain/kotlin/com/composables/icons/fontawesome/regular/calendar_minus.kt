package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CalendarMinus: ImageVector
    get() {
        if (_CalendarMinus != null) return _CalendarMinus!!
        
        _CalendarMinus = ImageVector.Builder(
            name = "calendar-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(124f, 328f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(200f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(124f)
                close()
                moveToRelative(324f, -216f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(112f)
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
                close()
                moveToRelative(-48f, 346f)
                verticalLineTo(160f)
                horizontalLineTo(48f)
                verticalLineToRelative(298f)
                curveToRelative(0f, 3.3f, 2.7f, 6f, 6f, 6f)
                horizontalLineToRelative(340f)
                curveToRelative(3.3f, 0f, 6f, -2.7f, 6f, -6f)
                close()
            }
        }.build()
        
        return _CalendarMinus!!
    }

private var _CalendarMinus: ImageVector? = null

