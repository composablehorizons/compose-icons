package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Split_scene: ImageVector
    get() {
        if (_Split_scene != null) return _Split_scene!!
        
        _Split_scene = ImageVector.Builder(
            name = "split_scene",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, 80f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(640f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Split_scene!!
    }

private var _Split_scene: ImageVector? = null

