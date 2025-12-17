package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Partly_cloudy_day: ImageVector
    get() {
        if (_Partly_cloudy_day != null) return _Partly_cloudy_day!!
        
        _Partly_cloudy_day = ImageVector.Builder(
            name = "partly_cloudy_day",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(734f, 791f)
                lineToRelative(-56f, -57f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(57f, 56f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(791f, 791f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(734f, 791f)
                close()
                moveToRelative(-494f, 9f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 640f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(48f, 0f, 88.5f, 26f)
                reflectiveQuadToRelative(58.5f, 71f)
                lineToRelative(10f, 23f)
                horizontalLineToRelative(24f)
                quadToRelative(42f, 0f, 70.5f, 29f)
                reflectiveQuadToRelative(28.5f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineTo(240f)
                close()
                moveToRelative(359f, -112f)
                quadToRelative(-4f, -63f, -45.5f, -109f)
                reflectiveQuadTo(449f, 522f)
                quadToRelative(-31f, -54f, -83.5f, -85.5f)
                reflectiveQuadTo(250f, 400f)
                quadToRelative(26f, -73f, 89f, -116.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 65f, -32f, 120.5f)
                reflectiveQuadTo(599f, 688f)
                close()
                moveToRelative(201f, -168f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 520f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(226f, 282f)
                lineToRelative(-57f, -57f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(56f, 57f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(282f, 282f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(452f, 0f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -28.5f)
                lineToRelative(56f, -57f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-57f, 57f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-198f, -82f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                close()
            }
        }.build()
        
        return _Partly_cloudy_day!!
    }

private var _Partly_cloudy_day: ImageVector? = null

