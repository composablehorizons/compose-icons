package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Scan_delete: ImageVector
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
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(174f)
                quadToRelative(-19f, -7f, -39f, -10.5f)
                reflectiveQuadToRelative(-41f, -3.5f)
                quadToRelative(-100f, 0f, -170f, 69.5f)
                reflectiveQuadTo(480f, 719f)
                quadToRelative(0f, 45f, 16f, 86.5f)
                reflectiveQuadTo(542f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Scan_delete!!
    }

private var _Scan_delete: ImageVector? = null

