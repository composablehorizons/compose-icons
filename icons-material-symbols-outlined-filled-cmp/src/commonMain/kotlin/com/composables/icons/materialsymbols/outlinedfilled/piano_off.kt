package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Piano_off: ImageVector
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
                moveTo(791f, 905f)
                lineToRelative(-65f, -65f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-526f)
                lineToRelative(-65f, -65f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(49f, -179f)
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

