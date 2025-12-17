package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Login: ImageVector
    get() {
        if (_Login != null) return _Login!!
        
        _Login = ImageVector.Builder(
            name = "login",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-560f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(480f)
                close()
                moveToRelative(-80f, -160f)
                lineToRelative(-55f, -58f)
                lineToRelative(102f, -102f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(327f)
                lineTo(345f, 338f)
                lineToRelative(55f, -58f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Login!!
    }

private var _Login: ImageVector? = null

