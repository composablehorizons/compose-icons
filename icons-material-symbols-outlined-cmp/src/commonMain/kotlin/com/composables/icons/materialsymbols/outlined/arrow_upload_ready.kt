package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Arrow_upload_ready: ImageVector
    get() {
        if (_Arrow_upload_ready != null) return _Arrow_upload_ready!!
        
        _Arrow_upload_ready = ImageVector.Builder(
            name = "arrow_upload_ready",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(170f, 732f)
                quadToRelative(-38f, -45f, -61f, -99f)
                reflectiveQuadTo(80f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(6f, 43f, 22f, 82.5f)
                reflectiveQuadToRelative(42f, 73.5f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(80f, 440f)
                quadToRelative(8f, -59f, 30f, -113f)
                reflectiveQuadToRelative(60f, -99f)
                lineToRelative(56f, 56f)
                quadToRelative(-26f, 34f, -42f, 73.5f)
                reflectiveQuadTo(162f, 440f)
                horizontalLineTo(80f)
                close()
                moveTo(438f, 878f)
                quadToRelative(-59f, -6f, -112.5f, -28.5f)
                reflectiveQuadTo(226f, 790f)
                lineToRelative(56f, -58f)
                quadToRelative(35f, 26f, 74f, 43f)
                reflectiveQuadToRelative(82f, 23f)
                verticalLineToRelative(80f)
                close()
                moveTo(284f, 228f)
                lineToRelative(-58f, -58f)
                quadToRelative(47f, -37f, 101f, -59.5f)
                reflectiveQuadTo(440f, 82f)
                verticalLineToRelative(80f)
                quadToRelative(-43f, 6f, -82.5f, 23f)
                reflectiveQuadTo(284f, 228f)
                close()
                moveTo(518f, 878f)
                verticalLineToRelative(-80f)
                quadToRelative(44f, -6f, 83.5f, -22.5f)
                reflectiveQuadTo(676f, 732f)
                lineToRelative(58f, 58f)
                quadToRelative(-47f, 38f, -101.5f, 60f)
                reflectiveQuadTo(518f, 878f)
                close()
                moveToRelative(160f, -650f)
                quadToRelative(-35f, -26f, -75f, -43f)
                reflectiveQuadToRelative(-83f, -23f)
                verticalLineToRelative(-80f)
                quadToRelative(59f, 6f, 113.5f, 28.5f)
                reflectiveQuadTo(734f, 170f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(112f, 504f)
                lineToRelative(-56f, -56f)
                quadToRelative(26f, -34f, 42f, -73.5f)
                reflectiveQuadToRelative(22f, -82.5f)
                horizontalLineToRelative(82f)
                quadToRelative(-8f, 59f, -30f, 113f)
                reflectiveQuadToRelative(-60f, 99f)
                close()
                moveToRelative(8f, -292f)
                quadToRelative(-6f, -43f, -22f, -82.5f)
                reflectiveQuadTo(734f, 284f)
                lineToRelative(56f, -56f)
                quadToRelative(38f, 45f, 61f, 99f)
                reflectiveQuadToRelative(29f, 113f)
                horizontalLineToRelative(-82f)
                close()
                moveTo(441f, 680f)
                verticalLineToRelative(-247f)
                lineTo(337f, 537f)
                lineToRelative(-56f, -57f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-57f, 56f)
                lineToRelative(-103f, -103f)
                verticalLineToRelative(247f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_upload_ready!!
    }

private var _Arrow_upload_ready: ImageVector? = null

