package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Settings_suggest: ImageVector
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
                lineTo(1.85f, 15.8f)
                lineToRelative(1.875f, -1.4f)
                verticalLineToRelative(-0.8f)
                lineTo(1.85f, 12.2f)
                lineToRelative(2.475f, -4.35f)
                lineToRelative(2.2f, 0.95f)
                quadToRelative(0.125f, -0.125f, 0.313f, -0.25f)
                quadToRelative(0.187f, -0.125f, 0.387f, -0.2f)
                lineToRelative(0.3f, -2.35f)
                horizontalLineToRelative(5f)
                lineToRelative(0.3f, 2.35f)
                quadToRelative(0.2f, 0.075f, 0.388f, 0.2f)
                quadToRelative(0.187f, 0.125f, 0.312f, 0.25f)
                lineToRelative(2.2f, -0.95f)
                lineTo(18.2f, 12.2f)
                lineToRelative(-1.875f, 1.4f)
                verticalLineToRelative(0.8f)
                lineToRelative(1.875f, 1.4f)
                lineToRelative(-2.475f, 4.35f)
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
                moveToRelative(0f, -2f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadToRelative(-0.287f, -0.287f, -0.287f, -0.712f)
                reflectiveQuadToRelative(0.287f, -0.713f)
                quadTo(9.6f, 13f, 10.025f, 13f)
                reflectiveQuadToRelative(0.713f, 0.287f)
                quadToRelative(0.287f, 0.288f, 0.287f, 0.713f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadToRelative(-0.288f, 0.288f, -0.713f, 0.288f)
                close()
                moveToRelative(-0.75f, 5f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.2f, -1.8f)
                quadToRelative(0.725f, -0.2f, 1.238f, -0.512f)
                quadToRelative(0.512f, -0.313f, 1.012f, -0.838f)
                lineToRelative(1.65f, 0.75f)
                lineToRelative(0.7f, -1.25f)
                lineToRelative(-1.45f, -1.1f)
                quadToRelative(0.2f, -0.575f, 0.2f, -1.25f)
                reflectiveQuadToRelative(-0.2f, -1.25f)
                lineToRelative(1.45f, -1.1f)
                lineToRelative(-0.7f, -1.25f)
                lineToRelative(-1.65f, 0.75f)
                quadToRelative(-0.5f, -0.525f, -1.012f, -0.838f)
                quadTo(11.7f, 10f, 10.975f, 9.8f)
                lineToRelative(-0.2f, -1.8f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.2f, 1.8f)
                quadToRelative(-0.725f, 0.2f, -1.237f, 0.512f)
                quadToRelative(-0.513f, 0.313f, -1.013f, 0.838f)
                lineToRelative(-1.65f, -0.75f)
                lineToRelative(-0.7f, 1.25f)
                lineToRelative(1.45f, 1.1f)
                quadToRelative(-0.2f, 0.575f, -0.212f, 1.25f)
                quadToRelative(-0.013f, 0.675f, 0.212f, 1.25f)
                lineToRelative(-1.45f, 1.1f)
                lineToRelative(0.7f, 1.25f)
                lineToRelative(1.65f, -0.75f)
                quadToRelative(0.5f, 0.525f, 1.013f, 0.838f)
                quadToRelative(0.512f, 0.312f, 1.237f, 0.512f)
                close()
                moveToRelative(0.75f, -6f)
                close()
            }
        }.build()
        
        return _Settings_suggest!!
    }

private var _Settings_suggest: ImageVector? = null

