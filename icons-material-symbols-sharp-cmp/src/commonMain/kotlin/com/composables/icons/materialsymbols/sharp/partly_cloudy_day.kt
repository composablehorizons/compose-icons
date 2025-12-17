package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Partly_cloudy_day: ImageVector
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
                moveTo(440f, 200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(266f, 110f)
                lineToRelative(-56f, -56f)
                lineToRelative(113f, -114f)
                lineToRelative(56f, 57f)
                lineToRelative(-113f, 113f)
                close()
                moveToRelative(54f, 210f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                close()
                moveToRelative(3f, 299f)
                lineTo(650f, 706f)
                lineToRelative(56f, -56f)
                lineToRelative(114f, 112f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(254f, 310f)
                lineTo(141f, 197f)
                lineToRelative(57f, -57f)
                lineToRelative(112f, 114f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-14f, 450f)
                horizontalLineToRelative(180f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(480f, 700f)
                quadToRelative(0f, -25f, -17f, -42.5f)
                reflectiveQuadTo(421f, 640f)
                horizontalLineToRelative(-51f)
                lineToRelative(-20f, -48f)
                quadToRelative(-14f, -33f, -44f, -52.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 640f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(60f, 0f, 109.5f, 32.5f)
                reflectiveQuadTo(423f, 560f)
                quadToRelative(58f, 0f, 97.5f, 43f)
                reflectiveQuadTo(560f, 706f)
                quadToRelative(-2f, 57f, -42.5f, 95.5f)
                reflectiveQuadTo(420f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(320f, -134f)
                quadToRelative(-5f, -20f, -10f, -39f)
                reflectiveQuadToRelative(-10f, -39f)
                quadToRelative(45f, -19f, 72.5f, -59f)
                reflectiveQuadToRelative(27.5f, -89f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-60f, 0f, -105f, 39f)
                reflectiveQuadToRelative(-53f, 99f)
                quadToRelative(-20f, -5f, -41f, -9f)
                reflectiveQuadToRelative(-41f, -9f)
                quadToRelative(14f, -88f, 82.5f, -144f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 77f, -44f, 138.5f)
                reflectiveQuadTo(560f, 706f)
                close()
                moveToRelative(-79f, -226f)
                close()
            }
        }.build()
        
        return _Partly_cloudy_day!!
    }

private var _Partly_cloudy_day: ImageVector? = null

