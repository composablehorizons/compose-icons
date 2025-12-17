package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Repeat_on: ImageVector
    get() {
        if (_Repeat_on != null) return _Repeat_on!!
        
        _Repeat_on = ImageVector.Builder(
            name = "repeat_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 40f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -40f)
                lineToRelative(56f, -58f)
                lineToRelative(-62f, -62f)
                horizontalLineToRelative(486f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                horizontalLineTo(274f)
                lineToRelative(62f, -62f)
                lineToRelative(-56f, -58f)
                lineToRelative(-160f, 160f)
                lineTo(280f, 880f)
                close()
                moveToRelative(-80f, -440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(406f)
                lineToRelative(-62f, 62f)
                lineToRelative(56f, 58f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-56f, 58f)
                lineToRelative(62f, 62f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Repeat_on!!
    }

private var _Repeat_on: ImageVector? = null

