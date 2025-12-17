package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Time_auto: ImageVector
    get() {
        if (_Time_auto != null) return _Time_auto!!
        
        _Time_auto = ImageVector.Builder(
            name = "time_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(417f, 610f)
                horizontalLineToRelative(124f)
                lineToRelative(15f, 46f)
                quadToRelative(4f, 11f, 13f, 17.5f)
                reflectiveQuadToRelative(20f, 6.5f)
                quadToRelative(19f, 0f, 29.5f, -15.5f)
                reflectiveQuadTo(623f, 632f)
                lineToRelative(-94f, -265f)
                quadToRelative(-4f, -11f, -14f, -18f)
                reflectiveQuadToRelative(-22f, -7f)
                horizontalLineToRelative(-26f)
                quadToRelative(-12f, 0f, -22f, 7f)
                reflectiveQuadToRelative(-14f, 18f)
                lineToRelative(-95f, 267f)
                quadToRelative(-6f, 17f, 4.5f, 31.5f)
                reflectiveQuadTo(369f, 680f)
                quadToRelative(11f, 0f, 20f, -6.5f)
                reflectiveQuadToRelative(13f, -17.5f)
                lineToRelative(15f, -46f)
                close()
                moveToRelative(19f, -58f)
                lineToRelative(44f, -132f)
                lineToRelative(43f, 132f)
                horizontalLineToRelative(-87f)
                close()
                moveToRelative(-36f, -432f)
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
                moveToRelative(80f, 760f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 774f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(62f, 0f, 119f, 20f)
                reflectiveQuadToRelative(107f, 58f)
                lineToRelative(28f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-28f, 28f)
                quadToRelative(38f, 50f, 58f, 107f)
                reflectiveQuadToRelative(20f, 119f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Time_auto!!
    }

private var _Time_auto: ImageVector? = null

