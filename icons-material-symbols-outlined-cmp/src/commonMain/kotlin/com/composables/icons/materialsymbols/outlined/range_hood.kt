package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Range_hood: ImageVector
    get() {
        if (_Range_hood != null) return _Range_hood!!
        
        _Range_hood = ImageVector.Builder(
            name = "range_hood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-168f)
                quadToRelative(0f, -16f, 6.5f, -30.5f)
                reflectiveQuadTo(104f, 496f)
                lineToRelative(176f, -176f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                lineToRelative(177f, 177f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(167f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(72f, -320f)
                horizontalLineToRelative(496f)
                lineTo(600f, 352f)
                verticalLineToRelative(-152f)
                horizontalLineTo(360f)
                verticalLineToRelative(152f)
                lineTo(232f, 480f)
                close()
                moveToRelative(-72f, 240f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, -52f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Range_hood!!
    }

private var _Range_hood: ImageVector? = null

