package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Outgoing_mail: ImageVector
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
                moveTo(416f, 440f)
                lineToRelative(264f, -154f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(-10f)
                lineTo(416f, 347f)
                lineTo(169f, 200f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(88f)
                lineToRelative(256f, 152f)
                close()
                moveTo(155f, 680f)
                quadToRelative(-31f, 0f, -53f, -22f)
                reflectiveQuadToRelative(-22f, -53f)
                verticalLineToRelative(-410f)
                quadToRelative(0f, -31f, 22f, -53f)
                reflectiveQuadToRelative(53f, -22f)
                horizontalLineToRelative(530f)
                quadToRelative(31f, 0f, 53f, 22f)
                reflectiveQuadToRelative(22f, 53f)
                verticalLineToRelative(173f)
                quadToRelative(0f, 14f, -11f, 24f)
                reflectiveQuadToRelative(-25f, 9f)
                quadToRelative(-49f, -2f, -93.5f, 16f)
                reflectiveQuadTo(551f, 470f)
                quadToRelative(-35f, 35f, -53.5f, 80f)
                reflectiveQuadTo(481f, 644f)
                quadToRelative(1f, 14f, -9f, 25f)
                reflectiveQuadToRelative(-24f, 11f)
                horizontalLineTo(155f)
                close()
            }
        }.build()
        
        return _Outgoing_mail!!
    }

private var _Outgoing_mail: ImageVector? = null

