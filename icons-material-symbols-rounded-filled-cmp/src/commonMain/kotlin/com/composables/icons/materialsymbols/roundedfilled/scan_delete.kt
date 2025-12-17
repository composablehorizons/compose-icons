package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Scan_delete: ImageVector
    get() {
        if (_Scan_delete != null) return _Scan_delete!!
        
        _Scan_delete = ImageVector.Builder(
            name = "scan_delete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 360f)
                horizontalLineToRelative(120f)
                lineTo(520f, 160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 360f)
                close()
                moveToRelative(120f, 417f)
                lineToRelative(-56f, 55f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(608f, 832f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(56f, -56f)
                lineToRelative(-56f, -56f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(56f, 56f)
                lineToRelative(56f, -56f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(832f, 608f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-55f, 56f)
                lineToRelative(55f, 56f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(832f, 832f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-56f, -55f)
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
                verticalLineToRelative(109f)
                quadToRelative(0f, 12f, -9.5f, 19f)
                reflectiveQuadToRelative(-21.5f, 4f)
                quadToRelative(-59f, -13f, -117f, 4f)
                reflectiveQuadToRelative(-102f, 61f)
                quadToRelative(-32f, 32f, -51f, 75.5f)
                reflectiveQuadTo(480f, 719f)
                quadToRelative(0f, 29f, 7f, 58f)
                reflectiveQuadToRelative(21f, 55f)
                quadToRelative(9f, 17f, 1f, 32.5f)
                reflectiveQuadTo(484f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Scan_delete!!
    }

private var _Scan_delete: ImageVector? = null

