package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Switch_account: ImageVector
    get() {
        if (_Switch_account != null) return _Switch_account!!
        
        _Switch_account = ImageVector.Builder(
            name = "switch_account",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 440f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveTo(320f, 630f)
                quadToRelative(45f, -53f, 108f, -81.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(69f, 0f, 132f, 28.5f)
                reflectiveQuadTo(800f, 630f)
                verticalLineToRelative(-470f)
                horizontalLineTo(320f)
                verticalLineToRelative(470f)
                close()
                moveToRelative(-80f, 90f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(480f, -520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 360f)
                close()
                moveTo(428f, 640f)
                horizontalLineToRelative(264f)
                quadToRelative(-29f, -20f, -63f, -30f)
                reflectiveQuadToRelative(-69f, -10f)
                quadToRelative(-35f, 0f, -69f, 10f)
                reflectiveQuadToRelative(-63f, 30f)
                close()
                moveToRelative(132f, -245f)
                close()
            }
        }.build()
        
        return _Switch_account!!
    }

private var _Switch_account: ImageVector? = null

