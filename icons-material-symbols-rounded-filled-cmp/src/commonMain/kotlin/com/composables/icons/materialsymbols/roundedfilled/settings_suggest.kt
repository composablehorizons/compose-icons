package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_suggest: ImageVector
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
                moveTo(18.525f, 8.3f)
                quadToRelative(-0.125f, 0f, -0.262f, -0.075f)
                quadToRelative(-0.138f, -0.075f, -0.188f, -0.225f)
                lineToRelative(-0.65f, -1.4f)
                lineToRelative(-1.4f, -0.65f)
                quadToRelative(-0.15f, -0.05f, -0.225f, -0.188f)
                quadToRelative(-0.075f, -0.137f, -0.075f, -0.262f)
                reflectiveQuadToRelative(0.075f, -0.263f)
                quadToRelative(0.075f, -0.137f, 0.225f, -0.187f)
                lineToRelative(1.4f, -0.65f)
                lineToRelative(0.65f, -1.4f)
                quadToRelative(0.05f, -0.15f, 0.188f, -0.225f)
                quadToRelative(0.137f, -0.075f, 0.262f, -0.075f)
                reflectiveQuadToRelative(0.263f, 0.075f)
                quadToRelative(0.137f, 0.075f, 0.187f, 0.225f)
                lineToRelative(0.65f, 1.4f)
                lineToRelative(1.4f, 0.65f)
                quadToRelative(0.15f, 0.05f, 0.225f, 0.187f)
                quadToRelative(0.075f, 0.138f, 0.075f, 0.263f)
                reflectiveQuadToRelative(-0.075f, 0.262f)
                quadToRelative(-0.075f, 0.138f, -0.225f, 0.188f)
                lineToRelative(-1.4f, 0.65f)
                lineToRelative(-0.65f, 1.4f)
                quadToRelative(-0.05f, 0.15f, -0.187f, 0.225f)
                quadToRelative(-0.138f, 0.075f, -0.263f, 0.075f)
                close()
                moveToRelative(2f, 7.025f)
                quadToRelative(-0.125f, 0f, -0.25f, -0.075f)
                reflectiveQuadToRelative(-0.2f, -0.2f)
                lineToRelative(-0.35f, -0.75f)
                lineToRelative(-0.75f, -0.35f)
                quadToRelative(-0.075f, -0.05f, -0.275f, -0.45f)
                quadToRelative(0f, -0.125f, 0.075f, -0.25f)
                reflectiveQuadToRelative(0.2f, -0.2f)
                lineToRelative(0.75f, -0.35f)
                lineToRelative(0.35f, -0.75f)
                quadToRelative(0.05f, -0.075f, 0.45f, -0.275f)
                quadToRelative(0.125f, 0f, 0.25f, 0.075f)
                reflectiveQuadToRelative(0.2f, 0.2f)
                lineToRelative(0.35f, 0.75f)
                lineToRelative(0.75f, 0.35f)
                quadToRelative(0.075f, 0.05f, 0.275f, 0.45f)
                quadToRelative(0f, 0.125f, -0.075f, 0.25f)
                reflectiveQuadToRelative(-0.2f, 0.2f)
                lineToRelative(-0.75f, 0.35f)
                lineToRelative(-0.35f, 0.75f)
                quadToRelative(-0.05f, 0.075f, -0.45f, 0.275f)
                close()
                moveTo(8.4f, 22f)
                quadToRelative(-0.375f, 0f, -0.65f, -0.25f)
                reflectiveQuadToRelative(-0.325f, -0.625f)
                lineToRelative(-0.2f, -1.475f)
                quadToRelative(-0.2f, -0.075f, -0.387f, -0.2f)
                quadToRelative(-0.188f, -0.125f, -0.313f, -0.25f)
                lineToRelative(-1.375f, 0.6f)
                quadToRelative(-0.35f, 0.15f, -0.712f, 0.037f)
                quadToRelative(-0.363f, -0.112f, -0.563f, -0.462f)
                lineToRelative(-1.6f, -2.8f)
                quadToRelative(-0.2f, -0.35f, -0.125f, -0.712f)
                quadToRelative(0.075f, -0.363f, 0.4f, -0.588f)
                lineToRelative(1.175f, -0.875f)
                verticalLineToRelative(-0.8f)
                lineToRelative(-1.175f, -0.875f)
                quadToRelative(-0.325f, -0.225f, -0.4f, -0.588f)
                quadToRelative(-0.075f, -0.362f, 0.125f, -0.712f)
                lineToRelative(1.6f, -2.8f)
                quadToRelative(0.2f, -0.35f, 0.563f, -0.463f)
                quadToRelative(0.362f, -0.112f, 0.712f, 0.038f)
                lineToRelative(1.375f, 0.6f)
                quadToRelative(0.125f, -0.125f, 0.313f, -0.25f)
                quadToRelative(0.187f, -0.125f, 0.387f, -0.2f)
                lineToRelative(0.2f, -1.475f)
                quadToRelative(0.05f, -0.375f, 0.325f, -0.625f)
                reflectiveQuadTo(8.4f, 6f)
                horizontalLineToRelative(3.25f)
                quadToRelative(0.375f, 0f, 0.65f, 0.25f)
                reflectiveQuadToRelative(0.325f, 0.625f)
                lineToRelative(0.2f, 1.475f)
                quadToRelative(0.2f, 0.075f, 0.388f, 0.2f)
                quadToRelative(0.187f, 0.125f, 0.312f, 0.25f)
                lineToRelative(1.375f, -0.6f)
                quadToRelative(0.35f, -0.15f, 0.713f, -0.038f)
                quadToRelative(0.362f, 0.113f, 0.562f, 0.463f)
                lineToRelative(1.6f, 2.8f)
                quadToRelative(0.2f, 0.35f, 0.125f, 0.712f)
                quadToRelative(-0.075f, 0.363f, -0.4f, 0.588f)
                lineToRelative(-1.175f, 0.875f)
                verticalLineToRelative(0.8f)
                lineToRelative(1.175f, 0.875f)
                quadToRelative(0.325f, 0.225f, 0.4f, 0.588f)
                quadToRelative(0.075f, 0.362f, -0.125f, 0.712f)
                lineToRelative(-1.6f, 2.8f)
                quadToRelative(-0.2f, 0.35f, -0.562f, 0.462f)
                quadToRelative(-0.363f, 0.113f, -0.713f, -0.037f)
                lineToRelative(-1.375f, -0.6f)
                quadToRelative(-0.125f, 0.125f, -0.312f, 0.25f)
                quadToRelative(-0.188f, 0.125f, -0.388f, 0.2f)
                lineToRelative(-0.2f, 1.475f)
                quadToRelative(-0.05f, 0.375f, -0.325f, 0.625f)
                reflectiveQuadToRelative(-0.65f, 0.25f)
                close()
                moveToRelative(1.625f, -5f)
                quadToRelative(1.25f, 0f, 2.125f, -0.875f)
                reflectiveQuadTo(13.025f, 14f)
                quadToRelative(0f, -1.25f, -0.875f, -2.125f)
                reflectiveQuadTo(10.025f, 11f)
                quadToRelative(-1.25f, 0f, -2.125f, 0.875f)
                reflectiveQuadTo(7.025f, 14f)
                quadToRelative(0f, 1.25f, 0.875f, 2.125f)
                reflectiveQuadToRelative(2.125f, 0.875f)
                close()
                moveToRelative(0f, -3f)
                close()
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

