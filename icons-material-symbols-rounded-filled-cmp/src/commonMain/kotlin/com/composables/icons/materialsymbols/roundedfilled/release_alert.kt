package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Release_alert: ImageVector
    get() {
        if (_Release_alert != null) return _Release_alert!!
        
        _Release_alert = ImageVector.Builder(
            name = "release_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(326f, 870f)
                lineToRelative(-58f, -98f)
                lineToRelative(-110f, -24f)
                quadToRelative(-15f, -3f, -24f, -15.5f)
                reflectiveQuadToRelative(-7f, -27.5f)
                lineToRelative(11f, -113f)
                lineToRelative(-75f, -86f)
                quadToRelative(-10f, -11f, -10f, -26f)
                reflectiveQuadToRelative(10f, -26f)
                lineToRelative(75f, -86f)
                lineToRelative(-11f, -113f)
                quadToRelative(-2f, -15f, 7f, -27.5f)
                reflectiveQuadToRelative(24f, -15.5f)
                lineToRelative(110f, -24f)
                lineToRelative(58f, -98f)
                quadToRelative(8f, -13f, 22f, -17.5f)
                reflectiveQuadToRelative(28f, 1.5f)
                lineToRelative(104f, 44f)
                lineToRelative(104f, -44f)
                quadToRelative(14f, -6f, 28f, -1.5f)
                reflectiveQuadToRelative(22f, 17.5f)
                lineToRelative(58f, 98f)
                lineToRelative(110f, 24f)
                quadToRelative(15f, 3f, 24f, 15.5f)
                reflectiveQuadToRelative(7f, 27.5f)
                lineToRelative(-11f, 113f)
                lineToRelative(75f, 86f)
                quadToRelative(10f, 11f, 10f, 26f)
                reflectiveQuadToRelative(-10f, 26f)
                lineToRelative(-75f, 86f)
                lineToRelative(11f, 113f)
                quadToRelative(2f, 15f, -7f, 27.5f)
                reflectiveQuadTo(802f, 748f)
                lineToRelative(-110f, 24f)
                lineToRelative(-58f, 98f)
                quadToRelative(-8f, 13f, -22f, 17.5f)
                reflectiveQuadTo(584f, 886f)
                lineToRelative(-104f, -44f)
                lineToRelative(-104f, 44f)
                quadToRelative(-14f, 6f, -28f, 1.5f)
                reflectiveQuadTo(326f, 870f)
                close()
                moveToRelative(154f, -190f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 480f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                close()
            }
        }.build()
        
        return _Release_alert!!
    }

private var _Release_alert: ImageVector? = null

