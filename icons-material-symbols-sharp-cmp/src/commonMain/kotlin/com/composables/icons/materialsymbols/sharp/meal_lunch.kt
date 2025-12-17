package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Meal_lunch: ImageVector
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
                moveTo(202f, 800f)
                horizontalLineToRelative(236f)
                lineToRelative(20f, -80f)
                horizontalLineTo(182f)
                lineToRelative(20f, 80f)
                close()
                moveToRelative(-42f, -280f)
                horizontalLineTo(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(215f, -89f)
                lineToRelative(-85f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(120f, 320f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(120f, 320f)
                close()
                moveToRelative(400f, -160f)
                horizontalLineTo(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                lineTo(80f, 640f)
                horizontalLineToRelative(480f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(246f)
                lineToRelative(27f, -320f)
                horizontalLineTo(567f)
                lineToRelative(7f, 80f)
                horizontalLineToRelative(-81f)
                lineToRelative(-13f, -160f)
                horizontalLineToRelative(400f)
                lineToRelative(-33f, 400f)
                horizontalLineToRelative(73f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(40f, -800f)
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

