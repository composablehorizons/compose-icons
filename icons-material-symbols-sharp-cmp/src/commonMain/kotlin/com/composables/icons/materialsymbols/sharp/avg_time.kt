package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Avg_time: ImageVector
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
                moveTo(480f, 880f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 774f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadTo(734f, 774f)
                quadToRelative(-49f, 49f, -114.5f, 77.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(120f, 520f)
                quadToRelative(0f, -74f, 28.5f, -139.5f)
                reflectiveQuadTo(226f, 266f)
                quadToRelative(49f, -49f, 114.5f, -77.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(62f, 0f, 119f, 20f)
                reflectiveQuadToRelative(107f, 58f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(-56f, 56f)
                quadToRelative(38f, 50f, 58f, 107f)
                reflectiveQuadToRelative(20f, 119f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, 120f)
                quadToRelative(-106f, 0f, -184f, 69f)
                reflectiveQuadToRelative(-93f, 171f)
                horizontalLineToRelative(142f)
                lineToRelative(52f, 96f)
                lineToRelative(163f, -286f)
                lineToRelative(104f, 190f)
                horizontalLineToRelative(93f)
                quadToRelative(-15f, -102f, -93f, -171f)
                reflectiveQuadToRelative(-184f, -69f)
                close()
                moveToRelative(0f, 560f)
                quadToRelative(106f, 0f, 184f, -69f)
                reflectiveQuadToRelative(93f, -171f)
                horizontalLineTo(615f)
                lineToRelative(-52f, -96f)
                lineToRelative(-163f, 286f)
                lineToRelative(-104f, -190f)
                horizontalLineToRelative(-93f)
                quadToRelative(15f, 102f, 93f, 171f)
                reflectiveQuadToRelative(184f, 69f)
                close()
                moveToRelative(0f, 0f)
                quadToRelative(-116f, 0f, -198f, -82f)
                reflectiveQuadToRelative(-82f, -198f)
                quadToRelative(0f, -116f, 82f, -198f)
                reflectiveQuadToRelative(198f, -82f)
                quadToRelative(116f, 0f, 198f, 82f)
                reflectiveQuadToRelative(82f, 198f)
                quadToRelative(0f, 116f, -82f, 198f)
                reflectiveQuadToRelative(-198f, 82f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Avg_time!!
    }

private var _Avg_time: ImageVector? = null

