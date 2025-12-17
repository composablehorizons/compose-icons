package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Transgender: ImageVector
    get() {
        if (_Transgender != null) return _Transgender!!
        
        _Transgender = ImageVector.Builder(
            name = "transgender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(-40f, 240f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-84f)
                quadToRelative(-78f, -14f, -129f, -75f)
                reflectiveQuadToRelative(-51f, -141f)
                quadToRelative(0f, -33f, 9.5f, -65f)
                reflectiveQuadToRelative(28.5f, -59f)
                lineToRelative(-26f, -26f)
                lineToRelative(-28f, 28f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(188f, 338f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                lineToRelative(28f, -29f)
                lineToRelative(-76f, -76f)
                verticalLineToRelative(63f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(100f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(60f, 240f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(100f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(300f, 80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(260f, 120f)
                horizontalLineToRelative(-63f)
                lineToRelative(76f, 76f)
                lineToRelative(29f, -29f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(358f, 224f)
                lineToRelative(-28f, 29f)
                lineToRelative(26f, 26f)
                quadToRelative(27f, -20f, 59f, -29.5f)
                reflectiveQuadToRelative(65f, -9.5f)
                quadToRelative(33f, 0f, 65f, 9.5f)
                reflectiveQuadToRelative(59f, 29.5f)
                lineToRelative(159f, -159f)
                horizontalLineToRelative(-63f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(660f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(700f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(900f, 80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(860f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(820f, 240f)
                verticalLineToRelative(-63f)
                lineTo(661f, 335f)
                quadToRelative(19f, 28f, 29f, 59.5f)
                reflectiveQuadToRelative(10f, 65.5f)
                quadToRelative(0f, 80f, -51f, 141f)
                reflectiveQuadToRelative(-129f, 75f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                verticalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Transgender!!
    }

private var _Transgender: ImageVector? = null

