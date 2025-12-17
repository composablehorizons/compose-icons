package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Calendar_view_month: ImageVector
    get() {
        if (_Calendar_view_month != null) return _Calendar_view_month!!
        
        _Calendar_view_month = ImageVector.Builder(
            name = "calendar_view_month",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 460f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(120f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(214f)
                verticalLineToRelative(260f)
                horizontalLineTo(373f)
                close()
                moveToRelative(254f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(627f)
                close()
                moveTo(120f, 760f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(120f)
                close()
                moveToRelative(253f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(214f)
                verticalLineToRelative(260f)
                horizontalLineTo(373f)
                close()
                moveToRelative(254f, 0f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(213f)
                verticalLineToRelative(260f)
                horizontalLineTo(627f)
                close()
            }
        }.build()
        
        return _Calendar_view_month!!
    }

private var _Calendar_view_month: ImageVector? = null

