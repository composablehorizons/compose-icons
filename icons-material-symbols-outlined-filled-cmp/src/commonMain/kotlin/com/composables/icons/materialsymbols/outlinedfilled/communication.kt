package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Communication: ImageVector
    get() {
        if (_Communication != null) return _Communication!!
        
        _Communication = ImageVector.Builder(
            name = "communication",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(408f, 528f)
                lineToRelative(-42f, -42f)
                quadToRelative(8f, -11f, 11f, -22.5f)
                reflectiveQuadToRelative(3f, -23.5f)
                quadToRelative(0f, -12f, -3f, -23.5f)
                reflectiveQuadTo(366f, 395f)
                lineToRelative(42f, -43f)
                quadToRelative(16f, 19f, 24f, 42f)
                reflectiveQuadToRelative(8f, 46f)
                quadToRelative(0f, 23f, -8f, 45.5f)
                reflectiveQuadTo(408f, 528f)
                close()
                moveToRelative(85f, 86f)
                lineToRelative(-43f, -43f)
                quadToRelative(25f, -28f, 37.5f, -62f)
                reflectiveQuadToRelative(12.5f, -69f)
                quadToRelative(0f, -35f, -12.5f, -68.5f)
                reflectiveQuadTo(450f, 310f)
                lineToRelative(43f, -43f)
                quadToRelative(34f, 37f, 50.5f, 81.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(0f, 47f, -16.5f, 92f)
                reflectiveQuadTo(493f, 614f)
                close()
                moveTo(200f, 480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(200f, 480f)
                close()
                moveTo(40f, 640f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                quadToRelative(26f, -11f, 53.5f, -17f)
                reflectiveQuadToRelative(57.5f, -6f)
                quadToRelative(30f, 0f, 57.5f, 6f)
                reflectiveQuadToRelative(53.5f, 17f)
                quadToRelative(23f, 10f, 36f, 30f)
                reflectiveQuadToRelative(13f, 44f)
                verticalLineToRelative(23f)
                horizontalLineTo(40f)
                close()
                moveToRelative(720f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(680f, 400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 480f)
                close()
                moveTo(600f, 640f)
                verticalLineToRelative(-23f)
                quadToRelative(0f, -24f, 13f, -44f)
                reflectiveQuadToRelative(36f, -30f)
                quadToRelative(26f, -11f, 53.5f, -17f)
                reflectiveQuadToRelative(57.5f, -6f)
                quadToRelative(30f, 0f, 57.5f, 6f)
                reflectiveQuadToRelative(53.5f, 17f)
                quadToRelative(23f, 10f, 36f, 30f)
                reflectiveQuadToRelative(13f, 44f)
                verticalLineToRelative(23f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Communication!!
    }

private var _Communication: ImageVector? = null

