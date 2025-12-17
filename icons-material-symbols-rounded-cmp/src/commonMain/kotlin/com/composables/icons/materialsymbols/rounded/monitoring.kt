package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Monitoring: ImageVector
    get() {
        if (_Monitoring != null) return _Monitoring!!
        
        _Monitoring = ImageVector.Builder(
            name = "monitoring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 540f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 580f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 840f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-140f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 660f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 800f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 600f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 800f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 440f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                close()
                moveTo(560f, 479f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(503f, 456f)
                lineTo(400f, 353f)
                lineTo(188f, 565f)
                quadToRelative(-12f, 12f, -28.5f, 11.5f)
                reflectiveQuadTo(131f, 564f)
                quadToRelative(-11f, -12f, -10.5f, -28.5f)
                reflectiveQuadTo(132f, 508f)
                lineToRelative(211f, -211f)
                quadToRelative(12f, -12f, 26.5f, -17.5f)
                reflectiveQuadTo(400f, 274f)
                quadToRelative(16f, 0f, 31f, 5.5f)
                reflectiveQuadToRelative(26f, 17.5f)
                lineToRelative(103f, 103f)
                lineToRelative(212f, -212f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(829f, 189f)
                quadToRelative(11f, 12f, 10.5f, 28.5f)
                reflectiveQuadTo(828f, 245f)
                lineTo(617f, 456f)
                quadToRelative(-11f, 11f, -26f, 17f)
                reflectiveQuadToRelative(-31f, 6f)
                close()
            }
        }.build()
        
        return _Monitoring!!
    }

private var _Monitoring: ImageVector? = null

