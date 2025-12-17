package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Touchpad_mouse: ImageVector
    get() {
        if (_Touchpad_mouse != null) return _Touchpad_mouse!!
        
        _Touchpad_mouse = ImageVector.Builder(
            name = "touchpad_mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 880f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(440f, 660f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 91f, -64f, 155.5f)
                reflectiveQuadTo(660f, 880f)
                close()
                moveToRelative(-500f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(35f)
                quadToRelative(0f, 17f, -16f, 24.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                quadToRelative(-38f, -27f, -82f, -41.5f)
                reflectiveQuadTo(660f, 240f)
                quadToRelative(-125f, 0f, -212.5f, 87.5f)
                reflectiveQuadTo(360f, 540f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 24f, 3f, 47f)
                reflectiveQuadToRelative(11f, 46f)
                quadToRelative(5f, 17f, -4.5f, 32f)
                reflectiveQuadTo(343f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -280f)
                quadToRelative(3f, -75f, 54f, -129.5f)
                reflectiveQuadTo(620f, 323f)
                verticalLineToRelative(197f)
                horizontalLineTo(440f)
                close()
                moveToRelative(260f, 0f)
                verticalLineToRelative(-197f)
                quadToRelative(75f, 13f, 126f, 67.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineTo(700f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse!!
    }

private var _Touchpad_mouse: ImageVector? = null

