package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_speaker: ImageVector
    get() {
        if (_Mobile_speaker != null) return _Mobile_speaker!!
        
        _Mobile_speaker = ImageVector.Builder(
            name = "mobile_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 480f)
                verticalLineToRelative(320f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 400f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(640f, 160f)
                verticalLineToRelative(107f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 307f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 267f)
                verticalLineToRelative(-107f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(227f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(467f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(427f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(260f, -320f)
                lineToRelative(106f, -106f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(344f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(460f, 720f)
                horizontalLineToRelative(-60f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 680f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 560f)
                horizontalLineToRelative(60f)
                close()
                moveToRelative(300f, 80f)
                quadToRelative(0f, 31f, -14.5f, 56.5f)
                reflectiveQuadTo(708f, 738f)
                quadToRelative(-9f, 6f, -18.5f, 0.5f)
                reflectiveQuadTo(680f, 721f)
                verticalLineToRelative(-162f)
                quadToRelative(0f, -11f, 9.5f, -17.5f)
                reflectiveQuadToRelative(18.5f, -0.5f)
                quadToRelative(24f, 16f, 38f, 42f)
                reflectiveQuadToRelative(14f, 57f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(0f, -60f, -33f, -110.5f)
                reflectiveQuadTo(718f, 456f)
                quadToRelative(-23f, -10f, -31f, -26f)
                reflectiveQuadToRelative(-5f, -30f)
                quadToRelative(3f, -14f, 13f, -23f)
                reflectiveQuadToRelative(24f, -5f)
                quadToRelative(90f, 26f, 145.5f, 100f)
                reflectiveQuadTo(920f, 640f)
                quadToRelative(0f, 94f, -55.5f, 168.5f)
                reflectiveQuadTo(719f, 909f)
                quadToRelative(-14f, 4f, -24f, -5f)
                reflectiveQuadToRelative(-13f, -23f)
                quadToRelative(-3f, -14f, 4.5f, -30f)
                reflectiveQuadToRelative(30.5f, -26f)
                quadToRelative(56f, -24f, 89.5f, -74f)
                reflectiveQuadTo(840f, 640f)
                close()
                moveTo(380f, 280f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 280f)
                close()
            }
        }.build()
        
        return _Mobile_speaker!!
    }

private var _Mobile_speaker: ImageVector? = null

