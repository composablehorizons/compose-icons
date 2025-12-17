package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Taxi_alert: ImageVector
    get() {
        if (_Taxi_alert != null) return _Taxi_alert!!
        
        _Taxi_alert = ImageVector.Builder(
            name = "taxi_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 320f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(-60f, 280f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 680f)
                close()
                moveToRelative(-360f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(320f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(260f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(200f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(260f, 680f)
                close()
                moveToRelative(420f, -200f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -82f, 58f, -141f)
                reflectiveQuadToRelative(142f, -59f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveTo(140f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 820f)
                verticalLineToRelative(-286f)
                quadToRelative(0f, -7f, 1f, -14f)
                reflectiveQuadToRelative(3f, -13f)
                lineToRelative(80f, -227f)
                quadToRelative(6f, -18f, 21.5f, -29f)
                reflectiveQuadToRelative(34.5f, -11f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 160f)
                horizontalLineToRelative(21f)
                quadToRelative(17f, 0f, 26f, 14f)
                reflectiveQuadToRelative(4f, 30f)
                quadToRelative(-5f, 20f, -8f, 39.5f)
                reflectiveQuadToRelative(-3f, 39.5f)
                quadToRelative(0f, 15f, -10f, 26f)
                reflectiveQuadToRelative(-25f, 11f)
                horizontalLineTo(234f)
                lineToRelative(-42f, 120f)
                horizontalLineToRelative(239f)
                quadToRelative(9f, 0f, 17.5f, 4f)
                reflectiveQuadToRelative(14.5f, 12f)
                quadToRelative(40f, 49f, 96.5f, 76.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(19f, 0f, 37f, -2.5f)
                reflectiveQuadToRelative(36f, -7.5f)
                quadToRelative(17f, -5f, 32f, 5.5f)
                reflectiveQuadToRelative(15f, 27.5f)
                verticalLineToRelative(237f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(740f, 880f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(680f, 820f)
                verticalLineToRelative(-20f)
                horizontalLineTo(200f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(140f, 880f)
                close()
            }
        }.build()
        
        return _Taxi_alert!!
    }

private var _Taxi_alert: ImageVector? = null

