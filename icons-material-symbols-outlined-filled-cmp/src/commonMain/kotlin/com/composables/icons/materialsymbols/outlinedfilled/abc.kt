package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Abc: ImageVector
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
                moveTo(680f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 560f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 400f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineTo(680f)
                close()
                moveToRelative(-300f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(160f)
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
                horizontalLineTo(380f)
                close()
                moveToRelative(60f, -150f)
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
                moveToRelative(-320f, 60f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Abc!!
    }

private var _Abc: ImageVector? = null

