package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_system_daydream: ImageVector
    get() {
        if (_Settings_system_daydream != null) return _Settings_system_daydream!!
        
        _Settings_system_daydream = ImageVector.Builder(
            name = "settings_system_daydream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 640f)
                horizontalLineToRelative(260f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineToRelative(-2f)
                quadToRelative(-8f, -51f, -44.5f, -85.5f)
                reflectiveQuadTo(486f, 320f)
                quadToRelative(-42f, 0f, -78f, 21f)
                reflectiveQuadToRelative(-54f, 59f)
                horizontalLineToRelative(-5f)
                quadToRelative(-47f, 0f, -78f, 36f)
                reflectiveQuadToRelative(-31f, 84f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-10f)
                quadToRelative(0f, -29f, 20.5f, -49.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(29f, 0f, 49.5f, 20.5f)
                reflectiveQuadTo(550f, 470f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(70f)
                quadToRelative(8f, 0f, 14f, 6f)
                reflectiveQuadToRelative(6f, 14f)
                quadToRelative(0f, 8f, -6f, 14f)
                reflectiveQuadToRelative(-14f, 6f)
                horizontalLineTo(360f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Settings_system_daydream!!
    }

private var _Settings_system_daydream: ImageVector? = null

