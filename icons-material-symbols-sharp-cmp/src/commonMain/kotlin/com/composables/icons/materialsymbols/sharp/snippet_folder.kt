package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Snippet_folder: ImageVector
    get() {
        if (_Snippet_folder != null) return _Snippet_folder!!
        
        _Snippet_folder = ImageVector.Builder(
            name = "snippet_folder",
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
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-400f)
                horizontalLineTo(447f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(420f, -100f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(55f)
                lineToRelative(65f, 65f)
                verticalLineToRelative(135f)
                horizontalLineTo(580f)
                close()
                moveToRelative(-60f, 60f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-220f)
                lineTo(660f, 360f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                close()
            }
        }.build()
        
        return _Snippet_folder!!
    }

private var _Snippet_folder: ImageVector? = null

