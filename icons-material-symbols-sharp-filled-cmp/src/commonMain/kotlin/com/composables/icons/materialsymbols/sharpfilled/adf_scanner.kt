package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Adf_scanner: ImageVector
    get() {
        if (_Adf_scanner != null) return _Adf_scanner!!
        
        _Adf_scanner = ImageVector.Builder(
            name = "adf_scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(400f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                close()
            }
        }.build()
        
        return _Adf_scanner!!
    }

private var _Adf_scanner: ImageVector? = null

