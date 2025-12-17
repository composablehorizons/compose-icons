package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Nearby_error: ImageVector
    get() {
        if (_Nearby_error != null) return _Nearby_error!!
        
        _Nearby_error = ImageVector.Builder(
            name = "nearby_error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 680f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                close()
                moveToRelative(0f, 160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                close()
                moveToRelative(-360f, 0f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 856f)
                lineTo(104f, 536f)
                quadToRelative(-12f, -12f, -18f, -26.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(320f, -320f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(169f, 169f)
                quadToRelative(8f, 8f, 11.5f, 16.5f)
                reflectiveQuadTo(720f, 309f)
                quadToRelative(0f, 23f, -15.5f, 37f)
                reflectiveQuadTo(669f, 360f)
                quadToRelative(-10f, 0f, -19f, -3.5f)
                reflectiveQuadTo(633f, 345f)
                lineTo(480f, 192f)
                lineTo(192f, 480f)
                lineToRelative(288f, 288f)
                lineToRelative(153f, -153f)
                quadToRelative(8f, -8f, 17.5f, -11.5f)
                reflectiveQuadTo(669f, 600f)
                quadToRelative(20f, 0f, 35.5f, 14f)
                reflectiveQuadToRelative(15.5f, 37f)
                quadToRelative(0f, 11f, -3.5f, 19.5f)
                reflectiveQuadTo(705f, 687f)
                lineTo(536f, 856f)
                quadToRelative(-12f, 12f, -26.5f, 18f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-28f, -252f)
                lineTo(332f, 508f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -8f, 3f, -15f)
                reflectiveQuadToRelative(9f, -13f)
                lineToRelative(120f, -120f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(15f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 9f)
                lineToRelative(120f, 120f)
                quadToRelative(6f, 6f, 9f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15f)
                reflectiveQuadToRelative(-9f, 13f)
                lineTo(508f, 628f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                close()
            }
        }.build()
        
        return _Nearby_error!!
    }

private var _Nearby_error: ImageVector? = null

