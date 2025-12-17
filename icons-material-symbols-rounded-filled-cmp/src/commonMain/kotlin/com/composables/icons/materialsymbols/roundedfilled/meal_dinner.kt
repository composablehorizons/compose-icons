package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Meal_dinner: ImageVector
    get() {
        if (_Meal_dinner != null) return _Meal_dinner!!
        
        _Meal_dinner = ImageVector.Builder(
            name = "meal_dinner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(322f, 560f)
                quadToRelative(-100f, 0f, -171f, -70f)
                reflectiveQuadTo(80f, 320f)
                quadToRelative(0f, -94f, 62.5f, -161f)
                reflectiveQuadTo(295f, 82f)
                quadToRelative(13f, -2f, 20f, 10f)
                reflectiveQuadToRelative(-1f, 24f)
                quadToRelative(-11f, 20f, -16f, 40.5f)
                reflectiveQuadToRelative(-5f, 43.5f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(473f, 380f)
                quadToRelative(12f, 0f, 24f, -1.5f)
                reflectiveQuadToRelative(23f, -4.5f)
                quadToRelative(14f, -4f, 23.5f, 5f)
                reflectiveQuadToRelative(5.5f, 21f)
                quadToRelative(-26f, 71f, -87.5f, 115.5f)
                reflectiveQuadTo(322f, 560f)
                close()
                moveToRelative(398f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
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
                horizontalLineToRelative(200f)
                verticalLineToRelative(-127f)
                quadToRelative(-36f, -13f, -58f, -44f)
                reflectiveQuadToRelative(-22f, -69f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 240f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 38f, -22f, 69f)
                reflectiveQuadToRelative(-58f, 44f)
                verticalLineToRelative(127f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Meal_dinner!!
    }

private var _Meal_dinner: ImageVector? = null

