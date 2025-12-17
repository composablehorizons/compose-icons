package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Outgoing_mail: ImageVector
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
                moveTo(720f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -64f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(167f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
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
                verticalLineToRelative(209f)
                quadToRelative(-10f, -2f, -20f, -3f)
                reflectiveQuadToRelative(-20f, -1f)
                quadToRelative(-98f, 0f, -169f, 70.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(0f, 10f, 1f, 20f)
                reflectiveQuadToRelative(3f, 20f)
                horizontalLineTo(155f)
                close()
            }
        }.build()
        
        return _Outgoing_mail!!
    }

private var _Outgoing_mail: ImageVector? = null

