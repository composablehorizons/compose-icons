package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_suggest: ImageVector
    get() {
        if (_Settings_suggest != null) return _Settings_suggest!!
        
        _Settings_suggest = ImageVector.Builder(
            name = "settings_suggest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.525f, 9f)
                lineToRelative(-1.1f, -2.4f)
                lineToRelative(-2.4f, -1.1f)
                lineToRelative(2.4f, -1.1f)
                lineToRelative(1.1f, -2.4f)
                lineToRelative(1.1f, 2.4f)
                lineToRelative(2.4f, 1.1f)
                lineToRelative(-2.4f, 1.1f)
                close()
                moveToRelative(2f, 7f)
                lineToRelative(-0.8f, -1.7f)
                lineToRelative(-1.7f, -0.8f)
                lineToRelative(1.7f, -0.8f)
                lineToRelative(0.8f, -1.7f)
                lineToRelative(0.8f, 1.7f)
                lineToRelative(1.7f, 0.8f)
                lineToRelative(-1.7f, 0.8f)
                close()
                moveToRelative(-13f, 6f)
                lineToRelative(-0.3f, -2.35f)
                quadToRelative(-0.2f, -0.075f, -0.387f, -0.2f)
                quadToRelative(-0.188f, -0.125f, -0.313f, -0.25f)
                lineToRelative(-2.2f, 0.95f)
                lineToRelative(-2.5f, -4.35f)
                lineToRelative(1.9f, -1.4f)
                verticalLineToRelative(-0.8f)
                lineToRelative(-1.9f, -1.4f)
                lineToRelative(2.5f, -4.35f)
                lineToRelative(2.2f, 0.95f)
                quadToRelative(0.125f, -0.125f, 0.313f, -0.25f)
                quadToRelative(0.187f, -0.125f, 0.387f, -0.2f)
                lineToRelative(0.3f, -2.35f)
                horizontalLineToRelative(5f)
                lineToRelative(0.3f, 2.35f)
                quadToRelative(0.2f, 0.075f, 0.388f, 0.2f)
                quadToRelative(0.187f, 0.125f, 0.312f, 0.25f)
                lineToRelative(2.2f, -0.95f)
                lineToRelative(2.5f, 4.35f)
                lineToRelative(-1.9f, 1.4f)
                verticalLineToRelative(0.8f)
                lineToRelative(1.9f, 1.4f)
                lineToRelative(-2.5f, 4.35f)
                lineToRelative(-2.2f, -0.95f)
                quadToRelative(-0.125f, 0.125f, -0.312f, 0.25f)
                quadToRelative(-0.188f, 0.125f, -0.388f, 0.2f)
                lineToRelative(-0.3f, 2.35f)
                close()
                moveToRelative(2.5f, -5f)
                quadToRelative(1.25f, 0f, 2.125f, -0.875f)
                reflectiveQuadTo(13.025f, 14f)
                quadToRelative(0f, -1.25f, -0.875f, -2.125f)
                reflectiveQuadTo(10.025f, 11f)
                quadToRelative(-1.25f, 0f, -2.125f, 0.875f)
                reflectiveQuadTo(7.025f, 14f)
                quadToRelative(0f, 1.25f, 0.875f, 2.125f)
                reflectiveQuadToRelative(2.125f, 0.875f)
                close()
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

