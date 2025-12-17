package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Alarm_off: ImageVector
    get() {
        if (_Alarm_off != null) return _Alarm_off!!
        
        _Alarm_off = ImageVector.Builder(
            name = "alarm_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(798f, 690f)
                lineToRelative(-60f, -60f)
                quadToRelative(11f, -27f, 16.5f, -52.5f)
                reflectiveQuadTo(760f, 524f)
                quadToRelative(0f, -116f, -82f, -200f)
                reflectiveQuadToRelative(-198f, -84f)
                quadToRelative(-28f, 0f, -54f, 4.5f)
                reflectiveQuadTo(374f, 260f)
                lineToRelative(-60f, -60f)
                quadToRelative(38f, -20f, 79.5f, -30f)
                reflectiveQuadToRelative(86.5f, -10f)
                quadToRelative(74f, 0f, 139.5f, 28f)
                reflectiveQuadTo(734f, 265.5f)
                quadTo(783f, 315f, 811.5f, 381f)
                reflectiveQuadTo(840f, 524f)
                quadToRelative(0f, 45f, -11f, 86.5f)
                reflectiveQuadTo(798f, 690f)
                close()
                moveToRelative(52f, -370f)
                lineTo(680f, 150f)
                lineToRelative(56f, -56f)
                lineToRelative(170f, 170f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(820f, 936f)
                lineTo(694f, 810f)
                quadToRelative(-45f, 33f, -99.5f, 51.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-74f, 0f, -139.5f, -28f)
                reflectiveQuadTo(226f, 776f)
                quadToRelative(-49f, -48f, -77.5f, -113f)
                reflectiveQuadTo(120f, 524f)
                quadToRelative(0f, -62f, 18.5f, -116.5f)
                reflectiveQuadTo(192f, 308f)
                lineToRelative(-34f, -34f)
                lineToRelative(-48f, 48f)
                lineToRelative(-56f, -56f)
                lineToRelative(48f, -48f)
                lineToRelative(-74f, -74f)
                lineToRelative(56f, -56f)
                lineTo(876f, 880f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 801f)
                quadToRelative(42f, 0f, 82f, -13f)
                reflectiveQuadToRelative(74f, -36f)
                lineTo(248f, 366f)
                quadToRelative(-23f, 35f, -35.5f, 75.5f)
                reflectiveQuadTo(200f, 524f)
                quadToRelative(0f, 116f, 82f, 196.5f)
                reflectiveQuadTo(480f, 801f)
                close()
                moveToRelative(-38f, -242f)
                close()
                moveToRelative(114f, -114f)
                close()
            }
        }.build()
        
        return _Alarm_off!!
    }

private var _Alarm_off: ImageVector? = null

