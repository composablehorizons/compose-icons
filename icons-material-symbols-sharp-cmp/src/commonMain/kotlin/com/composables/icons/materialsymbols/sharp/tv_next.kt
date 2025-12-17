package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tv_next: ImageVector
    get() {
        if (_Tv_next != null) return _Tv_next!!
        
        _Tv_next = ImageVector.Builder(
            name = "tv_next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 900f)
                lineToRelative(-60f, -60f)
                lineToRelative(120f, -120f)
                lineToRelative(-120f, -120f)
                lineToRelative(60f, -60f)
                lineToRelative(180f, 180f)
                lineTo(780f, 900f)
                close()
                moveToRelative(-460f, -60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveTo(160f, 680f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Tv_next!!
    }

private var _Tv_next: ImageVector? = null

