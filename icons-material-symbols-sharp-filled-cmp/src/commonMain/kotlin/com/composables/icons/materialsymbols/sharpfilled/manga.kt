package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Manga: ImageVector
    get() {
        if (_Manga != null) return _Manga!!
        
        _Manga = ImageVector.Builder(
            name = "manga",
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
                moveToRelative(244f, -80f)
                horizontalLineToRelative(476f)
                verticalLineToRelative(-439f)
                lineToRelative(-120f, 39f)
                lineToRelative(-123f, -40f)
                lineToRelative(-77f, 105f)
                lineToRelative(-123f, 40f)
                verticalLineToRelative(130f)
                lineToRelative(-76f, 105f)
                lineToRelative(43f, 60f)
                close()
            }
        }.build()
        
        return _Manga!!
    }

private var _Manga: ImageVector? = null

