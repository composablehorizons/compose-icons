package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Meal_lunch: ImageVector
    get() {
        if (_Meal_lunch != null) return _Meal_lunch!!
        
        _Meal_lunch = ImageVector.Builder(
            name = "meal_lunch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(234f, 800f)
                horizontalLineToRelative(172f)
                quadToRelative(14f, 0f, 25f, -8f)
                reflectiveQuadToRelative(14f, -22f)
                lineToRelative(13f, -50f)
                horizontalLineTo(182f)
                lineToRelative(13f, 50f)
                quadToRelative(3f, 14f, 14f, 22f)
                reflectiveQuadToRelative(25f, 8f)
                close()
                moveTo(120f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                close()
                moveToRelative(198f, -82f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(28f, 28f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(403f, 403f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(346f, 403f)
                lineToRelative(-28f, -29f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                close()
                moveToRelative(-198f, 2f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(0f, -16f, 14.5f, -22.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 80f)
                quadToRelative(16f, 0f, 22.5f, 14.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(120f, 320f)
                close()
                moveToRelative(280f, -200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 160f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 120f)
                close()
                moveTo(80f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 800f)
                horizontalLineToRelative(40f)
                quadToRelative(-1f, -3f, -1.5f, -5.5f)
                reflectiveQuadTo(117f, 789f)
                lineToRelative(-25f, -99f)
                quadToRelative(-5f, -19f, 7f, -34.5f)
                reflectiveQuadToRelative(32f, -15.5f)
                horizontalLineToRelative(378f)
                quadToRelative(20f, 0f, 32f, 15.5f)
                reflectiveQuadToRelative(7f, 34.5f)
                lineToRelative(-25f, 99f)
                quadToRelative(-1f, 3f, -1.5f, 5.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(246f)
                lineToRelative(27f, -320f)
                horizontalLineTo(567f)
                lineToRelative(3f, 37f)
                quadToRelative(2f, 17f, -10.5f, 30f)
                reflectiveQuadTo(530f, 560f)
                quadToRelative(-16f, 0f, -27f, -10.5f)
                reflectiveQuadTo(490f, 523f)
                lineToRelative(-6f, -80f)
                quadToRelative(-2f, -17f, 10f, -30f)
                reflectiveQuadToRelative(29f, -13f)
                horizontalLineToRelative(314f)
                quadToRelative(17f, 0f, 29f, 13f)
                reflectiveQuadToRelative(10f, 30f)
                lineToRelative(-29f, 357f)
                horizontalLineToRelative(33f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -800f)
                close()
                moveToRelative(600f, 720f)
                close()
                moveToRelative(-360f, 0f)
                close()
            }
        }.build()
        
        return _Meal_lunch!!
    }

private var _Meal_lunch: ImageVector? = null

