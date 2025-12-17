package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tv_guide: ImageVector
    get() {
        if (_Tv_guide != null) return _Tv_guide!!
        
        _Tv_guide = ImageVector.Builder(
            name = "tv_guide",
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
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(70f)
                lineToRelative(90f, 240f)
                horizontalLineToRelative(80f)
                lineToRelative(120f, -320f)
                horizontalLineTo(660f)
                lineToRelative(-60f, 180f)
                lineToRelative(-60f, -180f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Tv_guide!!
    }

private var _Tv_guide: ImageVector? = null

