package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_chat: ImageVector
    get() {
        if (_Mobile_chat != null) return _Mobile_chat!!
        
        _Mobile_chat = ImageVector.Builder(
            name = "mobile_chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(280f)
                horizontalLineTo(440f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(113f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(127f)
                verticalLineToRelative(160f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, -160f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(600f)
                lineToRelative(-80f, 80f)
                close()
                moveToRelative(-40f, -520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Mobile_chat!!
    }

private var _Mobile_chat: ImageVector? = null

