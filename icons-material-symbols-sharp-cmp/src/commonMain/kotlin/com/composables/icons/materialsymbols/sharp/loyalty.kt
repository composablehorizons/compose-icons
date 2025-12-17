package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Loyalty: ImageVector
    get() {
        if (_Loyalty != null) return _Loyalty!!
        
        _Loyalty = ImageVector.Builder(
            name = "loyalty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(513f, 913f)
                lineTo(80f, 480f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(400f)
                lineToRelative(432f, 434f)
                lineTo(513f, 913f)
                close()
                moveToRelative(0f, -113f)
                lineToRelative(286f, -286f)
                lineToRelative(-353f, -354f)
                horizontalLineTo(160f)
                verticalLineToRelative(286f)
                lineToRelative(353f, 354f)
                close()
                moveTo(260f, 320f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 260f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 200f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 260f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 320f)
                close()
                moveToRelative(220f, 160f)
                close()
                moveToRelative(40f, 220f)
                lineToRelative(140f, -140f)
                quadToRelative(11f, -11f, 17.5f, -26f)
                reflectiveQuadToRelative(6.5f, -32f)
                quadToRelative(0f, -34f, -24f, -58f)
                reflectiveQuadToRelative(-58f, -24f)
                quadToRelative(-19f, 0f, -37.5f, 11f)
                reflectiveQuadTo(520f, 468f)
                quadToRelative(-30f, -28f, -47f, -38f)
                reflectiveQuadToRelative(-35f, -10f)
                quadToRelative(-34f, 0f, -58f, 24f)
                reflectiveQuadToRelative(-24f, 58f)
                quadToRelative(0f, 17f, 6.5f, 32f)
                reflectiveQuadToRelative(17.5f, 26f)
                lineToRelative(140f, 140f)
                close()
            }
        }.build()
        
        return _Loyalty!!
    }

private var _Loyalty: ImageVector? = null

