package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Voice_chat: ImageVector
    get() {
        if (_Voice_chat != null) return _Voice_chat!!
        
        _Voice_chat = ImageVector.Builder(
            name = "voice_chat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(270f, 440f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(300f, 410f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(270f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(240f, 390f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(270f, 440f)
                close()
                moveToRelative(100f, 80f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(400f, 490f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(370f, 280f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(340f, 310f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(370f, 520f)
                close()
                moveToRelative(110f, 80f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 570f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 230f)
                verticalLineToRelative(340f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(110f, -80f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(620f, 490f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(590f, 280f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(560f, 310f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(590f, 520f)
                close()
                moveToRelative(100f, -80f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(720f, 410f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(690f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(660f, 390f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(690f, 440f)
                close()
                moveTo(240f, 720f)
                lineToRelative(-92f, 92f)
                quadToRelative(-19f, 19f, -43.5f, 8.5f)
                reflectiveQuadTo(80f, 783f)
                verticalLineToRelative(-623f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Voice_chat!!
    }

private var _Voice_chat: ImageVector? = null

