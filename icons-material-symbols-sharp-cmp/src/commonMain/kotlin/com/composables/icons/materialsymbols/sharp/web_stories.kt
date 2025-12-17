package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Web_stories: ImageVector
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
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(760f, -160f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-680f, 80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, -640f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Web_stories!!
    }

private var _Web_stories: ImageVector? = null

