package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pdf_off: ImageVector
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
                moveToRelative(-60f, 140f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(380f, 576f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(340f, 456f)
                horizontalLineTo(220f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(196f, 0f)
                horizontalLineToRelative(120f)
                quadToRelative(13f, 0f, 23f, -7f)
                reflectiveQuadToRelative(15f, -19f)
                lineToRelative(-58f, -58f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-64f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(184f)
                close()
                moveTo(200f, 936f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 856f)
                verticalLineTo(296f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -26.5f)
                lineToRelative(673f, 673f)
                quadToRelative(-11f, 12f, -25.5f, 18f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(200f)
                close()
                moveToRelative(591f, 64f)
                lineTo(56f, 264f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveToRelative(49f, -704f)
                verticalLineToRelative(527f)
                lineTo(680f, 663f)
                verticalLineToRelative(-47f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                horizontalLineTo(620f)
                verticalLineToRelative(147f)
                lineToRelative(-44f, -44f)
                verticalLineToRelative(-63f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(536f, 456f)
                horizontalLineToRelative(-63f)
                lineTo(233f, 216f)
                horizontalLineToRelative(527f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 296f)
                close()
            }
        }.build()
        
        return _Pdf_off!!
    }

private var _Pdf_off: ImageVector? = null

