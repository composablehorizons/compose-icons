package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calendar_view_week: ImageVector
    get() {
        if (_Calendar_view_week != null) return _Calendar_view_week!!
        
        _Calendar_view_week = ImageVector.Builder(
            name = "calendar_view_week",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(510f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(135f)
                verticalLineToRelative(560f)
                horizontalLineTo(510f)
                close()
                moveToRelative(-195f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(135f)
                verticalLineToRelative(560f)
                horizontalLineTo(315f)
                close()
                moveToRelative(-195f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(135f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(585f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(135f)
                verticalLineToRelative(560f)
                horizontalLineTo(705f)
                close()
            }
        }.build()
        
        return _Calendar_view_week!!
    }

private var _Calendar_view_week: ImageVector? = null

