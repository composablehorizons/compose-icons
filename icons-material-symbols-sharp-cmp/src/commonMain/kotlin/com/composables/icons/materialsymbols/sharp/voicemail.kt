package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Voicemail: ImageVector
    get() {
        if (_Voicemail != null) return _Voicemail!!
        
        _Voicemail = ImageVector.Builder(
            name = "voicemail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 640f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(80f, 460f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(260f, 280f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(440f, 460f)
                quadToRelative(0f, 27f, -8f, 52f)
                reflectiveQuadToRelative(-22f, 48f)
                horizontalLineToRelative(140f)
                quadToRelative(-14f, -23f, -22f, -48f)
                reflectiveQuadToRelative(-8f, -52f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(700f, 280f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(880f, 460f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 640f)
                horizontalLineTo(260f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(440f, 0f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
            }
        }.build()
        
        return _Voicemail!!
    }

private var _Voicemail: ImageVector? = null

