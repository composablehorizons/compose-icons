package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Toys: ImageVector
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
                horizontalLineTo(80f)
                verticalLineToRelative(-290f)
                horizontalLineToRelative(112f)
                lineToRelative(-72f, -72f)
                lineToRelative(-40f, 40f)
                lineToRelative(-56f, -56f)
                lineToRelative(136f, -136f)
                lineToRelative(56f, 56f)
                lineToRelative(-40f, 40f)
                lineToRelative(56f, 56f)
                lineToRelative(60f, -176f)
                horizontalLineToRelative(377f)
                lineToRelative(81f, 244f)
                horizontalLineToRelative(130f)
                verticalLineToRelative(294f)
                horizontalLineToRelative(-82f)
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
                horizontalLineToRelative(-91f)
                lineToRelative(-53f, 160f)
                close()
                moveToRelative(224f, 0f)
                horizontalLineToRelative(144f)
                lineToRelative(-53f, -160f)
                horizontalLineToRelative(-91f)
                verticalLineToRelative(160f)
                close()
                moveTo(392f, 640f)
                horizontalLineToRelative(176f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(30f, 0f, 56f, 14f)
                reflectiveQuadToRelative(44f, 38f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-132f)
                horizontalLineTo(160f)
                verticalLineToRelative(132f)
                horizontalLineToRelative(20f)
                quadToRelative(18f, -24f, 44f, -38f)
                reflectiveQuadToRelative(56f, -14f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                close()
                moveToRelative(-112f, 80f)
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
                moveTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Toys!!
    }

private var _Toys: ImageVector? = null

