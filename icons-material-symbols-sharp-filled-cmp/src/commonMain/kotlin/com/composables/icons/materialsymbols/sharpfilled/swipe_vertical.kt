package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Swipe_vertical: ImageVector
    get() {
        if (_Swipe_vertical != null) return _Swipe_vertical!!
        
        _Swipe_vertical = ImageVector.Builder(
            name = "swipe_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(81f)
                quadToRelative(-59f, -72f, -90f, -159f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -94f, 31f, -181f)
                reflectiveQuadToRelative(90f, -159f)
                horizontalLineTo(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-116f)
                quadToRelative(-58f, 66f, -89f, 147f)
                reflectiveQuadToRelative(-31f, 169f)
                quadToRelative(0f, 88f, 31f, 169f)
                reflectiveQuadToRelative(89f, 147f)
                verticalLineToRelative(-116f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(531f, -30f)
                lineTo(304f, 707f)
                lineToRelative(38f, -83f)
                lineToRelative(116f, -9f)
                lineToRelative(-126f, -344f)
                lineToRelative(75f, -28f)
                lineToRelative(110f, 301f)
                lineToRelative(38f, -14f)
                lineToRelative(-55f, -149f)
                lineToRelative(75f, -29f)
                lineToRelative(55f, 151f)
                lineToRelative(37f, -14f)
                lineToRelative(-41f, -112f)
                lineToRelative(75f, -28f)
                lineToRelative(41f, 113f)
                lineToRelative(38f, -14f)
                lineToRelative(-14f, -37f)
                lineToRelative(75f, -28f)
                lineToRelative(125f, 338f)
                lineToRelative(-355f, 129f)
                close()
            }
        }.build()
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

