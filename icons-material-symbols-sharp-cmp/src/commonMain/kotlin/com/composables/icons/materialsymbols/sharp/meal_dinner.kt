package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Meal_dinner: ImageVector
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
                quadToRelative(0f, -100f, 71f, -170f)
                reflectiveQuadToRelative(172f, -70f)
                horizontalLineToRelative(16f)
                quadToRelative(-22f, 25f, -34f, 56f)
                reflectiveQuadToRelative(-12f, 64f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(473f, 380f)
                quadToRelative(23f, 0f, 45f, -5.5f)
                reflectiveQuadToRelative(42f, -16.5f)
                quadToRelative(-14f, 88f, -81f, 145f)
                reflectiveQuadToRelative(-157f, 57f)
                close()
                moveToRelative(-1f, -80f)
                quadToRelative(24f, 0f, 47.5f, -6.5f)
                reflectiveQuadTo(412f, 453f)
                quadToRelative(-87f, -21f, -142f, -90.5f)
                reflectiveQuadTo(213f, 204f)
                quadToRelative(-26f, 23f, -39.5f, 53f)
                reflectiveQuadTo(160f, 320f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(114f, 47f)
                close()
                moveToRelative(399f, -40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(40f, 160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(760f, 600f)
                close()
                moveTo(458f, 720f)
                horizontalLineTo(182f)
                lineToRelative(20f, 80f)
                horizontalLineToRelative(236f)
                lineToRelative(20f, -80f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                lineTo(80f, 640f)
                horizontalLineToRelative(480f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-127f)
                quadToRelative(-36f, -13f, -58f, -44f)
                reflectiveQuadToRelative(-22f, -69f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 38f, -22f, 69f)
                reflectiveQuadToRelative(-58f, 44f)
                verticalLineToRelative(127f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(246f, -538f)
                close()
                moveToRelative(474f, 178f)
                close()
                moveTo(320f, 800f)
                close()
            }
        }.build()
        
        return _Meal_dinner!!
    }

private var _Meal_dinner: ImageVector? = null

