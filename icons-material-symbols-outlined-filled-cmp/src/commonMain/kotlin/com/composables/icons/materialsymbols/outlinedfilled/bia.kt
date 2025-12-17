package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Bia: ImageVector
    get() {
        if (_Bia != null) return _Bia!!
        
        _Bia = ImageVector.Builder(
            name = "bia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 360f)
                horizontalLineToRelative(126f)
                quadToRelative(-3f, -9f, -4.5f, -19f)
                reflectiveQuadToRelative(-1.5f, -21f)
                quadToRelative(0f, -11f, 1.5f, -21f)
                reflectiveQuadToRelative(4.5f, -19f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(360f, 40f)
                quadToRelative(58f, 0f, 109f, -15f)
                reflectiveQuadToRelative(51f, -65f)
                quadToRelative(0f, -50f, -51f, -65f)
                reflectiveQuadToRelative(-109f, -15f)
                quadToRelative(-58f, 0f, -109f, 15f)
                reflectiveQuadToRelative(-51f, 65f)
                quadToRelative(0f, 50f, 51f, 65f)
                reflectiveQuadToRelative(109f, 15f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(275f)
                quadToRelative(34f, -20f, 77f, -30f)
                reflectiveQuadToRelative(88f, -10f)
                quadToRelative(91f, 0f, 165.5f, 39.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(480f)
                horizontalLineTo(640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Bia!!
    }

private var _Bia: ImageVector? = null

