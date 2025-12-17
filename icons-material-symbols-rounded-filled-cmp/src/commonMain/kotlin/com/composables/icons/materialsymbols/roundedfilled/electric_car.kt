package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Electric_car: ImageVector
    get() {
        if (_Electric_car != null) return _Electric_car!!
        
        _Electric_car = ImageVector.Builder(
            name = "electric_car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 680f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 620f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(75f, -213f)
                quadToRelative(8f, -24f, 29f, -39f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(410f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 39f)
                lineToRelative(75f, 213f)
                quadToRelative(2f, 6f, 3f, 13f)
                reflectiveQuadToRelative(1f, 14f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 680f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 620f)
                verticalLineToRelative(-20f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-8f, -360f)
                horizontalLineToRelative(496f)
                lineToRelative(-42f, -120f)
                horizontalLineTo(274f)
                lineToRelative(-42f, 120f)
                close()
                moveToRelative(68f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(360f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 480f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 420f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 360f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 480f)
                close()
                moveTo(520f, 840f)
                verticalLineToRelative(48f)
                quadToRelative(0f, 11f, -9.5f, 17f)
                reflectiveQuadTo(491f, 906f)
                lineToRelative(-173f, -87f)
                quadToRelative(-7f, -4f, -5.5f, -11.5f)
                reflectiveQuadToRelative(9.5f, -7.5f)
                horizontalLineToRelative(118f)
                verticalLineToRelative(-48f)
                quadToRelative(0f, -11f, 9.5f, -17f)
                reflectiveQuadToRelative(19.5f, -1f)
                lineToRelative(173f, 87f)
                quadToRelative(7f, 4f, 5.5f, 11.5f)
                reflectiveQuadTo(638f, 840f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Electric_car!!
    }

private var _Electric_car: ImageVector? = null

