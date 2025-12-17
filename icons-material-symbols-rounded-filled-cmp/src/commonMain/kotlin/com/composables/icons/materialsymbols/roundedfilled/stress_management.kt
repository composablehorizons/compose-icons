package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stress_management: ImageVector
    get() {
        if (_Stress_management != null) return _Stress_management!!
        
        _Stress_management = ImageVector.Builder(
            name = "stress_management",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 640f)
                quadToRelative(68f, 0f, 151f, -27f)
                reflectiveQuadToRelative(249f, -95f)
                verticalLineToRelative(-15f)
                quadToRelative(0f, -51f, -41f, -82f)
                reflectiveQuadToRelative(-90f, -17f)
                quadToRelative(-17f, 5f, -34.5f, 12f)
                reflectiveQuadTo(668f, 434f)
                quadToRelative(-61f, 26f, -103f, 36f)
                reflectiveQuadToRelative(-85f, 10f)
                quadToRelative(-45f, 0f, -87f, -10.5f)
                reflectiveQuadTo(287f, 433f)
                quadToRelative(-24f, -10f, -41.5f, -16.5f)
                reflectiveQuadTo(212f, 405f)
                quadToRelative(-49f, -16f, -90.5f, 15f)
                reflectiveQuadTo(80f, 503f)
                verticalLineToRelative(13f)
                quadToRelative(131f, 60f, 230f, 92f)
                reflectiveQuadToRelative(170f, 32f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(138f, 0f, 242.5f, -75.5f)
                reflectiveQuadTo(864f, 611f)
                quadToRelative(-131f, 56f, -220f, 82.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-76f, 0f, -173.5f, -28.5f)
                reflectiveQuadTo(94f, 610f)
                quadToRelative(34f, 123f, 137f, 196.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Stress_management!!
    }

private var _Stress_management: ImageVector? = null

