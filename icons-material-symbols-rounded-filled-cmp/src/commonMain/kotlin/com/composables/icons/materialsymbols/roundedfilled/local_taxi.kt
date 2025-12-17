package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Local_taxi: ImageVector
    get() {
        if (_Local_taxi != null) return _Local_taxi!!
        
        _Local_taxi = ImageVector.Builder(
            name = "local_taxi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 760f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 780f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(75f, -213f)
                quadToRelative(8f, -24f, 29f, -39f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(85f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 160f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(85f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 39f)
                lineToRelative(75f, 213f)
                quadToRelative(2f, 6f, 3f, 13f)
                reflectiveQuadToRelative(1f, 14f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 780f)
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
                reflectiveQuadTo(360f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(240f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(300f, 640f)
                close()
                moveToRelative(360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(720f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(600f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(660f, 640f)
                close()
            }
        }.build()
        
        return _Local_taxi!!
    }

private var _Local_taxi: ImageVector? = null

