package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Soap: ImageVector
    get() {
        if (_Soap != null) return _Soap!!
        
        _Soap = ImageVector.Builder(
            name = "soap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(630f, 320f)
                quadToRelative(-29f, 0f, -49.5f, -20.5f)
                reflectiveQuadTo(560f, 250f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(630f, 180f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(700f, 250f)
                quadToRelative(0f, 29f, -20.5f, 49.5f)
                reflectiveQuadTo(630f, 320f)
                close()
                moveToRelative(210f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(760f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 320f)
                close()
                moveTo(700f, 160f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 100f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 40f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 100f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 160f)
                close()
                moveToRelative(60f, 720f)
                horizontalLineTo(80f)
                verticalLineToRelative(-441f)
                lineToRelative(385f, -250f)
                lineToRelative(65f, 65f)
                lineToRelative(-78f, 126f)
                horizontalLineToRelative(348f)
                verticalLineToRelative(80f)
                horizontalLineTo(308f)
                lineToRelative(77f, -124f)
                lineToRelative(-225f, 146f)
                verticalLineToRelative(318f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveTo(320f, 618f)
                close()
            }
        }.build()
        
        return _Soap!!
    }

private var _Soap: ImageVector? = null

