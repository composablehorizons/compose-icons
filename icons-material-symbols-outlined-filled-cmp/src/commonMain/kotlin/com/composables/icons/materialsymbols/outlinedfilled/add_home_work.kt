package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Add_home_work: ImageVector
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
                moveToRelative(220f, -315f)
                quadToRelative(-39f, -42f, -91f, -63.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-11f, 0f, -20.5f, 0.5f)
                reflectiveQuadTo(680f, 443f)
                verticalLineToRelative(-43f)
                lineTo(400f, 198f)
                verticalLineToRelative(-78f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(405f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-400f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(27f)
                quadToRelative(-72f, 34f, -116f, 103.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 31f, 6.5f, 61.5f)
                reflectiveQuadTo(467f, 840f)
                horizontalLineToRelative(-67f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Add_home_work!!
    }

private var _Add_home_work: ImageVector? = null

