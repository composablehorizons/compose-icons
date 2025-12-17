package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Media_output_off: ImageVector
    get() {
        if (_Media_output_off != null) return _Media_output_off!!
        
        _Media_output_off = ImageVector.Builder(
            name = "media_output_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 400f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -51f, 19f, -94.5f)
                reflectiveQuadToRelative(51f, -75.5f)
                lineToRelative(43f, 43f)
                quadToRelative(-25f, 25f, -39f, 57f)
                reflectiveQuadToRelative(-14f, 70f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(200f)
                horizontalLineTo(400f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(503f, -331f)
                lineToRelative(-46f, -46f)
                quadToRelative(23f, -11f, 49f, -17f)
                reflectiveQuadToRelative(54f, -6f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(126f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(640f, 460f)
                quadToRelative(-15f, 0f, -29f, 2f)
                reflectiveQuadToRelative(-28f, 7f)
                close()
                moveTo(320f, 679f)
                quadToRelative(-51f, -8f, -85.5f, -46.5f)
                reflectiveQuadTo(200f, 540f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(19f, 0f, 36.5f, 4.5f)
                reflectiveQuadTo(409f, 418f)
                quadToRelative(-14f, 15f, -26.5f, 31.5f)
                reflectiveQuadTo(360f, 484f)
                quadToRelative(-5f, -2f, -10f, -3f)
                reflectiveQuadToRelative(-10f, -1f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 540f)
                quadToRelative(0f, 20f, 12f, 36f)
                reflectiveQuadToRelative(31f, 21f)
                quadToRelative(-2f, 11f, -2.5f, 21.5f)
                reflectiveQuadTo(320f, 640f)
                verticalLineToRelative(39f)
                close()
                moveToRelative(-46f, -519f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(406f)
                verticalLineToRelative(242f)
                quadToRelative(-21f, 2f, -41f, 7.5f)
                reflectiveQuadTo(520f, 343f)
                verticalLineToRelative(-183f)
                horizontalLineTo(274f)
                close()
                moveToRelative(137f, 102f)
                close()
                moveTo(820f, 932f)
                lineTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Media_output_off!!
    }

private var _Media_output_off: ImageVector? = null

