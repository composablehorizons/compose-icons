package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Language_us_dvorak: ImageVector
    get() {
        if (_Language_us_dvorak != null) return _Language_us_dvorak!!
        
        _Language_us_dvorak = ImageVector.Builder(
            name = "language_us_dvorak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-240f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-40f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 640f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(170f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(450f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(370f, 680f)
                horizontalLineTo(200f)
                close()
                moveToRelative(452f, 0f)
                quadToRelative(-12f, 0f, -22f, -7.5f)
                reflectiveQuadTo(616f, 654f)
                lineTo(507f, 330f)
                quadToRelative(-6f, -18f, 5f, -34f)
                reflectiveQuadToRelative(31f, -16f)
                quadToRelative(12f, 0f, 22f, 7.5f)
                reflectiveQuadToRelative(14f, 18.5f)
                lineToRelative(86f, 252f)
                lineToRelative(86f, -252f)
                quadToRelative(4f, -11f, 14f, -18.5f)
                reflectiveQuadToRelative(22f, -7.5f)
                quadToRelative(20f, 0f, 31f, 15.5f)
                reflectiveQuadToRelative(5f, 34.5f)
                lineTo(714f, 654f)
                quadToRelative(-4f, 11f, -14f, 18.5f)
                reflectiveQuadToRelative(-22f, 7.5f)
                horizontalLineToRelative(-26f)
                close()
            }
        }.build()
        
        return _Language_us_dvorak!!
    }

private var _Language_us_dvorak: ImageVector? = null

