package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Web_stories: ImageVector
    get() {
        if (_Web_stories != null) return _Web_stories!!
        
        _Web_stories = ImageVector.Builder(
            name = "web_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(680f, -160f)
                verticalLineToRelative(-480f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(900f, 300f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(840f, 720f)
                close()
            }
        }.build()
        
        return _Web_stories!!
    }

private var _Web_stories: ImageVector? = null

