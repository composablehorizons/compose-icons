package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Hdr_plus_off: ImageVector
    get() {
        if (_Hdr_plus_off != null) return _Hdr_plus_off!!
        
        _Hdr_plus_off = ImageVector.Builder(
            name = "hdr_plus_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 420f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(340f, 620f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-60f, 140f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(44f)
                lineToRelative(34f, 80f)
                horizontalLineToRelative(62f)
                lineToRelative(-36f, -84f)
                quadToRelative(15f, -9f, 25.5f, -23.5f)
                reflectiveQuadTo(480f, 620f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(420f, 520f)
                horizontalLineTo(280f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, -280f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-84f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(144f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -84f, 31f, -156.5f)
                reflectiveQuadTo(199f, 199f)
                lineToRelative(562f, 562f)
                quadToRelative(-51f, 57f, -123.5f, 88f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(340f, 52f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-6f, -232f)
                lineTo(594f, 480f)
                horizontalLineToRelative(46f)
                quadToRelative(24f, 0f, 42f, -18f)
                reflectiveQuadToRelative(18f, -42f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -24f, -18f, -42f)
                reflectiveQuadToRelative(-42f, -18f)
                horizontalLineTo(520f)
                verticalLineToRelative(166f)
                lineToRelative(-40f, -40f)
                verticalLineToRelative(-126f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(66f)
                lineTo(259f, 145f)
                quadToRelative(47f, -32f, 103f, -48.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 62f, -17f, 117.5f)
                reflectiveQuadTo(814f, 700f)
                close()
            }
        }.build()
        
        return _Hdr_plus_off!!
    }

private var _Hdr_plus_off: ImageVector? = null

