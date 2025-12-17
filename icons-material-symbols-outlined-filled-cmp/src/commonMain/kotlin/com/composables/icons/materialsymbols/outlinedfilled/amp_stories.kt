package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Amp_stories: ImageVector
    get() {
        if (_Amp_stories != null) return _Amp_stories!!
        
        _Amp_stories = ImageVector.Builder(
            name = "amp_stories",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(640f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-160f, -80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Amp_stories!!
    }

private var _Amp_stories: ImageVector? = null

