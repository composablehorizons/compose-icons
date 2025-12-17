package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Avg_time: ImageVector
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
                moveTo(400f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 40f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 120f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, 470f)
                lineToRelative(-44f, -88f)
                quadToRelative(-5f, -11f, -15f, -16.5f)
                reflectiveQuadToRelative(-21f, -5.5f)
                horizontalLineTo(122f)
                quadToRelative(15f, -135f, 117f, -227.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(62f, 0f, 119f, 20f)
                reflectiveQuadToRelative(107f, 58f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-28f, 28f)
                quadToRelative(32f, 42f, 51f, 88.5f)
                reflectiveQuadToRelative(25f, 97.5f)
                horizontalLineTo(665f)
                lineToRelative(-69f, -138f)
                quadToRelative(-11f, -23f, -36f, -23f)
                reflectiveQuadToRelative(-36f, 23f)
                lineTo(400f, 590f)
                close()
                moveToRelative(80f, 290f)
                quadToRelative(-139f, 0f, -241f, -92.5f)
                reflectiveQuadTo(122f, 560f)
                horizontalLineToRelative(173f)
                lineToRelative(69f, 138f)
                quadToRelative(11f, 23f, 36f, 23f)
                reflectiveQuadToRelative(36f, -23f)
                lineToRelative(124f, -248f)
                lineToRelative(44f, 88f)
                quadToRelative(5f, 11f, 15f, 16.5f)
                reflectiveQuadToRelative(21f, 5.5f)
                horizontalLineToRelative(198f)
                quadToRelative(-15f, 135f, -116.5f, 227.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Avg_time!!
    }

private var _Avg_time: ImageVector? = null

