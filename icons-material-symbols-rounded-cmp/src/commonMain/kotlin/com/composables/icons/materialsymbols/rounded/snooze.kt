package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Snooze: ImageVector
    get() {
        if (_Snooze != null) return _Snooze!!
        
        _Snooze = ImageVector.Builder(
            name = "snooze",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(468f, 566f)
                lineToRelative(107f, -120f)
                quadToRelative(1f, -1f, 5f, -14f)
                verticalLineToRelative(-16f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(550f, 386f)
                horizontalLineTo(410f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(380f, 416f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 446f)
                horizontalLineToRelative(84f)
                lineTo(385f, 568f)
                quadToRelative(-1f, 1f, -5f, 14f)
                verticalLineToRelative(14f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(410f, 626f)
                horizontalLineToRelative(140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(580f, 596f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(550f, 566f)
                horizontalLineToRelative(-82f)
                close()
                moveToRelative(12f, 314f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 520f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -360f)
                close()
                moveTo(82f, 292f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(114f, -114f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(138f, 292f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(796f, 0f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(708f, 178f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(114f, 114f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveTo(480f, 800f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Snooze!!
    }

private var _Snooze: ImageVector? = null

