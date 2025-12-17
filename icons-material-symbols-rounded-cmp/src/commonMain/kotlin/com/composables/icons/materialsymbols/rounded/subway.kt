package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Subway: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-446f)
                quadToRelative(0f, -85f, 44f, -147.5f)
                reflectiveQuadTo(248f, 112f)
                quadToRelative(54f, -21f, 115f, -26.5f)
                reflectiveQuadToRelative(117f, -5.5f)
                quadToRelative(56f, 0f, 117f, 5.5f)
                reflectiveQuadTo(712f, 112f)
                quadToRelative(80f, 32f, 124f, 94.5f)
                reflectiveQuadTo(880f, 354f)
                verticalLineToRelative(446f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                close()
                moveToRelative(220f, -280f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(160f)
                horizontalLineTo(300f)
                close()
                moveToRelative(320f, 140f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(580f, 620f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(620f, 580f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(660f, 620f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(620f, 660f)
                close()
                moveToRelative(-280f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 620f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 580f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 620f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 660f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(640f)
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
                moveToRelative(264f, -60f)
                horizontalLineToRelative(110f)
                lineToRelative(51f, 51f)
                quadToRelative(5f, 5f, 10.5f, 7f)
                reflectiveQuadToRelative(11.5f, 2f)
                quadToRelative(20f, 0f, 27.5f, -19f)
                reflectiveQuadToRelative(-6.5f, -33f)
                lineToRelative(-10f, -10f)
                quadToRelative(44f, -6f, 73f, -39.5f)
                reflectiveQuadToRelative(29f, -78.5f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -78f, -70f, -99f)
                reflectiveQuadToRelative(-170f, -21f)
                quadToRelative(-91f, 0f, -165.5f, 21f)
                reflectiveQuadTo(240f, 360f)
                verticalLineToRelative(260f)
                quadToRelative(0f, 45f, 29f, 78.5f)
                reflectiveQuadToRelative(73f, 39.5f)
                lineToRelative(-11f, 11f)
                quadToRelative(-14f, 14f, -6.5f, 32.5f)
                reflectiveQuadTo(352f, 800f)
                quadToRelative(6f, 0f, 11f, -2f)
                reflectiveQuadToRelative(10f, -7f)
                lineToRelative(51f, -51f)
                close()
                moveToRelative(-264f, 60f)
                verticalLineToRelative(-446f)
                quadToRelative(0f, -60f, 29.5f, -102.5f)
                reflectiveQuadTo(278f, 186f)
                quadToRelative(44f, -17f, 97.5f, -21.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(51f, 0f, 104.5f, 4.5f)
                reflectiveQuadTo(682f, 186f)
                quadToRelative(59f, 23f, 88.5f, 65.5f)
                reflectiveQuadTo(800f, 354f)
                verticalLineToRelative(446f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Subway!!
    }

private var _Subway: ImageVector? = null

