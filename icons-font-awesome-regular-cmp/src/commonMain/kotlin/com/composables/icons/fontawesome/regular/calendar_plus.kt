package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.CalendarPlus: ImageVector
    get() {
        if (_CalendarPlus != null) return _CalendarPlus!!
        
        _CalendarPlus = ImageVector.Builder(
            name = "calendar-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 292f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-76f)
                verticalLineToRelative(76f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-24f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-76f)
                horizontalLineToRelative(-76f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(76f)
                verticalLineToRelative(-76f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(24f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(76f)
                horizontalLineToRelative(76f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
                moveToRelative(112f, -180f)
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
        
        return _CalendarPlus!!
    }

private var _CalendarPlus: ImageVector? = null

