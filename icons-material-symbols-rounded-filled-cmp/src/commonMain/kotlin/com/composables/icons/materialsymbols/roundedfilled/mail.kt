package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mail: ImageVector
    get() {
        if (_Mail != null) return _Mail!!
        
        _Mail = ImageVector.Builder(
            name = "mail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -287f)
                quadToRelative(5f, 0f, 10.5f, -1.5f)
                reflectiveQuadTo(501f, 507f)
                lineToRelative(283f, -177f)
                quadToRelative(8f, -5f, 12f, -12.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(0f, -20f, -17f, -30f)
                reflectiveQuadToRelative(-35f, 1f)
                lineTo(480f, 440f)
                lineTo(212f, 272f)
                quadToRelative(-18f, -11f, -35f, -0.5f)
                reflectiveQuadTo(160f, 301f)
                quadToRelative(0f, 10f, 4f, 17.5f)
                reflectiveQuadToRelative(12f, 11.5f)
                lineToRelative(283f, 177f)
                quadToRelative(5f, 3f, 10.5f, 4.5f)
                reflectiveQuadTo(480f, 513f)
                close()
            }
        }.build()
        
        return _Mail!!
    }

private var _Mail: ImageVector? = null

