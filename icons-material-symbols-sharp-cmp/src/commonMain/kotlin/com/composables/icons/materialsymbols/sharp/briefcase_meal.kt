package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Briefcase_meal: ImageVector
    get() {
        if (_Briefcase_meal != null) return _Briefcase_meal!!
        
        _Briefcase_meal = ImageVector.Builder(
            name = "briefcase_meal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveTo(160f, 760f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                quadToRelative(-26f, -6f, -43f, -27.5f)
                reflectiveQuadTo(260f, 563f)
                verticalLineToRelative(-163f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 28f, -17f, 49.5f)
                reflectiveQuadTo(380f, 640f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-88f)
                quadToRelative(-26f, -15f, -43f, -50.5f)
                reflectiveQuadTo(520f, 540f)
                quadToRelative(0f, -58f, 26f, -99f)
                reflectiveQuadToRelative(64f, -41f)
                quadToRelative(37f, 0f, 63.5f, 41f)
                reflectiveQuadToRelative(26.5f, 99f)
                quadToRelative(0f, 47f, -17f, 82.5f)
                reflectiveQuadTo(640f, 672f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Briefcase_meal!!
    }

private var _Briefcase_meal: ImageVector? = null

