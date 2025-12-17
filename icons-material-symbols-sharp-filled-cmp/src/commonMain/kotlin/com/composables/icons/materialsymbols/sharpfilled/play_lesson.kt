package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Play_lesson: ImageVector
    get() {
        if (_Play_lesson != null) return _Play_lesson!!
        
        _Play_lesson = ImageVector.Builder(
            name = "play_lesson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(364f)
                quadToRelative(-18f, -2f, -40f, -2f)
                reflectiveQuadToRelative(-40f, 2f)
                quadToRelative(-109f, 16f, -174.5f, 96f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 44f, 13.5f, 83.5f)
                reflectiveQuadTo(490f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(600f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-50f, -100f)
                lineToRelative(160f, -100f)
                lineToRelative(-160f, -100f)
                verticalLineToRelative(200f)
                close()
                moveTo(280f, 440f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(280f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

