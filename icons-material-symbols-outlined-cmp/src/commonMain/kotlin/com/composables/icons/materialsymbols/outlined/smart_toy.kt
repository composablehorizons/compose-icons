package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Smart_toy: ImageVector
    get() {
        if (_Smart_toy != null) return _Smart_toy!!
        
        _Smart_toy = ImageVector.Builder(
            name = "smart_toy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 600f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 200f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 280f)
                verticalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-160f)
                close()
                moveToRelative(200f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(420f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(360f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(300f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(360f, 520f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(660f, 460f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(600f, 400f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(540f, 460f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(600f, 520f)
                close()
                moveTo(320f, 680f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-80f, 80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(240f, -240f)
                close()
            }
        }.build()
        
        return _Smart_toy!!
    }

private var _Smart_toy: ImageVector? = null

