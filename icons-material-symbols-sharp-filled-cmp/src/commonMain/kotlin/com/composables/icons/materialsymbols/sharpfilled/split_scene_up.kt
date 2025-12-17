package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Split_scene_up: ImageVector
    get() {
        if (_Split_scene_up != null) return _Split_scene_up!!
        
        _Split_scene_up = ImageVector.Builder(
            name = "split_scene_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Split_scene_up!!
    }

private var _Split_scene_up: ImageVector? = null

