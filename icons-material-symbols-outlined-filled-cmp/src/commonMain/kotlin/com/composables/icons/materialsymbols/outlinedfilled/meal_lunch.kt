package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Meal_lunch: ImageVector
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
                moveTo(80f, 520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineTo(80f)
                close()
                moveToRelative(295f, -89f)
                lineToRelative(-85f, -85f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 320f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(120f, 320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(-1f, -3f, -1.5f, -5.5f)
                reflectiveQuadTo(117f, 789f)
                lineTo(80f, 640f)
                horizontalLineToRelative(480f)
                lineToRelative(-37f, 149f)
                quadToRelative(-1f, 3f, -1.5f, 5.5f)
                reflectiveQuadTo(520f, 800f)
                horizontalLineToRelative(83f)
                lineToRelative(60f, -240f)
                horizontalLineTo(493f)
                lineToRelative(-13f, -160f)
                horizontalLineToRelative(400f)
                lineToRelative(-33f, 400f)
                horizontalLineToRelative(73f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Meal_lunch!!
    }

private var _Meal_lunch: ImageVector? = null

