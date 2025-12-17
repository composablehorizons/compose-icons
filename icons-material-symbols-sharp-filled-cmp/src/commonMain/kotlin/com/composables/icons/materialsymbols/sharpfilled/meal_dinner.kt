package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Meal_dinner: ImageVector
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
                moveToRelative(398f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
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
            }
        }.build()
        
        return _Meal_dinner!!
    }

private var _Meal_dinner: ImageVector? = null

