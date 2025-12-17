package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Weekend: ImageVector
    get() {
        if (_Weekend != null) return _Weekend!!
        
        _Weekend = ImageVector.Builder(
            name = "weekend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(400f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(160f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(80f, 0f)
                verticalLineToRelative(112f)
                quadToRelative(18f, 17f, 29f, 39f)
                reflectiveQuadToRelative(11f, 49f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -27f, 11f, -49f)
                reflectiveQuadToRelative(29f, -39f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 280f)
                close()
                moveToRelative(520f, 360f)
                horizontalLineTo(200f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -8f, -3f, -15.5f)
                reflectiveQuadToRelative(-8.5f, -13f)
                quadToRelative(-5.5f, -5.5f, -13f, -8.5f)
                reflectiveQuadToRelative(-15.5f, -3f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(160f, 720f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(840f, 680f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(-8f, 0f, -15.5f, 3f)
                reflectiveQuadToRelative(-13f, 8.5f)
                quadToRelative(-5.5f, 5.5f, -8.5f, 13f)
                reflectiveQuadToRelative(-3f, 15.5f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-280f, 0f)
                close()
                moveToRelative(0f, 80f)
                close()
                moveToRelative(0f, -160f)
                close()
            }
        }.build()
        
        return _Weekend!!
    }

private var _Weekend: ImageVector? = null

