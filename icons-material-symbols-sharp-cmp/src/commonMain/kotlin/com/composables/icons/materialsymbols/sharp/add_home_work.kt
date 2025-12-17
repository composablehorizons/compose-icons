package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Add_home_work: ImageVector
    get() {
        if (_Add_home_work != null) return _Add_home_work!!
        
        _Add_home_work = ImageVector.Builder(
            name = "add_home_work",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineTo(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(480f, -360f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                lineToRelative(-28.5f, 28.5f)
                lineTo(543f, 497f)
                lineTo(320f, 338f)
                lineTo(120f, 480f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(40f)
                close()
                moveToRelative(880f, -720f)
                verticalLineToRelative(405f)
                quadToRelative(-17f, -18f, -37f, -32.5f)
                reflectiveQuadTo(840f, 467f)
                verticalLineToRelative(-267f)
                horizontalLineTo(480f)
                verticalLineToRelative(56f)
                lineToRelative(-80f, -58f)
                verticalLineToRelative(-78f)
                horizontalLineToRelative(520f)
                close()
                moveTo(680f, 360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, 560f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-20f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                horizontalLineTo(740f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(100f)
                horizontalLineTo(600f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Add_home_work!!
    }

private var _Add_home_work: ImageVector? = null

