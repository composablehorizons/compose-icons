package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ecg_heart: ImageVector
    get() {
        if (_Ecg_heart != null) return _Ecg_heart!!
        
        _Ecg_heart = ImageVector.Builder(
            name = "ecg_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(645f, 120f)
                quadToRelative(100f, 0f, 167.5f, 74f)
                reflectiveQuadTo(880f, 370f)
                quadToRelative(0f, 18f, -2f, 35.5f)
                reflectiveQuadToRelative(-7f, 34.5f)
                horizontalLineTo(621f)
                lineToRelative(-67f, -102f)
                horizontalLineToRelative(-72f)
                lineToRelative(-54f, 172f)
                lineToRelative(-47f, -70f)
                horizontalLineTo(89f)
                quadToRelative(-5f, -17f, -7f, -34.5f)
                reflectiveQuadTo(80f, 371f)
                quadToRelative(0f, -103f, 67f, -177f)
                reflectiveQuadToRelative(167f, -74f)
                quadToRelative(48f, 0f, 90.5f, 19f)
                reflectiveQuadToRelative(75.5f, 53f)
                quadToRelative(32f, -34f, 74.5f, -53f)
                reflectiveQuadToRelative(90.5f, -19f)
                close()
                moveTo(479f, 878f)
                lineTo(148f, 545f)
                quadToRelative(-6f, -6f, -11f, -12f)
                reflectiveQuadToRelative(-10f, -13f)
                horizontalLineToRelative(211f)
                lineToRelative(69f, 103f)
                horizontalLineToRelative(71f)
                lineToRelative(54f, -173f)
                lineToRelative(46f, 70f)
                horizontalLineToRelative(254f)
                lineToRelative(-10f, 12f)
                lineToRelative(-10f, 12f)
                lineTo(479f, 878f)
                close()
            }
        }.build()
        
        return _Ecg_heart!!
    }

private var _Ecg_heart: ImageVector? = null

