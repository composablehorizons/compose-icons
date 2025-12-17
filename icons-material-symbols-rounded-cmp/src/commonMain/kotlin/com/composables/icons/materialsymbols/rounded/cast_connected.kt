package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Cast_connected: ImageVector
    get() {
        if (_Cast_connected != null) return _Cast_connected!!
        
        _Cast_connected = ImageVector.Builder(
            name = "cast_connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineToRelative(-65f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(575f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(615f, 560f)
                horizontalLineToRelative(25f)
                verticalLineToRelative(-160f)
                horizontalLineTo(453f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(413f, 360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(453f, 320f)
                horizontalLineToRelative(227f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 360f)
                close()
                moveTo(480f, 480f)
                close()
                moveToRelative(400f, -240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(638f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(598f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(638f, 720f)
                horizontalLineToRelative(162f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(6f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 286f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 246f)
                verticalLineToRelative(-6f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
                moveTo(320f, 800f)
                quadToRelative(-16f, 0f, -28f, -9.5f)
                reflectiveQuadTo(277f, 765f)
                quadToRelative(-11f, -63f, -56.5f, -107f)
                reflectiveQuadTo(112f, 603f)
                quadToRelative(-15f, -2f, -23.5f, -14.5f)
                reflectiveQuadTo(80f, 560f)
                quadToRelative(0f, -17f, 11f, -28.5f)
                reflectiveQuadToRelative(26f, -9.5f)
                quadToRelative(94f, 12f, 160.5f, 79f)
                reflectiveQuadTo(357f, 762f)
                quadToRelative(2f, 16f, -9f, 27f)
                reflectiveQuadToRelative(-28f, 11f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11f)
                reflectiveQuadTo(438f, 761f)
                quadToRelative(-14f, -128f, -104.5f, -217f)
                reflectiveQuadTo(115f, 442f)
                quadToRelative(-16f, -2f, -25.5f, -14f)
                reflectiveQuadTo(80f, 400f)
                quadToRelative(0f, -17f, 10.5f, -29f)
                reflectiveQuadToRelative(25.5f, -10f)
                quadToRelative(161f, 13f, 274f, 125f)
                reflectiveQuadToRelative(128f, 273f)
                quadToRelative(2f, 17f, -9.5f, 29f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-350f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(80f, 750f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(130f, 700f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(180f, 750f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(130f, 800f)
                close()
            }
        }.build()
        
        return _Cast_connected!!
    }

private var _Cast_connected: ImageVector? = null

