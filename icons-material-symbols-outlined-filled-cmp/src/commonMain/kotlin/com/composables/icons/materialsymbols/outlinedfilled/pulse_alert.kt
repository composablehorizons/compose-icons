package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pulse_alert: ImageVector
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
                moveTo(121f, 480f)
                quadToRelative(-22f, -35f, -31.5f, -69.5f)
                reflectiveQuadTo(80f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(300f, 120f)
                quadToRelative(51f, 0f, 98.5f, 22f)
                reflectiveQuadToRelative(81.5f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 63.5f)
                reflectiveQuadTo(880f, 341f)
                quadToRelative(-32f, -29f, -73f, -45f)
                reflectiveQuadToRelative(-87f, -16f)
                quadToRelative(-90f, 0f, -156f, 57.5f)
                reflectiveQuadTo(484f, 480f)
                horizontalLineToRelative(-62f)
                lineToRelative(-68f, -102f)
                quadToRelative(-6f, -9f, -14.5f, -13.5f)
                reflectiveQuadTo(321f, 360f)
                quadToRelative(-10f, 0f, -19f, 4.5f)
                reflectiveQuadTo(287f, 378f)
                lineToRelative(-69f, 102f)
                horizontalLineToRelative(-97f)
                close()
                moveToRelative(359f, 360f)
                lineTo(353f, 726f)
                quadToRelative(-61f, -55f, -101.5f, -94.5f)
                reflectiveQuadTo(182f, 560f)
                horizontalLineToRelative(58f)
                quadToRelative(10f, 0f, 19f, -5f)
                reflectiveQuadToRelative(14f, -13f)
                lineToRelative(47f, -70f)
                lineToRelative(47f, 70f)
                quadToRelative(5f, 8f, 14f, 13f)
                reflectiveQuadToRelative(19f, 5f)
                horizontalLineToRelative(84f)
                quadToRelative(9f, 55f, 40.5f, 99f)
                reflectiveQuadToRelative(78.5f, 70f)
                lineTo(480f, 840f)
                close()
                moveToRelative(240f, -160f)
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

