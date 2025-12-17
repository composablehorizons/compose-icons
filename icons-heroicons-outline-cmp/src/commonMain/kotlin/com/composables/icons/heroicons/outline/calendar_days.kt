package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.CalendarDays: ImageVector
    get() {
        if (_CalendarDays != null) return _CalendarDays!!
        
        _CalendarDays = ImageVector.Builder(
            name = "calendar-days",
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
                moveTo(6.75f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(17.25f, 3f)
                verticalLineToRelative(2.25f)
                moveTo(3f, 18.75f)
                verticalLineTo(7.5f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 2.25f, -2.25f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 7.5f)
                verticalLineToRelative(11.25f)
                moveToRelative(-18f, 0f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5.25f, 21f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 18.75f)
                moveToRelative(-18f, 0f)
                verticalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 9f)
                horizontalLineToRelative(13.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 21f, 11.25f)
                verticalLineToRelative(7.5f)
                moveToRelative(-9f, -6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(12f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(9.75f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(9.75f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(9.75f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(7.5f, 15f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(6.75f, -4.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(15f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(2.25f, -4.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(-0.008f)
                close()
                moveToRelative(0f, 2.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(16.5f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _CalendarDays!!
    }

private var _CalendarDays: ImageVector? = null

