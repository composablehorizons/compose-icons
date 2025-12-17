package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Fluid: ImageVector
    get() {
        if (_Fluid != null) return _Fluid!!
        
        _Fluid = ImageVector.Builder(
            name = "fluid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-83f)
                quadToRelative(-103f, -14f, -171.5f, -92.5f)
                reflectiveQuadTo(200f, 480f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 106f, -68.5f, 184.5f)
                reflectiveQuadTo(520f, 757f)
                verticalLineToRelative(83f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(30f, -400f)
                horizontalLineToRelative(126f)
                quadToRelative(2f, -10f, 3f, -19.5f)
                reflectiveQuadToRelative(1f, -20.5f)
                verticalLineToRelative(-40f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(110f)
                quadToRelative(33f, 0f, 62.5f, 15f)
                reflectiveQuadToRelative(49.5f, 41f)
                quadToRelative(8f, 11f, 21f, 17.5f)
                reflectiveQuadToRelative(27f, 6.5f)
                close()
                moveToRelative(-70f, 160f)
                quadToRelative(49f, 0f, 91f, -21.5f)
                reflectiveQuadToRelative(69f, -58.5f)
                horizontalLineToRelative(-90f)
                quadToRelative(-33f, 0f, -62.5f, -15f)
                reflectiveQuadTo(438f, 544f)
                quadToRelative(-8f, -11f, -21f, -17.5f)
                reflectiveQuadToRelative(-27f, -6.5f)
                horizontalLineTo(284f)
                quadToRelative(14f, 69f, 68.5f, 114.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-42f, -160f)
                close()
            }
        }.build()
        
        return _Fluid!!
    }

private var _Fluid: ImageVector? = null

