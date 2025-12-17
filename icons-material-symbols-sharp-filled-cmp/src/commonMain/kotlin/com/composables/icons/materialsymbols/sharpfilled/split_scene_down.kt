package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Split_scene_down: ImageVector
    get() {
        if (_Split_scene_down != null) return _Split_scene_down!!
        
        _Split_scene_down = ImageVector.Builder(
            name = "split_scene_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Split_scene_down!!
    }

private var _Split_scene_down: ImageVector? = null

