package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Business_messages: ImageVector
    get() {
        if (_Business_messages != null) return _Business_messages!!
        
        _Business_messages = ImageVector.Builder(
            name = "business_messages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-370f)
                lineTo(68f, 193f)
                quadToRelative(-8f, -10f, -3f, -21.5f)
                reflectiveQuadTo(83f, 160f)
                horizontalLineToRelative(717f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-480f)
                horizontalLineTo(280f)
                close()
                moveToRelative(272f, 360f)
                horizontalLineToRelative(128f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineTo(457f)
                quadToRelative(-27f, 0f, -37.5f, 24.5f)
                reflectiveQuadTo(428f, 588f)
                lineToRelative(84f, 84f)
                quadToRelative(11f, 11f, 28f, 11f)
                reflectiveQuadToRelative(28f, -11f)
                quadToRelative(11f, -11f, 11f, -28f)
                reflectiveQuadToRelative(-11f, -28f)
                lineToRelative(-16f, -16f)
                close()
                moveToRelative(-24f, -240f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 440f)
                horizontalLineToRelative(223f)
                quadToRelative(27f, 0f, 37.5f, -24.5f)
                reflectiveQuadTo(652f, 372f)
                lineToRelative(-84f, -84f)
                quadToRelative(-11f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 11f)
                quadToRelative(-11f, 11f, -11f, 28f)
                reflectiveQuadToRelative(11f, 28f)
                lineToRelative(16f, 16f)
                close()
                moveTo(280f, 240f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Business_messages!!
    }

private var _Business_messages: ImageVector? = null

