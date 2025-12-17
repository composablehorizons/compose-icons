package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Play_lesson: ImageVector
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
                moveTo(452f, 800f)
                quadToRelative(6f, 20f, 16.5f, 41.5f)
                reflectiveQuadTo(490f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(284f)
                quadToRelative(-18f, -2f, -40f, -2f)
                reflectiveQuadToRelative(-40f, 2f)
                verticalLineToRelative(-284f)
                horizontalLineTo(480f)
                verticalLineToRelative(280f)
                lineToRelative(-100f, -60f)
                lineToRelative(-100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(252f)
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
                moveTo(280f, 160f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-200f)
                close()
                moveToRelative(172f, 0f)
                horizontalLineTo(200f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-240f)
                horizontalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

