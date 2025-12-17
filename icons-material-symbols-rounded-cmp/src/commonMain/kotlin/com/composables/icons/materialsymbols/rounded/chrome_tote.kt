package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chrome_tote: ImageVector
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
                moveTo(541f, 482f)
                lineToRelative(-36f, -35f)
                quadToRelative(-12f, -11f, -28f, -11f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-11f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(104f, -104f)
                quadToRelative(11f, -11f, 11.5f, -27.5f)
                reflectiveQuadTo(713f, 448f)
                quadToRelative(-11f, -12f, -28f, -12f)
                reflectiveQuadToRelative(-29f, 11f)
                lineToRelative(-35f, 35f)
                verticalLineTo(356f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(581f, 316f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(541f, 356f)
                verticalLineToRelative(126f)
                close()
                moveToRelative(-28f, 374f)
                horizontalLineToRelative(226f)
                quadToRelative(0f, 26f, -21.5f, 41f)
                reflectiveQuadTo(669f, 916f)
                lineToRelative(-440f, 55f)
                quadToRelative(-33f, 5f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -54f)
                lineTo(86f, 464f)
                quadToRelative(-4f, -33f, 16.5f, -59f)
                reflectiveQuadToRelative(53.5f, -30f)
                lineToRelative(45f, -5f)
                verticalLineToRelative(80f)
                lineToRelative(-36f, 4f)
                lineToRelative(54f, 438f)
                lineToRelative(294f, -36f)
                close()
                moveToRelative(-152f, -80f)
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineTo(256f)
                horizontalLineTo(361f)
                verticalLineToRelative(440f)
                close()
                moveTo(219f, 892f)
                close()
                moveToRelative(142f, -196f)
                verticalLineTo(256f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Chrome_tote!!
    }

private var _Chrome_tote: ImageVector? = null

