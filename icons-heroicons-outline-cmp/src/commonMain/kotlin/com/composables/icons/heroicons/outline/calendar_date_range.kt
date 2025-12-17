package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CalendarDateRange: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.75f, 2.994f)
                verticalLineToRelative(2.25f)
                moveToRelative(10.5f, -2.25f)
                verticalLineToRelative(2.25f)
                moveToRelative(-14.252f, 13.5f)
                verticalLineTo(7.491f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineToRelative(11.251f)
                moveToRelative(-18f, 0f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                moveToRelative(-18f, 0f)
                verticalLineToRelative(-7.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, 2.25f)
                verticalLineToRelative(7.5f)
                moveToRelative(-6.75f, -6f)
                horizontalLineToRelative(2.25f)
                moveToRelative(-9f, 2.25f)
                horizontalLineToRelative(4.5f)
                moveToRelative(0.002f, -2.25f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.006f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.006f)
                close()
                moveToRelative(-0.001f, 4.5f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.005f)
                close()
                moveToRelative(-2.25f, 0.001f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.006f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(-0.006f)
                close()
                moveToRelative(-2.25f, 0f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.005f)
                close()
                moveToRelative(6.75f, -2.247f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(-0.005f)
                verticalLineToRelative(-0.005f)
                close()
                moveToRelative(0f, 2.247f)
                horizontalLineToRelative(0.006f)
                verticalLineToRelative(0.006f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(-0.006f)
                close()
                moveToRelative(2.25f, -2.248f)
                horizontalLineToRelative(0.006f)
                verticalLineTo(15f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(-0.005f)
                close()
            }
        }.build()
        
        return _CalendarDateRange!!
    }

private var _CalendarDateRange: ImageVector? = null

