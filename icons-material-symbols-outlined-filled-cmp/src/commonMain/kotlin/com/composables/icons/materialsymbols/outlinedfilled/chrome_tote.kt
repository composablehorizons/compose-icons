package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chrome_tote: ImageVector
    get() {
        if (_Chrome_tote != null) return _Chrome_tote!!
        
        _Chrome_tote = ImageVector.Builder(
            name = "chrome_tote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(581f, 636f)
                lineToRelative(160f, -160f)
                lineToRelative(-56f, -57f)
                lineToRelative(-64f, 63f)
                verticalLineTo(316f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(166f)
                lineToRelative(-64f, -63f)
                lineToRelative(-56f, 57f)
                lineToRelative(160f, 160f)
                close()
                moveTo(361f, 776f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(281f, 696f)
                verticalLineTo(256f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(361f, 176f)
                horizontalLineToRelative(440f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(881f, 256f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(801f, 776f)
                horizontalLineTo(361f)
                close()
                moveTo(229f, 971f)
                quadToRelative(-33f, 5f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -54f)
                lineTo(86f, 464f)
                quadToRelative(-4f, -33f, 16.5f, -59f)
                reflectiveQuadToRelative(53.5f, -30f)
                lineToRelative(45f, -5f)
                verticalLineToRelative(366f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                horizontalLineToRelative(418f)
                quadToRelative(0f, 26f, -21.5f, 41f)
                reflectiveQuadTo(669f, 916f)
                lineToRelative(-440f, 55f)
                close()
            }
        }.build()
        
        return _Chrome_tote!!
    }

private var _Chrome_tote: ImageVector? = null

