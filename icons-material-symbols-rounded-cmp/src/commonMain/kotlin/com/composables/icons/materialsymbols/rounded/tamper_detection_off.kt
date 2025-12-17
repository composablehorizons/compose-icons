package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tamper_detection_off: ImageVector
    get() {
        if (_Tamper_detection_off != null) return _Tamper_detection_off!!
        
        _Tamper_detection_off = ImageVector.Builder(
            name = "tamper_detection_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 540f)
                verticalLineToRelative(68f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-288f)
                horizontalLineTo(352f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(368f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 240f)
                verticalLineToRelative(180f)
                lineToRelative(126f, -126f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(720f, 540f)
                close()
                moveTo(120f, 360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 320f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 360f)
                close()
                moveToRelative(480f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(600f, 720f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                lineToRelative(80f, 80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 800f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(794f, 906f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(740f, 740f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveTo(460f, 460f)
                close()
                moveToRelative(36f, -76f)
                close()
                moveTo(178f, 920f)
                quadToRelative(-17f, 0f, -31.5f, -6.5f)
                reflectiveQuadTo(121f, 896f)
                lineTo(14f, 790f)
                quadToRelative(-6f, -6f, -6f, -14f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(8f, -8f, 19f, -13f)
                reflectiveQuadToRelative(23f, -5f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadTo(98f, 762f)
                lineToRelative(22f, 22f)
                verticalLineToRelative(-294f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(180f, 490f)
                verticalLineToRelative(150f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-210f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(280f, 430f)
                verticalLineToRelative(210f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(380f, 470f)
                verticalLineToRelative(170f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -13f, 9f, -21.5f)
                reflectiveQuadToRelative(21f, -8.5f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(480f, 510f)
                verticalLineToRelative(330f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(400f, 920f)
                horizontalLineTo(178f)
                close()
            }
        }.build()
        
        return _Tamper_detection_off!!
    }

private var _Tamper_detection_off: ImageVector? = null

