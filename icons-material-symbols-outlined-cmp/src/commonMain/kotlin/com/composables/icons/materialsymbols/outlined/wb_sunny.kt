package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wb_sunny: ImageVector
    get() {
        if (_Wb_sunny != null) return _Wb_sunny!!
        
        _Wb_sunny = ImageVector.Builder(
            name = "wb_sunny",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, -400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(800f)
                close()
                moveToRelative(-760f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(708f, -252f)
                lineToRelative(-56f, -56f)
                lineToRelative(70f, -72f)
                lineToRelative(58f, 58f)
                lineToRelative(-72f, 70f)
                close()
                moveTo(198f, 820f)
                lineToRelative(-58f, -58f)
                lineToRelative(72f, -70f)
                lineToRelative(56f, 56f)
                lineToRelative(-70f, 72f)
                close()
                moveToRelative(564f, 0f)
                lineToRelative(-70f, -72f)
                lineToRelative(56f, -56f)
                lineToRelative(72f, 70f)
                lineToRelative(-58f, 58f)
                close()
                moveTo(212f, 268f)
                lineToRelative(-72f, -70f)
                lineToRelative(58f, -58f)
                lineToRelative(70f, 72f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(268f, 452f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(67f, 0f, 113.5f, -46.5f)
                reflectiveQuadTo(640f, 480f)
                quadToRelative(0f, -67f, -46.5f, -113.5f)
                reflectiveQuadTo(480f, 320f)
                quadToRelative(-67f, 0f, -113.5f, 46.5f)
                reflectiveQuadTo(320f, 480f)
                quadToRelative(0f, 67f, 46.5f, 113.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -160f)
                close()
            }
        }.build()
        
        return _Wb_sunny!!
    }

private var _Wb_sunny: ImageVector? = null

