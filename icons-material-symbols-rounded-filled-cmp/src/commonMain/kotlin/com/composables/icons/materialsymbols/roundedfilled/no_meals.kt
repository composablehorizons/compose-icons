package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_meals: ImageVector
    get() {
        if (_No_meals != null) return _No_meals!!
        
        _No_meals = ImageVector.Builder(
            name = "no_meals",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 645f)
                lineToRelative(-83f, -83f)
                lineToRelative(-117f, -117f)
                verticalLineToRelative(-165f)
                quadToRelative(0f, -34f, 14.5f, -69.5f)
                reflectiveQuadTo(612f, 146f)
                quadToRelative(23f, -29f, 51f, -47.5f)
                reflectiveQuadToRelative(55f, -18.5f)
                quadToRelative(18f, 0f, 30f, 14f)
                reflectiveQuadToRelative(12f, 33f)
                verticalLineToRelative(518f)
                close()
                moveToRelative(88f, 258f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-63f, -62f)
                horizontalLineToRelative(32f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 881f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 841f)
                verticalLineToRelative(-48f)
                lineTo(56f, 169f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                close()
                moveTo(480f, 365f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-165f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 120f)
                verticalLineToRelative(245f)
                close()
                moveTo(360f, 245f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-45f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 120f)
                verticalLineToRelative(125f)
                close()
                moveTo(240f, 125f)
                lineToRelative(-45f, -45f)
                quadToRelative(19f, 0f, 32f, 13f)
                reflectiveQuadToRelative(13f, 32f)
                close()
                moveToRelative(80f, 755f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 840f)
                verticalLineToRelative(-326f)
                quadToRelative(-51f, -14f, -85.5f, -56f)
                reflectiveQuadTo(160f, 360f)
                verticalLineToRelative(-201f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(121f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-81f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                lineToRelative(90f, 90f)
                quadToRelative(-16f, 23f, -39.5f, 39.5f)
                reflectiveQuadTo(360f, 514f)
                verticalLineToRelative(326f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                close()
            }
        }.build()
        
        return _No_meals!!
    }

private var _No_meals: ImageVector? = null

