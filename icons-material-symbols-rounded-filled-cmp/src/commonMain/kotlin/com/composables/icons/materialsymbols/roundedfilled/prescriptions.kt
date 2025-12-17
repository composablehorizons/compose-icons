package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Prescriptions: ImageVector
    get() {
        if (_Prescriptions != null) return _Prescriptions!!
        
        _Prescriptions = ImageVector.Builder(
            name = "prescriptions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(735f, 883f)
                lineToRelative(46f, -46f)
                lineToRelative(-178f, -178f)
                lineToRelative(-46f, 46f)
                quadToRelative(-37f, 37f, -37f, 89f)
                reflectiveQuadToRelative(37f, 89f)
                quadToRelative(37f, 37f, 89f, 37f)
                reflectiveQuadToRelative(89f, -37f)
                close()
                moveToRelative(102f, -102f)
                lineToRelative(46f, -46f)
                quadToRelative(37f, -37f, 37f, -89f)
                reflectiveQuadToRelative(-37f, -89f)
                quadToRelative(-37f, -37f, -89f, -37f)
                reflectiveQuadToRelative(-89f, 37f)
                lineToRelative(-46f, 46f)
                lineToRelative(178f, 178f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(200f, -190f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
                moveToRelative(-35f, 670f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(245f)
                quadToRelative(-42f, -10f, -83.5f, -1.5f)
                reflectiveQuadTo(680f, 475f)
                verticalLineToRelative(-35f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(349f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(195f)
                quadToRelative(-23f, 35f, -31.5f, 76.5f)
                reflectiveQuadTo(445f, 840f)
                close()
            }
        }.build()
        
        return _Prescriptions!!
    }

private var _Prescriptions: ImageVector? = null

