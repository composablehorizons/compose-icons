package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Pdf_off: ImageVector
    get() {
        if (_Pdf_off != null) return _Pdf_off!!
        
        _Pdf_off = ImageVector.Builder(
            name = "pdf_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 556f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-30f, 140f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(280f, 666f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(380f, 576f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 456f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(220f, 496f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(250f, 696f)
                close()
                moveToRelative(206f, 0f)
                horizontalLineToRelative(80f)
                quadToRelative(13f, 0f, 23f, -7f)
                reflectiveQuadToRelative(15f, -19f)
                lineToRelative(-58f, -58f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-64f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(144f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(456f, 696f)
                close()
                moveTo(200f, 936f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 856f)
                verticalLineTo(296f)
                quadToRelative(0f, -16f, 5.5f, -31f)
                reflectiveQuadToRelative(14.5f, -29f)
                lineToRelative(680f, 680f)
                quadToRelative(-14f, 9f, -29f, 14.5f)
                reflectiveQuadToRelative(-31f, 5.5f)
                horizontalLineTo(200f)
                close()
                moveToRelative(563f, 36f)
                lineTo(84f, 292f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 236f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 972f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 972f)
                close()
                moveToRelative(77f, -149f)
                lineTo(680f, 663f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(30f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(740f, 586f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(710f, 556f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(30f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(740f, 486f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(710f, 456f)
                horizontalLineToRelative(-50f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(620f, 496f)
                verticalLineToRelative(107f)
                lineToRelative(-44f, -44f)
                verticalLineToRelative(-63f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(536f, 456f)
                horizontalLineToRelative(-63f)
                lineTo(233f, 216f)
                horizontalLineToRelative(527f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 296f)
                verticalLineToRelative(527f)
                close()
            }
        }.build()
        
        return _Pdf_off!!
    }

private var _Pdf_off: ImageVector? = null

