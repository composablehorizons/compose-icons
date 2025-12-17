package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.No_transfer: ImageVector
    get() {
        if (_No_transfer != null) return _No_transfer!!
        
        _No_transfer = ImageVector.Builder(
            name = "no_transfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 780f)
                verticalLineToRelative(-62f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-347f)
                lineToRelative(-76f, -76f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(679f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineTo(652f, 765f)
                horizontalLineToRelative(114f)
                verticalLineToRelative(12f)
                quadToRelative(0f, 26f, -18.5f, 44.5f)
                reflectiveQuadTo(703f, 840f)
                quadToRelative(-26f, 0f, -44.5f, -18.5f)
                reflectiveQuadTo(640f, 777f)
                verticalLineToRelative(-17f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(247f)
                lineTo(367f, 480f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 680f)
                close()
                moveToRelative(160f, -600f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(562f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(522f, 440f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(158f)
                verticalLineToRelative(-120f)
                horizontalLineTo(400f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(306f)
                quadToRelative(-15f, -17f, -64.5f, -28.5f)
                reflectiveQuadTo(482f, 160f)
                quadToRelative(-61f, 0f, -102f, 3.5f)
                reflectiveQuadTo(312f, 174f)
                quadToRelative(-17f, 5f, -28.5f, -5f)
                reflectiveQuadTo(268f, 145f)
                quadToRelative(-4f, -14f, 3.5f, -29.5f)
                reflectiveQuadTo(300f, 95f)
                quadToRelative(35f, -9f, 80f, -12f)
                reflectiveQuadToRelative(100f, -3f)
                close()
                moveTo(340f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                close()
                moveTo(240f, 400f)
                horizontalLineToRelative(47f)
                lineToRelative(-47f, -47f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(75f, -200f)
                horizontalLineToRelative(391f)
                horizontalLineToRelative(-391f)
                close()
                moveToRelative(52f, 280f)
                close()
                moveToRelative(228f, 0f)
                close()
            }
        }.build()
        
        return _No_transfer!!
    }

private var _No_transfer: ImageVector? = null

