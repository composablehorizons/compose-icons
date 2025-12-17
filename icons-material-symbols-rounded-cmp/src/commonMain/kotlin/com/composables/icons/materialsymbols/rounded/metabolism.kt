package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Metabolism: ImageVector
    get() {
        if (_Metabolism != null) return _Metabolism!!
        
        _Metabolism = ImageVector.Builder(
            name = "metabolism",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(390f, 720f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-144f)
                quadToRelative(0f, -23f, 31.5f, -39.5f)
                reflectiveQuadTo(440f, 380f)
                quadToRelative(47f, 0f, 78.5f, 16.5f)
                reflectiveQuadTo(550f, 436f)
                verticalLineToRelative(144f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(140f)
                horizontalLineTo(390f)
                close()
                moveToRelative(50f, -360f)
                quadToRelative(-26f, 0f, -43f, -17f)
                reflectiveQuadToRelative(-17f, -43f)
                quadToRelative(0f, -26f, 17f, -43f)
                reflectiveQuadToRelative(43f, -17f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                close()
                moveToRelative(0f, 480f)
                quadToRelative(-150f, 0f, -255f, -105f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(8f)
                lineToRelative(45f, -46f)
                quadToRelative(6f, -6f, 13f, -9f)
                reflectiveQuadToRelative(14.5f, -3f)
                quadToRelative(7.5f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(901f, 499f)
                lineTo(788f, 612f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(618f, 498f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(45f, 45f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(1f, 116f, 82.5f, 198f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(47f, 0f, 88.5f, -14f)
                reflectiveQuadToRelative(76.5f, -40f)
                quadToRelative(14f, -10f, 30f, -10f)
                reflectiveQuadToRelative(27f, 11f)
                quadToRelative(12f, 12f, 12.5f, 29f)
                reflectiveQuadTo(661f, 764f)
                quadToRelative(-46f, 36f, -102f, 56f)
                reflectiveQuadToRelative(-119f, 20f)
                close()
            }
        }.build()
        
        return _Metabolism!!
    }

private var _Metabolism: ImageVector? = null

