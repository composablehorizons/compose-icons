package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Directions_off: ImageVector
    get() {
        if (_Directions_off != null) return _Directions_off!!
        
        _Directions_off = ImageVector.Builder(
            name = "directions_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(640f, 752f)
                lineTo(480f, 912f)
                lineTo(48f, 480f)
                lineToRelative(217f, -217f)
                lineToRelative(225f, 225f)
                verticalLineToRelative(112f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(320f, 600f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(81f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-41f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(434f, 38f)
                lineTo(618f, 502f)
                lineToRelative(62f, -62f)
                lineToRelative(-140f, -140f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-24f)
                lineTo(322f, 206f)
                lineToRelative(158f, -158f)
                lineToRelative(432f, 432f)
                lineToRelative(-158f, 158f)
                close()
            }
        }.build()
        
        return _Directions_off!!
    }

private var _Directions_off: ImageVector? = null

