package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Explosion: ImageVector
    get() {
        if (_Explosion != null) return _Explosion!!
        
        _Explosion = ImageVector.Builder(
            name = "explosion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(421f, 620f)
                lineToRelative(31f, 30f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(31f, -30f)
                horizontalLineToRelative(41f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(620f, 580f)
                verticalLineToRelative(-41f)
                lineToRelative(30f, -31f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                lineToRelative(-30f, -31f)
                verticalLineToRelative(-41f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(580f, 340f)
                horizontalLineToRelative(-41f)
                lineToRelative(-38f, -37f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                lineToRelative(-38f, 37f)
                horizontalLineToRelative(-41f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 380f)
                verticalLineToRelative(41f)
                lineToRelative(-30f, 31f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                lineToRelative(30f, 31f)
                verticalLineToRelative(41f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 620f)
                horizontalLineToRelative(41f)
                close()
                moveToRelative(-75f, 180f)
                horizontalLineTo(240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-106f)
                lineToRelative(-77f, -78f)
                quadToRelative(-11f, -12f, -17f, -26.5f)
                reflectiveQuadTo(60f, 480f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadTo(83f, 424f)
                lineToRelative(77f, -78f)
                verticalLineToRelative(-106f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                horizontalLineToRelative(106f)
                lineToRelative(78f, -77f)
                quadToRelative(12f, -11f, 26.5f, -17f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(15f, 0f, 29.5f, 6f)
                reflectiveQuadToRelative(26.5f, 17f)
                lineToRelative(78f, 77f)
                horizontalLineToRelative(106f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(106f)
                lineToRelative(77f, 78f)
                quadToRelative(11f, 12f, 17f, 26.5f)
                reflectiveQuadToRelative(6f, 29.5f)
                quadToRelative(0f, 15f, -6f, 29.5f)
                reflectiveQuadTo(877f, 536f)
                lineToRelative(-77f, 78f)
                verticalLineToRelative(106f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineTo(614f)
                lineToRelative(-78f, 77f)
                quadToRelative(-12f, 11f, -26.5f, 17f)
                reflectiveQuadTo(480f, 900f)
                quadToRelative(-15f, 0f, -29.5f, -6f)
                reflectiveQuadTo(424f, 877f)
                lineToRelative(-78f, -77f)
                close()
                moveToRelative(34f, -80f)
                lineToRelative(100f, 100f)
                lineToRelative(100f, -100f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(-140f)
                lineToRelative(100f, -100f)
                lineToRelative(-100f, -100f)
                verticalLineToRelative(-140f)
                horizontalLineTo(580f)
                lineTo(480f, 140f)
                lineTo(380f, 240f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                lineTo(140f, 480f)
                lineToRelative(100f, 100f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(140f)
                close()
                moveToRelative(100f, -240f)
                close()
            }
        }.build()
        
        return _Explosion!!
    }

private var _Explosion: ImageVector? = null

