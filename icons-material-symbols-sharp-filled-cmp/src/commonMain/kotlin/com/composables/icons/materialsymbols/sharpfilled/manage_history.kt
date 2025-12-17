package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Manage_history: ImageVector
    get() {
        if (_Manage_history != null) return _Manage_history!!
        
        _Manage_history = ImageVector.Builder(
            name = "manage_history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 400f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(94f)
                quadToRelative(51f, -64f, 124.5f, -99f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(150f, 0f, 255f, 105f)
                reflectiveQuadToRelative(105f, 255f)
                horizontalLineToRelative(-80f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-69f, 0f, -129f, 32f)
                reflectiveQuadToRelative(-101f, 88f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(2f, 120f)
                horizontalLineToRelative(82f)
                quadToRelative(12f, 93f, 76.5f, 157.5f)
                reflectiveQuadTo(435f, 756f)
                lineToRelative(48f, 84f)
                quadToRelative(-138f, 0f, -242f, -91.5f)
                reflectiveQuadTo(122f, 520f)
                close()
                moveToRelative(412f, 70f)
                lineToRelative(-94f, -94f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(56f, 56f)
                lineToRelative(-42f, 70f)
                close()
                moveTo(719f, 960f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(663f, 876f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(707f, 620f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 23f, 11.5f)
                reflectiveQuadToRelative(21f, 14.5f)
                lineToRelative(58f, -20f)
                lineToRelative(40f, 70f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 13f, 2f, 25f)
                reflectiveQuadToRelative(-2f, 25f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(811f, 900f)
                lineTo(799f, 960f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(839f, 760f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(759f, 680f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(679f, 760f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(759f, 840f)
                close()
            }
        }.build()
        
        return _Manage_history!!
    }

private var _Manage_history: ImageVector? = null

