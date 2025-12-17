package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Transcribe: ImageVector
    get() {
        if (_Transcribe != null) return _Transcribe!!
        
        _Transcribe = ImageVector.Builder(
            name = "transcribe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(850f, 210f)
                quadToRelative(6f, -6f, 14.5f, -9.5f)
                reflectiveQuadTo(882f, 197f)
                quadToRelative(19f, 0f, 32f, 13f)
                reflectiveQuadToRelative(13f, 32f)
                quadToRelative(0f, 9f, -3.5f, 17.5f)
                reflectiveQuadTo(914f, 274f)
                quadToRelative(-18f, 18f, -29f, 38.5f)
                reflectiveQuadTo(874f, 360f)
                quadToRelative(0f, 25f, 10.5f, 46f)
                reflectiveQuadToRelative(27.5f, 38f)
                quadToRelative(8f, 7f, 11.5f, 15.5f)
                reflectiveQuadTo(927f, 478f)
                quadToRelative(0f, 19f, -13f, 32f)
                reflectiveQuadToRelative(-32f, 13f)
                quadToRelative(-9f, 0f, -17.5f, -3.5f)
                reflectiveQuadTo(850f, 510f)
                quadToRelative(-32f, -29f, -50f, -67.5f)
                reflectiveQuadTo(782f, 360f)
                quadToRelative(0f, -44f, 18f, -82.5f)
                reflectiveQuadToRelative(50f, -67.5f)
                close()
                moveTo(722f, 82f)
                quadToRelative(6f, -6f, 14f, -9.5f)
                reflectiveQuadToRelative(17f, -3.5f)
                quadToRelative(19f, 0f, 32f, 13f)
                reflectiveQuadToRelative(13f, 32f)
                quadToRelative(0f, 10f, -4f, 18.5f)
                reflectiveQuadTo(783f, 147f)
                quadToRelative(-43f, 41f, -68f, 95.5f)
                reflectiveQuadTo(690f, 360f)
                quadToRelative(0f, 63f, 24.5f, 118f)
                reflectiveQuadToRelative(67.5f, 96f)
                quadToRelative(7f, 6f, 11f, 14.5f)
                reflectiveQuadToRelative(4f, 18.5f)
                quadToRelative(0f, 18f, -13f, 31f)
                reflectiveQuadToRelative(-31f, 13f)
                quadToRelative(-9f, 0f, -17f, -3.5f)
                reflectiveQuadToRelative(-14f, -9.5f)
                quadToRelative(-56f, -53f, -89f, -125f)
                reflectiveQuadToRelative(-33f, -153f)
                quadToRelative(0f, -81f, 33f, -153f)
                reflectiveQuadToRelative(89f, -125f)
                close()
                moveTo(360f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(77f, 0f, 141f, 18f)
                reflectiveQuadToRelative(115f, 44f)
                quadToRelative(30f, 15f, 47f, 44f)
                reflectiveQuadToRelative(17f, 62f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(580f, 694f)
                quadToRelative(-36f, -18f, -92.5f, -36f)
                reflectiveQuadTo(360f, 640f)
                quadToRelative(-71f, 0f, -127.5f, 18f)
                reflectiveQuadTo(140f, 694f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 440f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Transcribe!!
    }

private var _Transcribe: ImageVector? = null

