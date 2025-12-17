package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Takeout_dining: ImageVector
    get() {
        if (_Takeout_dining != null) return _Takeout_dining!!
        
        _Takeout_dining = ImageVector.Builder(
            name = "takeout_dining",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 720f)
                horizontalLineToRelative(338f)
                lineToRelative(19f, -280f)
                horizontalLineTo(292f)
                lineToRelative(20f, 280f)
                close()
                moveToRelative(-26f, -360f)
                horizontalLineToRelative(389f)
                lineToRelative(3f, -50f)
                lineToRelative(-112f, -110f)
                horizontalLineTo(394f)
                lineTo(282f, 310f)
                lineToRelative(4f, 50f)
                close()
                moveToRelative(-76f, 68f)
                lineTo(108f, 326f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(38f, 38f)
                verticalLineToRelative(-8f)
                quadToRelative(2f, -13f, 7.5f, -24f)
                reflectiveQuadToRelative(14.5f, -20f)
                lineToRelative(113f, -113f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                horizontalLineToRelative(174f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(113f, 113f)
                quadToRelative(9f, 9f, 14.5f, 20.5f)
                reflectiveQuadTo(758f, 301f)
                verticalLineToRelative(7f)
                lineToRelative(38f, -38f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(750f, 428f)
                horizontalLineTo(210f)
                close()
                moveToRelative(438f, 372f)
                horizontalLineTo(312f)
                quadToRelative(-32f, 0f, -55f, -21f)
                reflectiveQuadToRelative(-25f, -53f)
                lineToRelative(-22f, -298f)
                horizontalLineToRelative(540f)
                lineToRelative(-22f, 298f)
                quadToRelative(-2f, 32f, -25f, 53f)
                reflectiveQuadToRelative(-55f, 21f)
                close()
                moveTo(480f, 360f)
                close()
                moveToRelative(1f, 80f)
                close()
            }
        }.build()
        
        return _Takeout_dining!!
    }

private var _Takeout_dining: ImageVector? = null

