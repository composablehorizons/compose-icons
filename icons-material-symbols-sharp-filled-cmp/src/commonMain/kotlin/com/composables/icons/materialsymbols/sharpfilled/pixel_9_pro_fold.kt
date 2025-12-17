package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pixel_9_pro_fold: ImageVector
    get() {
        if (_Pixel_9_pro_fold != null) return _Pixel_9_pro_fold!!
        
        _Pixel_9_pro_fold = ImageVector.Builder(
            name = "pixel_9_pro_fold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-560f)
                horizontalLineTo(480f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-80f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(240f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(600f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(640f, 320f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Pixel_9_pro_fold!!
    }

private var _Pixel_9_pro_fold: ImageVector? = null

