package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Toys: ImageVector
    get() {
        if (_Toys != null) return _Toys!!
        
        _Toys = ImageVector.Builder(
            name = "toys",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                quadToRelative(-45f, 0f, -78.5f, -28.5f)
                reflectiveQuadTo(162f, 698f)
                quadToRelative(-38f, -20f, -60f, -57f)
                reflectiveQuadToRelative(-22f, -81f)
                quadToRelative(0f, -53f, 30.5f, -94.5f)
                reflectiveQuadTo(192f, 408f)
                lineToRelative(-72f, -72f)
                lineToRelative(-12f, 12f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(80f, -80f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-12f, 12f)
                lineToRelative(56f, 56f)
                lineToRelative(32f, -94f)
                quadToRelative(12f, -37f, 43.5f, -59.5f)
                reflectiveQuadTo(378f, 160f)
                horizontalLineToRelative(204f)
                quadToRelative(39f, 0f, 70.5f, 22.5f)
                reflectiveQuadTo(696f, 242f)
                lineToRelative(54f, 162f)
                quadToRelative(57f, 11f, 93.5f, 55f)
                reflectiveQuadTo(880f, 560f)
                quadToRelative(0f, 44f, -22f, 81f)
                reflectiveQuadToRelative(-60f, 57f)
                quadToRelative(-6f, 45f, -39.5f, 73.5f)
                reflectiveQuadTo(680f, 800f)
                quadToRelative(-38f, 0f, -68.5f, -22f)
                reflectiveQuadTo(568f, 720f)
                horizontalLineTo(392f)
                quadToRelative(-13f, 36f, -43.5f, 58f)
                reflectiveQuadTo(280f, 800f)
                close()
                moveToRelative(16f, -400f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-62f)
                quadToRelative(-13f, 0f, -23f, 7.5f)
                reflectiveQuadTo(340f, 268f)
                lineToRelative(-44f, 132f)
                close()
                moveToRelative(224f, 0f)
                horizontalLineToRelative(144f)
                lineToRelative(-44f, -132f)
                quadToRelative(-5f, -13f, -15f, -20.5f)
                reflectiveQuadToRelative(-23f, -7.5f)
                horizontalLineToRelative(-62f)
                verticalLineToRelative(160f)
                close()
                moveTo(280f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(400f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(680f, 720f)
                close()
            }
        }.build()
        
        return _Toys!!
    }

private var _Toys: ImageVector? = null

