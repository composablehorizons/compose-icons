package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Wb_twilight: ImageVector
    get() {
        if (_Wb_twilight != null) return _Wb_twilight!!
        
        _Wb_twilight = ImageVector.Builder(
            name = "wb_twilight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(734f, 404f)
                lineToRelative(-56f, -58f)
                lineToRelative(86f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-86f, 86f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(360f, -520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(226f, 402f)
                lineToRelative(-84f, -86f)
                lineToRelative(56f, -56f)
                lineToRelative(86f, 86f)
                lineToRelative(-58f, 56f)
                close()
                moveToRelative(71f, 158f)
                horizontalLineToRelative(366f)
                quadToRelative(-23f, -54f, -72f, -87f)
                reflectiveQuadToRelative(-111f, -33f)
                quadToRelative(-62f, 0f, -111f, 33f)
                reflectiveQuadToRelative(-72f, 87f)
                close()
                moveToRelative(-97f, 80f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -80f)
                close()
            }
        }.build()
        
        return _Wb_twilight!!
    }

private var _Wb_twilight: ImageVector? = null

