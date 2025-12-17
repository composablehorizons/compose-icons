package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Child_hat: ImageVector
    get() {
        if (_Child_hat != null) return _Child_hat!!
        
        _Child_hat = ImageVector.Builder(
            name = "child_hat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(-60f, 0f, -108.5f, -33f)
                reflectiveQuadTo(300f, 600f)
                horizontalLineToRelative(360f)
                quadToRelative(-23f, 54f, -71.5f, 87f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveTo(380f, 540f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(330f, 490f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(430f, 490f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(380f, 540f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(530f, 490f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(580f, 440f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(630f, 490f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(580f, 540f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-149f, 0f, -253.5f, -103.5f)
                reflectiveQuadTo(120f, 524f)
                lineToRelative(81f, -30f)
                quadToRelative(-1f, 7f, -1f, 13f)
                verticalLineToRelative(13f)
                quadToRelative(0f, 117f, 81.5f, 198.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(117f, 0f, 198.5f, -81.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -16f, -1.5f, -31.5f)
                reflectiveQuadTo(753f, 458f)
                quadToRelative(-60f, -7f, -113.5f, -30.5f)
                reflectiveQuadTo(541f, 366f)
                lineToRelative(213f, -80f)
                quadToRelative(41f, 48f, 63.5f, 107.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(136f, 455f)
                quadToRelative(-7f, -20f, -11.5f, -41f)
                reflectiveQuadToRelative(-4.5f, -43f)
                quadToRelative(0f, -91f, 51f, -163f)
                reflectiveQuadToRelative(129f, -112f)
                quadToRelative(-2f, -4f, -2.5f, -7.5f)
                reflectiveQuadToRelative(-0.5f, -8.5f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(337f, 40f)
                quadToRelative(14f, 0f, 24f, 8f)
                reflectiveQuadToRelative(14f, 20f)
                quadToRelative(22f, -5f, 43.5f, -8f)
                reflectiveQuadToRelative(44.5f, -3f)
                quadToRelative(67f, 0f, 127.5f, 26f)
                reflectiveQuadTo(697f, 158f)
                lineToRelative(122f, -46f)
                lineToRelative(28f, 75f)
                lineToRelative(-711f, 268f)
                close()
            }
        }.build()
        
        return _Child_hat!!
    }

private var _Child_hat: ImageVector? = null

