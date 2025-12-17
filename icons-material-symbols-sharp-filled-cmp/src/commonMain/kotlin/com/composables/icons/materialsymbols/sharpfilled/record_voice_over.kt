package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Record_voice_over: ImageVector
    get() {
        if (_Record_voice_over != null) return _Record_voice_over!!
        
        _Record_voice_over = ImageVector.Builder(
            name = "record_voice_over",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 638f)
                lineToRelative(-62f, -62f)
                quadToRelative(44f, -41f, 69f, -97f)
                reflectiveQuadToRelative(25f, -119f)
                quadToRelative(0f, -63f, -25f, -118f)
                reflectiveQuadToRelative(-69f, -96f)
                lineToRelative(62f, -64f)
                quadToRelative(56f, 53f, 89f, 125f)
                reflectiveQuadToRelative(33f, 153f)
                quadToRelative(0f, 81f, -33f, 153f)
                reflectiveQuadToRelative(-89f, 125f)
                close()
                moveTo(670f, 510f)
                lineToRelative(-64f, -64f)
                quadToRelative(18f, -17f, 29f, -38.5f)
                reflectiveQuadToRelative(11f, -47.5f)
                quadToRelative(0f, -26f, -11f, -47.5f)
                reflectiveQuadTo(606f, 274f)
                lineToRelative(64f, -64f)
                quadToRelative(32f, 29f, 50f, 67.5f)
                reflectiveQuadToRelative(18f, 82.5f)
                quadToRelative(0f, 44f, -18f, 82.5f)
                reflectiveQuadTo(670f, 510f)
                close()
                moveToRelative(-310f, 10f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(77f, 0f, 141f, 18f)
                reflectiveQuadToRelative(115f, 44f)
                quadToRelative(30f, 15f, 47f, 44f)
                reflectiveQuadToRelative(17f, 62f)
                verticalLineToRelative(112f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Record_voice_over!!
    }

private var _Record_voice_over: ImageVector? = null

