package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Outgoing_mail: ImageVector
    get() {
        if (_Outgoing_mail != null) return _Outgoing_mail!!
        
        _Outgoing_mail = ImageVector.Builder(
            name = "outgoing_mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(727f, 680f)
                horizontalLineTo(600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 600f)
                horizontalLineToRelative(127f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(5f, 5f, 8f, 12.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-8f, 12.5f)
                lineTo(748f, 772f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(692f, 772f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                close()
                moveToRelative(-567f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 16f, -12f, 28f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 363f)
                verticalLineToRelative(-107f)
                lineTo(416f, 440f)
                lineTo(160f, 257f)
                verticalLineToRelative(343f)
                horizontalLineToRelative(283f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(483f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(443f, 680f)
                horizontalLineTo(160f)
                close()
                moveToRelative(58f, -480f)
                lineToRelative(198f, 142f)
                lineToRelative(204f, -142f)
                horizontalLineTo(218f)
                close()
                moveToRelative(-58f, 400f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Outgoing_mail!!
    }

private var _Outgoing_mail: ImageVector? = null

