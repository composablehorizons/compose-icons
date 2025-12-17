package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Prayer_times: ImageVector
    get() {
        if (_Prayer_times != null) return _Prayer_times!!
        
        _Prayer_times = ImageVector.Builder(
            name = "prayer_times",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(346f, 800f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-106f)
                lineToRelative(-77f, -78f)
                quadToRelative(-11f, -12f, -17f, -26.5f)
                reflectiveQuadTo(60f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadTo(83f, 424f)
                lineToRelative(77f, -78f)
                verticalLineToRelative(-106f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(106f)
                lineToRelative(78f, -77f)
                quadToRelative(12f, -11f, 26.5f, -17f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 17f)
                lineToRelative(78f, 77f)
                horizontalLineToRelative(106f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(106f)
                lineToRelative(77f, 78f)
                quadToRelative(11f, 12f, 17f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(877f, 536f)
                lineToRelative(-77f, 78f)
                verticalLineToRelative(106f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(614f)
                lineToRelative(-78f, 77f)
                quadToRelative(-12f, 11f, -26.5f, 17f)
                reflectiveQuadTo(480f, 900f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 877f)
                lineToRelative(-78f, -77f)
                close()
                moveToRelative(34f, -80f)
                lineToRelative(100f, 100f)
                lineToRelative(100f, -100f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                verticalLineToRelative(-140f)
                horizontalLineTo(580f)
                lineTo(480f, 140f)
                lineTo(380f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                lineTo(140f, 480f)
                lineToRelative(100f, 100f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(140f)
                close()
                moveToRelative(100f, -240f)
                close()
                moveToRelative(41f, -20f)
                lineToRelative(59f, -43f)
                lineToRelative(58f, 43f)
                lineToRelative(-23f, -68f)
                lineToRelative(59f, -43f)
                horizontalLineToRelative(-72f)
                lineToRelative(-22f, -69f)
                lineToRelative(-22f, 69f)
                horizontalLineToRelative(-73f)
                lineToRelative(59f, 43f)
                lineToRelative(-23f, 68f)
                close()
                moveToRelative(-41f, 220f)
                quadToRelative(83f, 0f, 141.5f, -58f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -8f, -0.5f, -16f)
                reflectiveQuadToRelative(-2.5f, -16f)
                quadToRelative(-11f, 47f, -49f, 77.5f)
                reflectiveQuadTo(539f, 556f)
                quadToRelative(-60f, 0f, -101f, -41f)
                reflectiveQuadToRelative(-41f, -101f)
                quadToRelative(0f, -46f, 26f, -82.5f)
                reflectiveQuadToRelative(68f, -51.5f)
                horizontalLineToRelative(-11f)
                quadToRelative(-84f, 0f, -142f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 84f, 58f, 142f)
                reflectiveQuadToRelative(142f, 58f)
                close()
            }
        }.build()
        
        return _Prayer_times!!
    }

private var _Prayer_times: ImageVector? = null

