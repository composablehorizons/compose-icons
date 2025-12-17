package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CalendarDateRange: ImageVector
    get() {
        if (_CalendarDateRange != null) return _CalendarDateRange!!
        
        _CalendarDateRange = ImageVector.Builder(
            name = "calendar-date-range",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 11.993f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.006f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(12f)
                close()
                moveTo(12f, 16.494f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.005f)
                curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(12f)
                close()
                moveTo(8.999f, 17.244f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(7.499f, 16.494f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.005f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(7.5f)
                close()
                moveTo(13.499f, 14.997f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(14.25f, 16.494f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(0.006f)
                curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(15.75f, 14.995f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(0.005f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.006f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-0.006f)
                close()
                moveTo(13.498f, 12.743f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineToRelative(-2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(6.748f, 14.993f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2.993f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9f)
                verticalLineTo(2.994f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.5f, 0f)
                verticalLineToRelative(1.497f)
                horizontalLineToRelative(-0.752f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(11.252f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(13.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineTo(7.492f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                horizontalLineTo(18f)
                verticalLineTo(2.993f)
                close()
                moveTo(3.748f, 18.743f)
                verticalLineToRelative(-7.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _CalendarDateRange!!
    }

private var _CalendarDateRange: ImageVector? = null

