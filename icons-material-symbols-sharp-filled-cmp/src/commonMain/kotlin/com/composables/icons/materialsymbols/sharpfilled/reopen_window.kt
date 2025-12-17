package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Reopen_window: ImageVector
    get() {
        if (_Reopen_window != null) return _Reopen_window!!
        
        _Reopen_window = ImageVector.Builder(
            name = "reopen_window",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(160f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveTo(760f, 960f)
                quadToRelative(-73f, 0f, -127.5f, -45.5f)
                reflectiveQuadTo(564f, 800f)
                horizontalLineToRelative(62f)
                quadToRelative(13f, 44f, 49.5f, 72f)
                reflectiveQuadTo(760f, 900f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-29f, 0f, -54f, 10.5f)
                reflectiveQuadTo(662f, 660f)
                horizontalLineToRelative(58f)
                verticalLineToRelative(60f)
                horizontalLineTo(560f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(57f)
                quadToRelative(27f, -26f, 63f, -41.5f)
                reflectiveQuadToRelative(77f, -15.5f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 960f)
                close()
            }
        }.build()
        
        return _Reopen_window!!
    }

private var _Reopen_window: ImageVector? = null

