package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Railway_alert_2: ImageVector
    get() {
        if (_Railway_alert_2 != null) return _Railway_alert_2!!
        
        _Railway_alert_2 = ImageVector.Builder(
            name = "railway_alert_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                lineToRelative(80f, 80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(320f, -280f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(460f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(340f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(400f, 600f)
                close()
                moveToRelative(280f, -120f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(0f, -82f, 58f, -141f)
                reflectiveQuadToRelative(142f, -59f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 280f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(-20f, -160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(20f, 80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(200f, 760f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(-20f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-260f)
                quadToRelative(0f, -129f, 92.5f, -204.5f)
                reflectiveQuadTo(400f, 40f)
                quadToRelative(29f, 0f, 56.5f, 3.5f)
                reflectiveQuadTo(510f, 55f)
                quadToRelative(-43f, 33f, -71.5f, 80.5f)
                reflectiveQuadTo(402f, 240f)
                horizontalLineTo(177f)
                quadToRelative(-8f, 18f, -12.5f, 37.5f)
                reflectiveQuadTo(160f, 320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(252f)
                quadToRelative(26f, 88f, 99.5f, 144f)
                reflectiveQuadTo(681f, 560f)
                quadToRelative(10f, 0f, 19.5f, -0.5f)
                reflectiveQuadTo(720f, 557f)
                verticalLineToRelative(23f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                horizontalLineToRelative(-20f)
                lineToRelative(40f, 40f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Railway_alert_2!!
    }

private var _Railway_alert_2: ImageVector? = null

