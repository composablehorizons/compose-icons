package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CalendarSad: ImageVector
    get() {
        if (_CalendarSad != null) return _CalendarSad!!
        
        _CalendarSad = ImageVector.Builder(
            name = "calendar-sad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 7f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-12f)
                close()
                moveToRelative(12f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(-8f, -4f)
                verticalLineToRelative(4f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(16f)
                moveToRelative(-9.995f, 3f)
                horizontalLineToRelative(0.01f)
                moveToRelative(3.99f, 0f)
                horizontalLineToRelative(0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 18f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 4f, 0f)
            }
        }.build()
        
        return _CalendarSad!!
    }

private var _CalendarSad: ImageVector? = null

