package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Texture_add: ImageVector
    get() {
        if (_Texture_add != null) return _Texture_add!!
        
        _Texture_add = ImageVector.Builder(
            name = "texture_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 840f)
                horizontalLineToRelative(-56f)
                verticalLineToRelative(-56f)
                lineToRelative(664f, -664f)
                horizontalLineToRelative(57f)
                verticalLineToRelative(56f)
                lineTo(176f, 840f)
                close()
                moveToRelative(-56f, -252f)
                verticalLineToRelative(-112f)
                lineToRelative(356f, -356f)
                horizontalLineToRelative(112f)
                lineTo(120f, 588f)
                close()
                moveToRelative(0f, -308f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                lineTo(120f, 280f)
                close()
                moveToRelative(720f, 92f)
                verticalLineToRelative(112f)
                lineToRelative(-19f, 19f)
                quadToRelative(-20f, -10f, -42.5f, -15.5f)
                reflectiveQuadTo(732f, 480f)
                lineToRelative(108f, -108f)
                close()
                moveTo(372f, 840f)
                lineToRelative(108f, -108f)
                quadToRelative(2f, 24f, 7.5f, 46.5f)
                reflectiveQuadTo(503f, 821f)
                lineToRelative(-19f, 19f)
                horizontalLineTo(372f)
                close()
                moveToRelative(308f, -80f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                close()
            }
        }.build()
        
        return _Texture_add!!
    }

private var _Texture_add: ImageVector? = null

