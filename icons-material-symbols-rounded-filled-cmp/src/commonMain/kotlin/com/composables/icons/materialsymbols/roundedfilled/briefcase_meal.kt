package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Briefcase_meal: ImageVector
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
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(400f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-20f, 520f)
                verticalLineToRelative(-120f)
                quadToRelative(26f, -6f, 43f, -27.5f)
                reflectiveQuadToRelative(17f, -49.5f)
                verticalLineToRelative(-143f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(131f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-131f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(143f)
                quadToRelative(0f, 28f, 17f, 49.5f)
                reflectiveQuadToRelative(43f, 27.5f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-88f)
                quadToRelative(26f, -14f, 43f, -49.5f)
                reflectiveQuadToRelative(17f, -82.5f)
                quadToRelative(0f, -58f, -26.5f, -99f)
                reflectiveQuadTo(610f, 400f)
                quadToRelative(-38f, 0f, -64f, 41f)
                reflectiveQuadToRelative(-26f, 99f)
                quadToRelative(0f, 46f, 17f, 81.5f)
                reflectiveQuadToRelative(43f, 50.5f)
                verticalLineToRelative(88f)
                horizontalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Briefcase_meal!!
    }

private var _Briefcase_meal: ImageVector? = null

