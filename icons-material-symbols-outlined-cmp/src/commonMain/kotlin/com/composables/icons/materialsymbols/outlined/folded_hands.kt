package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Folded_hands: ImageVector
    get() {
        if (_Folded_hands != null) return _Folded_hands!!
        
        _Folded_hands = ImageVector.Builder(
            name = "folded_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 640f)
                verticalLineToRelative(-109f)
                lineToRelative(-45f, -81f)
                quadToRelative(-7f, 5f, -11f, 13f)
                reflectiveQuadToRelative(-4f, 17f)
                verticalLineToRelative(229f)
                lineTo(663f, 880f)
                horizontalLineToRelative(-93f)
                lineToRelative(-90f, -148f)
                verticalLineToRelative(-252f)
                quadToRelative(0f, -31f, 15f, -57f)
                reflectiveQuadToRelative(41f, -43f)
                lineToRelative(-56f, -99f)
                quadToRelative(-20f, -38f, -17.5f, -80.5f)
                reflectiveQuadTo(495f, 128f)
                lineToRelative(68f, -68f)
                lineToRelative(276f, 324f)
                lineToRelative(41f, 496f)
                horizontalLineToRelative(-80f)
                lineToRelative(-39f, -464f)
                lineToRelative(-203f, -238f)
                lineToRelative(-6f, 6f)
                quadToRelative(-10f, 10f, -11.5f, 23f)
                reflectiveQuadToRelative(4.5f, 25f)
                lineToRelative(155f, 278f)
                verticalLineToRelative(130f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-360f, 0f)
                verticalLineToRelative(-130f)
                lineToRelative(155f, -278f)
                quadToRelative(6f, -12f, 4.5f, -25f)
                reflectiveQuadTo(408f, 184f)
                lineToRelative(-6f, -6f)
                lineToRelative(-203f, 238f)
                lineToRelative(-39f, 464f)
                horizontalLineTo(80f)
                lineToRelative(41f, -496f)
                lineToRelative(276f, -324f)
                lineToRelative(68f, 68f)
                quadToRelative(30f, 30f, 32.5f, 72.5f)
                reflectiveQuadTo(480f, 281f)
                lineToRelative(-56f, 99f)
                quadToRelative(26f, 17f, 41f, 43f)
                reflectiveQuadToRelative(15f, 57f)
                verticalLineToRelative(252f)
                lineTo(390f, 880f)
                horizontalLineToRelative(-93f)
                lineToRelative(103f, -171f)
                verticalLineToRelative(-229f)
                quadToRelative(0f, -9f, -4f, -17f)
                reflectiveQuadToRelative(-11f, -13f)
                lineToRelative(-45f, 81f)
                verticalLineToRelative(109f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Folded_hands!!
    }

private var _Folded_hands: ImageVector? = null

