package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.System_update_alt: ImageVector
    get() {
        if (_System_update_alt != null) return _System_update_alt!!
        
        _System_update_alt = ImageVector.Builder(
            name = "system_update_alt",
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
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -184f)
                lineTo(280f, 416f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 104f)
                verticalLineToRelative(-304f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(304f)
                lineToRelative(104f, -104f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _System_update_alt!!
    }

private var _System_update_alt: ImageVector? = null

