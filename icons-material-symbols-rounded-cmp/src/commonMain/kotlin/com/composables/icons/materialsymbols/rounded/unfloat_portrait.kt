package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Unfloat_portrait: ImageVector
    get() {
        if (_Unfloat_portrait != null) return _Unfloat_portrait!!
        
        _Unfloat_portrait = ImageVector.Builder(
            name = "unfloat_portrait",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 976f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 896f)
                verticalLineTo(256f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 176f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 256f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 616f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 576f)
                verticalLineTo(256f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 936f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 976f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -504f)
                lineToRelative(95f, 95f)
                quadToRelative(12f, 12f, 28.5f, 12f)
                reflectiveQuadToRelative(28.5f, -12f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(552f, 510f)
                lineToRelative(-95f, -94f)
                horizontalLineToRelative(63f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 376f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 336f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 376f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 576f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 536f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(240f, 504f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 936f)
                verticalLineTo(736f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 696f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 736f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 976f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-120f, -80f)
                horizontalLineTo(240f)
                verticalLineTo(256f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(360f)
                horizontalLineTo(600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 696f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Unfloat_portrait!!
    }

private var _Unfloat_portrait: ImageVector? = null

