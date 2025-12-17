package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 760f)
                close()
                moveToRelative(129f, -171f)
                lineTo(216f, 476f)
                quadToRelative(-23f, -23f, -23.5f, -56.5f)
                reflectiveQuadTo(215f, 363f)
                lineToRelative(29f, -29f)
                lineToRelative(228f, 226f)
                lineToRelative(-29f, 29f)
                quadToRelative(-23f, 23f, -57f, 23f)
                reflectiveQuadToRelative(-57f, -23f)
                close()
                moveToRelative(311f, -197f)
                lineTo(414f, 164f)
                lineToRelative(29f, -29f)
                quadToRelative(23f, -23f, 56.5f, -22.5f)
                reflectiveQuadTo(556f, 136f)
                lineToRelative(113f, 113f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineToRelative(-29f, 29f)
                close()
                moveToRelative(156f, 380f)
                lineTo(302f, 278f)
                lineToRelative(56f, -56f)
                lineToRelative(494f, 494f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

