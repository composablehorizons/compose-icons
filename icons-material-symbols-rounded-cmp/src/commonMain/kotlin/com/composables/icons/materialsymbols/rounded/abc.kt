package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Abc: ImageVector
    get() {
        if (_Abc != null) return _Abc!!
        
        _Abc = ImageVector.Builder(
            name = "abc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 600f)
                quadToRelative(-8f, 0f, -14f, -6f)
                reflectiveQuadToRelative(-6f, -14f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -8f, 6f, -14f)
                reflectiveQuadToRelative(14f, -6f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 400f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(580f, 520f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(540f, 600f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -150f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(0f, 90f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                close()
                moveToRelative(-290f, 60f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(120f, 570f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(290f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(260f, 570f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(150f, 600f)
                close()
                moveToRelative(30f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(500f, 120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(810f, 450f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(780f, 420f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(810f, 510f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(840f, 540f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Abc!!
    }

private var _Abc: ImageVector? = null

