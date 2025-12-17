package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Partly_cloudy_day: ImageVector
    get() {
        if (_Partly_cloudy_day != null) return _Partly_cloudy_day!!
        
        _Partly_cloudy_day = ImageVector.Builder(
            name = "partly_cloudy_day",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 640f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(48f, 0f, 88.5f, 26f)
                reflectiveQuadToRelative(58.5f, 71f)
                lineToRelative(10f, 23f)
                horizontalLineToRelative(24f)
                quadToRelative(42f, 0f, 70.5f, 29f)
                reflectiveQuadToRelative(28.5f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineTo(240f)
                close()
                moveToRelative(359f, -112f)
                quadToRelative(-4f, -63f, -45.5f, -109f)
                reflectiveQuadTo(449f, 522f)
                quadToRelative(-31f, -54f, -83.5f, -85.5f)
                reflectiveQuadTo(250f, 400f)
                quadToRelative(26f, -73f, 89f, -116.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 65f, -32f, 120.5f)
                reflectiveQuadTo(599f, 688f)
                close()
                moveTo(440f, 200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(266f, 110f)
                lineToRelative(-56f, -56f)
                lineToRelative(112f, -114f)
                lineToRelative(57f, 57f)
                lineToRelative(-113f, 113f)
                close()
                moveToRelative(54f, 210f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(2f, 300f)
                lineTo(650f, 706f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 112f)
                lineToRelative(-58f, 58f)
                close()
                moveTo(254f, 310f)
                lineTo(141f, 197f)
                lineToRelative(57f, -57f)
                lineToRelative(112f, 114f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Partly_cloudy_day!!
    }

private var _Partly_cloudy_day: ImageVector? = null

