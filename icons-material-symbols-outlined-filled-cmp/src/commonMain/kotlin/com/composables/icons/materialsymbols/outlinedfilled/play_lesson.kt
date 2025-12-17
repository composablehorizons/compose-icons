package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Play_lesson: ImageVector
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
                moveTo(280f, 160f)
                verticalLineToRelative(280f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(280f)
                close()
                moveTo(720f, 920f)
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
                moveTo(440f, 719.73f)
                quadToRelative(0f, 43.27f, 13.5f, 83.77f)
                quadTo(467f, 844f, 490f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(282f)
                quadToRelative(-10.06f, -1f, -20.13f, -1.5f)
                quadToRelative(-10.06f, -0.5f, -20.13f, -0.5f)
                quadTo(603f, 440f, 521.5f, 521.5f)
                quadTo(440f, 603.01f, 440f, 719.73f)
                close()
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

