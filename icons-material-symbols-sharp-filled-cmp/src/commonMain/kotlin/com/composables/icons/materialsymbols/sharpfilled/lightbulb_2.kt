package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lightbulb_2: ImageVector
    get() {
        if (_Lightbulb_2 != null) return _Lightbulb_2!!
        
        _Lightbulb_2 = ImageVector.Builder(
            name = "lightbulb_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 720f)
                verticalLineToRelative(-130f)
                quadToRelative(-57f, -39f, -88.5f, -100f)
                reflectiveQuadTo(200f, 360f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(0f, 69f, -31.5f, 129.5f)
                reflectiveQuadTo(640f, 590f)
                verticalLineToRelative(130f)
                horizontalLineTo(320f)
                close()
                moveToRelative(40f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Lightbulb_2!!
    }

private var _Lightbulb_2: ImageVector? = null

