package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_flash: ImageVector
    get() {
        if (_No_flash != null) return _No_flash!!
        
        _No_flash = ImageVector.Builder(
            name = "no_flash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineToRelative(-72f, -71f)
                quadToRelative(-4f, 21f, -20.5f, 34.5f)
                reflectiveQuadTo(660f, 880f)
                horizontalLineTo(140f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(80f, 820f)
                verticalLineToRelative(-384f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(140f, 376f)
                horizontalLineToRelative(106f)
                lineToRelative(8f, -9f)
                lineTo(55f, 168f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(160f, 800f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-47f)
                lineTo(537f, 650f)
                quadToRelative(-11f, 48f, -48.5f, 79f)
                reflectiveQuadTo(400f, 760f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -51f, 31f, -88.5f)
                reflectiveQuadToRelative(79f, -48.5f)
                lineToRelative(-27f, -27f)
                horizontalLineTo(160f)
                verticalLineToRelative(344f)
                close()
                moveToRelative(240f, -120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(460f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(400f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(340f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(400f, 680f)
                close()
                moveToRelative(320f, -244f)
                verticalLineToRelative(73f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 549f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(640f, 508f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(-69f)
                lineToRelative(-68f, -68f)
                quadToRelative(-14f, -14f, -12.5f, -29.5f)
                reflectiveQuadTo(503f, 332f)
                quadToRelative(11f, -11f, 26.5f, -12.5f)
                reflectiveQuadTo(559f, 332f)
                lineToRelative(45f, 44f)
                horizontalLineToRelative(56f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 436f)
                close()
                moveToRelative(40f, -156f)
                horizontalLineToRelative(-20f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(109f)
                quadToRelative(11f, 0f, 17.5f, 9f)
                reflectiveQuadToRelative(1.5f, 19f)
                lineToRelative(-52f, 116f)
                horizontalLineToRelative(30f)
                quadToRelative(11f, 0f, 16.5f, 10f)
                reflectiveQuadToRelative(0.5f, 20f)
                lineToRelative(-84f, 152f)
                quadToRelative(-4f, 7f, -11.5f, 5f)
                reflectiveQuadToRelative(-7.5f, -10f)
                verticalLineToRelative(-121f)
                close()
                moveTo(640f, 525f)
                close()
                moveToRelative(-148f, 79f)
                close()
            }
        }.build()
        
        return _No_flash!!
    }

private var _No_flash: ImageVector? = null

