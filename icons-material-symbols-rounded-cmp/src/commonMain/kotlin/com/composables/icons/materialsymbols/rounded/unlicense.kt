package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Unlicense: ImageVector
    get() {
        if (_Unlicense != null) return _Unlicense!!
        
        _Unlicense = ImageVector.Builder(
            name = "unlicense",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(722f, 608f)
                lineToRelative(-56f, -56f)
                quadToRelative(26f, -32f, 40f, -70f)
                reflectiveQuadToRelative(14f, -82f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-44f, 0f, -82f, 14f)
                reflectiveQuadToRelative(-70f, 40f)
                lineToRelative(-56f, -56f)
                quadToRelative(42f, -36f, 95f, -57f)
                reflectiveQuadToRelative(113f, -21f)
                quadToRelative(133f, 0f, 226.5f, 93.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(0f, 60f, -21f, 113f)
                reflectiveQuadToRelative(-57f, 95f)
                close()
                moveTo(580f, 466f)
                lineTo(414f, 300f)
                quadToRelative(14f, -9f, 31f, -14.5f)
                reflectiveQuadToRelative(35f, -5.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 18f, -5.5f, 35f)
                reflectiveQuadTo(580f, 466f)
                close()
                moveTo(480f, 840f)
                lineTo(293f, 902f)
                quadToRelative(-20f, 7f, -36.5f, -5f)
                reflectiveQuadTo(240f, 865f)
                verticalLineToRelative(-253f)
                quadToRelative(-38f, -44f, -59f, -97f)
                reflectiveQuadToRelative(-21f, -115f)
                quadToRelative(0f, -29f, 4.5f, -55.5f)
                reflectiveQuadTo(180f, 292f)
                lineToRelative(-96f, -96f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(820f, 876f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(764f, 877f)
                lineToRelative(-44f, -43f)
                verticalLineToRelative(31f)
                quadToRelative(0f, 20f, -16.5f, 32f)
                reflectiveQuadTo(667f, 902f)
                lineToRelative(-187f, -62f)
                close()
                moveToRelative(0f, -200f)
                quadToRelative(11f, 0f, 21f, -1f)
                reflectiveQuadToRelative(21f, -3f)
                lineTo(244f, 358f)
                quadToRelative(-2f, 11f, -3f, 21f)
                reflectiveQuadToRelative(-1f, 21f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveTo(320f, 810f)
                lineToRelative(160f, -54f)
                lineToRelative(160f, 54f)
                verticalLineToRelative(-56f)
                lineToRelative(-52f, -54f)
                quadToRelative(-26f, 9f, -52.5f, 14.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-44f, 0f, -84f, -11f)
                reflectiveQuadToRelative(-76f, -31f)
                verticalLineToRelative(132f)
                close()
                moveToRelative(160f, -66f)
                close()
            }
        }.build()
        
        return _Unlicense!!
    }

private var _Unlicense: ImageVector? = null

