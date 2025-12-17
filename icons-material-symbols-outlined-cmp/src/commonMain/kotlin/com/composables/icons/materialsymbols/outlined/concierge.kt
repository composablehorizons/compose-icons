package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Concierge: ImageVector
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
                moveTo(400f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(0f, -81f, 51f, -141.5f)
                reflectiveQuadTo(620f, 544f)
                verticalLineToRelative(-25f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 479f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 519f)
                verticalLineToRelative(25f)
                quadToRelative(77f, 14f, 128.5f, 74.5f)
                reflectiveQuadTo(880f, 760f)
                horizontalLineTo(440f)
                close()
                moveToRelative(105f, -81f)
                horizontalLineToRelative(228f)
                quadToRelative(-19f, -27f, -48.5f, -43.5f)
                reflectiveQuadTo(660f, 619f)
                quadToRelative(-36f, 0f, -66f, 16.5f)
                reflectiveQuadTo(545f, 679f)
                close()
                moveToRelative(114f, 0f)
                close()
                moveTo(40f, 520f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(58f)
                lineToRelative(280f, -78f)
                lineToRelative(320f, 100f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(24f)
                quadToRelative(0f, 25f, -14.5f, 45.5f)
                reflectiveQuadTo(628f, 419f)
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
                lineToRelative(232f, -85f)
                quadToRelative(11f, -4f, 17.5f, -13.5f)
                reflectiveQuadTo(600f, 320f)
                horizontalLineToRelative(-71f)
                lineToRelative(-117f, 38f)
                lineToRelative(-24f, -76f)
                lineToRelative(125f, -42f)
                horizontalLineToRelative(247f)
                quadToRelative(9f, 0f, 22.5f, -6.5f)
                reflectiveQuadTo(796f, 218f)
                lineToRelative(-238f, -74f)
                lineToRelative(-278f, 76f)
                verticalLineToRelative(220f)
                close()
            }
        }.build()
        
        return _Concierge!!
    }

private var _Concierge: ImageVector? = null

