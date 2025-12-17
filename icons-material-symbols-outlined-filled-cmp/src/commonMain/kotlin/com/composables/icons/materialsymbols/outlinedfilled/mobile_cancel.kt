package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_cancel: ImageVector
    get() {
        if (_Mobile_cancel != null) return _Mobile_cancel!!
        
        _Mobile_cancel = ImageVector.Builder(
            name = "mobile_cancel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(404f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(106f, -290f)
                lineToRelative(94f, -93f)
                lineToRelative(93f, 93f)
                lineToRelative(57f, -56f)
                lineToRelative(-94f, -94f)
                lineToRelative(94f, -93f)
                lineToRelative(-57f, -57f)
                lineToRelative(-93f, 94f)
                lineToRelative(-94f, -94f)
                lineToRelative(-56f, 57f)
                lineToRelative(93f, 93f)
                lineToRelative(-93f, 94f)
                lineToRelative(56f, 56f)
                close()
            }
        }.build()
        
        return _Mobile_cancel!!
    }

private var _Mobile_cancel: ImageVector? = null

