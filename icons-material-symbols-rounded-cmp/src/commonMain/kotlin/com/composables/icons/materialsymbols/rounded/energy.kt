package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Energy: ImageVector
    get() {
        if (_Energy != null) return _Energy!!
        
        _Energy = ImageVector.Builder(
            name = "energy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -32f, 24f, -53.5f)
                reflectiveQuadToRelative(56f, -26.5f)
                verticalLineToRelative(-286f)
                quadToRelative(-22f, -8f, -38.5f, -23f)
                reflectiveQuadTo(374f, 416f)
                lineToRelative(-76f, 20f)
                quadToRelative(-36f, 8f, -68.5f, -6f)
                reflectiveQuadTo(188f, 382f)
                lineToRelative(174f, -44f)
                quadToRelative(8f, -41f, 38f, -68f)
                reflectiveQuadToRelative(72f, -30f)
                lineToRelative(24f, -90f)
                quadToRelative(10f, -35f, 38.5f, -55.5f)
                reflectiveQuadTo(598f, 82f)
                lineToRelative(-50f, 180f)
                quadToRelative(25f, 16f, 38.5f, 42f)
                reflectiveQuadToRelative(13.5f, 56f)
                quadToRelative(0f, 13f, -3f, 25.5f)
                reflectiveQuadToRelative(-7f, 24.5f)
                lineToRelative(54f, 56f)
                quadToRelative(25f, 26f, 29.5f, 61f)
                reflectiveQuadTo(654f, 586f)
                lineTo(534f, 466f)
                quadToRelative(-3f, 3f, -6.5f, 4.5f)
                reflectiveQuadTo(520f, 474f)
                verticalLineToRelative(286f)
                quadToRelative(32f, 5f, 56f, 26.5f)
                reflectiveQuadToRelative(24f, 53.5f)
                verticalLineToRelative(40f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -460f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 360f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 300f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 360f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 420f)
                close()
            }
        }.build()
        
        return _Energy!!
    }

private var _Energy: ImageVector? = null

