package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Multimodal_hand_eye: ImageVector
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
                moveTo(480f, 920f)
                horizontalLineTo(263f)
                lineTo(24f, 680f)
                lineToRelative(64f, -66f)
                lineToRelative(112f, 33f)
                verticalLineToRelative(-367f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(473f)
                lineToRelative(-98f, -28f)
                lineToRelative(115f, 115f)
                horizontalLineToRelative(183f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 760f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveTo(320f, 640f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 200f)
                horizontalLineTo(313f)
                horizontalLineToRelative(167f)
                close()
                moveToRelative(160f, -400f)
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
                quadToRelative(57f, 0f, 107.5f, -26f)
                reflectiveQuadToRelative(82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(640f, 160f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(450f, 260f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(640f, 360f)
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

