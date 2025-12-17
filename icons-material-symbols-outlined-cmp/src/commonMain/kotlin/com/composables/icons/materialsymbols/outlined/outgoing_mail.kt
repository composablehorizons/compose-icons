package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Outgoing_mail: ImageVector
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
                moveTo(160f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(204f)
                quadToRelative(-10f, -2f, -20f, -3f)
                reflectiveQuadToRelative(-20f, -1f)
                quadToRelative(-10f, 0f, -20f, 0.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                verticalLineToRelative(-147f)
                lineTo(416f, 440f)
                lineTo(160f, 257f)
                verticalLineToRelative(343f)
                horizontalLineToRelative(323f)
                quadToRelative(-2f, 10f, -2.5f, 20f)
                reflectiveQuadToRelative(-0.5f, 20f)
                quadToRelative(0f, 10f, 1f, 20f)
                reflectiveQuadToRelative(3f, 20f)
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

