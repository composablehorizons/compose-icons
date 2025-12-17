package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Trackpad_input_3: ImageVector
    get() {
        if (_Trackpad_input_3 != null) return _Trackpad_input_3!!
        
        _Trackpad_input_3 = ImageVector.Builder(
            name = "trackpad_input_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(593f, 880f)
                quadToRelative(-24f, 0f, -46f, -9f)
                reflectiveQuadToRelative(-39f, -26f)
                lineTo(304f, 640f)
                lineToRelative(33f, -34f)
                quadToRelative(14f, -14f, 34f, -19f)
                reflectiveQuadToRelative(40f, 0f)
                lineToRelative(69f, 20f)
                verticalLineToRelative(-287f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 320f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 360f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(593f)
                close()
                moveTo(160f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(600f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(72f)
                lineToRelative(79f, 80f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Trackpad_input_3!!
    }

private var _Trackpad_input_3: ImageVector? = null

