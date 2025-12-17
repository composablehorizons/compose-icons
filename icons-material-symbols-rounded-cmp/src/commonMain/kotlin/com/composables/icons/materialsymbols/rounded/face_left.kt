package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Face_left: ImageVector
    get() {
        if (_Face_left != null) return _Face_left!!
        
        _Face_left = ImageVector.Builder(
            name = "face_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(300f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 480f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(500f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(540f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 480f)
                close()
                moveToRelative(4f, -311f)
                quadToRelative(23f, 50f, 64f, 86.5f)
                reflectiveQuadToRelative(94f, 52.5f)
                quadToRelative(-22f, -51f, -63f, -87.5f)
                reflectiveQuadTo(544f, 169f)
                close()
                moveToRelative(-57f, -9f)
                quadToRelative(-66f, -2f, -123.5f, 30.5f)
                reflectiveQuadTo(273f, 280f)
                quadToRelative(66f, 2f, 123.5f, -30.5f)
                reflectiveQuadTo(487f, 160f)
                close()
                moveTo(160f, 400f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 72f, -28.5f, 132.5f)
                reflectiveQuadTo(694f, 638f)
                quadToRelative(-16f, 14f, -32f, 12f)
                reflectiveQuadToRelative(-27f, -13f)
                quadToRelative(-11f, -11f, -11.5f, -27f)
                reflectiveQuadToRelative(13.5f, -29f)
                quadToRelative(39f, -34f, 62f, -82f)
                reflectiveQuadToRelative(21f, -104f)
                quadToRelative(-63f, -11f, -118.5f, -45f)
                reflectiveQuadTo(508f, 264f)
                quadToRelative(-52f, 53f, -121f, 77.5f)
                reflectiveQuadTo(244f, 358f)
                quadToRelative(-2f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                quadToRelative(0f, 55f, 22.5f, 102f)
                reflectiveQuadToRelative(60.5f, 80f)
                quadToRelative(14f, 12f, 13.5f, 28f)
                reflectiveQuadTo(325f, 637f)
                quadToRelative(-11f, 11f, -27f, 13f)
                reflectiveQuadToRelative(-32f, -12f)
                quadToRelative(-49f, -45f, -77.5f, -105.5f)
                reflectiveQuadTo(160f, 400f)
                close()
                moveToRelative(313f, 400f)
                lineToRelative(35f, 35f)
                quadToRelative(11f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(508f, 892f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(348f, 788f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(104f, -104f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(508f, 685f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(127f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineTo(473f)
                close()
                moveToRelative(71f, -631f)
                close()
                moveToRelative(-57f, -9f)
                close()
            }
        }.build()
        
        return _Face_left!!
    }

private var _Face_left: ImageVector? = null

