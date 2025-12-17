package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Piano_off: ImageVector
    get() {
        if (_Piano_off != null) return _Piano_off!!
        
        _Piano_off = ImageVector.Builder(
            name = "piano_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineToRelative(-37f, -36f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-526f)
                lineToRelative(-37f, -37f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveToRelative(77f, -150f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-446f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(340f)
                quadToRelative(0f, 5f, -1.5f, 10f)
                reflectiveQuadToRelative(-4.5f, 10f)
                lineTo(520f, 406f)
                verticalLineToRelative(-206f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(126f)
                lineTo(234f, 120f)
                horizontalLineToRelative(526f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
                close()
                moveToRelative(-640f, 34f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-10f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 540f)
                verticalLineToRelative(-146f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(190f, 0f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(-76f)
                lineTo(438f, 552f)
                quadToRelative(-4f, 13f, -14.5f, 20.5f)
                reflectiveQuadTo(400f, 580f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(180f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(16f)
                lineToRelative(-16f, -16f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Piano_off!!
    }

private var _Piano_off: ImageVector? = null

