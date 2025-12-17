package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Slab_serif: ImageVector
    get() {
        if (_Slab_serif != null) return _Slab_serif!!
        
        _Slab_serif = ImageVector.Builder(
            name = "slab_serif",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(230f, 720f)
                horizontalLineToRelative(206f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-87f)
                lineToRelative(31f, -80f)
                horizontalLineToRelative(194f)
                lineToRelative(30f, 80f)
                horizontalLineToRelative(-85f)
                verticalLineToRelative(70f)
                horizontalLineToRelative(211f)
                verticalLineToRelative(-70f)
                horizontalLineToRelative(-40f)
                lineTo(528f, 240f)
                horizontalLineToRelative(-95f)
                lineTo(270f, 650f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(70f)
                close()
                moveToRelative(175f, -215f)
                lineToRelative(68f, -177f)
                horizontalLineToRelative(7f)
                lineToRelative(68f, 177f)
                horizontalLineTo(405f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-640f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Slab_serif!!
    }

private var _Slab_serif: ImageVector? = null

