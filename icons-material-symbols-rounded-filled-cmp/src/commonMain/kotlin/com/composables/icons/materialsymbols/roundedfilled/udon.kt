package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Udon: ImageVector
    get() {
        if (_Udon != null) return _Udon!!
        
        _Udon = ImageVector.Builder(
            name = "udon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(220f, 480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-50f)
                lineToRelative(-40f, 4f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(100f, 220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(0f, -220f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-62f)
                lineToRelative(-40f, 5f)
                verticalLineToRelative(57f)
                close()
                moveTo(98f, 600f)
                quadToRelative(-5f, -18f, -9f, -36f)
                reflectiveQuadToRelative(-6f, -37f)
                quadToRelative(-2f, -19f, 11f, -33f)
                reflectiveQuadToRelative(33f, -14f)
                horizontalLineToRelative(33f)
                verticalLineToRelative(-284f)
                quadToRelative(0f, -15f, 10.5f, -26.5f)
                reflectiveQuadTo(196f, 156f)
                lineToRelative(651f, -72f)
                quadToRelative(14f, -2f, 23.5f, 6.5f)
                reflectiveQuadTo(880f, 113f)
                quadToRelative(0f, 11f, -7.5f, 19.5f)
                reflectiveQuadTo(854f, 143f)
                lineToRelative(-434f, 49f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(430f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 290f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 320f)
                horizontalLineTo(420f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(413f)
                quadToRelative(20f, 0f, 33f, 14f)
                reflectiveQuadToRelative(11f, 33f)
                quadToRelative(-2f, 19f, -6f, 37f)
                reflectiveQuadToRelative(-9f, 36f)
                horizontalLineTo(98f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-112f, 0f, -203.5f, -54.5f)
                reflectiveQuadTo(133f, 680f)
                horizontalLineToRelative(694f)
                quadToRelative(-52f, 91f, -143.5f, 145.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Udon!!
    }

private var _Udon: ImageVector? = null

