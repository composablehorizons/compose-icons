package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Multimodal_hand_eye: ImageVector
    get() {
        if (_Multimodal_hand_eye != null) return _Multimodal_hand_eye!!
        
        _Multimodal_hand_eye = ImageVector.Builder(
            name = "multimodal_hand_eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(263f, 920f)
                lineTo(24f, 680f)
                lineToRelative(64f, -66f)
                lineToRelative(112f, 33f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(480f, 920f)
                horizontalLineTo(263f)
                close()
                moveToRelative(377f, -480f)
                quadToRelative(-91f, 0f, -168f, -48f)
                reflectiveQuadTo(360f, 260f)
                quadToRelative(35f, -84f, 112f, -132f)
                reflectiveQuadToRelative(168f, -48f)
                quadToRelative(91f, 0f, 168f, 48f)
                reflectiveQuadToRelative(112f, 132f)
                quadToRelative(-35f, 84f, -112f, 132f)
                reflectiveQuadToRelative(-168f, 48f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(580f, 260f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(700f, 260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(640f, 320f)
                close()
            }
        }.build()
        
        return _Multimodal_hand_eye!!
    }

private var _Multimodal_hand_eye: ImageVector? = null

