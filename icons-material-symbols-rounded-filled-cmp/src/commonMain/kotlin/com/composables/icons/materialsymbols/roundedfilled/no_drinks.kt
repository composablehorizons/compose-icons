package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_drinks: ImageVector
    get() {
        if (_No_drinks != null) return _No_drinks!!
        
        _No_drinks = ImageVector.Builder(
            name = "no_drinks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(592f, 478f)
                lineTo(394f, 280f)
                horizontalLineToRelative(268f)
                lineToRelative(72f, -80f)
                horizontalLineTo(314f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(543f)
                quadToRelative(27f, 0f, 44f, 18.5f)
                reflectiveQuadToRelative(17f, 41.5f)
                quadToRelative(0f, 11f, -4f, 21f)
                reflectiveQuadToRelative(-12f, 19f)
                lineTo(592f, 478f)
                close()
                moveTo(280f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 760f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-207f)
                lineTo(84f, 197f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadTo(84f, 141f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 679f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineTo(521f, 634f)
                lineToRelative(-1f, 126f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _No_drinks!!
    }

private var _No_drinks: ImageVector? = null

