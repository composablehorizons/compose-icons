package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Spo2: ImageVector
    get() {
        if (_Spo2 != null) return _Spo2!!
        
        _Spo2 = ImageVector.Builder(
            name = "spo2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(620f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(580f, 800f)
                horizontalLineTo(480f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(830f, 880f)
                horizontalLineTo(720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 730f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-90f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 670f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 640f)
                horizontalLineToRelative(110f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(860f, 680f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(820f, 790f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(860f, 850f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(830f, 880f)
                close()
                moveTo(400f, 94f)
                quadToRelative(8f, 0f, 14.5f, 2.5f)
                reflectiveQuadTo(427f, 104f)
                quadToRelative(36f, 32f, 73.5f, 68f)
                reflectiveQuadToRelative(72f, 75.5f)
                quadToRelative(34.5f, 39.5f, 64f, 82f)
                reflectiveQuadTo(687f, 417f)
                quadToRelative(7f, 15f, 0.5f, 30f)
                reflectiveQuadTo(665f, 467f)
                quadToRelative(-16f, 5f, -30.5f, -2f)
                reflectiveQuadTo(612f, 443f)
                quadToRelative(-17f, -36f, -41.5f, -70.5f)
                reflectiveQuadToRelative(-53f, -67.5f)
                quadTo(489f, 272f, 459f, 242f)
                reflectiveQuadToRelative(-59f, -56f)
                quadTo(281f, 295f, 220.5f, 387f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, 81f, 43f, 147f)
                reflectiveQuadToRelative(122f, 90f)
                quadToRelative(17f, 5f, 27f, 19.5f)
                reflectiveQuadToRelative(4f, 30.5f)
                quadToRelative(-7f, 17f, -24.5f, 24f)
                reflectiveQuadTo(295f, 864f)
                quadToRelative(-101f, -32f, -158f, -120.5f)
                reflectiveQuadTo(80f, 552f)
                quadToRelative(0f, -65f, 29f, -128.5f)
                reflectiveQuadToRelative(73f, -121f)
                quadTo(226f, 245f, 277.5f, 194f)
                reflectiveQuadToRelative(95.5f, -90f)
                quadToRelative(6f, -5f, 12.5f, -7.5f)
                reflectiveQuadTo(400f, 94f)
                close()
                moveToRelative(-6f, 458f)
                close()
            }
        }.build()
        
        return _Spo2!!
    }

private var _Spo2: ImageVector? = null

