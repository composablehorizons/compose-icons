package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Checked_bag: ImageVector
    get() {
        if (_Checked_bag != null) return _Checked_bag!!
        
        _Checked_bag = ImageVector.Builder(
            name = "checked_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -160f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(520f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                close()
                moveTo(420f, 240f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-26f, 0f, -43f, 17f)
                reflectiveQuadToRelative(-17f, 43f)
                close()
                moveTo(280f, 600f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(60f, -280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-280f)
                horizontalLineTo(340f)
                close()
                moveToRelative(-60f, 280f)
                horizontalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(-60f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(-400f, 0f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(60f, 0f)
                horizontalLineToRelative(280f)
                horizontalLineToRelative(-280f)
                close()
                moveToRelative(340f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Checked_bag!!
    }

private var _Checked_bag: ImageVector? = null

