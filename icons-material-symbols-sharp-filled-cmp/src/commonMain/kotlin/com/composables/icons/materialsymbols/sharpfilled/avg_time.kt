package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Avg_time: ImageVector
    get() {
        if (_Avg_time != null) return _Avg_time!!
        
        _Avg_time = ImageVector.Builder(
            name = "avg_time",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(37f, 456f)
                lineToRelative(-52f, -96f)
                horizontalLineTo(122f)
                quadToRelative(15f, -135f, 117f, -227.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(62f, 0f, 119f, 20f)
                reflectiveQuadToRelative(107f, 58f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(32f, 42f, 51f, 88.5f)
                reflectiveQuadToRelative(25f, 97.5f)
                horizontalLineTo(664f)
                lineTo(560f, 290f)
                lineTo(397f, 576f)
                close()
                moveToRelative(83f, 304f)
                quadToRelative(-139f, 0f, -241f, -92.5f)
                reflectiveQuadTo(122f, 560f)
                horizontalLineToRelative(174f)
                lineToRelative(104f, 190f)
                lineToRelative(163f, -286f)
                lineToRelative(52f, 96f)
                horizontalLineToRelative(223f)
                quadToRelative(-15f, 135f, -116.5f, 227.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Avg_time!!
    }

private var _Avg_time: ImageVector? = null

