package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fluid_balance: ImageVector
    get() {
        if (_Fluid_balance != null) return _Fluid_balance!!
        
        _Fluid_balance = ImageVector.Builder(
            name = "fluid_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(267f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(467f, 200f)
                reflectiveQuadToRelative(11.5f, 28.5f)
                quadTo(490f, 240f, 507f, 240f)
                horizontalLineToRelative(93f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, 8f, 65.5f)
                reflectiveQuadToRelative(22f, 61.5f)
                quadToRelative(13f, 26f, 1f, 49.5f)
                reflectiveQuadTo(433f, 800f)
                horizontalLineTo(160f)
                close()
                moveTo(760f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-44f)
                quadToRelative(-69f, -14f, -114.5f, -68.5f)
                reflectiveQuadTo(520f, 600f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 400f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 73f, -45.5f, 127.5f)
                reflectiveQuadTo(760f, 796f)
                verticalLineToRelative(44f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(30f, -360f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(30f)
                quadToRelative(33f, 0f, 62.5f, 15f)
                reflectiveQuadToRelative(49.5f, 41f)
                quadToRelative(8f, 12f, 21f, 18f)
                reflectiveQuadToRelative(27f, 6f)
                close()
                moveTo(400f, 440f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 400f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 520f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 600f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Fluid_balance!!
    }

private var _Fluid_balance: ImageVector? = null

