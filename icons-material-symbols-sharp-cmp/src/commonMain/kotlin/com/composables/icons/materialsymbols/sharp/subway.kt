package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Subway: ImageVector
    get() {
        if (_Subway != null) return _Subway!!
        
        _Subway = ImageVector.Builder(
            name = "subway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-526f)
                quadToRelative(0f, -85f, 44f, -147.5f)
                reflectiveQuadTo(248f, 112f)
                quadToRelative(54f, -21f, 115f, -26.5f)
                reflectiveQuadToRelative(117f, -5.5f)
                quadToRelative(56f, 0f, 117f, 5.5f)
                reflectiveQuadTo(712f, 112f)
                quadToRelative(80f, 32f, 124f, 94.5f)
                reflectiveQuadTo(880f, 354f)
                verticalLineToRelative(526f)
                horizontalLineTo(80f)
                close()
                moveToRelative(284f, -80f)
                horizontalLineToRelative(230f)
                lineToRelative(-60f, -60f)
                horizontalLineTo(424f)
                lineToRelative(-60f, 60f)
                close()
                moveToRelative(-64f, -280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-160f)
                horizontalLineTo(300f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(320f, 140f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(660f, 620f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(620f, 580f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(580f, 620f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(620f, 660f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(380f, 620f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 580f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(300f, 620f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(340f, 660f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-20f)
                lineToRelative(42f, -42f)
                quadToRelative(-44f, -6f, -73f, -39.5f)
                reflectiveQuadTo(240f, 620f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -78f, 74.5f, -99f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(100f, 0f, 170f, 21f)
                reflectiveQuadToRelative(70f, 99f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 45f, -29f, 78.5f)
                reflectiveQuadTo(618f, 738f)
                lineToRelative(42f, 42f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-446f)
                quadToRelative(0f, -60f, -29.5f, -102.5f)
                reflectiveQuadTo(682f, 186f)
                quadToRelative(-44f, -17f, -97.5f, -21.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-51f, 0f, -104.5f, 4.5f)
                reflectiveQuadTo(278f, 186f)
                quadToRelative(-59f, 23f, -88.5f, 65.5f)
                reflectiveQuadTo(160f, 354f)
                verticalLineToRelative(446f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Subway!!
    }

private var _Subway: ImageVector? = null

