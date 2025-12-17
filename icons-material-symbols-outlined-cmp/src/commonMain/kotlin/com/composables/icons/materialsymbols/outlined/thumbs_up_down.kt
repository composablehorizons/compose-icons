package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Thumbs_up_down: ImageVector
    get() {
        if (_Thumbs_up_down != null) return _Thumbs_up_down!!
        
        _Thumbs_up_down = ImageVector.Builder(
            name = "thumbs_up_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(0f, 480f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -12f, 5f, -23f)
                reflectiveQuadToRelative(13f, -19f)
                lineToRelative(198f, -198f)
                lineToRelative(30f, 30f)
                quadToRelative(6f, 6f, 10f, 15.5f)
                reflectiveQuadToRelative(4f, 18.5f)
                verticalLineToRelative(8f)
                lineToRelative(-28f, 128f)
                horizontalLineToRelative(208f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 240f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 6f, -1f, 11.5f)
                reflectiveQuadToRelative(-3f, 10.5f)
                lineToRelative(-90f, 212f)
                quadToRelative(-7f, 17f, -22.5f, 26.5f)
                reflectiveQuadTo(330f, 560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(238f, -80f)
                lineToRelative(82f, -194f)
                verticalLineToRelative(-6f)
                horizontalLineTo(134f)
                lineToRelative(24f, -108f)
                lineToRelative(-78f, 76f)
                verticalLineToRelative(232f)
                horizontalLineToRelative(238f)
                close()
                moveTo(744f, 960f)
                lineToRelative(-30f, -30f)
                quadToRelative(-6f, -6f, -10f, -15.5f)
                reflectiveQuadTo(700f, 896f)
                verticalLineToRelative(-8f)
                lineToRelative(28f, -128f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 720f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -6f, 1f, -11.5f)
                reflectiveQuadToRelative(3f, -10.5f)
                lineToRelative(90f, -212f)
                quadToRelative(8f, -17f, 23f, -26.5f)
                reflectiveQuadToRelative(33f, -9.5f)
                horizontalLineToRelative(250f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(960f, 480f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 12f, -4.5f, 22.5f)
                reflectiveQuadTo(942f, 762f)
                lineTo(744f, 960f)
                close()
                moveTo(642f, 480f)
                lineToRelative(-82f, 194f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(266f)
                lineToRelative(-24f, 108f)
                lineToRelative(78f, -76f)
                verticalLineToRelative(-232f)
                horizontalLineTo(642f)
                close()
                moveToRelative(-562f, 0f)
                verticalLineToRelative(-232f)
                verticalLineToRelative(232f)
                close()
                moveToRelative(800f, 0f)
                verticalLineToRelative(232f)
                verticalLineToRelative(-232f)
                close()
            }
        }.build()
        
        return _Thumbs_up_down!!
    }

private var _Thumbs_up_down: ImageVector? = null

