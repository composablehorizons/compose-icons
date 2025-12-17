package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Concierge: ImageVector
    get() {
        if (_Concierge != null) return _Concierge!!
        
        _Concierge = ImageVector.Builder(
            name = "concierge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 520f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(58f)
                lineToRelative(280f, -78f)
                lineToRelative(320f, 100f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                verticalLineToRelative(80f)
                lineTo(358f, 520f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(160f, 0f)
                horizontalLineToRelative(64f)
                lineToRelative(256f, -94f)
                verticalLineToRelative(-26f)
                horizontalLineToRelative(-71f)
                lineToRelative(-117f, 38f)
                lineToRelative(-24f, -76f)
                lineToRelative(125f, -42f)
                horizontalLineToRelative(283f)
                verticalLineToRelative(-22f)
                lineToRelative(-238f, -74f)
                lineToRelative(-278f, 76f)
                verticalLineToRelative(220f)
                close()
                moveTo(400f, 880f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-80f)
                horizontalLineTo(400f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(40f, -120f)
                horizontalLineToRelative(440f)
                quadToRelative(0f, -81f, -51.5f, -141.5f)
                reflectiveQuadTo(700f, 544f)
                verticalLineToRelative(-65f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(65f)
                quadToRelative(-78f, 14f, -129f, 74.5f)
                reflectiveQuadTo(440f, 760f)
                close()
                moveToRelative(105f, -81f)
                quadToRelative(19f, -27f, 49f, -43.5f)
                reflectiveQuadToRelative(66f, -16.5f)
                quadToRelative(35f, 0f, 64.5f, 16.5f)
                reflectiveQuadTo(773f, 679f)
                horizontalLineTo(545f)
                close()
                moveToRelative(114f, 0f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

