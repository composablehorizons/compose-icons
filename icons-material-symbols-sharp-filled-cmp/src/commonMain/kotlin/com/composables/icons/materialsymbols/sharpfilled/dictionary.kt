package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Dictionary: ImageVector
    get() {
        if (_Dictionary != null) return _Dictionary!!
        
        _Dictionary = ImageVector.Builder(
            name = "dictionary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 569f)
                horizontalLineToRelative(45f)
                lineToRelative(23f, -66f)
                horizontalLineToRelative(104f)
                lineToRelative(24f, 66f)
                horizontalLineToRelative(44f)
                lineToRelative(-97f, -258f)
                horizontalLineToRelative(-46f)
                lineToRelative(-97f, 258f)
                close()
                moveToRelative(81f, -103f)
                lineToRelative(38f, -107f)
                horizontalLineToRelative(2f)
                lineToRelative(38f, 107f)
                horizontalLineToRelative(-78f)
                close()
                moveToRelative(279f, 216f)
                quadToRelative(44f, -21f, 88.5f, -31.5f)
                reflectiveQuadTo(700f, 640f)
                quadToRelative(36f, 0f, 70.5f, 6f)
                reflectiveQuadToRelative(69.5f, 18f)
                verticalLineToRelative(-396f)
                quadToRelative(-33f, -14f, -68.5f, -21f)
                reflectiveQuadToRelative(-71.5f, -7f)
                quadToRelative(-47f, 0f, -93f, 12f)
                reflectiveQuadToRelative(-87f, 36f)
                verticalLineToRelative(394f)
                close()
                moveToRelative(-40f, 118f)
                quadToRelative(-48f, -38f, -104f, -59f)
                reflectiveQuadToRelative(-116f, -21f)
                quadToRelative(-53f, 0f, -111f, 20f)
                reflectiveQuadTo(40f, 802f)
                verticalLineToRelative(-580f)
                quadToRelative(44f, -30f, 103.5f, -46f)
                reflectiveQuadTo(260f, 160f)
                quadToRelative(58f, 0f, 113.5f, 15f)
                reflectiveQuadTo(480f, 220f)
                quadToRelative(51f, -30f, 106.5f, -45f)
                reflectiveQuadTo(700f, 160f)
                quadToRelative(57f, 0f, 116.5f, 16f)
                reflectiveQuadTo(920f, 222f)
                verticalLineToRelative(580f)
                quadToRelative(-50f, -42f, -108.5f, -62f)
                reflectiveQuadTo(700f, 720f)
                quadToRelative(-60f, 0f, -116f, 21f)
                reflectiveQuadToRelative(-104f, 59f)
                close()
                moveToRelative(80f, -404f)
                verticalLineToRelative(-68f)
                quadToRelative(33f, -14f, 67.5f, -21f)
                reflectiveQuadToRelative(72.5f, -7f)
                quadToRelative(26f, 0f, 51f, 4f)
                reflectiveQuadToRelative(49f, 10f)
                verticalLineToRelative(64f)
                quadToRelative(-24f, -9f, -48.5f, -13.5f)
                reflectiveQuadTo(700f, 360f)
                quadToRelative(-38f, 0f, -73f, 9.5f)
                reflectiveQuadTo(560f, 396f)
                close()
                moveToRelative(0f, 220f)
                verticalLineToRelative(-68f)
                quadToRelative(33f, -14f, 67.5f, -21f)
                reflectiveQuadToRelative(72.5f, -7f)
                quadToRelative(26f, 0f, 51f, 4f)
                reflectiveQuadToRelative(49f, 10f)
                verticalLineToRelative(64f)
                quadToRelative(-24f, -9f, -48.5f, -13.5f)
                reflectiveQuadTo(700f, 580f)
                quadToRelative(-38f, 0f, -73f, 9f)
                reflectiveQuadToRelative(-67f, 27f)
                close()
                moveToRelative(0f, -110f)
                verticalLineToRelative(-68f)
                quadToRelative(33f, -14f, 67.5f, -21f)
                reflectiveQuadToRelative(72.5f, -7f)
                quadToRelative(26f, 0f, 51f, 4f)
                reflectiveQuadToRelative(49f, 10f)
                verticalLineToRelative(64f)
                quadToRelative(-24f, -9f, -48.5f, -13.5f)
                reflectiveQuadTo(700f, 470f)
                quadToRelative(-38f, 0f, -73f, 9.5f)
                reflectiveQuadTo(560f, 506f)
                close()
            }
        }.build()
        
        return _Dictionary!!
    }

private var _Dictionary: ImageVector? = null

