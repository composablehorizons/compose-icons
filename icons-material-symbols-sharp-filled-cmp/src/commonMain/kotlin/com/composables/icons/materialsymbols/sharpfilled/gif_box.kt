package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Gif_box: ImageVector
    get() {
        if (_Gif_box != null) return _Gif_box!!
        
        _Gif_box = ImageVector.Builder(
            name = "gif_box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(180f, -280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(540f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Gif_box!!
    }

private var _Gif_box: ImageVector? = null

