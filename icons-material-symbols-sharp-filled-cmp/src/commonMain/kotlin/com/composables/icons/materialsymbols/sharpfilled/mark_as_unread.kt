package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mark_as_unread: ImageVector
    get() {
        if (_Mark_as_unread != null) return _Mark_as_unread!!
        
        _Mark_as_unread = ImageVector.Builder(
            name = "mark_as_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 680f)
                verticalLineToRelative(-430f)
                lineToRelative(340f, -170f)
                lineToRelative(392f, 200f)
                horizontalLineTo(637f)
                lineTo(420f, 170f)
                lineTo(160f, 299f)
                verticalLineToRelative(381f)
                horizontalLineTo(80f)
                close()
                moveToRelative(120f, 160f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(520f)
                horizontalLineTo(200f)
                close()
                moveToRelative(340f, -226f)
                lineToRelative(260f, -134f)
                verticalLineToRelative(-80f)
                lineTo(540f, 534f)
                lineTo(280f, 400f)
                verticalLineToRelative(80f)
                lineToRelative(260f, 134f)
                close()
            }
        }.build()
        
        return _Mark_as_unread!!
    }

private var _Mark_as_unread: ImageVector? = null

