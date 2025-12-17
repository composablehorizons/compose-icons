package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wb_shade: ImageVector
    get() {
        if (_Wb_shade != null) return _Wb_shade!!
        
        _Wb_shade = ImageVector.Builder(
            name = "wb_shade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 800f)
                lineTo(560f, 580f)
                verticalLineToRelative(-52f)
                quadToRelative(0f, -14f, 12f, -19f)
                reflectiveQuadToRelative(22f, 5f)
                lineToRelative(252f, 252f)
                quadToRelative(10f, 10f, 5f, 22f)
                reflectiveQuadToRelative(-19f, 12f)
                horizontalLineToRelative(-52f)
                close()
                moveToRelative(-220f, -40f)
                verticalLineToRelative(-80f)
                lineToRelative(120f, 120f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-32f)
                quadToRelative(-14f, 0f, -19f, -12f)
                reflectiveQuadToRelative(5f, -22f)
                lineToRelative(178f, -178f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(178f, 178f)
                quadToRelative(10f, 10f, 5f, 22f)
                reflectiveQuadToRelative(-19f, 12f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                close()
                moveToRelative(120f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Wb_shade!!
    }

private var _Wb_shade: ImageVector? = null

