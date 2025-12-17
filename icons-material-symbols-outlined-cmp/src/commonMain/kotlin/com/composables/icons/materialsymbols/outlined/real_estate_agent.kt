package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Real_estate_agent: ImageVector
    get() {
        if (_Real_estate_agent != null) return _Real_estate_agent!!
        
        _Real_estate_agent = ImageVector.Builder(
            name = "real_estate_agent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 560f)
                verticalLineToRelative(-260f)
                lineTo(560f, 160f)
                lineTo(360f, 300f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-100f)
                lineToRelative(280f, -200f)
                lineToRelative(280f, 200f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(560f, 160f)
                close()
                moveToRelative(20f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(80f, 80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveTo(280f, 740f)
                lineToRelative(278f, 76f)
                lineToRelative(238f, -74f)
                quadToRelative(-5f, -9f, -14.5f, -15.5f)
                reflectiveQuadTo(760f, 720f)
                horizontalLineTo(558f)
                quadToRelative(-27f, 0f, -43f, -2f)
                reflectiveQuadToRelative(-33f, -8f)
                lineToRelative(-93f, -31f)
                lineToRelative(22f, -78f)
                lineToRelative(81f, 27f)
                quadToRelative(17f, 5f, 40f, 8f)
                reflectiveQuadToRelative(68f, 4f)
                quadToRelative(0f, -11f, -6.5f, -21f)
                reflectiveQuadTo(578f, 606f)
                lineToRelative(-234f, -86f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(220f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(304f)
                quadToRelative(7f, 0f, 14f, 1.5f)
                reflectiveQuadToRelative(13f, 3.5f)
                lineToRelative(235f, 87f)
                quadToRelative(33f, 12f, 53.5f, 42f)
                reflectiveQuadToRelative(20.5f, 66f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, 33f)
                reflectiveQuadToRelative(35f, 87f)
                verticalLineToRelative(40f)
                lineTo(560f, 900f)
                lineToRelative(-280f, -78f)
                verticalLineToRelative(58f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Real_estate_agent!!
    }

private var _Real_estate_agent: ImageVector? = null

