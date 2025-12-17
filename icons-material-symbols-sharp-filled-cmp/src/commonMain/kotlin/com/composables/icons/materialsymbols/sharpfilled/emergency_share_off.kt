package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Emergency_share_off: ImageVector
    get() {
        if (_Emergency_share_off != null) return _Emergency_share_off!!
        
        _Emergency_share_off = ImageVector.Builder(
            name = "emergency_share_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(735f, 186f)
                quadToRelative(-51f, -51f, -117f, -78.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(-59f, 0f, -113.5f, 18f)
                reflectiveQuadTo(265f, 151f)
                lineToRelative(-57f, -57f)
                quadToRelative(58f, -46f, 127.5f, -70f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(88f, 0f, 168f, 33f)
                reflectiveQuadToRelative(143f, 96f)
                lineToRelative(-56f, 57f)
                close()
                moveTo(622f, 298f)
                quadToRelative(-29f, -29f, -65.5f, -43.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-26f, 0f, -51.5f, 6.5f)
                reflectiveQuadTo(380f, 266f)
                lineToRelative(-58f, -57f)
                quadToRelative(35f, -23f, 75f, -36f)
                reflectiveQuadToRelative(83f, -13f)
                quadToRelative(56f, 0f, 107f, 21f)
                reflectiveQuadToRelative(91f, 61f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(98f, 310f)
                lineTo(473f, 360f)
                horizontalLineToRelative(7f)
                quadToRelative(101f, 0f, 170.5f, 72f)
                reflectiveQuadTo(720f, 606f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(128f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-133f, -133f)
                quadToRelative(-30f, 45f, -74.5f, 91.5f)
                reflectiveQuadTo(480f, 960f)
                quadTo(359f, 857f, 299.5f, 769f)
                reflectiveQuadTo(240f, 606f)
                quadToRelative(0f, -56f, 23f, -104.5f)
                reflectiveQuadToRelative(61f, -82.5f)
                horizontalLineToRelative(95f)
                lineToRelative(241f, 241f)
                horizontalLineTo(548f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                close()
                moveTo(480f, 660f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 600f)
                quadToRelative(0f, -12f, -4.5f, -23f)
                reflectiveQuadToRelative(-13f, -19.5f)
                quadToRelative(-8.5f, -8.5f, -19.5f, -13f)
                reflectiveQuadToRelative(-23f, -4.5f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 600f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 660f)
                close()
            }
        }.build()
        
        return _Emergency_share_off!!
    }

private var _Emergency_share_off: ImageVector? = null

