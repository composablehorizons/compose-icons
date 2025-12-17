package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Fluid: ImageVector
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
                moveTo(760f, 920f)
                horizontalLineTo(440f)
                verticalLineToRelative(-163f)
                quadToRelative(-103f, -14f, -171.5f, -92.5f)
                reflectiveQuadTo(200f, 480f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 106f, -68.5f, 184.5f)
                reflectiveQuadTo(520f, 757f)
                verticalLineToRelative(83f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveTo(550f, 520f)
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
            }
        }.build()
        
        return _Fluid!!
    }

private var _Fluid: ImageVector? = null

