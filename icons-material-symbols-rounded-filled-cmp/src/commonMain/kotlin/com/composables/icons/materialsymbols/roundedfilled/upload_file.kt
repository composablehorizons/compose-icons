package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Upload_file: ImageVector
    get() {
        if (_Upload_file != null) return _Upload_file!!
        
        _Upload_file = ImageVector.Builder(
            name = "upload_file",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 593f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-127f)
                lineToRelative(36f, 36f)
                quadToRelative(6f, 6f, 13.5f, 9f)
                reflectiveQuadToRelative(15f, 2.5f)
                quadToRelative(7.5f, -0.5f, 14.5f, -3.5f)
                reflectiveQuadToRelative(13f, -9f)
                quadToRelative(11f, -12f, 11.5f, -28f)
                reflectiveQuadTo(612f, 572f)
                lineTo(508f, 468f)
                quadToRelative(-6f, -6f, -13f, -8.5f)
                reflectiveQuadToRelative(-15f, -2.5f)
                quadToRelative(-8f, 0f, -15f, 2.5f)
                reflectiveQuadToRelative(-13f, 8.5f)
                lineTo(348f, 572f)
                quadToRelative(-12f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(12.5f, 28f)
                quadToRelative(12f, 11f, 28f, 11.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                lineToRelative(35f, -35f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(447f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(280f, -560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 360f)
                horizontalLineToRelative(160f)
                lineTo(520f, 160f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Upload_file!!
    }

private var _Upload_file: ImageVector? = null

