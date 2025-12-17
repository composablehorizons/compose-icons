package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Uppercase: ImageVector
    get() {
        if (_Uppercase != null) return _Uppercase!!
        
        _Uppercase = ImageVector.Builder(
            name = "uppercase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(660f, 680f)
                verticalLineToRelative(-208f)
                lineToRelative(-36f, 36f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(208f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(700f, 720f)
                close()
                moveTo(236f, 607f)
                lineToRelative(-32f, 90f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(138f, 672f)
                lineToRelative(138f, -368f)
                quadToRelative(4f, -11f, 14f, -17.5f)
                reflectiveQuadToRelative(21f, -6.5f)
                horizontalLineToRelative(27f)
                quadToRelative(11f, 0f, 21f, 6.5f)
                reflectiveQuadToRelative(14f, 17.5f)
                lineToRelative(138f, 369f)
                quadToRelative(7f, 17f, -3.5f, 32f)
                reflectiveQuadTo(479f, 720f)
                quadToRelative(-11f, 0f, -20.5f, -6.5f)
                reflectiveQuadTo(445f, 696f)
                lineToRelative(-31f, -89f)
                horizontalLineTo(236f)
                close()
                moveToRelative(23f, -64f)
                horizontalLineToRelative(131f)
                lineToRelative(-65f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-62f, 182f)
                close()
            }
        }.build()
        
        return _Uppercase!!
    }

private var _Uppercase: ImageVector? = null

