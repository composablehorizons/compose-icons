package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Backpack: ImageVector
    get() {
        if (_Backpack != null) return _Backpack!!
        
        _Backpack = ImageVector.Builder(
            name = "backpack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -56f, 34f, -98f)
                reflectiveQuadToRelative(86f, -56f)
                verticalLineToRelative(-46f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(46f)
                quadToRelative(52f, 14f, 86f, 56f)
                reflectiveQuadToRelative(34f, 98f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(340f, -240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(620f, 640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(660f, 600f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(620f, 480f)
                horizontalLineTo(340f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(340f, 560f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(-100f, -40f)
                close()
            }
        }.build()
        
        return _Backpack!!
    }

private var _Backpack: ImageVector? = null

