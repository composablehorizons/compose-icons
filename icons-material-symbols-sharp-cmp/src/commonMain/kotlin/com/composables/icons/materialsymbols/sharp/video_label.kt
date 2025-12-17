package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Video_label: ImageVector
    get() {
        if (_Video_label != null) return _Video_label!!
        
        _Video_label = ImageVector.Builder(
            name = "video_label",
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
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-360f)
                horizontalLineTo(160f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Video_label!!
    }

private var _Video_label: ImageVector? = null

