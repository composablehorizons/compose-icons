package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Image_inset: ImageVector
    get() {
        if (_Image_inset != null) return _Image_inset!!
        
        _Image_inset = ImageVector.Builder(
            name = "image_inset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-320f)
                horizontalLineTo(240f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-80f, 160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -240f)
                lineToRelative(85f, -113f)
                lineToRelative(55f, 73f)
                lineToRelative(75f, -100f)
                lineToRelative(105f, 140f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Image_inset!!
    }

private var _Image_inset: ImageVector? = null

