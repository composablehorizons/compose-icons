package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Scan_delete: ImageVector
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
                moveTo(520f, 360f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(116f, 500f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(174f)
                quadToRelative(-19f, -7f, -39.5f, -10.5f)
                reflectiveQuadTo(719f, 480f)
                quadToRelative(-100f, 0f, -169.5f, 69.5f)
                reflectiveQuadTo(480f, 719f)
                quadToRelative(0f, 45f, 16f, 86.5f)
                reflectiveQuadTo(542f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Scan_delete!!
    }

private var _Scan_delete: ImageVector? = null

