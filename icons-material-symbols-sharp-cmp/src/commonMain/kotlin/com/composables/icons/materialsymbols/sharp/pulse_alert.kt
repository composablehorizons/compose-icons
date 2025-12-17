package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Pulse_alert: ImageVector
    get() {
        if (_Pulse_alert != null) return _Pulse_alert!!
        
        _Pulse_alert = ImageVector.Builder(
            name = "pulse_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 466f)
                close()
                moveTo(87f, 400f)
                quadToRelative(-4f, -15f, -5.5f, -30f)
                reflectiveQuadTo(80f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(300f, 120f)
                quadToRelative(51f, 0f, 98.5f, 22f)
                reflectiveQuadToRelative(81.5f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 62.5f)
                reflectiveQuadTo(880f, 339f)
                verticalLineToRelative(2f)
                quadToRelative(-19f, -17f, -41f, -29.5f)
                reflectiveQuadTo(792f, 291f)
                quadToRelative(-14f, -41f, -50f, -66f)
                reflectiveQuadToRelative(-82f, -25f)
                quadToRelative(-43f, 0f, -83f, 25.5f)
                reflectiveQuadTo(503f, 300f)
                horizontalLineToRelative(-46f)
                quadToRelative(-33f, -48f, -74f, -74f)
                reflectiveQuadToRelative(-83f, -26f)
                quadToRelative(-59f, 0f, -99.5f, 40.5f)
                reflectiveQuadTo(160f, 339f)
                quadToRelative(0f, 16f, 3f, 30.5f)
                reflectiveQuadToRelative(9f, 30.5f)
                horizontalLineTo(87f)
                close()
                moveToRelative(393f, 440f)
                lineTo(353f, 726f)
                quadToRelative(-27f, -25f, -50f, -46f)
                reflectiveQuadToRelative(-43f, -40f)
                horizontalLineToRelative(117f)
                quadToRelative(23f, 20f, 48.5f, 43f)
                reflectiveQuadToRelative(54.5f, 49f)
                quadToRelative(17f, -14f, 31.5f, -27f)
                reflectiveQuadToRelative(28.5f, -26f)
                quadToRelative(14f, 15f, 29.5f, 27.5f)
                reflectiveQuadTo(603f, 729f)
                lineTo(480f, 840f)
                close()
                moveTo(40f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(178f)
                lineToRelative(103f, -152f)
                lineToRelative(101f, 152f)
                horizontalLineToRelative(62f)
                quadToRelative(-2f, 10f, -3f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                quadToRelative(0f, 11f, 1f, 20.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                horizontalLineTo(379f)
                lineToRelative(-59f, -88f)
                lineToRelative(-59f, 88f)
                horizontalLineTo(40f)
                close()
                moveToRelative(680f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                close()
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Pulse_alert!!
    }

private var _Pulse_alert: ImageVector? = null

